/**
 * 
 */
package com.mycomp.dupcleaner.dto.searchfilter;

import com.mycomp.dupcleaner.strategy.searchfilter.FileTypeStrategy;
import com.mycomp.dupcleaner.strategy.searchfilter.FilterCriteriaStrategy;

/**
 * @author Ashok
 *
 */
public 	class FileTypeExtnFilter implements FilterCriteria
{
	
	private String value;
	
	private FilterCriteriaStrategy criteriaStrategy;	

	/**
	 * @param value
	 * @param criteriaStrategy
	 */
	private FileTypeExtnFilter(String value, FilterCriteriaStrategy criteriaStrategy) {
		super();
		this.value = value;
		this.criteriaStrategy = criteriaStrategy;
	}

	/**
	 * @return the value
	 */
	public String getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(String value) {
		this.value = value;
	}

	/**
	 * @return the criteriaStrategy
	 */
	public FilterCriteriaStrategy getCriteriaStrategy() {
		return criteriaStrategy;
	}

	/**
	 * @param criteriaStrategy the criteriaStrategy to set
	 */
	public void setCriteriaStrategy(FilterCriteriaStrategy criteriaStrategy) {
		this.criteriaStrategy = criteriaStrategy;
	}

	//@Override
	public static FilterCriteria createFilter(Object object) {
		String strObject = String.valueOf(object);
		return new FileTypeExtnFilter(strObject, new FileTypeStrategy(strObject));
	}

	@Override
	public boolean validate(Object object) {
		return this.validate(object);
	}

	@Override
	public void setValue(Object object) {
		
		this.value = String.valueOf(object);
		
	}
	
	
	
	
}
