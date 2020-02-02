/**
 * 
 */
package com.mycomp.dupcleaner.strategy.searchfilter;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.mycomp.dupcleaner.dto.DateRange;
import com.mycomp.dupcleaner.dto.DateRange.TypeOfDate;

/**
 * @author Ashok
 *
 */
public class DateRangeStrategy implements FilterCriteriaStrategy {
	
	private DateRange dateRange;	
	
	/**
	 * @param dateRange
	 */
	public DateRangeStrategy(DateRange dateRange) {
		super();
		this.dateRange = dateRange;
	}
	
	/* (non-Javadoc)
	 * @see com.mycomp.dupcleaner.strategy.FilterCriteriaStrategy#validate()
	 */
	@Override
	public boolean validate(Object valueObj) {
		// TODO Auto-generated method stub
		
		File file = (File) valueObj;
		try {
			BasicFileAttributes basicFileAttributes  = Files.readAttributes(file.toPath(), BasicFileAttributes.class);
			Date fileDate= new Date(basicFileAttributes.creationTime().toMillis());

			return (this.dateRange.getStartDate().before(fileDate) || this.dateRange.getStartDate().equals(fileDate)) && 
					(this.dateRange.getEndDate().after(fileDate) || this.dateRange.getEndDate().equals(fileDate));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

//= new BasicFileAttributeView()
		return false;
	}

//public static void main(String[] args) {
//	
//	
//	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//	
//    Date date1 = null;
//    Date date2 = null;
//	
//    try {
//		date1 = dateFormat.parse("2019-10-11");
//		date2 = dateFormat.parse("2019-10-11");
//	} catch (ParseException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
//	
//	DateRange dateRange = new DateRange( TypeOfDate.CREATED_DATE, date1, date2);
//	
//	DateRangeStrategy strategy = new DateRangeStrategy(dateRange);
//	System.out.println(
//	 
//	strategy.validate(Paths.get("C:\\Ashok\\WorkArea\\trainings\\UdemyMultiThreading.jpg").toFile()));
//	
//}


}
