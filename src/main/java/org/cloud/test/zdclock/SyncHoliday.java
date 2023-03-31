package org.cloud.test.zdclock;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.cloud.json.JSONUtil;

@WebServlet(urlPatterns = {"/holidays/get"})
public class SyncHoliday extends HttpServlet {

	private static final long serialVersionUID = 6743742936911270103L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("application/json;charset=UTF-8");
		resp.getWriter().append(getData());
	}

	public static String getData() {

		//组装结构
		SyncData data = new SyncData();
		HolidayList list = new HolidayList();
		Holidays holidays = new Holidays();
		List<Holiday> holidayListData = new ArrayList<Holiday>();
		holidays.setList(list);
		list.setHoliday(holidayListData);

		//标题
		list.setName("2023");

		//基础数据
		data.setDescription("success");
		data.setResult_code(200);
		data.setLast_modified(new Date().getTime());
		data.setHolidays(holidays);

		//假期数据
		holidayListData.add(new Holiday(0, "元旦", new Period("2022-12-31", "2023-1-2")));

		holidayListData.add(new Holiday(1,
						                "春节",
						                new Period("2023-1-21", "2023-1-27"),
						                new Alarmday("2023-1-21", "1"),
						                new Alarmday("2023-1-27", "2"),
										new Alarmday("", "0", "2023-1-28", "2023-1-29"))
							);

		holidayListData.add(new Holiday(2,
						                "清明节",
						                new Period("2023-4-5", "2023-4-5"))
							);


		holidayListData.add(new Holiday(3,
						                "劳动节",
						                new Period("2023-4-29", "2023-5-3"),
						                new Alarmday("", "0", "2023-4-23"),
						                new Alarmday("2023-4-29", "1"),
						                new Alarmday("2023-5-3", "2"),
						                new Alarmday("", "0", "2023-5-6"))
							);

		holidayListData.add(new Holiday(4,
						                "端午节",
						                new Period("2023-6-22", "2023-6-24"),
						                new Alarmday("2023-6-22", "1"),
						                new Alarmday("2023-6-24", "2"),
										new Alarmday("", "0", "2023-6-25"))
							);

		holidayListData.add(new Holiday(5, 
						                "中秋节", 
						                new Period("2023-9-29", "2023-10-6"),
						                new Alarmday("2023-9-29", "1"),
						                new Alarmday("2023-10-6", "2"),
										new Alarmday("", "0", "2023-10-7", "2023-10-8"))
							);
		
//		holidayListData.add(new Holiday(6,
//						                "国庆节",
//						                new Period("2022-10-1", "2022-10-7"),
//						                new Alarmday("2022-10-1", "1"),
//						                new Alarmday("2022-10-7", "2"),
//						                new Alarmday("", "0", "2022-10-8", "2022-10-9"))
//							);

		return JSONUtil.toJSONString(data);
	}
	
	public static void main(String[] args) {

		String ss = "{\"holidays\":\"{\\\"list\\\":{\\\"name\\\":\\\"2020\\\",\\\"holiday\\\":[{\\\"alarmday\\\":[],\\\"holiday_id\\\":\\\"0\\\",\\\"name\\\":\\\"元旦\\\",\\\"period\\\":{\\\"from\\\":\\\"2020-1-1\\\",\\\"to\\\":\\\"2020-1-1\\\"}},{\\\"alarmday\\\":[{\\\"date\\\":\\\"2020-1-18\\\",\\\"type\\\":\\\"0\\\",\\\"workday\\\":[\\\"2020-1-19\\\"]},{\\\"date\\\":\\\"2019-1-23\\\",\\\"type\\\":\\\"1\\\",\\\"workday\\\":[]},{\\\"date\\\":\\\"2019-1-30\\\",\\\"type\\\":\\\"2\\\",\\\"workday\\\":[]},{\\\"date\\\":\\\"2020-1-31\\\",\\\"type\\\":\\\"0\\\",\\\"workday\\\":[\\\"2020-2-1\\\"]}],\\\"holiday_id\\\":\\\"1\\\",\\\"name\\\":\\\"春节\\\",\\\"period\\\":{\\\"from\\\":\\\"2020-1-24\\\",\\\"to\\\":\\\"2020-1-30\\\"}},{\\\"alarmday\\\":[{\\\"date\\\":\\\"2020-4-3\\\",\\\"type\\\":\\\"1\\\",\\\"workday\\\":[]},{\\\"date\\\":\\\"2020-4-6\\\",\\\"type\\\":\\\"2\\\",\\\"workday\\\":[]}],\\\"holiday_id\\\":\\\"2\\\",\\\"name\\\":\\\"清明节\\\",\\\"period\\\":{\\\"from\\\":\\\"2020-4-4\\\",\\\"to\\\":\\\"2020-4-6\\\"}},{\\\"alarmday\\\":[{\\\"date\\\":\\\"2020-4-25\\\",\\\"type\\\":\\\"0\\\",\\\"workday\\\":[\\\"2020-4-26\\\"]},{\\\"date\\\":\\\"2020-4-30\\\",\\\"type\\\":\\\"1\\\",\\\"workday\\\":[]},{\\\"date\\\":\\\"2020-5-5\\\",\\\"type\\\":\\\"2\\\",\\\"workday\\\":[]},{\\\"date\\\":\\\"2020-5-8\\\",\\\"type\\\":\\\"0\\\",\\\"workday\\\":[\\\"2020-5-9\\\"]}],\\\"holiday_id\\\":\\\"3\\\",\\\"name\\\":\\\"劳动节\\\",\\\"period\\\":{\\\"from\\\":\\\"2020-5-1\\\",\\\"to\\\":\\\"2020-5-5\\\"}},{\\\"alarmday\\\":[{\\\"date\\\":\\\"2020-6-24\\\",\\\"type\\\":\\\"1\\\",\\\"workday\\\":[]},{\\\"date\\\":\\\"2020-6-27\\\",\\\"type\\\":\\\"0\\\",\\\"workday\\\":[\\\"2020-6-28\\\"]}],\\\"holiday_id\\\":\\\"4\\\",\\\"name\\\":\\\"端午节\\\",\\\"period\\\":{\\\"from\\\":\\\"2020-6-25\\\",\\\"to\\\":\\\"2020-6-27\\\"}},{\\\"alarmday\\\":[{\\\"date\\\":\\\"2020-9-26\\\",\\\"type\\\":\\\"0\\\",\\\"workday\\\":[\\\"2020-9-27\\\"]},{\\\"date\\\":\\\"2020-9-30\\\",\\\"type\\\":\\\"1\\\",\\\"workday\\\":[]},{\\\"date\\\":\\\"2020-10-8\\\",\\\"type\\\":\\\"2\\\",\\\"workday\\\":[]},{\\\"date\\\":\\\"2020-10-9\\\",\\\"type\\\":\\\"0\\\",\\\"workday\\\":[\\\"2020-10-10\\\"]}],\\\"holiday_id\\\":\\\"5\\\",\\\"name\\\":\\\"国庆节\\\",\\\"period\\\":{\\\"from\\\":\\\"2020-10-1\\\",\\\"to\\\":\\\"2020-10-8\\\"}}]}}\",\"description\":\"success\",\"result_code\":200,\"last_modified\":1608637931819}";

		System.out.println(ss);
		System.out.println(ss.replace("\\\"", "\""));

		System.out.println(getData());
	}
}
