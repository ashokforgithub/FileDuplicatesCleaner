package com.mycomp.dupcleaner.controller;

import java.io.File;
import java.net.URL;
import java.util.HashSet;
import java.util.ResourceBundle;

import com.mycomp.dupcleaner.dto.SFile;

import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.ObservableSet;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.CheckBoxTableCell;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.DirectoryChooser;
import javafx.util.Callback;

public class DupCleanController implements Initializable {

	@FXML
	private TableView<SFile> fGroup;

	@FXML
	private TableColumn<SFile, String> groupId;

	@FXML
	private TableColumn<SFile, String> fileName;

	@FXML
	private TableColumn<SFile, String> folderPath;

	@FXML
	private TableColumn<SFile, String> fileType;

	@FXML
	private TableColumn<SFile, String> createdDate;

	@FXML
	private TableColumn<SFile, String> modifiedDate;

	@FXML
	private TableColumn<SFile, Boolean> hidden;

	@FXML
	private TableColumn<SFile, CheckBox> selected;
	
	@FXML
	private TextField filePath;
	
	@FXML
	private ListView<String> folderListView;	
	
	@FXML
	private TextArea dirPaths;
	
	@FXML
	private ObservableSet<String> lstFolderPaths = FXCollections.observableSet(new HashSet<String>());
	
	
	
	public  ObservableList<SFile> lstFiles   = FXCollections.observableArrayList( new SFile("1","MyTestFile01","C:",".txt","13-11-2006 11:23:33","16-11-2006 11:43:33",false,false),
			new SFile("2","MyTestFile02","C:",".txt","14-11-2006 11:23:33","17-11-2006 11:43:33",false,false)
			)  ;
	

	
	/*public ObservableList<FileGroup> srchRsltLst = FXCollections.observableArrayList(
			new FileGroup("1", lstFiles  ), new FileGroup("2", lstFiles  )
			);*/

	/**
	 * @param event
	 */
	public void moveFiles(ActionEvent event) {
		System.out.println("Calling Move Files...");

	}
	
	/**
	 * @param event
	 */
	public void deleteFiles(ActionEvent event) {
		System.out.println("Calling Delete Files...");

	}
	
	/**
	 * @param event
	 */
	public void clearSearchResults(ActionEvent event) {
		System.out.println("Calling Clear Search Results...");

	}
	
	/**
	 * @param event
	 */
	public void configureSettings(ActionEvent event) {
		System.out.println("Calling Configure Settings...");

	}
	
	public void addFolder(ActionEvent event) {
		
		try {
			if(!("".equals(this.filePath.getText().trim()))){
			this.lstFolderPaths.add(this.filePath.getText());
			System.out.println("Added File Path:"+ this.filePath.getText());
			System.out.println(" List from Set" + FXCollections.observableArrayList(this.lstFolderPaths));
			this.folderListView.setItems(FXCollections.observableArrayList(this.lstFolderPaths));
			//this.folderListView.refresh();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public void browseFolder(ActionEvent event) {
		
		DirectoryChooser chooser = new DirectoryChooser();
		chooser.setTitle("Select a Folder");
		File defaultDirectory = new File("/");
		chooser.setInitialDirectory(defaultDirectory);		
		File selectedDirectory = chooser.showDialog(fGroup.getScene().getWindow());
		System.out.println("Path Selected:" + selectedDirectory.getPath());
		this.filePath.setText(selectedDirectory.getPath());
		
		
		
	}

	/* (non-Javadoc)
	 * @see javafx.fxml.Initializable#initialize(java.net.URL, java.util.ResourceBundle)
	 */
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		try {
			
			// TODO Auto-generated method stub
			groupId.setCellValueFactory(new PropertyValueFactory<SFile, String>("groupId"));
			fileName.setCellValueFactory(new PropertyValueFactory<SFile, String>("fileName"));
			folderPath.setCellValueFactory(new PropertyValueFactory<SFile, String>("folderPath"));
			fileType.setCellValueFactory(new PropertyValueFactory<SFile, String>("fileType"));
			createdDate.setCellValueFactory(new PropertyValueFactory<SFile, String>("createdDate"));
			modifiedDate.setCellValueFactory(new PropertyValueFactory<SFile, String>("modifiedDate"));
			hidden.setCellValueFactory(new PropertyValueFactory<SFile, Boolean>("hidden"));
			//selected.setCellValueFactory(new PropertyValueFactory<SFile, Boolean>("selected"));
			this.filePath.setText("");
			
			this.folderListView.setItems(FXCollections.observableArrayList(this.lstFolderPaths));
			
			selected.setCellValueFactory(
					new Callback<TableColumn.CellDataFeatures<SFile, CheckBox>, ObservableValue<CheckBox>>() {

						@Override
						public ObservableValue<CheckBox> call(TableColumn.CellDataFeatures<SFile, CheckBox> arg0) {
							SFile sFile = arg0.getValue();
							CheckBox checkBox = new CheckBox();
								checkBox.selectedProperty().setValue(sFile.getSelected());
								checkBox.selectedProperty().addListener(new ChangeListener<Boolean>() {
									public void changed(ObservableValue<? extends Boolean> ov, Boolean old_val,
											Boolean new_val) {

										sFile.setSelected(new_val);
										System.out.println(" Modified SFile for Checkbox:"+ sFile);

									}
								});
							
							return new SimpleObjectProperty<CheckBox>(checkBox);

						}

					});
			this.fGroup.setItems(this.lstFiles);
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			// TODO: handle finally clause
			
			System.out.println(" Modified SFiles"+this.lstFiles);
		}
		
				

	}

}
