/*
 * Copyright (c) 2009 - DHTMLX, All rights reserved
 */
import java.sql.Connection;

import com.dhtmlx.connector.ConnectorServlet;
import com.dhtmlx.connector.TreeConnector;



// TODO: Auto-generated Javadoc
/**
 * The Class TreeBasicConnectorA.
 */
public class Tree_01p_BasicConnectorA extends ConnectorServlet {

	/* (non-Javadoc)
	 * @see com.dhtmlx.connector.ConnectorServlet#configure()
	 */
	@Override
	protected void configure() {
		Connection conn= ( new DataBaseConnection()).getConnection();
		
		TreeConnector c = new TreeConnector(conn);
		c.event.attach(new Tree_01p_ChildDetectionBehavior());
		c.render_table("tasks", "taskId", "taskName","","parentId");
	}

}
