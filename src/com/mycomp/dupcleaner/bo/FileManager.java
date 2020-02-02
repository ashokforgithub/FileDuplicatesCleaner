/**
 * 
 */
package com.mycomp.dupcleaner.bo;

import java.io.FileFilter;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author Ashok
 *
 */
public class FileManager {
	
	
	private static FileManager fileManager=null;
	
	private static ReentrantLock lock = new ReentrantLock(true);
	
	private FileManager() {
	
		
		
	}
	
	public static FileManager getInstance()
	{
		
		try {
			if (null == fileManager) {
				lock.lock();

				fileManager = new FileManager();

				lock.unlock();

			} 
		} finally {
			// TODO: handle finally clause
			if(lock.isLocked())
				lock.unlock();
		}
			return fileManager;
		
	}
	
	
	public ConcurrentMap getSearchResults(FileFilter fileFilter)
	{
		
		//Get the BO
		
		//Build the FileFilter
		
		//Bucketing Strategy
			//QuickStrategy
			//Comprehensive Strategy
		
		//Search & Bucket
		
		return null;
	}
	
	

}
