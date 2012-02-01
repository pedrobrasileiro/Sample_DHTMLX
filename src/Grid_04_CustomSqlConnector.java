/*
 * Copyright (c) 2009 - DHTMLX, All rights reserved
 */
import java.sql.Connection;

import com.dhtmlx.connector.*;


// TODO: Auto-generated Javadoc
/**
 * The Class CustomSqlConnector.
 */
public class Grid_04_CustomSqlConnector extends ConnectorServlet {

	/* (non-Javadoc)
	 * @see com.dhtmlx.connector.ConnectorServlet#configure()
	 */
	@Override
	protected void configure() {
		Connection conn= ( new DataBaseConnection()).getConnection();
		
		GridConnector c = new GridConnector(conn);
		c.dynamic_loading(100);
		((DBDataWrapper)c.sql).attach( OperationType.Delete ,"update grid50000 set item_nm='deleted' where item_id='{item_id}'");
		c.render_table("grid50000", "item_id", "item_nm,item_cd");
	}
}
