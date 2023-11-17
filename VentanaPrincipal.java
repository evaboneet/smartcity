package smartcity;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.Font;
import java.awt.Image;

public class VentanaPrincipal implements ActionListener
{
	//Declaring J Elements
	
	JFrame frame = new JFrame();
	JLabel l1 = new JLabel("SmartCity");
	JButton butt1 = new JButton("Tourists");
	JButton butt2 = new JButton("Job Seekers");	
	JButton butt3 = new JButton("Students");
	JButton butt4 = new JButton("Business news");
	ImageIcon m=new ImageIcon("smartcity.png");
	JLabel b=new JLabel(m);
	
	VentanaPrincipal()
	{
		
		// Set Size, Layout and Close operation for the window
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1000,600);
		frame.setVisible(true);
		frame.setLayout(null);
		
		// Setting Labels, Buttons in the window
		frame.add(l1);
		frame.add(butt1);
		frame.add(butt2);
		frame.add(butt3);
		frame.add(butt4);
		frame.add(b);
		
		// setting label font, size and position
		l1.setBounds(400, 80, 1000, 40);
		l1.setFont(new Font("Verdana", Font.PLAIN, 42));
		
		
		// setting button font, size and position
		
		butt1.setBounds(100,300,180,100);
		butt1.setFocusable(false);
		butt1.addActionListener(this);
		butt1.setFont(new Font("Verdana", Font.PLAIN, 12));		

		butt2.setBounds(300,300,180,100);
		butt2.setFocusable(false);
		butt2.addActionListener(this);
		butt2.setFont(new Font("Verdana", Font.PLAIN, 12));

		butt3.setBounds(500,300,180,100);
		butt3.setFocusable(false);
		butt3.addActionListener(this);
		butt3.setFont(new Font("Verdana", Font.PLAIN, 12));

		butt4.setBounds(700,300,180,100);
		butt4.setFocusable(false);
		butt4.addActionListener(this);
		butt4.setFont(new Font("Verdana", Font.PLAIN, 12));
			
		// setting image scale and position
		Image img=m.getImage();
		Image temp=img.getScaledInstance(500,600,Image.SCALE_SMOOTH);
		m=new ImageIcon(temp);
		    
		b.setLayout(null);
		b.setBounds(5,60,975,380);			
		
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==butt1)
		{
			//close current window
			frame.dispose();
			//opens to another window 
			VentanaTurists VentanaTurists = new VentanaTurists();
		}		

		if(e.getSource()==butt2)
		{
			//close current window
			frame.dispose();
			//opens to another window 
			VentanaJobSeekers VentanaJobSeekers = new VentanaJobSeekers();
		}	

		if(e.getSource()==butt3)
		{
			//close current window
			frame.dispose();
			//opens to another window 
			VentanaStudents VentanaStudents = new VentanaStudents();
		}	

		if(e.getSource()==butt4)
		{
			//close current window
			frame.dispose();
			//opens to another window 
			VentanaBusiness VentanaBusiness = new VentanaBusiness();
		}	
	}

			
	
	
	}
	

