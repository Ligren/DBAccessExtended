package com.limosys.jlimoobject.define.vladtest;

import com.limosys.dbaccess.vladtest.T6467063785Access;
import com.limosys.dbaccess.vladtest.T6467063785AccessList;
import com.limosys.jlimoobject.define.JLimoObjectDataAccessInfo;

public class T6467063785DataAccessInfo extends JLimoObjectDataAccessInfo {
	protected void prepareDataAccessInfo() {		
		AccessTypeInfo ati = new AccessTypeInfo("ONEREC");
		ati.addDataSetInfo("DEFAULT",
												T6467063785Access.getInstance().getViewDataSet(),
												"com.limosys.dbaccess.vladtest",
												"T6467063785Access",
												"getInstance()",
												"getViewDataSet()");
		this.addAccessTypeInfo(ati);
		
		ati = new AccessTypeInfo("LIST");
		ati.addDataSetInfo("DEFAULT",
												T6467063785AccessList.getInstance().getViewDataSet(),
												"com.limosys.dbaccess.vladtest",
												"T6467063785AccessList",
												"getInstance()",
												"getViewDataSet()");
		this.addAccessTypeInfo(ati);
	}
}
