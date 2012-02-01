/*
 * Copyright (c) 2009 - DHTMLX, All rights reserved
 */
import com.dhtmlx.connector.ConnectorBehavior;
import com.dhtmlx.connector.ConnectorOperationException;
import com.dhtmlx.connector.DBDataWrapper;
import com.dhtmlx.connector.DataAction;
import com.dhtmlx.connector.LogManager;
import com.dhtmlx.connector.SchedulerConnector;


// TODO: Auto-generated Javadoc
/**
 * The Class SchedulerRecBehavior.
 */
public class Scheduler_RecBehavior extends ConnectorBehavior {
	
	/** The connector. */
	SchedulerConnector connector;
	
	/**
	 * Instantiates a new scheduler rec behavior.
	 * 
	 * @param connector the connector
	 */
	public Scheduler_RecBehavior(SchedulerConnector connector){
		this.connector = connector;
	}
	
	/* (non-Javadoc)
	 * @see com.dhtmlx.connector.ConnectorBehavior#beforeProcessing(com.dhtmlx.connector.DataAction)
	 */
	@Override
	public void beforeProcessing(DataAction action) {
		String status = action.get_status();
		String type = action.get_value("rec_type");
		String pid = action.get_value("event_pid");
		
		try {
			//when series changed or deleted we need to remove all linked events
			if ((status.equals("deleted") || status.equals("updated")) && !type.isEmpty()){
				((DBDataWrapper)connector.sql).query("DELETE FROM events_rec WHERE event_pid='"+((DBDataWrapper)connector.sql).escape(action.get_id())+"'");
			}
			if (status.equals("deleted") && !pid.isEmpty() && !pid.equals("0")){
				((DBDataWrapper)connector.sql).query("UPDATE events_rec SET rec_type='none' WHERE event_id='"+((DBDataWrapper)connector.sql).escape(action.get_id())+"'");
				action.success();
			}
		} catch (ConnectorOperationException e) {
			LogManager.getInstance().log("Reccuring event error \n"+e.getMessage());
		}
		
		super.beforeProcessing(action);
	}

	/* (non-Javadoc)
	 * @see com.dhtmlx.connector.ConnectorBehavior#afterProcessing(com.dhtmlx.connector.DataAction)
	 */
	@Override
	public void afterProcessing(DataAction action) {
		String status = action.get_status();
		String type = action.get_value("rec_type");
		if (status.equals("inserted") && type.equals("none"))
			action.set_status("deleted");
		else
			super.afterProcessing(action);
	}

	
}
