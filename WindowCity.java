package smartcity;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class WindowCity implements ActionListener
{
	JFrame frame = new JFrame();
	JLabel l1 = new JLabel("City Commodities");
	JButton butt1 = new JButton("Restaurants");	
	JButton butt2 = new JButton("Hospitals & Healthcare");
	JButton buttHome = new JButton("Back");
	
	WindowCity()
	{
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1000,600);
		frame.setVisible(true);
		frame.setLayout(null);
		
		frame.add(l1);
		frame.add(butt1);	
		frame.add(butt2);
		frame.add(buttHome);
		
		l1.setBounds(300, 80, 1000, 40);
		l1.setFont(new Font("Verdana", Font.PLAIN, 42));
		
		butt1.setBounds(300,250,250,100);
		butt1.setFocusable(false);
		butt1.addActionListener(this);
		butt1.setFont(new Font("Verdana", Font.PLAIN, 15));	
		
		butt2.setBounds(600,250,250,100);
		butt2.setFocusable(false);
		butt2.addActionListener(this);
		butt2.setFont(new Font("Verdana", Font.PLAIN, 15));
		
		buttHome.setBounds(600,400,300,50);
		buttHome.setFocusable(false);
		buttHome.addActionListener(this);
		buttHome.setFont(new Font("Verdana", Font.PLAIN, 12));	
		
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==butt2)
		{
			//close current window
			frame.dispose();
			//opens to another window 
			VentanaCityHospitals VentanaCityHospitals = new VentanaCityHospitals();
		}	

		if(e.getSource()==buttHome)
		{
			//close current window
			frame.dispose();
			//opens to another window 
			VentanaPrincipal VentanaPrincipal = new VentanaPrincipal();
		}		
		
	}
}
