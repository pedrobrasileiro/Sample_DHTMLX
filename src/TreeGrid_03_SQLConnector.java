/*
 * Copyright (c) 2009 - DHTMLX, All rights reserved
 */
import java.sql.Connection;

import com.dhtmlx.connector.ConnectorServlet;
import com.dhtmlx.connector.TreeGridConnector;



// TODO: Auto-generated Javadoc
/**
 * The Class TreeGridSQLConnector.
 */
public class TreeGrid_03_SQLConnector extends ConnectorServlet {

	/* (non-Javadoc)
	 * @see com.dhtmlx.connector.ConnectorServlet#configure()
	 */
	@Override
	protected void configure() {
		Connection conn= ( new DataBaseConnection()).getConnection();
		
		TreeGridConnector c = new TreeGridConnector(conn);
		
		c.render_sql("SELECT * from tasks WHERE complete>49", "taskId", "taskName,duration,complete","","parentId");
	}

}
