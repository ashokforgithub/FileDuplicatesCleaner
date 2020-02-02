/**
 * 
 */
package com.mycomp.dupcleaner.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

import org.apache.commons.lang.ObjectUtils;
import org.apache.commons.lang.StringUtils;

import com.mycomp.dupcleaner.dto.DateRange;
import com.mycomp.dupcleaner.dto.DateRange.TypeOfDate;
import com.mycomp.dupcleaner.dto.SizeRange;
import com.mycomp.dupcleaner.dto.SizeRange.UNIT_OF_SIZE;
import com.mycomp.dupcleaner.dto.searchfilter.DateRangeFilter;
import com.mycomp.dupcleaner.dto.searchfilter.FilterCriteria;
import com.mycomp.dupcleaner.dto.searchfilter.SizeRangeFilter;
import com.mycomp.dupcleaner.dto.searchfilter.StringFilter;

/**
 * @author Ashok
 *
 */
public class FilterCriteriaBuilder {

	private final Set<FilterCriteria> setFilterCriteria = new HashSet<>();

	public enum FilterCriteriaType {

		NAME, EXTN, SIZE, CREATED_DATE, MODIFIED_DATE, NONE;

	}

	private static final List<UNIT_OF_SIZE> lstSizeMeausreUnits = loadSizeMeausreUnits();

	private static List<UNIT_OF_SIZE> loadSizeMeausreUnits() {
		List<UNIT_OF_SIZE> sizeMeausreUnits = new ArrayList<>();
		Collections.addAll(sizeMeausreUnits, UNIT_OF_SIZE.values());

		return sizeMeausreUnits;

	}

	// Filter Options follows...

	private final FilterCriteria nameFilter = StringFilter.createFilter("");

	private final FilterCriteria fileExtnFilter = StringFilter.createFilter("");

	private final FilterCriteria sizeRangeFilter = SizeRangeFilter.createFilter("");

	private final FilterCriteria dateRangeFilter = DateRangeFilter.createFilter("");

	private static final UNIT_OF_SIZE getSizeMeausreUnit(String value) {
		Optional<UNIT_OF_SIZE> oSizeMeausreUnit = lstSizeMeausreUnits.stream().filter(e -> e.getValue().equals(value))
				.findFirst();
		if (oSizeMeausreUnit.isPresent())
			return oSizeMeausreUnit.get();
		else
			return null;
	}

	public void build(FilterCriteriaType criteriaType, Object object) {
		switch (criteriaType) {
		case NAME: {
			// Construct Name Filter, expecting the input object as String
			this.nameFilter.setValue(StringUtils.trim(String.valueOf(object)));
			this.setFilterCriteria.add(this.nameFilter);
			break;
		}
		case EXTN: {
			// Construct File Extension Filter;
			this.fileExtnFilter.setValue(StringUtils.trim(String.valueOf(object)));
			this.setFilterCriteria.add(this.fileExtnFilter);
			break;
		}
		case SIZE: {
			// Construct SIZE Filter;
			// Get Params as Map & create objects.
			if (null != object && object instanceof Map) {
				// Assertion Params would be available.
				Map<String, String> mapParams = (Map<String, String>) object;
				this.sizeRangeFilter.setValue((new SizeRange(getSizeMeausreUnit(mapParams.get("SIZE_UNIT")),
						Double.valueOf(mapParams.get("START_SIZE")), Double.valueOf(mapParams.get("END_SIZE")))));
				this.setFilterCriteria.add(this.sizeRangeFilter);
			}

			break;
		}
		case CREATED_DATE: {
			// Construct Created Date Filter;
			// Get Params as Map & create objects.
			if (null != object && object instanceof Map) {
				// Assertion Params would be available.
				Map<String, Object> mapParams = (Map<String, Object>) object;
				this.dateRangeFilter.setValue((new DateRange(TypeOfDate.valueOf(String.valueOf(mapParams.get("CREATED_DATE"))),
						(Date)mapParams.get("START_DATE"), (Date)mapParams.get("END_DATE"))));
				this.setFilterCriteria.add(this.sizeRangeFilter);
			}

			break;
		}
		case MODIFIED_DATE: {
			// Construct Modified Date Filter;
			// Get Params as Map & create objects.
			if (null != object && object instanceof Map) {
				// Assertion Params would be available.
				Map<String, Object> mapParams = (Map<String, Object>) object;
				this.dateRangeFilter.setValue((new DateRange(TypeOfDate.valueOf(String.valueOf(mapParams.get("MODIFIED_DATE"))),
						(Date)mapParams.get("START_DATE"), (Date)mapParams.get("END_DATE"))));
				this.setFilterCriteria.add(this.sizeRangeFilter);
			}
			break;
		}

		default: {
			System.out.println(" No Filter applied..");
		}		}

	}

}
