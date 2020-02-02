/**
 * 
 */
package com.mycomp.dupcleaner.dto;

import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 * @author Ashok
 *
 */
public class SFile  {
	
	private final SimpleStringProperty groupId;
	
	private final SimpleStringProperty fileName;
	
	private final SimpleStringProperty folderPath;
	
	private final SimpleStringProperty fileType;
	
	private final SimpleStringProperty createdDate;
	
	private final SimpleStringProperty modifiedDate;
	
	private final SimpleBooleanProperty hidden;
	
	private  SimpleBooleanProperty selected ;

	/**
	 * @param fileName
	 * @param folderPath
	 * @param fileType
	 * @param createdDate
	 * @param modifiedDate
	 * @param hidden
	 * @param selected
	 */
	public SFile(String groupId, String fileName, String folderPath, String fileType,
			String createdDate, String modifiedDate, boolean hidden,
			boolean selected) {
		super();
		this.groupId = new SimpleStringProperty(groupId);
		this.fileName = new SimpleStringProperty(fileName);
		this.folderPath = new SimpleStringProperty( folderPath);
		this.fileType =  new SimpleStringProperty(fileType);
		this.createdDate =  new SimpleStringProperty(createdDate);
		this.modifiedDate =  new SimpleStringProperty(modifiedDate);
		this.hidden = new SimpleBooleanProperty(hidden);
		this.selected = new SimpleBooleanProperty( selected);
		
		System.out.println("SFile Object Values: File Name="+this.getFileName()+", Folder Path="+this.getFolderPath());
	}

	public String getGroupId() {
		return groupId.get();
	}

	/**
	 * @return the fileName
	 */
	public String getFileName() {
		System.out.println(" File Name=" +fileName.get());
		return fileName.get();
	}

	/**
	 * @return the folderPath
	 */
	public String getFolderPath() {
		return folderPath.get();
	}

	/**
	 * @return the fileType
	 */
	public String getFileType() {
		return fileType.get();
	}

	/**
	 * @return the createdDate
	 */
	public String getCreatedDate() {
		return createdDate.get();
	}

	/**
	 * @return the modifiedDate
	 */
	public String getModifiedDate() {
		return modifiedDate.get();
	}

	/**
	 * @return the hidden
	 */
	public boolean getHidden() {
		return hidden.get();
	}

	/**
	 * @return the selected
	 */
	public boolean getSelected() {
		return selected.get();
	}

	
	/**
	 * @param selected the selected to set
	 */
	public void setSelected(boolean selected) {
		this.selected = new SimpleBooleanProperty(selected);
	}
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub	
		
		StringBuffer buffer = new StringBuffer(this.getClass().getName());
		buffer.append("fileName = ").append(this.getFileName());
		buffer.append("folderPath = ").append(this.getFolderPath());
		buffer.append("fileType = ").append(this.getFileType());
		buffer.append("createdDate = ").append(this.getCreatedDate());
		buffer.append("modifiedDate = ").append(this.getModifiedDate());
		buffer.append("hidden = ").append(this.getHidden());
		buffer.append("selected = ").append(this.getSelected());
		
		return buffer.toString();
	}
	

}
