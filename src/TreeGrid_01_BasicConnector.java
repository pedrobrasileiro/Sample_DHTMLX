/*
 * Copyright (c) 2009 - DHTMLX, All rights reserved
 */
import java.sql.Connection;

import com.dhtmlx.connector.ConnectorServlet;
import com.dhtmlx.connector.TreeGridConnector;



// TODO: Auto-generated Javadoc
/**
 * The Class TreeGridBasicConnector.
 */
public class TreeGrid_01_BasicConnector extends ConnectorServlet {

	/* (non-Javadoc)
	 * @see com.dhtmlx.connector.ConnectorServlet#configure()
	 */
	@Override
	protected void configure() {
		Connection conn= ( new DataBaseConnection()).getConnection();
		
		TreeGridConnector c = new TreeGridConnector(conn);
		c.render_table("tasks", "taskId", "taskName,duration,complete","","parentId");
	}

}
