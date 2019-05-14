import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import java.awt.event.*;

class busInfo extends JFrame implements ActionListener
{	
    JLabel l1 = new JLabel("Wellcome to our service");
    JLabel l2 = new JLabel("Choose Bus Time");
    JLabel l3 = new JLabel("Dhaka to Chittagong");
    JLabel l4 = new JLabel("Chittagong to Dhaka");
	
    JButton b1 = new JButton("Bus 1:  2.30pm");
    JButton b2 = new JButton("Bus 2:  5.00pm");
    JButton b31 = new JButton("Bus 3:  9.30am");
    JButton b41 = new JButton("Bus 4:  11.30am");
    
    JButton b5 = new JButton(" BACK");
	
	String un;
	
    public busInfo(String un)
    {
		this.un=un;
		
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setContentPane(new JLabel(new ImageIcon("C:\\Users\\5000 Series\\Downloads\\project\\project\\2.JPG")));

        setSize(950, 650);
        setLocationRelativeTo(null);
        setVisible(true);
        setTitle("BUS SELECTION");

        Position();
        
        setLayout(null);

    }
	
    public void actionPerformed(ActionEvent a)
    {
		
    	if(a.getSource() == b1)
	{
            new Bus1(un);
            this.setVisible(false);
	}
	if(a.getSource() == b2)
	{
            Bus2 b2= new Bus2();
            this.setVisible(false);
	}

        if (a.getSource() == b31)
        {
            Bus3 b3 = new Bus3();
            this.setVisible(false);
        }
        if (a.getSource() == b41)
        {
            Bus4 b4 = new Bus4();
            this.setVisible(false);
        }
        if(a.getSource() == b5)
	{
           Main m= new Main();
           this.setVisible(false);
	}	
    }

    public void Position()
    {
        add(l1);
        l1.setBounds(80, 400, 300, 70);
        l1.setFont(new Font("Open Sans", Font.BOLD, 25));
        l1.setForeground(Color.WHITE);

        add(l2);
        l2.setBounds(125, 420, 220, 90);
        l2.setFont(new Font("Open Sans", Font.BOLD, 25));
        l2.setForeground(Color.WHITE);

        add(l3);
        l3.setBounds(550, 05, 420, 90);
        l3.setFont(new Font("Open Sans", Font.BOLD, 25));
        l3.setForeground(Color.WHITE);

        add(l4);
        l4.setBounds(550, 315, 420, 90);
        l4.setFont(new Font("Open Sans", Font.BOLD, 25));
        l4.setForeground(Color.WHITE);

        add(b1);
        b1.setBounds(545, 76, 200, 117);
        b1.setFont(new Font("Open Sans", Font.BOLD, 20));
        b1.setForeground(Color.getHSBColor(4.1F, 0.7F, 9.2F));
        b1.setBackground(Color.WHITE);
        b1.setFocusPainted(false);
        b1.addActionListener(this);

        add(b2);
        b2.setBounds(545, 192, 200, 117);
        b2.setFont(new Font("Open Sans", Font.BOLD, 20));
        b2.setForeground(Color.getHSBColor(4.1F, 0.7F, 9.2F));
        b2.setBackground(Color.WHITE);
        b2.setFocusPainted(false);
        b2.addActionListener(this);

        
        

        add(b31);
        b31.setBounds(744, 388, 200, 117);
        b31.setFont(new Font("Open Sans", Font.BOLD, 20));
        b31.setForeground(Color.getHSBColor(4.1F, 0.7F, 9.3F));
        b31.setFocusPainted(false);
        b31.setBackground(Color.WHITE);
        b31.addActionListener(this);

        add(b41);
        b41.setBounds(744, 504, 200, 117);
        b41.setFont(new Font("Open Sans", Font.BOLD, 20));
        b41.setForeground(Color.getHSBColor(4.1F, 0.7F, 9.3F));
        b41.setFocusPainted(false);
        b41.setBackground(Color.WHITE);
        b41.addActionListener(this);

        add(b5);
        b5.setBounds(40, 535, 130, 50);
        b5.setFont(new Font("", Font.BOLD, 20));
        b5.setForeground(Color.WHITE);
        b5.setFocusPainted(false);
        b5.setContentAreaFilled(false);
        b5.addActionListener(this);
    }
	/*public static void main(String args[])
	{
		busInfo b5=new busInfo();
		b5.Position();
	}*/
	
}
	
