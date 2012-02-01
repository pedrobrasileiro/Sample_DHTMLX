/*
 * Copyright (c) 2009 - DHTMLX, All rights reserved
 */
import java.sql.Connection;
import java.util.ArrayList;
import java.util.HashMap;

import com.dhtmlx.connector.*;


// TODO: Auto-generated Javadoc
/**
 * The Class ComboConnectorA.
 */
public class Grid_06a_ComboConnectorA extends ConnectorServlet {

	/* (non-Javadoc)
	 * @see com.dhtmlx.connector.ConnectorServlet#configure()
	 */
	@Override
	protected void configure() {
		Connection conn= ( new DataBaseConnection()).getConnection();
		
		GridConnector c = new GridConnector(conn);
		
		ArrayList<String> c1 = new ArrayList<String>();
		HashMap<String,String> c2 = new HashMap<String,String>();
		
		c1.add("1");c1.add("two");c1.add("3");
		c2.put("91", "one");		c2.put("75", "two");
		
		c.set_options("item_nm",c1);
		c.set_options("item_cd",c2);
		
		
		c.sql.set_transaction_mode(TransactionType.OPERATION);
		c.dynamic_loading(100);
		c.render_table("grid50", "item_id", "item_nm,item_cd");
	}
}
