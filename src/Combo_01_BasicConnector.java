/*
 * Copyright (c) 2009 - DHTMLX, All rights reserved
 */
import java.sql.Connection;

import com.dhtmlx.connector.*;



// TODO: Auto-generated Javadoc
/**
 * The Class ComboBasicConnector.
 */
public class Combo_01_BasicConnector extends ConnectorServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/* (non-Javadoc)
	 * @see com.dhtmlx.connector.ConnectorServlet#configure()
	 */
	@Override
	protected void configure() {
		Connection conn= ( new DataBaseConnection()).getConnection();
		
		ComboConnector c = new ComboConnector(conn);
		c.render_table("country_data", "country_id", "name");
	}

}
