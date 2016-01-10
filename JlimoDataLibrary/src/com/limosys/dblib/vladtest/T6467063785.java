package com.limosys.dblib.vladtest;

import com.borland.dx.sql.dataset.Database;
import com.borland.dx.sql.dataset.ProcedureDataSet;
import com.limosys.dblib.vladtest.da.T6467063785DataAccess;
import com.limosys.jlimoobject.ValidateResult;
import com.borland.dx.dataset.StorageDataSet;
import com.borland.dx.dataset.ReadWriteRow;
import com.borland.dx.dataset.DataRow;
import com.borland.dx.dataset.DataSetException;
import com.borland.dx.dataset.Locate;
import java.util.Hashtable;

public class T6467063785 extends T6467063785DataAccess {

	private Database construct_db;
	// protected T6467063785ChangeLog chngLog = super.getChangeLog();
	private static T6467063785 dfltInstance_NONE = null;
	private static T6467063785 dfltInstance_ONEREC = null;
	private static T6467063785 dfltInstance_LIST = null;

	private static Hashtable<Integer, T6467063785> htLookup = new Hashtable<Integer, T6467063785>();

	public static T6467063785 getDfltT6467063785Lkup(Database db) {
		T6467063785 lkupObj;
		if (db == null) {
			lkupObj = getDfltInstance(T6467063785AccessType.LIST);
			db = ((ProcedureDataSet) lkupObj.getDataSetMain()).getDatabase();
			htLookup.put(db.hashCode(), lkupObj);
		} else {
			if (htLookup.containsKey(db.hashCode())) {
				lkupObj = htLookup.get(db.hashCode());
			} else {
				lkupObj = new T6467063785(T6467063785AccessType.LIST, db);
				htLookup.put(db.hashCode(), lkupObj);
			}
		}
		if (!lkupObj.getDataSetMain().isOpen()) lkupObj.RefreshDataSets();
		return lkupObj;
	}

	public static T6467063785 getDfltInstance(T6467063785AccessType accessType) {
		switch (accessType) {
			case ONEREC:
				if (dfltInstance_ONEREC == null) dfltInstance_ONEREC = new T6467063785(T6467063785AccessType.ONEREC);
				// if (!dfltInstance_ONEREC.getDataSetMain().isOpen()) dfltInstance_ONEREC.RefreshDataSets();
				return dfltInstance_ONEREC;
			case LIST:
				if (dfltInstance_LIST == null) dfltInstance_LIST = new T6467063785(T6467063785AccessType.LIST);
				// if (!dfltInstance_LIST.getDataSetMain().isOpen()) dfltInstance_LIST.RefreshDataSets();
				return dfltInstance_LIST;
			default:
				if (dfltInstance_NONE == null) dfltInstance_NONE = new T6467063785(T6467063785AccessType.NONE);
				return dfltInstance_NONE;
		}
	}

	public static T6467063785 getDfltInstance() {
		return getDfltInstance(T6467063785AccessType.NONE);
	}

	// protected StorageDataSet sdsMain = super.getDataSetMain();
	// protected StorageDataSet sdsNone = super.getSdsNone();
	// protected Column colName = super.colName();
	// protected Column colId = super.colId();

	public T6467063785() {
		// super(T6467063785AccessType.ONEREC, true);
		// super(T6467063785AccessType.LIST, true);
		try {
			jbInit();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public T6467063785(T6467063785AccessType accessType) {
		try {
			jbInit();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		setAccessType(accessType, false);
	}

	public T6467063785(T6467063785AccessType accessType, StorageDataSet sds) {
		super(accessType, new StorageDataSet[] { sds });
		try {
			jbInit();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public T6467063785(T6467063785AccessType accessType, Database db) {
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

	public boolean accessOneRec(int id, boolean forceRefresh) {
		return accessOneRec(id, false, forceRefresh);
	}

	public boolean accessOneRec(int id, boolean insertRow, boolean forceRefresh) {
		if (getAccessType() != T6467063785AccessType.ONEREC) {
			if (construct_db != null) {
				this.setAccessType(T6467063785AccessType.ONEREC, construct_db);
			} else {
				this.setAccessType(T6467063785AccessType.ONEREC, false);
			}
		}
		StorageDataSet sds = getDataSetMain();
		ReadWriteRow paramRow = sds.getProvider().getParameterRow();
		if (!paramRow.isNull("ID") && paramRow.getInt("ID") == id) {
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

	public boolean accessList(boolean forceRefresh) {
		return accessList(false, forceRefresh);
	}

	public boolean accessList(boolean insertRow, boolean forceRefresh) {
		if (getAccessType() != T6467063785AccessType.LIST) {
			if (construct_db != null) {
				this.setAccessType(T6467063785AccessType.LIST, construct_db);
			} else {
				this.setAccessType(T6467063785AccessType.LIST, false);
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
	
	// public boolean moveToRow_By?(
	// String _)
	//
	// {
	// if (this.getAccessType() != T6467063785AccessType._) { throw new DataSetException("can't use moveToRow... with " + this.getAccessType()); }
	// String _FldName = col_().getColumnName();
	// StorageDataSet sds = getDataSetMain();
	// if (!sds.isOpen()) sds.open();
	// DataRow _dr = new DataRow(sds, new String[] { _FldName });
	// _dr.setString(_FldName, _);
	// return sds.locate(_dr, Locate.FIRST);
	// }

	protected boolean allowAccessTypeChange(T6467063785AccessType accessType) {
		if (this == dfltInstance_ONEREC) {
			if (accessType != T6467063785AccessType.ONEREC) return false;
		} else if (this == dfltInstance_LIST) {
			if (accessType != T6467063785AccessType.LIST) return false;
		} else {
			return true;
		}
		return true;
	}

	@Override
	public void synchronizeWithMainDataSet() {
		// TODO Auto-generated method stub

	}

	@Override
	protected void addCalculatedColumns() {
		// TODO Auto-generated method stub

	}

	@Override
	protected ValidateResult validateRow(ReadWriteRow origRow) {
		// TODO Auto-generated method stub
		return null;
	}
}
