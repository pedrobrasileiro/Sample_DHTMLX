/*
 * Copyright (c) 2009 - DHTMLX, All rights reserved
 */
import com.dhtmlx.connector.ConnectorBehavior;
import com.dhtmlx.connector.DataItem;
import com.dhtmlx.connector.TreeDataItem;


// TODO: Auto-generated Javadoc
/**
 * The Class TreeChildDetectionBehavior.
 */
public class Tree_01p_ChildDetectionBehavior extends ConnectorBehavior {

	/* (non-Javadoc)
	 * @see com.dhtmlx.connector.ConnectorBehavior#beforeRender(com.dhtmlx.connector.DataItem)
	 */
	@Override
	public void beforeRender(DataItem data) {
		TreeDataItem d = (TreeDataItem)data;
		if (Integer.parseInt(data.get_value("taskId"))%100>1) 
			d.set_kids(0);
		else
			d.set_kids(1);
	}

}
