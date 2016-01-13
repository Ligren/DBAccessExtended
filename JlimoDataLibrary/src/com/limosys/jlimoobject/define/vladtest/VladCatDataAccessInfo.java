package com.limosys.jlimoobject.define.vladtest;

import com.limosys.dbaccess.vladtest.VladCatAccess;
import com.limosys.dbaccess.vladtest.VladCatAccessList;
import com.limosys.jlimoobject.define.JLimoObjectDataAccessInfo;

public class VladCatDataAccessInfo extends JLimoObjectDataAccessInfo {
	protected void prepareDataAccessInfo() {		
		AccessTypeInfo ati = new AccessTypeInfo("ONEREC");
		ati.addDataSetInfo("DEFAULT",
		                   VladCatAccess.getInstance().getViewDataSet(),
												"com.limosys.dbaccess.vladtest",
												"VladCatAccess",
												"getInstance()",
												"getViewDataSet()");
		this.addAccessTypeInfo(ati);
		
		ati = new AccessTypeInfo("LIST");
		ati.addDataSetInfo("DEFAULT",
		                   	VladCatAccessList.getInstance().getViewDataSet(),
												"com.limosys.dbaccess.vladtest",
												"VladCatAccessList",
												"getInstance()",
												"getViewDataSet()");
		this.addAccessTypeInfo(ati);
	}
}
