/*
 * Copyright (c) 2009 - DHTMLX, All rights reserved
 */
import java.sql.Connection;

import com.dhtmlx.connector.*;


// TODO: Auto-generated Javadoc
/**
 * The Class RenderingConnector.
 */
public class Grid_02_RenderingConnector extends ConnectorServlet {

	/* (non-Javadoc)
	 * @see com.dhtmlx.connector.ConnectorServlet#configure()
	 */
	@Override
	protected void configure() {
		Connection conn= ( new DataBaseConnection()).getConnection();
		
		GridConnector c = new GridConnector(conn);
		c.dynamic_loading(100);
		c.event.attach(new Grid_02_RenderingBehavior());
		c.render_table("grid50000", "item_id", "item_nm,item_cd");
	}
}
