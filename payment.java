import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.color.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;


public class payment extends JFrame implements ActionListener
{
	JButton b1,getTN;
	JLabel l1,l2;
	JTextField t1,t2;
	
	String em,sn;
	
	public payment(String em,String sn)
	{
		super("Payment");
		setVisible(true);
		setLayout(null);
		getContentPane().setBackground(Color.YELLOW);
		setSize(400,400);
		setLocation(480,180);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		em = "aiub.edu"; //bad dite hoibo
		this.em = em; //just ei line kajkorbo
		this.sn = sn; //tikase
		
		l1=new JLabel("Bkash Number:");
		l1.setBounds(20,40,100,50);
		add(l1);
		
		l2=new JLabel("Transtiction Number:");
		l2.setBounds(20,90,150,50);
		add(l2);
		
		t1=new JTextField();
		t1.setBounds(150,50,200,30);
		add(t1);
		
		t2=new JTextField();
		t2.setBounds(150,100,200,30);
		add(t2);
		
		b1=new JButton("Confirm");
		b1.setBounds(150,250,100,70);
		add(b1);
		b1.addActionListener(this);
		
		getTN = new JButton("Get transaction number");
		getTN.setBounds(100,200,200,30);
		add(getTN);
		getTN.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent event)
	 {
        String bn = t1.getText();
		String tn = t2.getText();
    
        if(event.getSource() == b1) 
		{
            //JOptionPane.showMessageDialog(null,"payment completed:");
			try
			{
				String query="SELECT * FROM `payment` WHERE Email_ID="+'"'+em+'"'+"and Bkash_No="+'"'+bn+'"'+"and Transaction_No="+'"'+tn+'"';
				Connection c = DatabaseConnection.dbConnector();
                Statement st = c.createStatement();
				ResultSet rs = st.executeQuery(query);
				
				int count=0;
				while(rs.next())
				{
					count+=count;
					//count=count+1;
					//++count
				}
				if(count<1)
				{
					try{
						String qr = "UPDATE `bus_1` SET `Info`='YES' WHERE `Seat_no`="+'"'+sn+'"';
						st.executeUpdate(qr);
						
						JOptionPane.showMessageDialog(null, "Payment completed");
					}
					catch(Exception e)
					{
						JOptionPane.showMessageDialog(null, e);
					}
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Payment not completed");
				}
			}
			catch(Exception e)
			{
				JOptionPane.showMessageDialog(null, "Payment denied. Try again...");
			}
        }
		else if(event.getSource()==getTN)
		{
			try{
				String query = "UPDATE `payment` SET `Transaction_No`=(SELECT LEFT(UUID(), 8)) WHERE Bkash_No ="+'"'+bn+'"';
				Connection c = DatabaseConnection.dbConnector();
                Statement st = c.createStatement();
                st.executeUpdate(query);
				
				String tni="";
				
				try{
					String query2 = "SELECT Transaction_No FROM `payment` WHERE Bkash_No = "+'"'+bn+'"';
                    ResultSet rs = st.executeQuery(query2);
					
					int count=0;
					while(rs.next())
					{
						tni = rs.getString("Transaction_No");
						count=count+1;
					}
					if(count<1)
					{
						System.out.println("Checking...");
					}
					else
					{
						JOptionPane.showMessageDialog(null, tni);
					}
				}catch(Exception ex)
				{
					JOptionPane.showMessageDialog(null, "Transaction number invalid");
				}
				
			}catch(Exception e)
			{
				JOptionPane.showMessageDialog(null, e);
			}
		}
	 }
	
	/*public static void main(String[] args)
	{
		new payment("");
	}*/
}