package com.limosys.dbaccess.counters;

import java.sql.SQLException;
import java.util.Hashtable;

import com.borland.dx.dataset.Column;
import com.borland.dx.dataset.DataSetException;
import com.borland.dx.dataset.ParameterRow;
import com.borland.dx.dataset.ParameterType;
import com.borland.dx.sql.dataset.Database;
import com.borland.dx.sql.dataset.Load;
import com.borland.dx.sql.dataset.ProcedureDataSet;
import com.borland.dx.sql.dataset.ProcedureDescriptor;
import com.limosys.dbaccess.Connection;
import com.limosys.dbaccess.counters.AcctCounter.AcctCounterType;

public class LSCounter {
	
	private static LSCounter custCounter;
	private static LSCounter jobIdCounter;
	private static LSCounter blngIdCounter;
	private static LSCounter webserviceIdCounter;
	private static LSCounter steadyIdCounter;
	private static LSCounter cxlIdCounter;
	private static LSCounter UserIdCounter;
	private static LSCounter sessionIdCounter;
	private static LSCounter depositCounter;
	private static LSCounter templateCounter;
	private static LSCounter emplIdCounter;
	private static LSCounter contactIdCounter;
	private static LSCounter deptIdCounter;
	private static LSCounter timeSliceIdCounter;
	private static LSCounter insurnaceCompCounter;
	private static LSCounter stationCounter;
	private static LSCounter hotelCounter;
	private static LSCounter drvrNotifyCounter;
	private static LSCounter steadyJobIdCounter;
	private static LSCounter terminalIdCounter;
	private static LSCounter miscChrgIdCounter;
	private static LSCounter drvrInvNumCounter;
	private static LSCounter msgIdCounter;
	private static LSCounter drvrHomeZoneIdCounter;
	private static LSCounter franchiseIdCounter;
	private static LSCounter refNoCounter;
	private static LSCounter drvrChrgSeq;
	private static LSCounter schemaIdCounter;
	private static LSCounter cVipIdCounter;
	private static LSCounter maintIdCounter;
	private static LSCounter drvrChrgTypeIdCounter;
	private static LSCounter drvrReceiptNumCounter;
	private static LSCounter voucherIdCounter;
	private static LSCounter pttRecIdCounter;
	private static LSCounter userEmpIdCounter;
	private static LSCounter bankAcctIdCounter;
	private static LSCounter gasStationIdCounter;
	private static LSCounter drvrSchedExportIdCounter;
	private static LSCounter carLinkIdCounter;
	private static LSCounter affiliateNotifyIdCounter;
	private static LSCounter ccSubmerchantIdCounter;
	private static LSCounter drvrCommIdCounter;
	private static LSCounter stopIdCounter;
	private static LSCounter affiliateNotifyJobIdCounter;
	private static LSCounter driverPanicMsgCounter;
	private static LSCounter gpsAffiliateBackupRecordidCounter;
	private static LSCounter wlLimitCounter;
	private static LSCounter carGroupIdCounter;
	private static LSCounter commentIdCounter;
	private static LSCounter mobileFeedbackIdCounter;
	private static LSCounter docIdCounter;
	private static LSCounter franChrgIdCounter;	
	private static LSCounter vladCatCounter;
	private static LSCounter vladDogCounter;

