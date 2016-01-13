package com.limosys.dblib.vladtest;

import com.borland.dx.sql.dataset.Database;
import com.borland.dx.sql.dataset.ProcedureDataSet;
import com.limosys.dbaccess.counters.LSCounter;
import com.limosys.dblib.vladtest.da.VladCatDataAccess;
import com.limosys.dblib.vladtest.da.VladCatDataAccess.VladCatAccessType;
import com.limosys.jlimoobject.ValidateResult;
import com.borland.dx.dataset.StorageDataSet;
import com.borland.dx.dataset.ReadWriteRow;
import com.borland.dx.dataset.DataRow;
import com.borland.dx.dataset.DataSetException;
import com.borland.dx.dataset.Locate;
import java.util.Hashtable;

public class VladCat extends VladCatDataAccess {

private Database construct_db;

//protected VladCatChangeLog chngLog = super.getChangeLog();
private static VladCat dfltInstance_NONE = null; 
private static VladCat dfltInstance_ONEREC = null; 
private static VladCat dfltInstance_LIST = null; 

private static Hashtable<Integer, VladCat> htLookup = new Hashtable<Integer,VladCat>();
public static VladCat getDfltVladCatLkup(Database db) {
  VladCat lkupObj;
  if (db==null) {
    lkupObj = getDfltInstance(VladCatAccessType.LIST);
    db = ((ProcedureDataSet)lkupObj.getDataSetMain()).getDatabase();
    htLookup.put(db.hashCode(), lkupObj);
  } else {
    if (htLookup.containsKey(db.hashCode())) {
      lkupObj = htLookup.get(db.hashCode());
    } else {
      lkupObj = new VladCat(VladCatAccessType.LIST, db);
      htLookup.put(db.hashCode(), lkupObj);
    }
  }
  if (!lkupObj.getDataSetMain().isOpen()) lkupObj.RefreshDataSets();
  return lkupObj;
}

public static VladCat getDfltInstance(VladCatAccessType accessType) {
switch (accessType) {
  case ONEREC :
    if(dfltInstance_ONEREC == null) dfltInstance_ONEREC = new VladCat(VladCatAccessType.ONEREC);
    //if (!dfltInstance_ONEREC.getDataSetMain().isOpen()) dfltInstance_ONEREC.RefreshDataSets();
    return dfltInstance_ONEREC;
  case LIST :
    if(dfltInstance_LIST == null) dfltInstance_LIST = new VladCat(VladCatAccessType.LIST);
    //if (!dfltInstance_LIST.getDataSetMain().isOpen()) dfltInstance_LIST.RefreshDataSets();
    return dfltInstance_LIST;
  default:
    if(dfltInstance_NONE == null) dfltInstance_NONE = new VladCat(VladCatAccessType.NONE);
    return dfltInstance_NONE;
 }
}
 
public static VladCat getDfltInstance() {
  return getDfltInstance(VladCatAccessType.NONE);
}

//protected StorageDataSet sdsMain = super.getDataSetMain();
//protected StorageDataSet sdsNone = super.getSdsNone();
//protected Column colName = super.colName();
//protected Column colId = super.colId();
//protected Column colFriendId = super.colFriendId();
//protected Column colDateTimeOfDeath = super.colDateTimeOfDeath();
//protected Column colAmountOfLegs = super.colAmountOfLegs();
//protected Column colDateOfBirth = super.colDateOfBirth();

public VladCat() {
  //super(VladCatAccessType.ONEREC, true);
  //super(VladCatAccessType.LIST, true);
  try {
      jbInit();
  } catch (Exception ex) {
    ex.printStackTrace();
  }
}

public VladCat(VladCatAccessType accessType) {
  try {
    jbInit();
  } catch (Exception ex) {
    ex.printStackTrace();
  }
  setAccessType(accessType, false);
}

public VladCat(VladCatAccessType accessType, StorageDataSet sds) {
  super(accessType, new StorageDataSet[] {sds});
  try {
    jbInit();
  } catch (Exception ex) {
    ex.printStackTrace();
  }
}

public VladCat(VladCatAccessType accessType, Database db) {
  construct_db = db;
  try {
    jbInit();
  } catch (Exception ex) {
    ex.printStackTrace();
  }
  setAccessType(accessType, construct_db);
}

private void lsInit() {
  //sdsMain.setColumns(sdsMain.getColumns());
  //sdsNone.setColumns(super.getDesignColumns());
}

private void jbInit() throws Exception {
  lsInit();
}

public boolean accessOneRec(int id, boolean forceRefresh) {
  return accessOneRec(id, false, forceRefresh);
}
public boolean accessOneRec(int id, boolean insertRow ,boolean forceRefresh) {
  if (getAccessType()!=VladCatAccessType.ONEREC) {
    if (construct_db!=null) {
      this.setAccessType(VladCatAccessType.ONEREC, construct_db);
    } else {
      this.setAccessType(VladCatAccessType.ONEREC, false);
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
  if(sds.rowCount()==0 && insertRow){
    sds.insertRow(false);
    return false;
  }else if(sds.rowCount()>0){
    return true;
  }
  return false;
}
/*
public boolean moveToRow_By?(String _) {
  if (this.getAccessType()!=VladCatAccessType._) {
    throw new DataSetException("can't use moveToRow... with " + this.getAccessType());
  }
  String _FldName = col_().getColumnName();
  StorageDataSet sds = getDataSetMain();
  if (!sds.isOpen()) sds.open();
  DataRow _dr = new DataRow(sds, new String[] {_FldName});
  _dr.setString(_FldName, _);
  return sds.locate(_dr, Locate.FIRST);
}*/

protected boolean allowAccessTypeChange(VladCatAccessType accessType) {
  if (this == dfltInstance_ONEREC) {
    if (accessType!=VladCatAccessType.ONEREC) return false;
  } else if (this == dfltInstance_LIST) {
    if (accessType!=VladCatAccessType.LIST) return false;
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
	if(isIdNull() || getId() == 0) 
		setId(LSCounter.getVladCatIdCounter());
	return null;
}



}
