/*
 * Copyright (c) 2009 - DHTMLX, All rights reserved
 */
import javax.servlet.http.HttpServletRequest;

import com.dhtmlx.connector.ConnectorBehavior;



// TODO: Auto-generated Javadoc
/**
 * The Class CustomGridStructure.
 */
public class Grid_10_GridStructure extends ConnectorBehavior {

	/* (non-Javadoc)
	 * @see com.dhtmlx.connector.ConnectorBehavior#beforeOutput(java.lang.StringBuffer, javax.servlet.http.HttpServletRequest)
	 */
	@Override
	public void beforeOutput(StringBuffer out, HttpServletRequest http_request) {
		String pos = http_request.getParameter("posStart");
		if (pos==null){
			out.append("<head>"+
		        "<column width='50'  type='ed'>Sales</column>"+
		        "<column width='150' type='ed'>Book Title</column>"+
		        "<column width='100' type='ed'>Author</column>"+
			    "</head>");
		}
	}

}
