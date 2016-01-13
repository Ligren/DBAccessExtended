package com.limosys.dblib.vladtest;

import java.util.Hashtable;

import com.borland.dx.dataset.ReadWriteRow;
import com.borland.dx.dataset.StorageDataSet;
import com.borland.dx.sql.dataset.Database;
import com.borland.dx.sql.dataset.ProcedureDataSet;
import com.limosys.dbaccess.counters.LSCounter;
import com.limosys.dblib.vladtest.da.VladDogDataAccess;
import com.limosys.dblib.vladtest.da.T6467063785DataAccess.T6467063785AccessType;
import com.limosys.jlimoobject.ValidateResult;

public class VladDog extends VladDogDataAccess {

	private Database construct_db;
	// protected VladDogChangeLog chngLog = super.getChangeLog();
	private static VladDog dfltInstance_NONE = null;
	private static VladDog dfltInstance_ONEREC = null;
	private static VladDog dfltInstance_LIST = null;

	private static Hashtable<Integer, VladDog> htLookup = new Hashtable<Integer, VladDog>();

	public static VladDog getDfltVladDogLkup(Database db) {
		VladDog lkupObj;
		if (db == null) {
			lkupObj = getDfltInstance(VladDogAccessType.LIST);
			db = ((ProcedureDataSet) lkupObj.getDataSetMain()).getDatabase();
			htLookup.put(db.hashCode(), lkupObj);
		} else {
			if (htLookup.containsKey(db.hashCode())) {
				lkupObj = htLookup.get(db.hashCode());
			} else {
				lkupObj = new VladDog(VladDogAccessType.LIST, db);
				htLookup.put(db.hashCode(), lkupObj);
			}
		}
		if (!lkupObj.getDataSetMain().isOpen()) lkupObj.RefreshDataSets();
		return lkupObj;
	}

	public static VladDog getDfltInstance(VladDogAccessType accessType) {
		switch (accessType) {
			case ONEREC:
				if (dfltInstance_ONEREC == null) dfltInstance_ONEREC = new VladDog(VladDogAccessType.ONEREC);
				// if (!dfltInstance_ONEREC.getDataSetMain().isOpen()) dfltInstance_ONEREC.RefreshDataSets();
				return dfltInstance_ONEREC;
			case LIST:
				if (dfltInstance_LIST == null) dfltInstance_LIST = new VladDog(VladDogAccessType.LIST);
				// if (!dfltInstance_LIST.getDataSetMain().isOpen()) dfltInstance_LIST.RefreshDataSets();
				return dfltInstance_LIST;
			default:
				if (dfltInstance_NONE == null) dfltInstance_NONE = new VladDog(VladDogAccessType.NONE);
				return dfltInstance_NONE;
		}
	}

	public static VladDog getDfltInstance() {
		return getDfltInstance(VladDogAccessType.NONE);
	}

	// protected StorageDataSet sdsMain = super.getDataSetMain();
	// protected StorageDataSet sdsNone = super.getSdsNone();
	// protected Column colName = super.colName();
	// protected Column colId = super.colId();
	// protected Column colFriendId = super.colFriendId();
	// protected Column colDateTimeOfDeath = super.colDateTimeOfDeath();
	// protected Column colAmountOfLegs = super.colAmountOfLegs();
	// protected Column colDateOfBirth = super.colDateOfBirth();

	public VladDog() {
		// super(VladDogAccessType.ONEREC, true);
		// super(VlaidDogAccessType.LIST, true);
		try {
			jbInit();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public VladDog(VladDogAccessType accessType) {
		try {
			jbInit();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		setAccessType(accessType, false);
	}

	public VladDog(VladDogAccessType accessType, StorageDataSet sds) {
		super(accessType, new StorageDataSet[] { sds });
		try {
			jbInit();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public VladDog(VladDogAccessType accessType, Database db) {
		construct_db = db;
		try {
			jbInit();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		setAccessType(accessType, construct_db);
	}

	private void lsInit() {
		// sdsMain.setColumns(sdsMain.getColumns());
		// sdsNone.setColumns(super.getDesignColumns());
	}

	private void jbInit() throws Exception {
		lsInit();
	}

public boolean accessOneRec(int id,	boolean forceRefresh)	{
  return accessOneRec(id, false, forceRefresh);
}

public boolean accessOneRec(int id,	boolean insertRow, boolean forceRefresh) {
		if (getAccessType() != VladDogAccessType.ONEREC) {
			if (construct_db != null) {
				this.setAccessType(VladDogAccessType.ONEREC, construct_db);
			} else {
				this.setAccessType(VladDogAccessType.ONEREC, false);
			}
		}
		StorageDataSet sds = getDataSetMain();
		ReadWriteRow paramRow = sds.getProvider().getParameterRow();
		if (!paramRow.isNull("ID") && paramRow.getString("ID").equals(id)) {
			if (forceRefresh) this.RefreshDataSets();
		} else {
			paramRow.setInt("ID", id);
			this.RefreshDataSets();
		}
		if (sds.rowCount() == 0 && insertRow) {
			sds.insertRow(false);
			return false;
		} else if (sds.rowCount() > 0) { return true; }
		return false;
	}
/*
public boolean moveToRow_By?(
	String _)

	{
		if (this.getAccessType() != VladDogAccessType._) { throw new DataSetException("can't use moveToRow... with " + this.getAccessType()); }
		String _FldName = col_().getColumnName();
		StorageDataSet sds = getDataSetMain();
		if (!sds.isOpen()) sds.open();
		DataRow _dr = new DataRow(sds, new String[] { _FldName });
		_dr.setString(_FldName, _);
		return sds.locate(_dr, Locate.FIRST);
	}
	*/

	protected boolean allowAccessTypeChange(VladDogAccessType accessType) {
		if (this == dfltInstance_ONEREC) {
			if (accessType != VladDogAccessType.ONEREC) return false;
		} else if (this == dfltInstance_LIST) {
			if (accessType != VladDogAccessType.LIST) return false;
		} else {
			return true;
		}
		return true;
	}
	
	public boolean accessList(boolean forceRefresh) {
		return accessList(false, forceRefresh);
	}

	public boolean accessList(boolean insertRow, boolean forceRefresh) {
		if (getAccessType() != VladDogAccessType.LIST) {
			if (construct_db != null) {
				this.setAccessType(VladDogAccessType.LIST, construct_db);
			} else {
				this.setAccessType(VladDogAccessType.LIST, false);
			}
		}
		StorageDataSet sds = getDataSetMain();		
		
		if (forceRefresh) this.RefreshDataSets();
		
		if (sds.rowCount() == 0 && insertRow) {
			sds.insertRow(false);
			return false;
		} else if (sds.rowCount() > 0) { return true; }
		return false;
	}

	

	@Override
	protected void addCalculatedColumns() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected ValidateResult validateRow(ReadWriteRow origRow) {
		if(isIdNull() || getId() == 0)
			setId(LSCounter.getVladDogIdCounter());
		return null;
	}

	@Override
	public void synchronizeWithMainDataSet() {
	}

}
