/*
 * Copyright (c) 2009 - DHTMLX, All rights reserved
 */
import java.sql.Connection;

import com.dhtmlx.connector.*;


// TODO: Auto-generated Javadoc
/**
 * The Class SelectFilterConnector.
 */
public class Grid_05_SelectFilterConnector extends ConnectorServlet {

	/* (non-Javadoc)
	 * @see com.dhtmlx.connector.ConnectorServlet#configure()
	 */
	@Override
	protected void configure() {
		Connection conn= ( new DataBaseConnection()).getConnection();
		
		GridConnector c = new GridConnector(conn);
		c.dynamic_loading(100);
		c.render_table("grid50", "item_id", "item_nm,item_cd");
	}
}
