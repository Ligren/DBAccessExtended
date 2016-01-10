package com.limosys.dblib.vladtest.test;

import org.junit.Test;

import com.limosys.dblib.vladtest.T6467063785;
import com.limosys.dblib.vladtest.da.T6467063785DataAccess.T6467063785AccessType;
import com.limosys.jlimoobject.SaveException;

public class T6467063785Test {

	@Test
	public void testOneRec() {
		T6467063785 c = T6467063785.getDfltInstance(T6467063785AccessType.ONEREC);
		
		if(c.accessOneRec(1, true)) {
			c.getDataSetMain().first();
			System.out.println("My id = " + c.getId() + "; NAME = " + c.getName());
		}
		
		c.addNew();
		c.setId(9);
		c.setName("TEst5");
		try {
			c.saveChanges();
		} catch (SaveException e) {
			System.out.println("Not saved !");
			e.printStackTrace();
		}
	}
	
	@Test
	public void testList() {
		T6467063785 c = T6467063785.getDfltInstance(T6467063785AccessType.LIST);
		
		if(c.accessList(true)) {
			c.getDataSetMain().first();
			do {
				System.out.println(c.getId() + ", " + c.getName());
			} while (c.getDataSetMain().next());
		}
	}
}