	private static final String S_ACCS_GRP_ID = "ACCS_GRP_ID";
	private static final String S_BLNG_ID = "BLNG_ENT";
	private static final String S_EMPL_ID = "EMPL_ID";
	private static final String S_CONTACT_ID = "CONTACT_ID";
	private static final String S_DEPT_ID = "DEPT_ID";
	private static final String S_JOB_ID = "JOB_ID";
	private static final String S_CUST_ID = "CUST_ID";
	private static final String S_CXL_ID = "CXL_ID";
	private static final String S_TIME_SLICE = "TIME_SLICE";
	private static final String S_INSURANCE_COMP = "INSR_COMP";
	private static final String S_STATION_ID = "STATION_ID";
	private static final String S_HOTEL_ID = "HOTEL_ID";
	private static final String S_DRVR_NOTIFY_ID = "DRVR_NOTIFY_ID";
	private static final String S_STEADY_JOB_ID = "STEADY_JOB_ID";
	private static final String S_TERMINAL_ID = "TERMINAL_ID";
	private static final String S_MISC_CHRG_ID = "MISC_CHRG_ID";
	private static final String S_DRVR_INV_NUM = "DRVR_INV_NUM";
	private static final String S_MSG_ID = "MSG_ID";
	private static final String S_DRVR_HOME_ZONE_ID = "DRVR_HOME_ZONE_ID";
	private static final String S_FRANCHISE_ID = "FRANCHISE_ID";
	private static final String S_REF_NO = "REF_NO";
	private static final String S_DRVR_CHRG_SEQ = "DRVR_CHRG_SEQ";
	private static final String S_SCHEMA_ID = "SCHEMA_ID";
	private static final String S_CVIP_ID = "CVIP_ID";
	private static final String S_MAINT_ID = "MAINT_ID";
	private static final String S_DRVR_CHRG_TYPE_ID = "DRVR_CHRG_TYPE_ID";
	private static final String S_DRVR_RECEIPT_NUM = "DRVR_RECEIPT_NUM";
	private static final String S_VOUCHER_ID = "VOUCHER_ID";
	private static final String S_PTT_REC_ID = "PTT_REC_ID";
	private static final String S_USER_EMP_ID = "USER_EMP_ID";
	private static final String S_BANK_ACCT_ID = "BANK_ACCT_ID";
	private static final String S_GAS_STATION_ID = "GAS_STATION_ID";
	private static final String S_DRVR_SCHED_EXPORT_ID = "DRVR_SCHED_EXPORT_ID";
	private static final String S_CAR_LINK_ID = "CAR_LINK_ID";
	private static final String S_AFFILIATE_NOTIFY_ID = "AFFILIATE_NOTIFY_ID";
	private static final String S_CC_SUBMERCHANT_ID = "CC_SUBMERCHANT_ID";
	private static final String S_DRVR_COMM_ID = "DRVR_COMM_ID";
	private static final String S_STOP_ID = "STOP_ID";
	private static final String S_AFFILIATE_NOTIFY_JOB_ID = "NOTIFY_ID";
	private static final String S_DRIVER_PANIC_MSG_ID = "MSG_ID";
	private static final String S_GPS_AFFILIATE_BACKUP_RECORD_ID = "RECORD_ID";
	private static final String S_WL_LIMIT_ID = "WL_LIMIT_ID";
	private static final String S_CAR_GROUP_ID = "CAR_GROUP_ID";
	private static final String S_COMMENT_ID = "COMMENT_ID";
	private static final String S_MOBILE_FEEDBACK_ID = "FEEDBACK_ID";
	private static final String S_DOC_ID = "DOC_ID";
	private static final String S_FRAN_CHRG_ID = "FRAN_CHRG_ID";
	private static final String S_VLAD_CAT_COUNTER= "VLAD_TEST_CAT_ID";
	private static final String S_VLAD_DOG_COUNTER = "VLAD_TEST_DOG_ID";

	private static LSCounter accsGrpIdCounter;

	private static Database dbStatic;
	private Database dbJLimo;

	private ParameterRow paramRowCounterDisp = new ParameterRow();

	private Column col_prAcct_Name = new Column();
	private Column col_prCounters_Name1 = new Column();

	ProcedureDataSet procDSCounterDisp = new ProcedureDataSet();


	public enum LSCounterType {
		ALEPH_RESULT_ITEM_ID
	}
	
	private static Hashtable<Integer, LSCounter> htCounter = new Hashtable<Integer, LSCounter>();
	
	public static int getNextCounterValue(Database db, LSCounterType counterType) {
		return LSCounter.getDfltCounter(db).getNextCounterValue(counterType);
	}
	
	private static LSCounter getDfltCounter(Database db) {
		LSCounter counter = null;
		if (db == null) db = Connection.getAddressDefault();
		if (htCounter.containsKey(db.hashCode())) {
			counter = htCounter.get(db.hashCode());
		} else {
			counter = new LSCounter(db);
			htCounter.put(db.hashCode(), counter);
		}
		return counter;
	}


