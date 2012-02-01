/*
 * Copyright (c) 2009 - DHTMLX, All rights reserved
 */


import java.sql.Connection;
import java.sql.DriverManager;

import com.dhtmlx.connector.*;


// TODO: Auto-generated Javadoc
/**
 * The Class MSSQLBasicConnector.
 */
public class Grid_MSSQLBasicConnector extends ConnectorServlet {

	/* (non-Javadoc)
	 * @see com.dhtmlx.connector.ConnectorServlet#configure()
	 */
	@Override
	protected void configure() {
		Connection conn=null;
		try {
			Class.forName ("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance ();
			conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=sampleDB;user=sa;password=1;");
		} catch (Throwable e) {
			e.printStackTrace();
		}
		
		GridConnector c = new GridConnector(conn, DBType.MSSQL);
		c.dynamic_loading(100);
		c.render_table("grid50000", "item_id", "item_nm,item_cd");
	}
}
