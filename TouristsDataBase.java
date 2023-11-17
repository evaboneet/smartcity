package smartcity;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.Vector;
import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class TouristsDataBase extends JFrame implements ActionListener
{
	JFrame frame = new JFrame(); // Define window
	
	public TouristsDataBase()
	{
	
		
	// Set Window Size and Visibility 
		frame.setSize(1000,600);
		frame.setVisible(true);
		
		// Defining vector for database column and data
		Vector<String> columnNames = new Vector<String>();
		Vector<Vector<Object>> data = new Vector<Vector<Object>>();
		
		try {
			
			// Connecting to the Microsoft Access Database
			String databaseURL= "jdbc:ucanaccess://C:\\Users\\Administrator\\eclipse-workspace\\SmartCityExample\\TouristAttractionDatabase.accdb";		// The Database Location will need to be change depending on where it was saved
			Connection connection = DriverManager.getConnection(databaseURL);
			Statement st = connection.createStatement();
			
			
			String sql = "SELECT * FROM Hotel1 "; // Select the Hotel1 Database
			ResultSet rs = st.executeQuery(sql);
			ResultSetMetaData metaData = rs.getMetaData();
			int columns = metaData.getColumnCount();
			for (int i = 1; i <= columns; i++) 
			{
				columnNames.addElement(metaData.getColumnName(i));
			}
			while (rs.next()) 
			{
				Vector<Object> row = new Vector<Object>(columns);
				for (int i = 1; i <= columns; i++) {
					row.addElement(rs.getObject(i));
				}
				data.addElement(row);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		
		DefaultTableModel model = new DefaultTableModel(data, columnNames) 
		{
	

		@Override
		public boolean isCellEditable(int row, int column) 
		{
		return false; // Cells aren't editable
		}
		};
	
		JTable table = new JTable(model); // define table 
		JScrollPane sp = new JScrollPane(table); // table on scroll pane, allows table to be scrollable
		getContentPane().add(sp);

		frame.add(sp); // placing scroll pane on window
		pack();
	
		}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
	
		
	}
}
