/**
 * 
 */
package com.mycomp.dupcleaner.strategy.searchfilter;

import java.util.regex.Pattern;

/**
 * @author Ashok
 *
 */
public class RegularExpStrategy implements FilterCriteriaStrategy {
	
	private String text;
	
	/**
	 * @param text
	 */
	public RegularExpStrategy(String text) {
		super();
		this.text = text;
	}



	/* (non-Javadoc)
	 * @see com.mycomp.dupcleaner.strategy.FilterCriteriaStrategy#validate()
	 */
	@Override
	public boolean validate(final Object valueObj) {
		String strObj = String.valueOf(valueObj);
		
		return Pattern.matches(this.text, strObj);
	}

}
