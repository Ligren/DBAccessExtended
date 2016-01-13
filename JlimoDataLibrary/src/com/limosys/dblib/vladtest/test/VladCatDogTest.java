package com.limosys.dblib.vladtest.test;

import java.util.Date;
import java.util.Random;

import org.junit.Before;
import org.junit.Test;

import com.limosys.dblib.vladtest.VladCat;
import com.limosys.dblib.vladtest.VladDog;
import com.limosys.dblib.vladtest.da.VladCatDataAccess.VladCatAccessType;
import com.limosys.dblib.vladtest.da.VladDogDataAccess.VladDogAccessType;
import com.limosys.jlimoobject.SaveException;

public class VladCatDogTest {
	private VladCat cat;
	private VladDog dog;
	private VladDog dogList;
	private Random rndm;

	@Before
	public void before() {
		cat = VladCat.getDfltInstance(VladCatAccessType.ONEREC);
		dog = VladDog.getDfltInstance(VladDogAccessType.ONEREC);
		dogList = VladDog.getDfltInstance(VladDogAccessType.LIST);
		rndm = new Random();
	}

	@Test
	public void addRowTest() throws SaveException {

		for (int i = 1; i < 100; i++) {
			Long lngDOB = 1500000000000L;
			long rndmInt = (long) Math.sqrt(rndm.nextInt(Integer.MAX_VALUE - 1));

			cat.addNew();
			cat.setAmountOfLegs((short) 4);
			cat.setName("Borya #" + rndm.nextInt(500));
			cat.setDateOfBirth(new Date(lngDOB + rndmInt * 2));
			cat.setDateTimeOfDeath(new Date(lngDOB + rndmInt * 13000000));
			cat.saveChanges();

			dog.addNew();
			dog.setAmountOfLegs((short) (rndm.nextInt(4) + 1));
			dog.setName("Timur #" + rndm.nextInt(500));
			dog.setDateOfBirth(new Date(lngDOB + rndmInt));
			dog.setDateTimeOfDeath(new Date(lngDOB + rndmInt * 10000000));
			dog.saveChanges();
		}
	}

	@Test
	public void deleteRowTest() throws SaveException {
		if (dogList.accessList(true)) {
			int amountRow = dogList.getDataSetMain().getRowCount();
			dogList.getDataSetMain().first();
			for (int i = 1; i < amountRow; i++) {
				if (dogList.getAmountOfLegs() <= 2) {
					dogList.getDataSetMain().deleteRow();
				} else {
					dogList.getDataSetMain().next();
				}
			}
			dogList.saveChanges();
		}
	}

	@Test
	public void updateRowTest() throws SaveException {

		// fix dog
		if (dogList.accessList(true)) {
			dogList.getDataSetMain().first();
			do {
				if (dogList.getAmountOfLegs() < 4) {
					dogList.setAmountOfLegs(fixLeg());
					dogList.saveChanges();
				}
			} while (dogList.getDataSetMain().next());
		}
	}

	private short fixLeg() {
		return 4;
	}

}
