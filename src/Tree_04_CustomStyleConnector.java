/*
 * Copyright (c) 2009 - DHTMLX, All rights reserved
 */
import java.sql.Connection;

import com.dhtmlx.connector.ConnectorServlet;
import com.dhtmlx.connector.TreeConnector;



// TODO: Auto-generated Javadoc
/**
 * The Class TreeCustomStyleConnector.
 */
public class Tree_04_CustomStyleConnector extends ConnectorServlet {

	/* (non-Javadoc)
	 * @see com.dhtmlx.connector.ConnectorServlet#configure()
	 */
	@Override
	protected void configure() {
		Connection conn= ( new DataBaseConnection()).getConnection();
		
		TreeConnector c = new TreeConnector(conn);
		c.event.attach(new Tree_04_ColoringBehavior());
		c.render_sql("SELECT * from tasks WHERE complete>49","taskId","taskName","duration,complete","parentId");
	}

}
