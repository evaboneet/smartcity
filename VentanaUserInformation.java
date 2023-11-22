package smartcity;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class VentanaUserInformation implements ActionListener
{
    Connection conexion = null;
    JFrame frame = new JFrame();
	JLabel l1 = new JLabel("User information section");
	JButton butt1 = new JButton("Add user");	
	JButton buttHome = new JButton("Back");
    JTextField textField = new JTextField();

    VentanaUserInformation(){

        // Set Size, Layout and Close operation for the window
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1000,500);
		frame.setVisible(true);
		frame.setLayout(null);

        // Setting Labels, Buttons in the window
        frame.add(l1);
		frame.add(butt1);
        frame.add(buttHome);
        frame.add(textField);

        l1.setBounds(100, 300, 1000, 180);
		l1.setFont(new Font("Verdana", Font.PLAIN, 42));

        textField.setBounds(100, 100, 200, 50);

        butt1.setBounds(200,100,250,100);
		butt1.setFocusable(false);
		butt1.addActionListener(this);
		butt1.setFont(new Font("Verdana", Font.PLAIN, 15));
    }
    public void refresh()
	{
		// Method that refreshes the text boxes after an action is done e.g. Add new record 
		textField.setText("");
	}

    public void add() //Method that adds a user to the database
    {
        
        try{
            //Create the connection to the database
            String url = "jdbc:mysql://localhost:3306/project";
            String usuario = "root";
            String contraseña = "Xoro_8324";
            conexion = DriverManager.getConnection(url, usuario, contraseña);
            //Create the query
            Statement statement = conexion.createStatement();
            ResultSet resultSet = statement.executeUpdate("DELETE FROM users WHERE user_id =" + textField.getText());
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==butt1)
		{
			//refresh the text boxes
			refresh();
		}
    }
    
}