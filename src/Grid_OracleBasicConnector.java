/*
 * Copyright (c) 2009 - DHTMLX, All rights reserved
 */
import java.sql.Connection;
import java.sql.DriverManager;

import com.dhtmlx.connector.DBType;
import com.dhtmlx.connector.ConnectorServlet;
import com.dhtmlx.connector.DBDataWrapper;
import com.dhtmlx.connector.GridConnector;



// TODO: Auto-generated Javadoc
/**
 * The Class OracleBasicConnector.
 */
public class Grid_OracleBasicConnector extends ConnectorServlet {

	/* (non-Javadoc)
	 * @see com.dhtmlx.connector.ConnectorServlet#configure()
	 */
	protected void configure() {
		Connection conn=null;
		try {
			Class.forName ("oracle.jdbc.OracleDriver").newInstance ();
			conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.13.128:1521:XE","HR","2");
		} catch (Throwable e) {
			e.printStackTrace();
		}
		
		GridConnector c = new GridConnector(conn, DBType.Oracle);
		c.dynamic_loading(100);
		((DBDataWrapper)c.sql).sequence("EMPLOYEES_INC.nextVal");
		c.render_table("EMPLOYEES","EMPLOYEE_ID","FIRST_NAME,LAST_NAME");
	}

}
