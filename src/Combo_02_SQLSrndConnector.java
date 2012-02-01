/*
 * Copyright (c) 2009 - DHTMLX, All rights reserved
 */
import java.sql.Connection;

import com.dhtmlx.connector.ComboConnector;
import com.dhtmlx.connector.ConnectorServlet;



// TODO: Auto-generated Javadoc
/**
 * The Class ComboSQLSrndConnector.
 */
public class Combo_02_SQLSrndConnector extends ConnectorServlet {

	/* (non-Javadoc)
	 * @see com.dhtmlx.connector.ConnectorServlet#configure()
	 */
	@Override
	protected void configure() {
		Connection conn= ( new DataBaseConnection()).getConnection();
		
		ComboConnector c = new ComboConnector(conn);
		c.dynamic_loading(2);
		c.render_sql("SELECT * FROM country_data  WHERE country_id >40 ","country_id","name");

	}

}
