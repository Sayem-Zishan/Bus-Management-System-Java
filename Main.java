import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Main extends JFrame implements ActionListener
{
    JButton b1 = new JButton("CUSTOMER");
    JButton b2 = new JButton("EMPLOYEE");
    JButton b3 = new JButton("ADMIN");

    public Main()
    {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(new JLabel(new ImageIcon("E:\\FINAL PROJECT\\1.png")));
        
        setVisible(true);
        
	setSize(700,350);
    	
       Position();
		
        setLayout(null);		
    }
    
    public void actionPerformed(ActionEvent a)
    {
        if (a.getSource() == b1)
        {
            Customer c= new Customer();
           this.setVisible(false);
        }
        if (a.getSource() == b2)
        {
           Customer c= new Customer();
           this.setVisible(false);
        }
        if (a.getSource() == b3)
        {
		   new addemploye();
		   this.setVisible(false);
        }
    }

    public void Position()
    {
        add(b1);
        b1.setBounds(500, 0, 200, 118);
        b1.setFont(new Font("Open Sans", Font.BOLD, 20));
        b1.setForeground(Color.WHITE);
        b1.setFocusPainted(false);
        b1.setContentAreaFilled(false);
        b1.addActionListener(this);

        add(b2);
        b2.setBounds(500, 117, 200, 117);
        b2.setFont(new Font("Open Sans", Font.BOLD, 20));
        b2.setForeground(Color.WHITE);
        b2.setFocusPainted(false);
        b2.setContentAreaFilled(false);
        b2.addActionListener(this);

        add(b3);
        b3.setBounds(500, 233, 200, 117);
        b3.setFont(new Font("Open Sans", Font.BOLD, 20));
        b3.setForeground(Color.WHITE);
        b3.setFocusPainted(false);
        b3.setContentAreaFilled(false);
        b3.addActionListener(this);
    }
	
	
}