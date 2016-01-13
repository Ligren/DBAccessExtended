package com.limosys.jlimoobject.define.vladtest;

import com.limosys.dbaccess.vladtest.VladDogAccess;
import com.limosys.dbaccess.vladtest.VladDogAccessList;
import com.limosys.jlimoobject.define.JLimoObjectDataAccessInfo;

public class VladDogDataAccessInfo extends JLimoObjectDataAccessInfo {
	protected void prepareDataAccessInfo() {		
		AccessTypeInfo ati = new AccessTypeInfo("ONEREC");
		ati.addDataSetInfo("DEFAULT",
		                   VladDogAccess.getInstance().getViewDataSet(),
												"com.limosys.dbaccess.vladtest",
												"VladDogAccess",
												"getInstance()",
												"getViewDataSet()");
		this.addAccessTypeInfo(ati);
		
		ati = new AccessTypeInfo("LIST");
		ati.addDataSetInfo("DEFAULT",
		                   	VladDogAccessList.getInstance().getViewDataSet(),
												"com.limosys.dbaccess.vladtest",
												"VladDogAccessList",
												"getInstance()",
												"getViewDataSet()");
		this.addAccessTypeInfo(ati);
	}
}
