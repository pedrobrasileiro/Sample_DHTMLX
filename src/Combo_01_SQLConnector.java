/*
 * Copyright (c) 2009 - DHTMLX, All rights reserved
 */
import java.sql.Connection;

import com.dhtmlx.connector.ComboConnector;
import com.dhtmlx.connector.ConnectorServlet;



// TODO: Auto-generated Javadoc
/**
 * The Class ComboSQLConnector.
 */
public class Combo_01_SQLConnector extends ConnectorServlet {

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
		c.render_sql("SELECT * FROM country_data  WHERE country_id >40 ","country_id","name");


	}

}
