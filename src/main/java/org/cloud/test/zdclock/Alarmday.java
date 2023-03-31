package org.cloud.test.zdclock;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import org.cloud.lang.BaseUtil;
import org.cloud.lang.date.DateUtil;
import org.cloud.lang.date.DefaultDateFormat;

public class Alarmday {

	private String date;
	
	/**
	 * 0:调休(workday]
	 * 1:开始(
	 * 2:结束]
	 */
	private String type;
	
	/**
	 * 工作日,type为调休才有
	 */
	private List<String> workday;
	
	public Alarmday(String date, String type, String... workday) {
		this.date = date;
		this.type = type;

		if (BaseUtil.isEmpty(workday)) {
			this.workday = Collections.emptyList();
		} else {
			this.workday = Arrays.asList(workday);
		}

		if ("0".equals(type)) {
			this.date = subOneDay(this.workday.get(0));
		}

		if ("1".equals(type)) {
			this.date = subOneDay(this.date);
		}
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<String> getWorkday() {
		return workday;
	}

	public void setWorkday(List<String> workday) {
		this.workday = workday;
	}

	private static String subOneDay(String date) {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-M-d");
		//设置严格转换格式
		sdf.setLenient(false);

		try {
			Date d1 = sdf.parse(date);
			Date d2 = DateUtil.changeData(d1, 1, false, DefaultDateFormat.DAY);
			return sdf.format(d2);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}

	}
}
