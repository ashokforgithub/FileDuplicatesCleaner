/**
 * 
 */
package com.mycomp.dupcleaner.strategy.searchfilter;

import com.mycomp.dupcleaner.dto.SizeRange;

/**
 * @author Ashok
 *
 */
public class NumericalRangeStrategy implements FilterCriteriaStrategy {
	
	private SizeRange sizeRange;
	

	/**
	 * @param sizeRange
	 */
	public NumericalRangeStrategy(SizeRange sizeRange) {
		super();
		this.sizeRange = sizeRange;
	}

	/* (non-Javadoc)
	 * @see com.mycomp.dupcleaner.strategy.FilterCriteriaStrategy#validate()
	 */
	@Override
	public boolean validate(Object valueObj) {
		// TODO Auto-generated method stub
		return false;
	}


}
