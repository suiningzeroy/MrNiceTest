package com.example.mrnice.test;

import java.util.Calendar;

import android.util.Log;

import com.example.mrnice.DBUtil;
import com.example.mrnice.model.SpecialDay;
import com.example.mrnice.MrNiceConstant;

import junit.framework.TestCase;

public class DBUtilTest extends TestCase {

	public void testGetAlarmDayBaseOnSpecialDay() {
		SpecialDay spd = new SpecialDay();
		spd.setCycle(MrNiceConstant.ANNUALLY);
		spd.setDay("21");
		spd.setMonth("11");
		spd.setYear("2013");
		String result = DBUtil.getAlarmDateBaseOnSpecialDay(spd);
		
		assertEquals(result, "20131121");
	}

	public void testGetDaySub() {
		Calendar now = 	Calendar.getInstance();
		String today = String.valueOf(now.get(Calendar.YEAR)) + String.valueOf(now.get(Calendar.MONTH )+1) + String.valueOf(now.get(Calendar.DAY_OF_MONTH));
		Log.d("test","today is :" + today);
		long result = DBUtil.GetNumberOfDaysBetweenToDateStrings(today,"20131128");
		assertEquals(result, 6);
	}

}
