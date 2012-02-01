/*
 * Copyright (c) 2009 - DHTMLX, All rights reserved
 */
import com.dhtmlx.connector.ConnectorBehavior;
import com.dhtmlx.connector.DataAction;


// TODO: Auto-generated Javadoc
/**
 * The Class TreeValidationBehavior.
 */
public class Tree_06_ValidationBehavior extends ConnectorBehavior {

	/* (non-Javadoc)
	 * @see com.dhtmlx.connector.ConnectorBehavior#beforeProcessing(com.dhtmlx.connector.DataAction)
	 */
	@Override
	public void beforeProcessing(DataAction action) {
		if (action.get_value("taskName").length()<5)
			action.invalid();
	}

}
