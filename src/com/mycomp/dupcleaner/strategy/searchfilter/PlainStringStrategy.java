/**
 * 
 */
package com.mycomp.dupcleaner.strategy.searchfilter;

import org.apache.commons.lang.StringUtils;

/**
 * @author Ashok
 *
 */
public class PlainStringStrategy implements FilterCriteriaStrategy{
	
	private String text;

	/**
	 * @param text
	 */
	public PlainStringStrategy(String text) {
		super();
		this.text = StringUtils.trim( text);
	}

	@Override
	public boolean validate(Object valueObj) {
		return this.text.equals(String.valueOf(valueObj));
	}

}
