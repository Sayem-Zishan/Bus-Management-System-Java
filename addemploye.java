import javax.swing.*;
import java.awt.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.color.*;

public class addemploye extends JFrame implements ActionListener
{
	JLabel l1;
	JButton b1;
	
	public addemploye()
	{
		super("Admin Home");
		setVisible(true);
		setLayout(null);
		getContentPane().setBackground(Color.YELLOW);
		setSize(400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		l1=new JLabel("Want to add new Employee??");
		l1.setBounds(150,150,150,100);
		add(l1);
		
		b1=new JButton("Confirm");
		b1.setBounds(150,200,70,70);
		add(b1);
		b1.addActionListener(this);		
	}
	
	public void actionPerformed(ActionEvent event)
	{
		if(event.getSource() == b1) 
		{
            //write something here
        }
	  }
}