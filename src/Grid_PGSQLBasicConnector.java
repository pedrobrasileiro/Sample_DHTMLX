/*
 * Copyright (c) 2009 - DHTMLX, All rights reserved
 */
import java.sql.Connection;
import java.sql.DriverManager;

import com.dhtmlx.connector.DBType;
import com.dhtmlx.connector.ConnectorServlet;
import com.dhtmlx.connector.GridConnector;



// TODO: Auto-generated Javadoc
/**
 * The Class PGSQLBasicConnector.
 */
public class Grid_PGSQLBasicConnector extends ConnectorServlet {

	/* (non-Javadoc)
	 * @see com.dhtmlx.connector.ConnectorServlet#configure()
	 */
	protected void configure() {
		Connection conn=null;
		try {
			Class.forName ("org.postgresql.Driver").newInstance ();
			conn = DriverManager.getConnection("jdbc:postgresql://localhost/sampleDB","root","1234");
		} catch (Throwable e) {
			e.printStackTrace();
		}
		
		GridConnector c = new GridConnector(conn, DBType.PostgreSQL);
		c.dynamic_loading(100);
		c.render_table("grid50000", "item_id", "item_nm,item_cd");
	}
}
