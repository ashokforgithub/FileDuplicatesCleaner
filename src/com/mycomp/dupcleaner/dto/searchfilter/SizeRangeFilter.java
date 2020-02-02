/**
 * 
 */
package com.mycomp.dupcleaner.dto.searchfilter;

import com.mycomp.dupcleaner.dto.SizeRange;
import com.mycomp.dupcleaner.strategy.searchfilter.NumericalRangeStrategy;

/**
 * @author Ashok
 *
 */
public class SizeRangeFilter implements FilterCriteria {
	
	private SizeRange sizeRange;
	
	private NumericalRangeStrategy strategy;

	/**
	 * @param sizeRange
	 * @param strategy
	 */
	private SizeRangeFilter(SizeRange sizeRange, NumericalRangeStrategy strategy) {
		super();
		this.sizeRange = sizeRange;
		this.strategy = strategy;
	}
	
	/**
	 * @return the strategy
	 */
	public NumericalRangeStrategy getStrategy() {
		return strategy;
	}

	/**
	 * @param strategy the strategy to set
	 */
	public void setStrategy(NumericalRangeStrategy strategy) {
		this.strategy = strategy;
	}
	
	@Override
	public Object getValue() {
		return this.sizeRange;
	}

	@Override
	public boolean validate(Object object) {
		return this.strategy.validate(object);
	}


	//@Override
	public static FilterCriteria createFilter(Object object) {
		return new SizeRangeFilter((SizeRange) object, new NumericalRangeStrategy((SizeRange)object));
	}

	@Override
	public void setValue(Object object) {

			this.sizeRange= (SizeRange) object;
	}
	

}
