package org.cloud.test.zdclock;

/**
 * 日期范围
 * @since
 * 		v1.0
 * @version
 * 		v1.0, 2021-01-04 10:36:57
 * @author Cloud
 */
public class Period {

	private String from;
	
	private String to;
	
	public Period(String from, String to) {
		this.from = from;
		this.to = to;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}
	
	
}
