import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class login extends JFrame implements ActionListener
{
    JLabel pleaseLogInLabel;
    JLabel email;
    JLabel passwordLabel;
    
    JButton logIn;
    JButton cancel;
    
    JTextField emailtxt;
    JPasswordField passwordTxt;
    
    String em;
    char[] pw;
    
    public login()
    {
        super("LOGIN PANEL");
        
        pleaseLogInLabel = new JLabel("Please Log in");
        pleaseLogInLabel.setBounds(180,10,150,30);
        add(pleaseLogInLabel);
        
        email = new JLabel("Email: ");
        email.setBounds(110,50,150,30);
        add(email);
        
        emailtxt = new JTextField();
        emailtxt.setBounds(200,55,150,20);
        add(emailtxt);
        
        passwordLabel = new JLabel("Password: ");
        passwordLabel.setBounds(115,80,150,30);
        add(passwordLabel);
        
        passwordTxt = new JPasswordField();
        passwordTxt.setBounds(200,85,150,20);
        add(passwordTxt);
        
        cancel = new JButton("Cancel");
        cancel.setBounds(100,150,100,30);
        cancel.setBackground(Color.white);
        cancel.setForeground(Color.red);
        add(cancel);
        
        logIn = new JButton("Log in");
        logIn.setBounds(300,150,100,30);
        logIn.setBackground(Color.white);
        logIn.setForeground(Color.red);
        add(logIn);
        
        logIn.addActionListener(this);
        cancel.addActionListener(this);
        
        setLayout(null);
        setBackground(Color.red);
        setSize(480,320);
        setResizable(false);
        setLocation(480,220);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        em = emailtxt.getText();
        pw = passwordTxt.getPassword();
		
		String pwd = new String(pw);
        
        if(ae.getSource()==logIn)
        {
            try{
                String query = "Select * from user_registration where email_id = "+'"'+em+'"'+" and password = "+'"'+pwd+'"';
				Connection c = DatabaseConnection.dbConnector();
				Statement st = c.createStatement();
				ResultSet r = st.executeQuery(query);
                
                int count =0;
                while(r.next())
                {
                    count = count + 1;
                }
                if(count>=1)
                {
                   // System.out.println(em+" "+new String(pw));
                    JOptionPane.showMessageDialog(null,"Login Successfull");
                    new busInfo(em);
                    dispose();
                }
                else
                {
                    //System.out.println(+em" "+new String(pw));
                    JOptionPane.showMessageDialog(null,"Username or Password is incorrect!");
                }
                r.close();
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,e);
                System.out.println("Error");
            }
        }
        
        else if(ae.getSource()==cancel)
        {
          //  setVisible(false);
           // new LibraryManagementSystem();
        }
    }
	public static void main(String[] args)
	{
		new login();
    }
}
