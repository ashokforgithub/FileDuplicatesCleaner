/**
 * 
 */
package com.mycomp.dupcleaner.dto;

/**
 * @author Ashok
 *
 */
public class SizeRange {
	
	public enum UNIT_OF_SIZE{
		
		B("b"),KB("kb"),MB("mb"),GB("gb");
		
		private String value;
		

		/**
		 * @param value
		 */
		private UNIT_OF_SIZE(String value) {
			this.value = value;
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
		
		
		
		
	}
	
	private UNIT_OF_SIZE sizeUnit;
	
	private double sizeStart;
	
	private double sizeEnd;

	/**
	 * @param sizeUnit
	 * @param sizeStart
	 * @param sizeEnd
	 */
	public SizeRange(UNIT_OF_SIZE sizeUnit, double sizeStart, double sizeEnd) {
		super();
		this.sizeUnit = sizeUnit;
		this.sizeStart = sizeStart;
		this.sizeEnd = sizeEnd;
	}

	/**
	 * @return the sizeUnit
	 */
	public UNIT_OF_SIZE getSizeUnit() {
		return sizeUnit;
	}

	/**
	 * @param sizeUnit the sizeUnit to set
	 */
	public void setSizeUnit(UNIT_OF_SIZE sizeUnit) {
		this.sizeUnit = sizeUnit;
	}

	/**
	 * @return the sizeStart
	 */
	public double getSizeStart() {
		return sizeStart;
	}

	/**
	 * @param sizeStart the sizeStart to set
	 */
	public void setSizeStart(double sizeStart) {
		this.sizeStart = sizeStart;
	}

	/**
	 * @return the sizeEnd
	 */
	public double getSizeEnd() {
		return sizeEnd;
	}

	/**
	 * @param sizeEnd the sizeEnd to set
	 */
	public void setSizeEnd(double sizeEnd) {
		this.sizeEnd = sizeEnd;
	}
 
	


}
