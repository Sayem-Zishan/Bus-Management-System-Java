import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

class Bus4 extends JFrame implements ActionListener
{
    int[] arr = new int[32];
    String[] str = new String[32];
    int i;
    //String b,c;
    int bus=4;
	

    JLabel l3 = new JLabel("CHOOSE SEAT");
    JLabel l4 = new JLabel("BUS  4");
	

	
    JButton [] jb = new JButton[32];
    
    JButton b34 = new JButton("Confirm ");
    JButton b35 = new JButton(" Back");
    	
    public Bus4()
    {
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setContentPane(new JLabel(new ImageIcon("F:\\Bus\\src\\bus\\7.jpg")));
        
        setSize(950,650);
        setLocationRelativeTo(null);
        setVisible(true);
        setTitle("BUS 4");
        
        Position();
        
        for(i=0;i<32;i++)
        {
            arr[i]=0;
        }
        
        //GetInfo();
        
        setLayout(null);
    }
    
    public void actionPerformed(ActionEvent a)
    {
        for(i=0;i<32;i++)
        {
            if (a.getSource() == jb[i])
            {
                JButton s = (JButton) a.getSource();
                s.setBackground(Color.WHITE);
                s.setEnabled(false);
                arr[i] = 1;
                str[i] = jb[i].getText();
            }
        }
        
        if (a.getSource() == b34)
        {
           /* if ((!t1.getText().equals("") && !t2.getText().equals("")))
            {
                b = t1.getText();
                c = t2.getText();
                Payment p = new Payment(b, c, arr, str, bus);
                this.setVisible(false);
            } else
            {
                JOptionPane.showMessageDialog(this, "Feild Empty");
            }*/

        }
        if (a.getSource() == b35)
        {
            busInfo bus = new busInfo();
            this.setVisible(false);
        }
    }

  /*  public void GetInfo()
    {
        int AVL;
        try
        {
            String host = "jdbc:derby://localhost:1527/bus_ticket";
            String uName = "a";
            String uPass = "a";

            Connection con = DriverManager.getConnection(host, uName, uPass);

            Statement stmt = (Statement) con.createStatement();
            String query = "SELECT * FROM BUS4";
            stmt.executeQuery(query);
            ResultSet rs = stmt.getResultSet();

            int i = 0;
            while (rs.next())
            {
                AVL = rs.getInt("AVL");

                if (AVL == 1)
                {
                    arr[i] = 1;
                }
                i++;
            }

        }
        catch (SQLException err)
        {
            System.out.println(err.getMessage());
        }
        
        for (i = 0; i < 32; i++)
        {
            if (arr[i] == 1)
            {
                jb[i].setEnabled(false);
                jb[i].setBackground(Color.WHITE);
            }
        }
    }*/

