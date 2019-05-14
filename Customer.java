import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.Statement;
import java.awt.Color.*;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Customer extends JFrame implements ActionListener 
{
	JButton signup,login;
	JTextField  t1,t2,t3,t4,t5;
	public Customer()
	{
		setVisible(true);
		setSize(600,600);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setBackground(Color.cyan); 
		
	    	JLabel l1=new JLabel("First Name ");
		l1.setBounds(20,20,100,45);
		add(l1);
		
		JLabel l2=new JLabel("Last Name");
		l2.setBounds(20,60,100,45);
		add(l2);
		
		JLabel l3=new JLabel("Email");
		l3.setBounds(20,100,100,45);
		add(l3);
		
		JLabel l4=new JLabel("Passsword");
		l4.setBounds(20,140,100,45);
		add(l4);
		JLabel l5=new JLabel("Phone Number");
		l5.setBounds(20,180,100,45);
		add(l5);

		
		t1=new JTextField();
		t1.setBounds(100,20,120,35);
		add(t1);
		//t1.setText(" ");
		
		t2=new JTextField();
		t2.setBounds(100,60,120,35);
		add(t2);
		//t2.setText(" ");
		
		
		t3=new JTextField();
		t3.setBounds(100,100,120,35);
		add(t3);
		//t3.setText(" ");
		
		t4=new JTextField();
		t4.setBounds(100,140,120,35);
		add(t4);
		t4.setText(" ");
		
		t5=new JTextField();
		t5.setBounds(100,180,120,35);
		add(t5);
		//t5.setText(" ");
		
	
		
		
		signup=new JButton("Sign Up");
		signup.setBounds(40,235,100,60);
		signup.addActionListener(this);
	    	add(signup);
		
		login=new JButton("Login");
		login.setBounds(450,235,100,60);
		login.addActionListener(this);
	    add(login);
		//b1.addActionListener(this);
		
		
		
	}
	public void actionPerformed(ActionEvent ae)
	{
		String fn = t1.getText();
		String ln = t2.getText();
		String em = t3.getText();
		String pw = t4.getText();
		String pn = t5.getText();
		
		if(ae.getSource()==signup)
		{
			try
			{
				String query = "INSERT INTO `user_registration` (`First_Name`, `Last_Name`, `Email_ID`, `Password`, `Phone_Number`) VALUES (" + '"'+fn+'"'+','+ '"'+ln+'"'+','+ '"'+em+'"'+','+'"'+pw+'"'+','+'"'+pn+'"'+')';
				Connection c = DatabaseConnection.dbConnector();
                Statement st = c.createStatement();
                st.executeUpdate(query);
			}catch(Exception e)
			{
				System.out.println("Error");
				JOptionPane.showMessageDialog(null, "User Can not created!!");
			}
			JOptionPane.showMessageDialog(null, "Button performed");
		}
		else if(ae.getSource()==login)
		{
			new login();
			this.setVisible(false);
	}
	}
		
	//public static void main(String[] args)
	//{new Customer();}
}