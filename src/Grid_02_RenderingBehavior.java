/*
 * Copyright (c) 2009 - DHTMLX, All rights reserved
 */
import com.dhtmlx.connector.ConnectorBehavior;
import com.dhtmlx.connector.DataItem;
import com.dhtmlx.connector.GridDataItem;


// TODO: Auto-generated Javadoc
/**
 * The Class CustomRenderingBehavior.
 */
public class Grid_02_RenderingBehavior extends ConnectorBehavior {

	/* (non-Javadoc)
	 * @see com.dhtmlx.connector.ConnectorBehavior#beforeRender(com.dhtmlx.connector.DataItem)
	 */
	@Override
	public void beforeRender(DataItem data) {
		// 	color_rows
		if (data.get_index()%2 == 1)
			((GridDataItem)data).set_row_color("red");
	}
	
}
