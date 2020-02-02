/**
 * 
 */
package com.mycomp.dupcleaner.dto;

import javafx.beans.property.SimpleListProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.ObservableList;

/**
 * @author Ashok
 *
 */
public class FileGroup {
	

	

	private final SimpleStringProperty groupId;
	
	private final SimpleListProperty<SFile> sFiles;

	public String getGroupId() {
		return groupId.get();
	}

	public ObservableList<SFile> getsFiles() {
		return sFiles.get();
	}

	/**
	 * @param groupId
	 * @param sFiles
	 */
	public FileGroup(String groupId, ObservableList<SFile> sFiles) {
		super();
		this.groupId = new SimpleStringProperty(groupId);
		this.sFiles = new SimpleListProperty<SFile>(sFiles);		
	}
	
	
	

}
