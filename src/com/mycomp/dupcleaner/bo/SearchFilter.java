/**
 * 
 */
package com.mycomp.dupcleaner.bo;

import java.io.File;
import java.io.FileFilter;
import java.util.regex.Pattern;

import org.apache.commons.lang.StringUtils;

import com.mycomp.dupcleaner.dto.searchfilter.FilterCriteria;

//import com.mycomp.dupcleaner.dto.FilterCriteria;

/**
 * @author Ashok
 *
 */
public class SearchFilter implements FileFilter {
	
	private FilterCriteria filterCriteria;
	
	

	/**
	 * @param filterCriteria
	 */
	public SearchFilter(FilterCriteria filterCriteria) {
		super();
		this.filterCriteria = filterCriteria;
	}



	/* (non-Javadoc)
	 * @see java.io.FileFilter#accept(java.io.File)
	 */
	@Override
	public boolean accept(File pathname) {
		
		boolean boolResult=false;
		if(null != filterCriteria)
		{
			String value = StringUtils.trim(String.valueOf(filterCriteria.getValue()));
			if(StringUtils.isNotEmpty(value))
			{
				//if it has a wild card.
					if(value.contains("*") || value.contains("?"))
					{
						//Do a Pattern Search.
						if(Pattern.matches(value, pathname.getName())) {
							boolResult= true;
						}
						
						
					}
					else
					{
						boolResult= StringUtils.equalsIgnoreCase(value, pathname.getName());
					}
			}
		}
		return boolResult;
	}

}
