package com.limosys.dbaccess.vladtest;

import com.limosys.dbaccess.*;
import com.borland.dx.dataset.*;
import com.borland.dx.sql.dataset.*;
import java.sql.*;
import java.util.*;

public class VladCatAccess {

  private static VladCatAccess dfltInstance;  private Database dbAlias;
  private ProcedureDataSet pdsVLAD_CAT = new ProcedureDataSet();
  private ProcedureResolver prVLAD_CAT = new VLAD_CATResolver();
  private Column colId = new Column();
  private Column colName = new Column();
  private Column colDateOfBirth = new Column();
  private Column colAmountOfLegs = new Column();
  private Column colFriendId = new Column();
  private Column colDateTimeOfDeath = new Column();
  private ParameterRow pRowSelect = new ParameterRow();
  private ArrayList<DbAccessListener> dbAccessListeners;


  public VladCatAccess() {
    try {
      jbInit();
    }
    catch (Exception e) {
      e.printStackTrace();
    }
  }

  public VladCatAccess(Database db) {
    try {
      dbAlias = db;
      jbInit();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public StorageDataSet getViewDataSet() {
    return (StorageDataSet)pdsVLAD_CAT;
  }

  public static VladCatAccess getInstance(){ 
    if (dfltInstance==null) dfltInstance = new VladCatAccess(); 
    return dfltInstance; 
  } 

  private void jbInit() throws Exception {
    dbAlias = com.limosys.dbaccess.Connection.getAddress(dbAlias);
    dbAlias.setTransactionIsolation(java.sql.Connection.TRANSACTION_READ_COMMITTED);
    dbAlias.setUseStatementCaching(false);
    
    pRowSelect.addColumn("ID", Variant.INT);
    
    colId.setColumnName("ID");
    colId.setServerColumnName("ID");
    colId.setTableName("VLAD_CAT");
    colId.setRowId(true);
    colId.setDataType(Variant.INT);
    colId.setSqlType(4);
    colName.setColumnName("NAME");
    colName.setServerColumnName("NAME");
    colName.setTableName("VLAD_CAT");
    colName.setDataType(Variant.STRING);
    colName.setPrecision(255);
    colName.setSqlType(12);
    colDateOfBirth.setColumnName("DATE_OF_BIRTH");
    colDateOfBirth.setServerColumnName("DATE_OF_BIRTH");
    colDateOfBirth.setTableName("VLAD_CAT");
    colDateOfBirth.setDataType(Variant.TIMESTAMP);
    colDateOfBirth.setSqlType(93);
    colAmountOfLegs.setColumnName("AMOUNT_OF_LEGS");
    colAmountOfLegs.setServerColumnName("AMOUNT_OF_LEGS");
    colAmountOfLegs.setTableName("VLAD_CAT");
    colAmountOfLegs.setDataType(Variant.SHORT);
    colAmountOfLegs.setSqlType(5);
    colFriendId.setColumnName("FRIEND_ID");
    colFriendId.setServerColumnName("FRIEND_ID");
    colFriendId.setTableName("VLAD_CAT");
    colFriendId.setDataType(Variant.INT);
    colFriendId.setSqlType(4);
    colDateTimeOfDeath.setColumnName("DATE_TIME_OF_DEATH");
    colDateTimeOfDeath.setServerColumnName("DATE_TIME_OF_DEATH");
    colDateTimeOfDeath.setTableName("VLAD_CAT");
    colDateTimeOfDeath.setDataType(Variant.TIMESTAMP);
    colDateTimeOfDeath.setSqlType(93);
    prVLAD_CAT.setDatabase(dbAlias);
    //prVLAD_CAT.setInsertProcedure(new ProcedureDescriptor(dbAlias, "exec lsp_VLAD_CAT_I_v1  :ID, :NAME, :DATE_OF_BIRTH, :AMOUNT_OF_LEGS, :FRIEND_ID, :DATE_TIME_OF_DEATH", pdsVLAD_CAT, true, Load.ALL));
    prVLAD_CAT.setDeleteProcedure(new ProcedureDescriptor(dbAlias, "exec lsp_VLAD_CAT_D_v1  :ID", pdsVLAD_CAT, true, Load.ALL));
    pdsVLAD_CAT.setMetaDataUpdate(MetaDataUpdate.NONE);
    pdsVLAD_CAT.setResolver(prVLAD_CAT);
    pdsVLAD_CAT.setSchemaName("");
    pdsVLAD_CAT.setProcedure(new ProcedureDescriptor(dbAlias, "exec lsp_VLAD_CAT_SRow_v1 :ID", pRowSelect, true, Load.ALL));
    pdsVLAD_CAT.setColumns(new Column[] { colId, colName, colDateOfBirth, colAmountOfLegs, colFriendId, colDateTimeOfDeath});
  }
  public synchronized void removeDbAccessListener(DbAccessListener l) {
  	if (dbAccessListeners != null && dbAccessListeners.contains(l)) dbAccessListeners.remove(l);
  }
  
  public synchronized void addDbAccessListener(DbAccessListener l) {
  	 if (l == null) return;
  	 if (dbAccessListeners == null) dbAccessListeners = new ArrayList<DbAccessListener>();
  	 if (!dbAccessListeners.contains(l)) dbAccessListeners.add(l);
  }
  
  protected void fireRowInserted(DbAccessEvent e) {
  if (dbAccessListeners == null) return;
    for (DbAccessListener l : dbAccessListeners) {
   		l.rowInserted(e);
    }
  }
  
  @SuppressWarnings("serial")
  public class VLAD_CATResolver extends ProcedureResolver {

    public void updateRow(DataSet dataSet, ReadWriteRow oldRow) {

      ResolverParams[] rpUpdateArr = new ResolverParams[1]; 
      ResolverParams[] rpSelectArr = new ResolverParams[1]; 
      String[] csParams; 
      // Hashtable htOverride; 
      int rpCount=0;

      //VLAD_CAT:
      csParams = new String[] {
          "ID",
          "NAME",
          "DATE_OF_BIRTH",
          "AMOUNT_OF_LEGS",
          "FRIEND_ID",
          "DATE_TIME_OF_DEATH",
          "Orig_ID",
          "Orig_NAME",
          "Orig_DATE_OF_BIRTH",
          "Orig_AMOUNT_OF_LEGS",
          "Orig_FRIEND_ID",
          "Orig_DATE_TIME_OF_DEATH"
      };
      rpUpdateArr[rpCount] = new ResolverParams("VLAD_CAT", "lsp_VLAD_CAT_U_v1", csParams, null); 
      csParams = new String[] {
          "ID"
      };
      rpSelectArr[rpCount++] = new ResolverParams("VLAD_CAT", "lsp_VLAD_CAT_SRow_v1",  csParams, null); 

      DbGen.resolveUpdate(dataSet, oldRow, this.getDatabase(), rpUpdateArr, rpSelectArr); 
    }

    public void insertRow(DataSet dataSet) {
      ResolverParams[] rpInsertArr = new ResolverParams[1]; 
      String[] csParams; 
      // Hashtable htOverride; 
      DataRow insertedRow = null;
      if (dbAccessListeners!=null) {
        insertedRow = new DataRow(dataSet);
      }
      int rpCount=0;

      //VLAD_CAT:
      csParams = new String[] {
          "ID",
          "NAME",
          "DATE_OF_BIRTH",
          "AMOUNT_OF_LEGS",
          "FRIEND_ID",
          "DATE_TIME_OF_DEATH"
      };
      rpInsertArr[rpCount++] = new ResolverParams("VLAD_CAT", "lsp_VLAD_CAT_I_v1", csParams, null); 

      DbGen.resolveInsert(dataSet, this.getDatabase(), rpInsertArr, insertedRow);
      fireRowInserted(new DbAccessEvent(this, insertedRow));
    }

   /*
    public void deleteRow(DataSet dataSet) {
      ResolverParams[] rpDeleteArr = new ResolverParams[1]; 
      String[] csParams; 
      // Hashtable htOverride; 
      int rpCount=0;

      //VLAD_CAT:
      csParams = new String[] { "ID"};
      rpDeleteArr[rpCount++] = new ResolverParams("VLAD_CAT", "lsp_VLAD_CAT_D_v1", csParams, null);

      DbGen.resolveDelete(dataSet, this.getDatabase(), rpDeleteArr);
    }
   */
  }
}
