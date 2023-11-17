package smartcity;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


public class VentanaCityHospitals extends JFrame implements ActionListener
{
	//Declare J variables
	JFrame frame = new JFrame();
	JButton butt1 = new JButton("Add/Save");
	JButton butt2 = new JButton("Delete");
	JButton butt3 = new JButton("View Database");
	JButton butt4 = new JButton("Back to Menu");
	JButton butt5 = new JButton("Search for Records");
	JButton butt6 = new JButton("Update for Records");
	
	JTextField tf1 = new JTextField("");
	JTextField tf2 = new JTextField("");
	JTextField tf3 = new JTextField("");
	JTextField tf4 = new JTextField("");
	JTextField tf5 = new JTextField("");
	JTextField tf6 = new JTextField("");
	
	JLabel l1 = new JLabel("ID:");
	JLabel l2 = new JLabel("Hotel Name:");
	JLabel l3 = new JLabel("Address:");
	JLabel l4 = new JLabel("Contact Details");
	JLabel l5 = new JLabel("Website:");
	JLabel l6 = new JLabel("Rating:");
	JLabel l7 = new JLabel("Tourist Database");
	
	Font myfont1 = new Font ("Calibri",Font.BOLD, 13);
	Font myfont2 = new Font ("Calibri",Font.BOLD, 20);
	
	VentanaCityHospitals()
	{
		// Setting Labels, Buttons and texboxes in the window
		
		frame.add(butt1);
		frame.add(butt2);
		frame.add(butt3);
		frame.add(butt4);
		frame.add(butt5);
		frame.add(butt6);
		
	
		
		frame.add(tf1);
		frame.add(tf2);
		frame.add(tf3);
		frame.add(tf4);
		frame.add(tf5);
		frame.add(tf6);
		
		
		frame.add(l1);
		frame.add(l2);
		frame.add(l3);
		frame.add(l4);
		frame.add(l5);
		frame.add(l6);
		frame.add(l7);
		
		// Set Size, Layout and Close operation for the window
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(350,610);
		frame.setLayout(null);
		frame.setVisible(true);
		
		// setting buttons location, size and function
		
		butt1.setBounds(5,375,160,40);
		butt1.setFocusable(false);
		butt1.addActionListener(this);
		
		butt2.setBounds(170,375,160,40); 
		butt2.setFocusable(false);
		butt2.addActionListener(this);
		
		butt3.setBounds(5,425,325,40);
		butt3.setFocusable(false);
		butt3.addActionListener(this);
		
		butt4.setBounds(5,525,325,40);
		butt4.setFocusable(false);
		butt4.addActionListener(this);
		
		butt5.setBounds(5,475,325,40);
		butt5.setFocusable(false);
		butt5.addActionListener(this);
		
		butt6.setBounds(5,475,325,40);
		butt6.setFocusable(false);
		butt6.addActionListener(this);
		
		// Setting position and size of textfields
		tf1.setBounds(100,70,230,40);
		
		tf2.setBounds(100,120,230,40);
		
		tf3.setBounds(100,170,230,40);
		
		tf4.setBounds(100,220,230,40);
		
		tf5.setBounds(100,270,230,40);
		
		tf6.setBounds(100,320,230,40);
		
		// setting font, text size and position for labels
		l1.setBounds(10,75,200,40);
		l1.setFont(myfont1);
		
		l2.setBounds(10,125,200,40);
		l2.setFont(myfont1);
		
		l3.setBounds(10,175,200,40);
		l3.setFont(myfont1);
		
		l4.setBounds(10,225,200,40);
		l4.setFont(myfont1);
		
		l5.setBounds(10,275,200,40);
		l5.setFont(myfont1);
		
		l6.setBounds(10,325,200,40);
		l6.setFont(myfont1);
		
		l7.setBounds(50,0,300,100);
		l7.setFont(myfont2);
		
	}
	
	public void Refresh()
	{
		// Method that refreshes the text boxes after an action is done e.g. Add new record 
		tf1.setText("");
		tf2.setText("");
		tf3.setText("");
		tf4.setText("");
		tf5.setText("");
		tf6.setText("");
	}
	
	public void save()  // creating save function for database
	{
		try {				
			// connection to the MS database using UCanAccess
			String databaseURL= "jdbc:ucanaccess://C:\\Users\\Administrator\\eclipse-workspace\\SmartCityExample\\TouristAttractionDatabase.accdb";		// The Database Location will need to be change depending on where it was saved
			Connection connection = DriverManager.getConnection(databaseURL);
			Statement st = connection.createStatement();
		
			// setting where new data is place within the database
		st.executeUpdate("insert into Hotel1 VALUES('"
				 + tf1.getText() + "','" + tf2.getText() + "','" + tf3.getText() + "','"
                + tf6.getText() + "','" + tf4.getText() +  "','" +  tf5.getText() + "')");
	        JOptionPane.showMessageDialog(null, "Record Inserted");  
	        Refresh(); //Calling Refresh() method  
	    } catch (SQLException e) 
		{  
	        
	    }  		
	}
	
	public void delete() // creating delete function 
	{
		try {
			// connection to the MS database using UCanAccess
			String databaseURL= "jdbc:ucanaccess://C:\\Users\\Administrator\\eclipse-workspace\\SmartCityExample\\TouristAttractionDatabase.accdb";		// The Database Location will need to be change depending on where it was saved
			Connection connection = DriverManager.getConnection(databaseURL);
			Statement st = connection.createStatement();
			
			// telling the database to delete a row based on the records ID
			st.executeUpdate("DELETE FROM Hotel1 WHERE ID =" + tf1.getText());  
	        JOptionPane.showMessageDialog(null, "Record Deleted");    
	        Refresh(); //Calling Refresh() method  
			
		    } catch (SQLException e) 
			{  
		       
		    }  
	}
	
	public void search() // creating search record function
	{
		try {
			String databaseURL= "jdbc:ucanaccess://C:\\Users\\Administrator\\eclipse-workspace\\SmartCityExample\\TouristAttractionDatabase.accdb";		// The Database Location will need to be change depending on where it was saved
			Connection connection = DriverManager.getConnection(databaseURL);
			Statement st = connection.createStatement();
			
			ResultSet r = st.executeQuery("SELECT * FROM Hotel1 WHERE = "
					+ tf1.getText() + "','" + tf2.getText() + "','"
	                + tf3.getText() + "','" + tf4.getText() + "')");
			Refresh(); //Calling Refresh() method  
			
			while(r.next())
			{
				
			}
			
		    } catch (SQLException e) 
			{  
		        
		    }  
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==butt3)
		{
			//opens to another window 
			TouristsDataBase TouristsDataBase = new TouristsDataBase();
		}
		if(e.getSource()==butt1)
		{
			save(); // implementing save method on button click
		}
		if(e.getSource()==butt2)
		{
			delete(); // implement delete method on button click
		}
		if(e.getSource()==butt4)
		{
			frame.dispose();
			WindowCity WindowCity = new WindowCity();
		}
		
	}
	
}
