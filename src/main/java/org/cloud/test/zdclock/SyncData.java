package org.cloud.test.zdclock;

import org.cloud.json.JSONUtil;

public class SyncData {

	private Holidays holidays;
	
	private String description;
	
	private int result_code;
	
	private long last_modified;

	public String getHolidays() {
		return JSONUtil.toJSONString(holidays);
	}

	public void setHolidays(Holidays holidays) {
		this.holidays = holidays;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getResult_code() {
		return result_code;
	}

	public void setResult_code(int result_code) {
		this.result_code = result_code;
	}

	public long getLast_modified() {
		return last_modified;
	}

	public void setLast_modified(long last_modified) {
		this.last_modified = last_modified;
	}
	
}
