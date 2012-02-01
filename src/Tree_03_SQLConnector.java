/*
 * Copyright (c) 2009 - DHTMLX, All rights reserved
 */
import java.sql.Connection;

import com.dhtmlx.connector.ConnectorServlet;
import com.dhtmlx.connector.TreeConnector;



// TODO: Auto-generated Javadoc
/**
 * The Class TreeSQLConnector.
 */
public class Tree_03_SQLConnector extends ConnectorServlet {

	/* (non-Javadoc)
	 * @see com.dhtmlx.connector.ConnectorServlet#configure()
	 */
	@Override
	protected void configure() {
		Connection conn= ( new DataBaseConnection()).getConnection();
		
		TreeConnector c = new TreeConnector(conn);
		c.render_sql("SELECT taskId,taskName from tasks WHERE complete>49","taskId","taskName","","parentId");
	}

}
