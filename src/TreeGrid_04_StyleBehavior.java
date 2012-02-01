/*
 * Copyright (c) 2009 - DHTMLX, All rights reserved
 */
import com.dhtmlx.connector.ConnectorBehavior;
import com.dhtmlx.connector.DataItem;
import com.dhtmlx.connector.TreeGridDataItem;


// TODO: Auto-generated Javadoc
/**
 * The Class TreeGridStyleBehavior.
 */
public class TreeGrid_04_StyleBehavior extends ConnectorBehavior {

	/* (non-Javadoc)
	 * @see com.dhtmlx.connector.ConnectorBehavior#beforeRender(com.dhtmlx.connector.DataItem)
	 */
	@Override
	public void beforeRender(DataItem common_data) {
		TreeGridDataItem data = (TreeGridDataItem) common_data;
		data.set_row_color(Float.parseFloat(data.get_value("complete"))<75?"#AAFFFF":"#FFAAFF");
		if (Float.parseFloat(data.get_value("duration"))>10)
			data.set_image("true.gif");
		else
			data.set_image("false.gif");
	}

}
