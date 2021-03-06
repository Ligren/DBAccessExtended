package com.limosys.dbaccess.vladtest;

import com.limosys.dbaccess.*;
import com.borland.dx.dataset.*;
import com.borland.dx.sql.dataset.*;
import java.sql.*;
import java.util.*;

public class T6467063785Access {

  private static T6467063785Access dfltInstance;  private Database dbAlias;
  private ProcedureDataSet pdsT_6467063785 = new ProcedureDataSet();
  private ProcedureResolver prT_6467063785 = new T_6467063785Resolver();
  private Column colId = new Column();
  private Column colName = new Column();
  private Column colCompanyName = new Column();
  private ParameterRow pRowSelect = new ParameterRow();
  private ArrayList<DbAccessListener> dbAccessListeners;


  public T6467063785Access() {
    try {
      jbInit();
    }
    catch (Exception e) {
      e.printStackTrace();
    }
  }

  public T6467063785Access(Database db) {
    try {
      dbAlias = db;
      jbInit();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public StorageDataSet getViewDataSet() {
    return (StorageDataSet)pdsT_6467063785;
  }

  public static T6467063785Access getInstance(){ 
    if (dfltInstance==null) dfltInstance = new T6467063785Access(); 
    return dfltInstance; 
  } 

  private void jbInit() throws Exception {
    dbAlias = com.limosys.dbaccess.Connection.getAddress(dbAlias);
    dbAlias.setTransactionIsolation(java.sql.Connection.TRANSACTION_READ_COMMITTED);
    dbAlias.setUseStatementCaching(false);
    
    pRowSelect.addColumn("ID", Variant.INT);
    
    colId.setColumnName("ID");
    colId.setServerColumnName("ID");
    colId.setTableName("T_6467063785");
    colId.setRowId(true);
    colId.setDataType(Variant.INT);
    colId.setSqlType(4);
    colName.setColumnName("NAME");
    colName.setServerColumnName("NAME");
    colName.setTableName("T_6467063785");
    colName.setDataType(Variant.STRING);
    colName.setPrecision(255);
    colName.setSqlType(12);
    colCompanyName.setColumnName("COMPANY_NAME");
    colCompanyName.setServerColumnName("COMPANY_NAME");
    colCompanyName.setTableName("T_6467063785");
    colCompanyName.setDataType(Variant.STRING);
    colCompanyName.setPrecision(255);
    colCompanyName.setSqlType(12);
    prT_6467063785.setDatabase(dbAlias);
    //prT_6467063785.setInsertProcedure(new ProcedureDescriptor(dbAlias, "exec lsp_T_6467063785_INotNull_v2  :ID, :NAME, :COMPANY_NAME", pdsT_6467063785, true, Load.ALL));
    prT_6467063785.setDeleteProcedure(new ProcedureDescriptor(dbAlias, "exec lsp_T_6467063785_D_v2  :ID", pdsT_6467063785, true, Load.ALL));
    pdsT_6467063785.setMetaDataUpdate(MetaDataUpdate.NONE);
    pdsT_6467063785.setResolver(prT_6467063785);
    pdsT_6467063785.setSchemaName("");
    pdsT_6467063785.setProcedure(new ProcedureDescriptor(dbAlias, "exec lsp_T_6467063785_SRow_v2 :ID", pRowSelect, true, Load.ALL));
    pdsT_6467063785.setColumns(new Column[] { colId, colName, colCompanyName});
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
  public class T_6467063785Resolver extends ProcedureResolver {

    public void updateRow(DataSet dataSet, ReadWriteRow oldRow) {

      ResolverParams[] rpUpdateArr = new ResolverParams[1]; 
      ResolverParams[] rpSelectArr = new ResolverParams[1]; 
      String[] csParams; 
      // Hashtable htOverride; 
      int rpCount=0;

      //T_6467063785:
      csParams = new String[] {
          "ID",
          "NAME",
          "COMPANY_NAME",
          "Orig_ID",
          "Orig_NAME",
          "Orig_COMPANY_NAME"
      };
      rpUpdateArr[rpCount] = new ResolverParams("T_6467063785", "lsp_T_6467063785_UInsDel_v2", csParams, null); 
      csParams = new String[] {
          "ID"
      };
      rpSelectArr[rpCount++] = new ResolverParams("T_6467063785", "lsp_T_6467063785_SRow_v2",  csParams, null); 

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

      //T_6467063785:
      csParams = new String[] {
          "ID",
          "NAME",
          "COMPANY_NAME"
      };
      rpInsertArr[rpCount++] = new ResolverParams("T_6467063785", "lsp_T_6467063785_INotNull_v2", csParams, null); 

      DbGen.resolveInsert(dataSet, this.getDatabase(), rpInsertArr, insertedRow);
      fireRowInserted(new DbAccessEvent(this, insertedRow));
    }

   /*
    public void deleteRow(DataSet dataSet) {
      ResolverParams[] rpDeleteArr = new ResolverParams[1]; 
      String[] csParams; 
      // Hashtable htOverride; 
      int rpCount=0;

      //T_6467063785:
      csParams = new String[] { "ID"};
      rpDeleteArr[rpCount++] = new ResolverParams("T_6467063785", "lsp_T_6467063785_D_v2", csParams, null);

      DbGen.resolveDelete(dataSet, this.getDatabase(), rpDeleteArr);
    }
   */
  }
}