    public void Position()
    {
       

        add(l3);
        l3.setBounds(700, 130, 100, 20);
        l3.setFont(new Font("Open Sans", Font.BOLD, 15));
        l3.setForeground(Color.WHITE);

        add(l4);
        l4.setBounds(200, 80, 170, 20);
        l4.setFont(new Font("Open Sans", Font.BOLD, 25));
        l4.setForeground(Color.WHITE);

        
        
        jb[0] = new JButton("A1");
        jb[1] = new JButton("A2");
        jb[2] = new JButton("A3");
        jb[3] = new JButton("A4");
        jb[4] = new JButton("B1");
        jb[5] = new JButton("B2");
        jb[6] = new JButton("B3");
        jb[7] = new JButton("B4");
        jb[8] = new JButton("C1");
        jb[9] = new JButton("C2");
        jb[10] = new JButton("C3");
        jb[11] = new JButton("C4");
        jb[12] = new JButton("D1");
        jb[13] = new JButton("D2");
        jb[14] = new JButton("D3");
        jb[15] = new JButton("D4");
        jb[16] = new JButton("E1");
        jb[17] = new JButton("E2");
        jb[18] = new JButton("E3");
        jb[19] = new JButton("E4");
        jb[20] = new JButton("F1");
        jb[21] = new JButton("F2");
        jb[22] = new JButton("F3");
        jb[23] = new JButton("F4");
        jb[24] = new JButton("G1");
        jb[25] = new JButton("G2");
        jb[26] = new JButton("G3");
        jb[27] = new JButton("G4");
        jb[28] = new JButton("H1");
        jb[29] = new JButton("H2");
        jb[30] = new JButton("H3");
        jb[31] = new JButton("H4");
        
        
        add(jb[0]);
        jb[0].setBounds(600, 160, 50, 20);
        jb[0].addActionListener(this);
        
        add(jb[1]);
        jb[1].setBounds(670, 160, 50, 20);
        jb[1].addActionListener(this);

        add(jb[2]);
        jb[2].setBounds(780, 160, 50, 20);
        jb[2].addActionListener(this);
        add(jb[3]);
        jb[3].setBounds(850, 160, 50, 20);
        jb[3].addActionListener(this);

        add(jb[4]);
        jb[4].setBounds(600, 200, 50, 20);
        jb[4].addActionListener(this);
        add(jb[5]);
        jb[5].setBounds(670, 200, 50, 20);
        jb[5].addActionListener(this);

        add(jb[6]);
        jb[6].setBounds(780, 200, 50, 20);
        jb[6].addActionListener(this);
        add(jb[7]);
        jb[7].setBounds(850, 200, 50, 20);
        jb[7].addActionListener(this);

        add(jb[8]);
        jb[8].setBounds(600, 240, 50, 20);
        jb[8].addActionListener(this);
        add(jb[9]);
        jb[9].setBounds(670, 240, 50, 20);
        jb[9].addActionListener(this);

        add(jb[10]);
        jb[10].setBounds(780, 240, 50, 20);
        jb[10].addActionListener(this);
        add(jb[11]);
        jb[11].setBounds(850, 240, 50, 20);
        jb[11].addActionListener(this);

        add(jb[12]);
        jb[12].setBounds(600, 280, 50, 20);
        jb[12].addActionListener(this);
        add(jb[13]);
        jb[13].setBounds(670, 280, 50, 20);
        jb[13].addActionListener(this);

        add(jb[14]);
        jb[14].setBounds(780, 280, 50, 20);
        jb[14].addActionListener(this);
        add(jb[15]);
        jb[15].setBounds(850, 280, 50, 20);
        jb[15].addActionListener(this);

        add(jb[16]);
        jb[16].setBounds(600, 320, 50, 20);
        jb[16].addActionListener(this);
        add(jb[17]);
        jb[17].setBounds(670, 320, 50, 20);
        jb[17].addActionListener(this);

        add(jb[18]);
        jb[18].setBounds(780, 320, 50, 20);
        jb[18].addActionListener(this);
        add(jb[19]);
        jb[19].setBounds(850, 320, 50, 20);
        jb[19].addActionListener(this);

        add(jb[20]);
        jb[20].setBounds(600, 360, 50, 20);
        jb[20].addActionListener(this);
        add(jb[21]);
        jb[21].setBounds(670, 360, 50, 20);
        jb[21].addActionListener(this);

        add(jb[22]);
        jb[22].setBounds(780, 360, 50, 20);
        jb[22].addActionListener(this);
        add(jb[23]);
        jb[23].setBounds(850, 360, 50, 20);
        jb[23].addActionListener(this);

        add(jb[24]);
        jb[24].setBounds(600, 400, 50, 20);
        jb[24].addActionListener(this);
        add(jb[25]);
        jb[25].setBounds(670, 400, 50, 20);
        jb[25].addActionListener(this);

        add(jb[26]);
        jb[26].setBounds(780, 400, 50, 20);
        jb[26].addActionListener(this);
        add(jb[27]);
        jb[27].setBounds(850, 400, 50, 20);
        jb[27].addActionListener(this);

        add(jb[28]);
        jb[28].setBounds(600, 440, 50, 20);
        jb[28].addActionListener(this);
        add(jb[29]);
        jb[29].setBounds(670, 440, 50, 20);
        jb[29].addActionListener(this);

        add(jb[30]);
        jb[30].setBounds(780, 440, 50, 20);
        jb[30].addActionListener(this);
        add(jb[31]);
        jb[31].setBounds(850, 440, 50, 20);
        jb[31].addActionListener(this);

        add(b34);
        b34.setBounds(750, 535, 135, 50);
        b34.setFont(new Font("", Font.BOLD, 20));
        b34.setForeground(Color.WHITE);
        b34.setFocusPainted(false);
        b34.setContentAreaFilled(false);
        b34.addActionListener(this);

        add(b35);
        b35.setBounds(40, 535, 130, 50);
        b35.setFont(new Font("", Font.BOLD, 20));
        b35.setForeground(Color.WHITE);
        b35.setFocusPainted(false);
        b35.setContentAreaFilled(false);
        b35.addActionListener(this);
    }

}