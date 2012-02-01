/*
 * Copyright (c) 2009 - DHTMLX, All rights reserved
 */
import java.sql.Connection;

import com.dhtmlx.connector.*;



// TODO: Auto-generated Javadoc
/**
 * The Class ComboSrndConnector.
 */
public class Combo_02_SrndConnector extends ConnectorServlet {

	/* (non-Javadoc)
	 * @see com.dhtmlx.connector.ConnectorServlet#configure()
	 */
	@Override
	protected void configure() {
		Connection conn= ( new DataBaseConnection()).getConnection();
		
		ComboConnector c = new ComboConnector(conn);
		c.dynamic_loading(2);
		c.render_table("country_data", "country_id", "name");
	}

}
