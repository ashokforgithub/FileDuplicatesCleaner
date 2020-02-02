/**
 * 
 */
package com.mycomp.dupcleaner.dto;

import java.util.List;

/**
 * @author Ashok
 *
 */
public class FileBucket {
	
	private long bucketId;
	
	private List<BFile> lstFiles;
	
	

	/**
	 * @param bucketId
	 * @param lstFiles
	 */
	public FileBucket(long bucketId, List<BFile> lstFiles) {
		super();
		this.bucketId = bucketId;
		this.lstFiles = lstFiles;
	}

	/**
	 * @return the bucketId
	 */
	public long getBucketId() {
		return bucketId;
	}

	/**
	 * @param bucketId the bucketId to set
	 */
	public void setBucketId(long bucketId) {
		this.bucketId = bucketId;
	}

	/**
	 * @return the lstFiles
	 */
	public List<BFile> getLstFiles() {
		return lstFiles;
	}

	/**
	 * @param lstFiles the lstFiles to set
	 */
	public void setLstFiles(List<BFile> lstFiles) {
		this.lstFiles = lstFiles;
	}
	
	
	
	

}
