package com.limosys.dblib.vladtest.test;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.limosys.dblib.vladtest.T6467063785;
import com.limosys.dblib.vladtest.da.T6467063785DataAccess.T6467063785AccessType;
import com.limosys.jlimoobject.SaveException;

public class T6467063785Test {

	T6467063785 c;

	@Before
	public void setUp() {
		c = T6467063785.getDfltInstance(T6467063785AccessType.ONEREC);
	}

	@After
	public void tearDown() throws SaveException {
		if (!c.isEmptyDataSet()) {
			c.accessOneRec(5, true);
			c.getDataSetMain().deleteRow();
			c.saveChanges();
		}
	}

	@Test
	public void testOneRec() throws SaveException {

		if (c.accessOneRec(1, true)) {
			c.getDataSetMain().first();
			System.out.println("My id = " + c.getId() + "; NAME = " + c.getName() + "; COMPANY NAME = " + c.getCompanyName());
		}

		// --------- add new row
		c.addNew();
		c.setId(5);
		c.setName("Kalabaka!");
		c.setCompanyName("lalala");
		c.saveChanges();

		c.accessOneRec(5, true);
		assertEquals(c.getName(), "Kalabaka!");

		// --------- update row
		String temporaryData = new Date().toString();
		System.out.println("our date = " + temporaryData);
		System.out.println(c.accessOneRec(2, true));
		if (!c.accessOneRec(2, true))
			c.setId(2);
		c.setName("George good programmer!");
		c.setCompanyName(temporaryData);
		c.saveChanges();

		c.accessOneRec(2, true);
		assertEquals(c.getName(), "George good programmer!");
		assertEquals(c.getCompanyName(), temporaryData);

		// --------- delete row
		if (c.accessOneRec(5, true)) {
			c.getDataSetMain().deleteRow();
			c.saveChanges();
		}
		assertFalse(c.accessOneRec(5, true));

	}

	@Test
	public void testList() {
		T6467063785 c = T6467063785.getDfltInstance(T6467063785AccessType.LIST);

		if (c.accessList(true)) {
			c.getDataSetMain().first();
			do {
				System.out.println("My id (from list) = " + c.getId() + "; NAME = " + c.getName() + "; COMPANY NAME = " + c.getCompanyName());
			} while (c.getDataSetMain().next());
		}
	}
}
