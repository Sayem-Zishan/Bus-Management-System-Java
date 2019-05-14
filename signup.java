import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.color.*;


public class signup extends JFrame implements ActionListener
{
	JButton b1;
	JTextField t1,t2,t3,t4,t5,t6;
	JLabel l1,l2,l3,l4,l5,l6;
	
	public signup()
	{
		super("Signup");
		setVisible(true);
		setLayout(null);
		//getContentPane().
		setBackground(Color.YELLOW);
	    //setPenColor(Color.green);
		setSize(400,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		l1=new JLabel("First Name");
		l1.setBounds(20,40,100,50);
		add(l1);
		
		l2=new JLabel("Last Name:");
		l2.setBounds(20,90,100,50);
		add(l2);
		
		l3=new JLabel("Address");
		l3.setBounds(20,140,100,50);
		add(l3);
		
		l4=new JLabel("Email");
		l4.setBounds(20,190,100,50);
		add(l4);
		
		l5=new JLabel("Mobile Number");
		l5.setBounds(20,240,100,50);
		add(l5);
		
		l6=new JLabel("Password");
		l6.setBounds(20,290,100,50);
		add(l6);
		
		t1=new JTextField();
		t1.setBounds(150,50,200,30);
		add(t1);
		
		t2=new JTextField();
		t2.setBounds(150,100,200,30);
		add(t2);
		
		t3=new JTextField();
		t3.setBounds(150,150,200,30);
		add(t3);
		
		t4=new JTextField();
		t4.setBounds(150,200,200,30);
		add(t4);
		
		t5=new JTextField();
		t5.setBounds(150,250,200,30);
		add(t5);
		
		t6=new JTextField();
		t6.setBounds(150,300,200,30);
		add(t6);
		
		b1=new JButton("SignUp");
		b1.setBounds(200,350,100,70);
		add(b1);
		b1.addActionListener(this::actionPerformed);
		
			
	}
	
	 public void actionPerformed(ActionEvent event)
	 {
        
    
        if(event.getSource() == b1) 
		{
            JOptionPane.showMessageDialog(null,"Signup completed: ");
        }
	 }
public static void main(String[] args)
	{
        signup s1 = new signup();
		
     }
		

}