package org.cloud.test.zdclock;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Holiday {

	private List<Alarmday> alarmday;
	
	private String holiday_id;
	
	private String name;
	
	private Period period;
	
	public Holiday(int id, String name, Period period, Alarmday... alarmday) {
		
		this.holiday_id = id + "";
		this.name = name;
		this.period = period;
		
		if (alarmday == null) {
			this.alarmday = Collections.emptyList();
		} else {
			this.alarmday = Arrays.asList(alarmday);
		}
	}

	public List<Alarmday> getAlarmday() {
		return alarmday;
	}

	public void setAlarmday(List<Alarmday> alarmday) {
		this.alarmday = alarmday;
	}

	public String getHoliday_id() {
		return holiday_id;
	}

	public void setHoliday_id(String holiday_id) {
		this.holiday_id = holiday_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Period getPeriod() {
		return period;
	}

	public void setPeriod(Period period) {
		this.period = period;
	}
	
}
