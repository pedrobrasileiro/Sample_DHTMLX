/*
 * Copyright (c) 2009 - DHTMLX, All rights reserved
 */
import com.dhtmlx.connector.ConnectorBehavior;
import com.dhtmlx.connector.DataAction;


// TODO: Auto-generated Javadoc
/**
 * The Class CustomValidationBehavior.
 */
public class Grid_03_ValidationBehavior extends ConnectorBehavior {

	/* (non-Javadoc)
	 * @see com.dhtmlx.connector.ConnectorBehavior#beforeProcessing(com.dhtmlx.connector.DataAction)
	 */
	@Override
	public void beforeProcessing(DataAction action) {
		if (action.get_value("item_cd").isEmpty() || action.get_value("item_nm").isEmpty())
			action.invalid();
	}
	
}
