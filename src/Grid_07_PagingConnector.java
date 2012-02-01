import java.sql.Connection;
import com.dhtmlx.connector.ConnectorServlet;
import com.dhtmlx.connector.GridConnector;


public class Grid_07_PagingConnector extends ConnectorServlet {

		/* (non-Javadoc)
		 * @see com.dhtmlx.connector.ConnectorServlet#configure()
		 */
		@Override
		protected void configure() {
			Connection conn= ( new DataBaseConnection()).getConnection();
			
			GridConnector c = new GridConnector(conn);
			c.dynamic_loading(40); //2 pages
			c.render_table("grid50000", "item_id", "item_nm,item_cd");
		}


}
