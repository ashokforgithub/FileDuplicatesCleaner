/**
 * 
 */
package com.mycomp.dupcleaner.factory;

import com.mycomp.dupcleaner.dto.SFile;

import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TableColumn;
import javafx.util.Callback;

/**
 * @author Ashok
 *
 */
@SuppressWarnings("rawtypes")
public class FileCheckBoxFactory implements Callback <TableColumn.CellDataFeatures ,ObservableValue> {

	@Override
	public ObservableValue call(TableColumn.CellDataFeatures param) {
		SFile sFile = (SFile) param.getValue();
        CheckBox checkBox = new CheckBox();
        checkBox.selectedProperty().setValue(sFile.getSelected());
        checkBox.selectedProperty().addListener((ov, old_val, new_val) -> {
        	sFile.setSelected(new_val);
        });
        return new SimpleObjectProperty(checkBox);
	}

	

	
	
	

}
