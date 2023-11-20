package smartcity;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class VentanaAdministrator implements ActionListener
{
    JFrame frame = new JFrame();
	JLabel l1 = new JLabel("Administrator Section");
	JButton butt1 = new JButton("User information");	
    JButton butt2 = new JButton("Services information");
	JButton buttHome = new JButton("Back");

    VentanaAdministrator(){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1000,600);
		frame.setVisible(true);
		frame.setLayout(null);
		
		frame.add(l1);
		frame.add(butt1);	
        frame.add(butt2);
		frame.add(buttHome);
		
		l1.setBounds(100, 300, 1000, 180);
		l1.setFont(new Font("Verdana", Font.PLAIN, 42));
		
		butt1.setBounds(200,100,250,100);
		butt1.setFocusable(false);
		butt1.addActionListener(this);
		butt1.setFont(new Font("Verdana", Font.PLAIN, 15));	
        
        butt2.setBounds(400,100,250,100);
		butt2.setFocusable(false);
		butt2.addActionListener(this);
		butt2.setFont(new Font("Verdana", Font.PLAIN, 15));
		
		buttHome.setBounds(600,400,300,50);
		buttHome.setFocusable(false);
		buttHome.addActionListener(this);
		buttHome.setFont(new Font("Verdana", Font.PLAIN, 12));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
    
}