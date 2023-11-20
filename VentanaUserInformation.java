package smartcity;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class VentanaUserInformation implements ActionListener
{
    JFrame frame = new JFrame();
	JLabel l1 = new JLabel("User information section");
	JButton butt1 = new JButton("User information");	
    JButton butt2 = new JButton("Services information");
	JButton buttHome = new JButton("Back");

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
    
}