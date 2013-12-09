package com.example.mrnice.test;

import com.example.mrnice.SpecialDaySetService;
import com.example.mrnice.model.SpecialDay;

import junit.framework.TestCase;

public class SpecialDaySetServiceTest extends TestCase {
	private SpecialDaySetService ss;
	
	protected void setUp() throws Exception {
		ss = new SpecialDaySetService();
		super.setUp();
	}

	public void testCompare_date() {
		String date1 = "20130101";
		String date2 = "20130102";
		int result = ss.compare_date(date2, date1);
		assertEquals(result, 1);
	}

}
