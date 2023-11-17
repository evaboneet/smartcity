package smartcity;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class VentanaJobSeekers implements ActionListener
{
	JFrame frame = new JFrame();
	JLabel l1 = new JLabel("Job seekers Section");
	JButton butt1 = new JButton("City Commodities");	
	JButton buttHome = new JButton("Back");
	
	VentanaJobSeekers()
	{
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1000,600);
		frame.setVisible(true);
		frame.setLayout(null);
		
		frame.add(l1);
		frame.add(butt1);	
		frame.add(buttHome);
		
		l1.setBounds(400, 80, 1000, 40);
		l1.setFont(new Font("Verdana", Font.PLAIN, 42));
		
		butt1.setBounds(385,100,250,100);
		butt1.setFocusable(false);
		butt1.addActionListener(this);
		butt1.setFont(new Font("Verdana", Font.PLAIN, 15));		
		
		buttHome.setBounds(600,400,300,50);
		buttHome.setFocusable(false);
		buttHome.addActionListener(this);
		buttHome.setFont(new Font("Verdana", Font.PLAIN, 12));		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==butt1)
		{
			//close current window
			frame.dispose();
			//opens to another window 
			WindowCity WindowCity = new WindowCity();
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
