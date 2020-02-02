/**
 * 
 */
package com.mycomp.dupcleaner.app;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.List;

/**
 * @author Ashok
 *
 */

public class FileHandlerService {
	
	
	
	public List<File> fetchFiles()
	{
	File dir = new File("C:\\Ashok\\WorkArea\\trainings");
	File[] files = dir.listFiles(new FilenameFilter() {
	    public boolean accept(File dir, String name) {
	    	System.out.println("Dir:"+dir.getAbsolutePath()+"\\"+name);
	    
	    	
	        return name.toLowerCase().endsWith(".pdf");
	    }
	});
	return Arrays.asList(files);
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(new FileHandlerService().fetchFiles());
		
	}

}
