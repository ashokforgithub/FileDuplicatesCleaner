/**
 * 
 */
package com.mycomp.dupcleaner.dto;

import java.util.Date;

/**
 * @author Ashok
 *
 */
public class DateRange{
	
	public enum TypeOfDate{
		CREATED_DATE, MODIFIED_DATE;		
	}

	private TypeOfDate typeOfDate;
	
	private Date startDate;
	
	private Date endDate;	

	
	
	/**
	 * @param typeOfDate
	 * @param startDate
	 * @param endDate
	 */
	public DateRange(TypeOfDate typeOfDate, Date startDate, Date endDate) {
		super();
		this.typeOfDate = typeOfDate;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	/**
	 * @return the typeOfDate
	 */
	public TypeOfDate getTypeOfDate() {
		return typeOfDate;
	}

	/**
	 * @param typeOfDate the typeOfDate to set
	 */
	public void setTypeOfDate(TypeOfDate typeOfDate) {
		this.typeOfDate = typeOfDate;
	}

	/**
	 * @return the startDate
	 */
	public Date getStartDate() {
		return startDate;
	}

	/**
	 * @param startDate the startDate to set
	 */
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	/**
	 * @return the endDate
	 */
	public Date getEndDate() {
		return endDate;
	}

	/**
	 * @param endDate the endDate to set
	 */
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
}
