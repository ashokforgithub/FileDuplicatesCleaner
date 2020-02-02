/**
 * 
 */
package com.mycomp.dupcleaner.dto.searchfilter;

/**
 * @author Ashok
 *
 */
public interface FilterCriteria {
	
	//FilterCriteria createFilter(Object object);
	
	Object getValue();
	
	void setValue(Object object);
		
	boolean validate(Object object);

}