	public LSCounter() {
		try {
			this.dbJLimo = dbStatic;
			jbInit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public LSCounter(Database db) {
		dbJLimo = Connection.getAddress(db);
		procDSCounterDisp.setEnableDelete(false);

		col_prAcct_Name.setColumnName("@CounterName");
		col_prAcct_Name.setDataType(com.borland.dx.dataset.Variant.STRING);
		col_prAcct_Name.setDefault("Job_Id");
		col_prAcct_Name.setParameterType(ParameterType.IN);
		col_prAcct_Name.setServerColumnName("@CounterName");
		col_prAcct_Name.setSqlType(0);

		col_prCounters_Name1.setColumnName("COUNTER_NME");
		col_prCounters_Name1.setDataType(com.borland.dx.dataset.Variant.STRING);
		col_prCounters_Name1.setDefault("Job_Id");
		col_prCounters_Name1.setServerColumnName("COUNTER_NME");
		col_prCounters_Name1.setParameterType(ParameterType.IN);
		col_prCounters_Name1.setSqlType(java.sql.Types.CHAR);
		paramRowCounterDisp.setColumns(new Column[] { col_prCounters_Name1 });

		try {
			procDSCounterDisp.setProcedure(new ProcedureDescriptor(dbJLimo, "exec dbo.SP_UpdateCounter :COUNTER_NME", paramRowCounterDisp, true, Load.ALL));
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private int getNextCounterValue(LSCounterType counterType) {
		procDSCounterDisp.getParameterRow().setString("COUNTER_NME", counterType.name());		
		int c = -1;
		while (c == -1) {
			try {
				procDSCounterDisp.executeQuery();
				c = procDSCounterDisp.getInt("PK_NEXT_ID");
			} catch (DataSetException dse) {
				dse.printStackTrace();
				if ((dse.getMessage() != null && dse.getMessage().contains("connection is closed"))
						|| (dse.getCause() != null && dse.getCause().getMessage() != null // check "Chained exception"
						&& dse.getCause().getMessage().contains("connecton is closed")))
					// TODO: Add more possible error messages to exit this loop.
					throw new DataSetException("LSCounter Database is closed");

				c = -1;
			}
		}
		return c;
	}
	
	
	public static void setDbStatic(Database db) {
		dbStatic = db;
	}

	public static synchronized int getJobId() {
		if (jobIdCounter == null) {
			jobIdCounter = new LSCounter();
		}
		return jobIdCounter.getNextCounterValueDisp(S_JOB_ID);
	}

	public static synchronized int getCustId() {
		if (custCounter == null) custCounter = new LSCounter();
		return custCounter.getNextCounterValueDisp(S_CUST_ID);
	}

	public static synchronized int getBlngId() {
		if (blngIdCounter == null) blngIdCounter = new LSCounter();
		return blngIdCounter.getNextCounterValueDisp(S_BLNG_ID);
	}

	public static synchronized int getEmplId() {
		if (emplIdCounter == null) emplIdCounter = new LSCounter();
		return emplIdCounter.getNextCounterValueDisp(S_EMPL_ID);
	}

	public static synchronized int getContactId() {
		if (contactIdCounter == null) contactIdCounter = new LSCounter();
		return contactIdCounter.getNextCounterValueDisp(S_CONTACT_ID);
	}

	public static synchronized int getDeptId() {
		if (deptIdCounter == null) deptIdCounter = new LSCounter();
		return deptIdCounter.getNextCounterValueDisp(S_DEPT_ID);
	}

	public static synchronized int getTimeSliceId() {
		if (timeSliceIdCounter == null) timeSliceIdCounter = new LSCounter();
		return timeSliceIdCounter.getNextCounterValueDisp(S_TIME_SLICE);
	}

	public static synchronized int getInsuranceCompIdId() {
		if (insurnaceCompCounter == null) insurnaceCompCounter = new LSCounter();
		return insurnaceCompCounter.getNextCounterValueDisp(S_INSURANCE_COMP);
	}

	public static synchronized int getTemplateId() {
		if (templateCounter == null) templateCounter = new LSCounter();
		return templateCounter.getNextCounterValueDisp("TEMPLATE_ID");
	}

	public static synchronized int getCustomerNo() {
		if (custCounter == null) custCounter = new LSCounter();
		return custCounter.getNextCounterValueDisp("CUSTOMER_NO");
	}

	public static synchronized int getSessionId() {
		if (sessionIdCounter == null) sessionIdCounter = new LSCounter();
		return sessionIdCounter.getNextCounterValueDisp("SESSION_ID");
	}

	public static synchronized int getCxlId() {
		if (cxlIdCounter == null) cxlIdCounter = new LSCounter();
		return cxlIdCounter.getNextCounterValueDisp(S_CXL_ID);
	}

	public static synchronized int getDepositNo() {
		if (depositCounter == null) depositCounter = new LSCounter();
		return depositCounter.getNextCounterValueDisp("DEPOSIT_NO");
	}

	public static synchronized int getSteadyId() {
		if (steadyIdCounter == null) steadyIdCounter = new LSCounter();
		return steadyIdCounter.getNextCounterValueDisp("Steady_Id");
	}

	public static synchronized int getUserIdCounter() {
		if (UserIdCounter == null) UserIdCounter = new LSCounter();
		return UserIdCounter.getNextCounterValueDisp("Users");
	}

	public static synchronized int getStationIdCounter() {
		if (stationCounter == null) stationCounter = new LSCounter();
		return stationCounter.getNextCounterValueDisp(S_STATION_ID);
	}

	public static synchronized int getHotelIdCounter() {
		if (hotelCounter == null) hotelCounter = new LSCounter();
		return hotelCounter.getNextCounterValueDisp(S_HOTEL_ID);
	}

	public static synchronized int getSteadyJobId() {
		if (steadyJobIdCounter == null) steadyJobIdCounter = new LSCounter();
		return steadyJobIdCounter.getNextCounterValueDisp(S_STEADY_JOB_ID);
	}

	public static synchronized int getTerminalId() {
		if (terminalIdCounter == null) terminalIdCounter = new LSCounter();
		return terminalIdCounter.getNextCounterValueDisp(S_TERMINAL_ID);
	}

	public static synchronized int getMiscChrgId() {
		if (miscChrgIdCounter == null) miscChrgIdCounter = new LSCounter();
		return miscChrgIdCounter.getNextCounterValueDisp(S_MISC_CHRG_ID);
	}

	public static synchronized int getDrvrInvNum() {
		if (drvrInvNumCounter == null) drvrInvNumCounter = new LSCounter();
		return drvrInvNumCounter.getNextCounterValueDisp(S_DRVR_INV_NUM);
	}

	public static synchronized int getMsgId() {
		if (msgIdCounter == null) msgIdCounter = new LSCounter();
		return msgIdCounter.getNextCounterValueDisp(S_MSG_ID);
	}

	public static int getDrvrHomeZoneId() {
		if (drvrHomeZoneIdCounter == null) drvrHomeZoneIdCounter = new LSCounter();
		return drvrHomeZoneIdCounter.getNextCounterValueDisp(S_DRVR_HOME_ZONE_ID);
	}

	public static int getFranchiseId() {
		if (franchiseIdCounter == null) franchiseIdCounter = new LSCounter();
		return franchiseIdCounter.getNextCounterValueDisp(S_FRANCHISE_ID);
	}

	public static int getRefNo() {
		if (refNoCounter == null) refNoCounter = new LSCounter();
		return refNoCounter.getNextCounterValueDisp(S_REF_NO);
	}

	public static synchronized int getDrvrChrgSeq() {
		if (drvrChrgSeq == null) drvrChrgSeq = new LSCounter();
		return drvrChrgSeq.getNextCounterValueDisp(S_DRVR_CHRG_SEQ);
	}

	public static synchronized int getSchemaId() {
		if (schemaIdCounter == null) schemaIdCounter = new LSCounter();
		return schemaIdCounter.getNextCounterValueDisp(S_SCHEMA_ID);
	}

	public static synchronized int getDrvrNotifyIdCounter() {
		if (drvrNotifyCounter == null) drvrNotifyCounter = new LSCounter();
		return drvrNotifyCounter.getNextCounterValueDisp(S_DRVR_NOTIFY_ID);
	}

	public static synchronized int getDriverPanicMsgIdCounter() {
		if (driverPanicMsgCounter == null) driverPanicMsgCounter = new LSCounter();
		return driverPanicMsgCounter.getNextCounterValueDisp(S_DRIVER_PANIC_MSG_ID);
	}
	
	public static synchronized int getVladCatIdCounter() {
		if (vladCatCounter == null) vladCatCounter = new LSCounter();
		return vladCatCounter.getNextCounterValueDisp(S_VLAD_CAT_COUNTER);
	}

	private synchronized int getNextCounterValueDisp(String counterName) {
		if (!paramRowCounterDisp.getString("COUNTER_NME").equals(counterName)) {
			paramRowCounterDisp.setString("COUNTER_NME", counterName);
		}
		int c = -1;
		while (c == -1) {
			try {
				procDSCounterDisp.executeQuery();
				c = procDSCounterDisp.getInt("PK_NEXT_ID");
			} catch (DataSetException dse) {
				dse.printStackTrace();
				if ((dse.getMessage() != null && dse.getMessage().contains("connection is closed"))
						|| (dse.getCause() != null && dse.getCause().getMessage() != null // check "Chained exception"
						&& dse.getCause().getMessage().contains("connecton is closed")))
					// TODO: Add more possible error messages to exit this loop.
					throw new DataSetException("LSCounter Database is closed");

				c = -1;
			}
		}
		return c;
	}

	public static synchronized int getAccsGrpId() {
		if (accsGrpIdCounter == null) {
			accsGrpIdCounter = new LSCounter();
		}
		return accsGrpIdCounter.getNextCounterValueDisp(S_ACCS_GRP_ID);
	}

	public static synchronized int getDrvrCommIdCounter() {
		if (drvrCommIdCounter == null) {
			drvrCommIdCounter = new LSCounter();
		}
		return drvrCommIdCounter.getNextCounterValueDisp(S_DRVR_COMM_ID);
	}

	private void jbInit() throws Exception {
		dbJLimo = com.limosys.dbaccess.Connection.getAddress(dbJLimo);
		procDSCounterDisp.setEnableDelete(false);

		col_prAcct_Name.setColumnName("@CounterName");
		col_prAcct_Name.setDataType(com.borland.dx.dataset.Variant.STRING);
		col_prAcct_Name.setDefault("Job_Id");
		col_prAcct_Name.setParameterType(ParameterType.IN);
		col_prAcct_Name.setServerColumnName("@CounterName");
		col_prAcct_Name.setSqlType(0);

		col_prCounters_Name1.setColumnName("COUNTER_NME");
		col_prCounters_Name1.setDataType(com.borland.dx.dataset.Variant.STRING);
		col_prCounters_Name1.setDefault("Job_Id");
		col_prCounters_Name1.setServerColumnName("COUNTER_NME");
		col_prCounters_Name1.setParameterType(ParameterType.IN);
		col_prCounters_Name1.setSqlType(java.sql.Types.CHAR);
		paramRowCounterDisp.setColumns(new Column[] { col_prCounters_Name1 });

		procDSCounterDisp.setProcedure(new com.borland.dx.sql.dataset.
											ProcedureDescriptor(dbJLimo,
																					"exec dbo.SP_UpdateCounter :COUNTER_NME", paramRowCounterDisp, true,
																					Load.ALL));
	}

	public static synchronized int getWebSericveId() {
		if (webserviceIdCounter == null) {
			webserviceIdCounter = new LSCounter();
		}
		return webserviceIdCounter.getNextCounterValueDisp("WEBSERVICE");
	}

	public static int getCVipId() {
		if (cVipIdCounter == null) {
			cVipIdCounter = new LSCounter();
		}
		return cVipIdCounter.getNextCounterValueDisp(S_CVIP_ID);
	}

	public static int getMaintId() {
		if (maintIdCounter == null) {
			maintIdCounter = new LSCounter();
		}
		return maintIdCounter.getNextCounterValueDisp(S_MAINT_ID);
	}

	public static int getDrvrChrgTypeId() {
		if (drvrChrgTypeIdCounter == null) {
			drvrChrgTypeIdCounter = new LSCounter();
		}
		return drvrChrgTypeIdCounter.getNextCounterValueDisp(S_DRVR_CHRG_TYPE_ID);
	}

	public static int getDrvrReceiptNum() {
		if (drvrReceiptNumCounter == null) {
			drvrReceiptNumCounter = new LSCounter();
		}
		return drvrReceiptNumCounter.getNextCounterValueDisp(S_DRVR_RECEIPT_NUM);
	}

	public static int getVoucherId() {
		if (voucherIdCounter == null) {
			voucherIdCounter = new LSCounter();
		}
		return voucherIdCounter.getNextCounterValueDisp(S_VOUCHER_ID);
	}

	public static int getPttRecId() {
		if (pttRecIdCounter == null) {
			pttRecIdCounter = new LSCounter();
		}
		return pttRecIdCounter.getNextCounterValueDisp(S_PTT_REC_ID);
	}

	public static int getUserEmpId() {
		if (userEmpIdCounter == null) {
			userEmpIdCounter = new LSCounter();
		}
		return userEmpIdCounter.getNextCounterValueDisp(S_USER_EMP_ID);
	}

	public static int getBankAcctId() {
		if (bankAcctIdCounter == null) {
			bankAcctIdCounter = new LSCounter();
		}
		return bankAcctIdCounter.getNextCounterValueDisp(S_BANK_ACCT_ID);
	}

	public static int getGasStationId() {
		if (gasStationIdCounter == null) {
			gasStationIdCounter = new LSCounter();
		}
		return gasStationIdCounter.getNextCounterValueDisp(S_GAS_STATION_ID);
	}

	public static Database getJobCounterDb() {
		if (jobIdCounter == null) jobIdCounter = new LSCounter();
		return jobIdCounter.dbJLimo;
	}

	public static int getDrvrSchedExportId() {
		if (drvrSchedExportIdCounter == null) drvrSchedExportIdCounter = new LSCounter();
		return drvrSchedExportIdCounter.getNextCounterValueDisp(S_DRVR_SCHED_EXPORT_ID);
	}

	public static int getCarLinkId() {
		if (carLinkIdCounter == null) carLinkIdCounter = new LSCounter();
		return carLinkIdCounter.getNextCounterValueDisp(S_CAR_LINK_ID);
	}

	public static int getAffiliateNotifyIdCounter() {
		if (affiliateNotifyIdCounter == null) affiliateNotifyIdCounter = new LSCounter();
		return affiliateNotifyIdCounter.getNextCounterValueDisp(S_AFFILIATE_NOTIFY_ID);
	}

	public static int getCcSubmerchantIdCounter() {
		if (ccSubmerchantIdCounter == null) ccSubmerchantIdCounter = new LSCounter();
		return ccSubmerchantIdCounter.getNextCounterValueDisp(S_CC_SUBMERCHANT_ID);
	}

	public static int getStopIdCounter() {
		if (stopIdCounter == null) stopIdCounter = new LSCounter();
		return stopIdCounter.getNextCounterValueDisp(S_STOP_ID);
	}

	public static int getAffiliateNotifyJobIdCounter() {
		if (affiliateNotifyJobIdCounter == null) affiliateNotifyJobIdCounter = new LSCounter();
		return affiliateNotifyJobIdCounter.getNextCounterValueDisp(S_AFFILIATE_NOTIFY_JOB_ID);
	}

	public static int getGpsAffiliateBackupRecordIdCounter() {
		if (gpsAffiliateBackupRecordidCounter == null) gpsAffiliateBackupRecordidCounter = new LSCounter();
		return gpsAffiliateBackupRecordidCounter.getNextCounterValueDisp(S_GPS_AFFILIATE_BACKUP_RECORD_ID);
	}

	public static int getWlLimitIdCounter() {
		if (wlLimitCounter == null) wlLimitCounter = new LSCounter();
		return wlLimitCounter.getNextCounterValueDisp(S_WL_LIMIT_ID);
	}

	public static int getCarGroupIdCounter() {
		if (carGroupIdCounter == null) carGroupIdCounter = new LSCounter();
		return carGroupIdCounter.getNextCounterValueDisp(S_CAR_GROUP_ID);
	}

	public static int getCommentIdCounter() {
		if (commentIdCounter == null) commentIdCounter = new LSCounter();
		return commentIdCounter.getNextCounterValueDisp(S_COMMENT_ID);
	}

	public static int getMobileFeedbackIdCounter() {
		if (mobileFeedbackIdCounter == null) mobileFeedbackIdCounter = new LSCounter();
		return mobileFeedbackIdCounter.getNextCounterValueDisp(S_MOBILE_FEEDBACK_ID);
	}

	public static int getAlephResultItemId() {
		// TODO Auto-generated method stub
		return 0;
	}

	public static synchronized int getDocIdCounter() {
		if (docIdCounter == null) {
			docIdCounter = new LSCounter();
		}
		return docIdCounter.getNextCounterValueDisp(S_DOC_ID);
	}

	public static synchronized int getFranChrgIdCounter() {
		if (franChrgIdCounter == null) {
			franChrgIdCounter = new LSCounter();
		}
		return franChrgIdCounter.getNextCounterValueDisp(S_FRAN_CHRG_ID);
	}

	public static int getVladDogIdCounter() {
		if (vladDogCounter == null) vladDogCounter = new LSCounter();
		return vladDogCounter.getNextCounterValueDisp(S_VLAD_DOG_COUNTER);
	}

}
