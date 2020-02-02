/**
 * 
 */
package com.mycomp.dupcleaner.dto.searchfilter;

import org.apache.commons.lang.StringUtils;

import com.mycomp.dupcleaner.strategy.searchfilter.FilterCriteriaStrategy;
import com.mycomp.dupcleaner.strategy.searchfilter.PlainStringStrategy;
import com.mycomp.dupcleaner.strategy.searchfilter.RegularExpStrategy;

/**
 * @author Ashok
 *
 */
public 	class StringFilter implements FilterCriteria
{
	
	private String value;
	
	private FilterCriteriaStrategy criteriaStrategy;	

	/**
	 * @param value
	 * @param criteriaStrategy
	 */
	private StringFilter(String value, FilterCriteriaStrategy criteriaStrategy) {
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
		// TODO Auto-generated method stub
		String strObject = String.valueOf(object);
		if(StringUtils.trim(strObject).contains("*") || StringUtils.trim(strObject).contains("?"))
		{
			return new StringFilter(strObject, new RegularExpStrategy(strObject));
		}
		return new StringFilter(strObject, new PlainStringStrategy(strObject));
	}

	@Override
	public boolean validate(Object object) {
		// TODO Auto-generated method stub
		return this.validate(object);
	}

	@Override
	public void setValue(Object object) {
		this.value=String.valueOf(object);
	}
	
	
	
	
}
