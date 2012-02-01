/*
 * Copyright (c) 2009 - DHTMLX, All rights reserved
 */
import java.sql.Connection;

import com.dhtmlx.connector.*;


// TODO: Auto-generated Javadoc
/**
 * The Class SQLBasicConnector.
 */
public class Grid_01a_SQLBasicConnector extends ConnectorServlet {

	/* (non-Javadoc)
	 * @see com.dhtmlx.connector.ConnectorServlet#configure()
	 */
	@Override
	protected void configure() {
		Connection conn= ( new DataBaseConnection()).getConnection();
		
		GridConnector c = new GridConnector(conn);
		c.dynamic_loading(100);
		c.render_sql("SELECT grid50000.item_id as ID , grid50000.item_nm FROM grid50000",
				"item_id(ID)","grid50000.item_id(ID),item_nm");
	}
}
