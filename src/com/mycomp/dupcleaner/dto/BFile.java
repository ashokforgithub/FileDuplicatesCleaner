/**
 * 
 */
package com.mycomp.dupcleaner.dto;

import java.util.Date;

/**
 * @author Ashok
 *
 */
public class BFile {
	
	private final String fileName;
	
	private final String folderPath;
	
	private final String fileType;
	
	private final Date createdDate;
	
	private final Date modifiedDate;
	
	private final String hidden;
	
	private  boolean  retainFlag ;
	
	private boolean deleteFlag;
	
	private long size;
	
	private String extension;
	
	

	/**
	 * @param fileName
	 * @param folderPath
	 * @param fileType
	 * @param createdDate
	 * @param modifiedDate
	 * @param hidden
	 * @param selected
	 * @param deleteFlag
	 */
	public BFile(String fileName, String folderPath, String fileType, Date createdDate, Date modifiedDate,
			String hidden, boolean retainFlag, boolean deleteFlag) {
		super();
		this.fileName = fileName;
		this.folderPath = folderPath;
		this.fileType = fileType;
		this.createdDate = createdDate;
		this.modifiedDate = modifiedDate;
		this.hidden = hidden;
		this.retainFlag = retainFlag;
		this.deleteFlag = deleteFlag;
	}

	

	/**
	 * @return the retainFlag
	 */
	public boolean isRetainFlag() {
		return retainFlag;
	}



	/**
	 * @param retainFlag the retainFlag to set
	 */
	public void setRetainFlag(boolean retainFlag) {
		this.retainFlag = retainFlag;
	}



	/**
	 * @return the deleteFlag
	 */
	public boolean isDeleteFlag() {
		return deleteFlag;
	}

	/**
	 * @param deleteFlag the deleteFlag to set
	 */
	public void setDeleteFlag(boolean deleteFlag) {
		this.deleteFlag = deleteFlag;
	}

	/**
	 * @return the fileName
	 */
	public String getFileName() {
		return fileName;
	}

	/**
	 * @return the folderPath
	 */
	public String getFolderPath() {
		return folderPath;
	}

	/**
	 * @return the fileType
	 */
	public String getFileType() {
		return fileType;
	}

	/**
	 * @return the createdDate
	 */
	public Date getCreatedDate() {
		return createdDate;
	}

	/**
	 * @return the modifiedDate
	 */
	public Date getModifiedDate() {
		return modifiedDate;
	}

	/**
	 * @return the hidden
	 */
	public String getHidden() {
		return hidden;
	}
	
	

}
