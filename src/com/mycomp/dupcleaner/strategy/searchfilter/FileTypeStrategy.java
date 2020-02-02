/**
 * 
 */
package com.mycomp.dupcleaner.strategy.searchfilter;

import org.apache.commons.lang.StringUtils;

/**
 * @author Ashok
 *
 */
public class FileTypeStrategy implements FilterCriteriaStrategy {

	private String extn;

	/**
	 * @param extn
	 */
	public FileTypeStrategy(String extn) {
		super();
		this.extn = StringUtils.trim(extn);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mycomp.dupcleaner.strategy.FilterCriteriaStrategy#validate()
	 */
	@Override
	public boolean validate(Object valueObj) {
		return this.extn.endsWith(String.valueOf(valueObj));
	}

}
