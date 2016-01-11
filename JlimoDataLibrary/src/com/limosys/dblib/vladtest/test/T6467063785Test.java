package com.limosys.dblib.vladtest.test;

import org.junit.Test;

import com.limosys.dblib.vladtest.T6467063785;
import com.limosys.dblib.vladtest.da.T6467063785DataAccess.T6467063785AccessType;
import com.limosys.jlimoobject.SaveException;

public class T6467063785Test {

	@Test
	public void testOneRec() {
		T6467063785 c = T6467063785.getDfltInstance(T6467063785AccessType.ONEREC);

		if (c.accessOneRec(1, true)) {
			c.getDataSetMain().first();
			System.out.println("My id = " + c.getId() + "; NAME = " + c.getName());
		}

		//--------- add new row
		c.addNew();
		c.setId(5);
		c.setName("Kalabaka!");
		try {
			c.saveChanges();
			System.out.println("Created");
		} catch (SaveException e) {
			System.out.println("Not saved !");
			e.printStackTrace();
		}

		//--------- update row
		c.accessOneRec(2, true);
		c.setName("George good programmer!");
		try {
			c.saveChanges();
			System.out.println("Updated");
		} catch (SaveException e) {
			System.out.println("Not saved !");
			e.printStackTrace();
		}
		
		//--------- delete row
		c.accessOneRec(5, true);
		c.getDataSetMain().deleteRow();
		try {
			c.saveChanges();
			System.out.println("Deleted");
		} catch (SaveException e) {
			System.out.println("Not saved !");
			e.printStackTrace();
		}

	}

	@Test
	public void testList() {
		T6467063785 c = T6467063785.getDfltInstance(T6467063785AccessType.LIST);
		
		if (c.accessList(true)) {
			c.getDataSetMain().first();
			do {
				System.out.println("My id (from list) = " + c.getId() + "; NAME = " + c.getName());
			} while (c.getDataSetMain().next());
		}
	}
}
