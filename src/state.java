import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class state extends JFrame implements ActionListener{
	JPanel jp1=new JPanel();
	JLabel l1,l2,l3,l4,l5,l6;
	JTextField t7,t2,t3,t4,t5,t6;
	JButton b1;
	Container c;
	state()
	{
		setTitle("Statement");
		setVisible(true);
		setSize(getMaximumSize());
		 c=getContentPane();
		 c.setBackground(Color.green);
		 
		jp1.setBackground(Color.gray);		
		l1 = new JLabel("Billing Information");
		l1.setForeground(Color.red);
		l1.setFont(new Font("Bell MT",Font.BOLD,40));
		b1 = new JButton("back");
		b1.setForeground(Color.red);
		b1.addActionListener(this);
		
		l2 = new JLabel("Card Type");
		l2.setFont(new Font("Century",Font.BOLD,17));
		l2.setForeground(Color.red);
		l3 = new JLabel("Cardholder's Name");
		l3.setFont(new Font("Century",Font.BOLD,17));
		l3.setForeground(Color.red);
		l4 = new JLabel("Card Number");
		l4.setFont(new Font("Century",Font.BOLD,17));
		l4.setForeground(Color.red);
		l5 = new JLabel("Expires On");
		l5.setFont(new Font("Century",Font.BOLD,17));
		l5.setForeground(Color.red);
		l6 = new JLabel("Security Code");
		l6.setFont(new Font("Century",Font.BOLD,17));
		l6.setForeground(Color.red);
		
		t2 = new JTextField();
		t3 = new JTextField();
		t4 = new JTextField();
		t5 = new JTextField();
		t6 = new JTextField();
		t7 = new JTextField();
		t2.setForeground(Color.red);
		t3.setForeground(Color.red);
		t4.setForeground(Color.red);
		t5.setForeground(Color.red);
		t6.setForeground(Color.red);
		t7.setForeground(Color.red);
		
		t2.setText("Visa");
		t3.setText("Joe P Anderson");
		t4.setText("4312xxxxxxx323");
		t5.setText("07");
		t7.setText("2039");
		t6.setText("1747");
		
		add(jp1);
		jp1.add(l2);
		jp1.add(l3);
		jp1.add(l4);
		jp1.add(l5);
		jp1.add(l6);
		jp1.add(t2);
		jp1.add(t3);
		jp1.add(t4);
		jp1.add(t5);
		jp1.add(t6);
		jp1.add(t7);
		jp1.add(l1);
		add(b1);
		
		jp1.setLayout(null);
		setLayout(null);
		jp1.setBounds(350,100,580,460);
		l1.setBounds(120, 10, 500, 80);
		l2.setBounds(80,110,200,50);
		t2.setBounds(290,110,210,50);
		l3.setBounds(80,170,200,50);
		t3.setBounds(290,170,210,50);
		l4.setBounds(80,230,200,50);
		t4.setBounds(290,230,210,50);
		l5.setBounds(80,290,100,50);
		t5.setBounds(290,290,70,50);
		t7.setBounds(370,290,130,50);
		l6.setBounds(80,350,150,50);
		t6.setBounds(290,350,210,50);
		b1.setBounds(1150, 570, 100, 50);
		
		t2.setEditable(false);
		t3.setEditable(false);
		t4.setEditable(false);
		t5.setEditable(false);
		t6.setEditable(false);
		t7.setEditable(false);
		
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if(arg0.getSource()==b1)
		{
			new operate();
			setVisible(false);
		}
		
	}
}


class missed extends JFrame implements ActionListener{

	JLabel d,cn,sc;
	Container ct;
	JTextField t1,t2;
	JButton b1,b2;
	Connection con;
	Statement st;
	missed()
	{
		setTitle("Reporting A Card");
		ct=getContentPane();
		ct.setBackground(Color.WHITE);
		setVisible(true);
		setSize(getMaximumSize());
		d = new JLabel("Missed Card Details");
		d.setForeground(Color.red);
		d.setFont(new Font("Bell MT",Font.BOLD,80));
		cn = new JLabel("Credit Card No.");
		sc = new JLabel("Security Code");
		t1 = new JTextField();
		t2 = new JTextField();
		b1 = new JButton("Submit");
		b2 = new JButton("back");
		b1.setForeground(Color.red);
		b2.setForeground(Color.red);
		cn.setForeground(Color.red);
		sc.setForeground(Color.red);
		
		
		add(d);
		add(cn);
		add(sc);
		add(t1);
		add(t2);
		add(b1);
		add(b2);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		
		setLayout(null);
		
		d.setBounds(300, 60, 900, 90);
		cn.setBounds(450, 250, 120, 50);
		sc.setBounds(450, 350, 120, 50);
		t1.setBounds(600, 250, 100, 50);
		t2.setBounds(600, 350, 100, 50);
		b1.setBounds(525, 430, 100, 50);
		b2.setBounds(80, 600, 100, 50);
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if(arg0.getSource()==b1)
		{
		//	int flag=0;
			
			try {
				con = DriverManager.getConnection("jdbc:odbc:data1");	
				st=con.createStatement();					
				ResultSet rs=st.executeQuery("select * from bank  where CreditCardNo='"+t1.getText()+"' and SecurityCode ='"+t2.getText()+"'");
				if (rs.next())
				{
					//	String s12=rs.getString(12);
						//String s4=rs.getString(4);
						String s14=rs.getString(14);
					if(s14.equals("1"))
					{
							st.executeUpdate("update bank set state=0 where CreditCardNo='"+t1.getText()+"' and SecurityCode ='"+t2.getText()+"'");
							JOptionPane.showMessageDialog(null, "Credit Card Is Blocked");
							t1.setText("");
							t2.setText("");
						//	flag=1;
						}
						else
							{
							JOptionPane.showMessageDialog(null, "Credit Card Is Already Blocked");
							t1.setText("");
							t2.setText("");
							}
								
						}
				
				else
				{
					JOptionPane.showMessageDialog(null, "There does not exits Credit Card of such number");
					t1.setText("");
					t2.setText("");
				}
				
				}
			
			catch(Exception e)
			{
			System.out.println(""+e.getMessage());	
			}
			
		}
		
		if(arg0.getSource()==b2)
		{
			new operate();
			this.dispose();
			//setVisible(false);
		}
			
	}
	
}

