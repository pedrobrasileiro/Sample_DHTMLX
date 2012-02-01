/*
 * Copyright (c) 2009 - DHTMLX, All rights reserved
 */
import java.sql.Connection;

import com.dhtmlx.connector.*;


// TODO: Auto-generated Javadoc
/**
 * The Class SelectFilterConnectorA.
 */
public class Grid_05a_SelectFilterConnectorA extends ConnectorServlet {

	/* (non-Javadoc)
	 * @see com.dhtmlx.connector.ConnectorServlet#configure()
	 */
	@Override
	protected void configure() {
		Connection conn= ( new DataBaseConnection()).getConnection();
		
		GridConnector c = new GridConnector(conn);
		
		BaseConnector filter1 = new OptionsConnector(conn);
		filter1.render_sql("SELECT  DISTINCT SUBSTR(item_nm,1,2) as value from grid50","item_id","item_nm(value)");
		c.set_options("item_nm",filter1);
		
		c.dynamic_loading(100);
		c.render_table("grid50", "item_id", "item_nm,item_cd");
	}
}
