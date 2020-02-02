/**
 * 
 */
package com.mycomp.dupcleaner.dto.searchfilter;

import com.mycomp.dupcleaner.dto.DateRange;
import com.mycomp.dupcleaner.strategy.searchfilter.DateRangeStrategy;

/**
 * @author Ashok
 *
 */
public class DateRangeFilter implements FilterCriteria{
	
	private DateRange dateRange;
	
	private DateRangeStrategy strategy;
	
	/**
	 * @param dateRange
	 * @param strategy
	 */
	private DateRangeFilter(DateRange dateRange, DateRangeStrategy strategy) {
		super();
		this.dateRange = dateRange;
		this.strategy = strategy;
	}

	/**
	 * @return the dateRange
	 */
	public DateRange getDateRange() {
		return dateRange;
	}

	/**
	 * @param dateRange the dateRange to set
	 */
	public void setDateRange(DateRange dateRange) {
		this.dateRange = dateRange;
	}

	/**
	 * @return the strategy
	 */
	public DateRangeStrategy getStrategy() {
		return strategy;
	}

	/**
	 * @param strategy the strategy to set
	 */
	public void setStrategy(DateRangeStrategy strategy) {
		this.strategy = strategy;
	}

	@Override
	public Object getValue() {
		return this.dateRange;
	}
	
	@Override
	public boolean validate(Object object) {
		return this.strategy.validate(this.dateRange);
	}

	//@Override
	public static FilterCriteria createFilter(Object object) {
		return new DateRangeFilter((DateRange) object, new DateRangeStrategy((DateRange) object));
	}

	@Override
	public void setValue(Object object) {

		this.dateRange = (DateRange) object;
		
	}

}
