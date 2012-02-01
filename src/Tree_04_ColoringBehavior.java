/*
 * Copyright (c) 2009 - DHTMLX, All rights reserved
 */
import com.dhtmlx.connector.ConnectorBehavior;
import com.dhtmlx.connector.DataItem;
import com.dhtmlx.connector.TreeDataItem;


// TODO: Auto-generated Javadoc
/**
 * The Class TreeColoringBehavior.
 */
public class Tree_04_ColoringBehavior extends ConnectorBehavior {

	/* (non-Javadoc)
	 * @see com.dhtmlx.connector.ConnectorBehavior#beforeRender(com.dhtmlx.connector.DataItem)
	 */
	@Override
	public void beforeRender(DataItem data) {
		TreeDataItem item = (TreeDataItem)data;
		if (Double.parseDouble(item.get_value("duration"))>10)
			item.set_image("lock.gif");
		if (Double.parseDouble(item.get_value("complete"))>75) 
			item.set_check_state(true);
	}

}
