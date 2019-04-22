import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


public class login extends JFrame implements ActionListener,ItemListener {
  			
JTextField t1;
JLabel l1,l2,l3,l4,l5;
JButton b1,b2,b3,b4,b5,b6,b7,b8;
JRadioButton r1,r2;
Connection con;
Statement st;
int n=1;
JPasswordField t2;
Container c;
JPanel jp1=new JPanel();
JLabel ji=new JLabel(new ImageIcon("C:/credit card management system/src/images/images (3).jpg"));
 public login()
 {
	 setTitle("Login");
	 c=getContentPane();
	 c.setBackground(Color.BLUE);
	setVisible(true);
	setSize(getMaximumSize());
	t1 = new JTextField();
	l1 = new JLabel("Login ID");
	t2 = new JPasswordField();
	l2 = new JLabel("Password");
	b1 = new JButton("Sign Up");
	b2 = new JButton("Sign-Up");
	b3 = new JButton("Guide");
	b4 = new JButton("Choose your Best Card");
	b5 = new JButton("Cost of the Cards");
	b6 = new JButton("Hard Facts");
	b7 = new JButton("Contact Us");
	b8 = new JButton("About");
	l5 = new JLabel("Existing CCS Users");
	r1 = new JRadioButton("Admin");
	r2 = new JRadioButton("User");
	r1.setSelected(true);
	l4 = new JLabel("New User");
	l4.setFont(new Font("Arial",Font.BOLD,15));
	l3 = new JLabel("WELCOME TO CREDIT CARD SYSTEM");
	l3.setFont(new Font("Century",Font.ROMAN_BASELINE,50));
	l4.setForeground(Color.red);
	l3.setForeground(Color.red);
	l5.setForeground(Color.blue);
	l1.setForeground(Color.blue);
	l2.setForeground(Color.blue);
	b1.setForeground(Color.blue);
	r1.setForeground(Color.blue);
	r2.setForeground(Color.blue);
	b3.setForeground(Color.blue);
	b4.setForeground(Color.blue);
	b5.setForeground(Color.blue);
	b6.setForeground(Color.blue);
	b7.setForeground(Color.blue);
	b8.setForeground(Color.blue);
	b2.setForeground(Color.blue);
	l5.setFont(new Font("Times New Roman",Font.CENTER_BASELINE,30));
	
	jp1.add(t1);
	jp1.add(l1);
	jp1.add(t2);
	jp1.add(l2);
	jp1.add(b1);
	jp1.add(l5);
	add(l3);
	add(l4);
	jp1.add(r1);
	jp1.add(r2);
	add(b2);
	add(b3);
	add(b4);
	add(b5);
	add(b6);
	add(b7);
	add(b8);
	add(jp1);
	add(ji);
	jp1.setBackground(Color.cyan);
	
	
	jp1.setLayout(null);
	setLayout(null);
	jp1.setBounds(700,160,380,290);
	l5.setBounds(70, 05, 300, 60);
	l1.setBounds(30,70,100,50);
	t1.setBounds(110,70,100,50);
	l2.setBounds(30,130,100,50);
	t2.setBounds(110,130,100,50);
	b1.setBounds(160,210,100,50);
	l3.setBounds(180,30,1000,50);
	r1.setBounds(240, 70, 100, 50);
	r2.setBounds(240, 130, 100, 50);
	b3.setBounds(130, 130, 100, 50);
	b4.setBounds(130, 210, 170, 50);
	b5.setBounds(130, 290, 140, 50);
	b6.setBounds(130, 370, 100, 50);
	b7.setBounds(130, 450, 100, 50);
	b8.setBounds(130, 530, 100, 50);
	l4.setBounds(305, 570, 100, 50);
	b2.setBounds(380, 570, 100, 50);
	ji.setBounds(380, 170, 300, 300);
	
	b1.addActionListener(this);
	b2.addActionListener(this);
	b3.addActionListener(this);
	b4.addActionListener(this);
	b5.addActionListener(this);
	b6.addActionListener(this);
	b7.addActionListener(this);
	b8.addActionListener(this);
	
	ButtonGroup bg1=new ButtonGroup();
	bg1.add(r1);
	bg1.add(r2);
	r1.addItemListener(this);
	r2.addItemListener(this);
	
	
	try {
		con = DriverManager.getConnection("jdbc:odbc:data1");
			System.out.println("connected");	
		}
	catch (Exception e)	
	{
		System.out.println(""+e.getMessage());
	}
 }
	public static void main(String[] args) {
		
		new login
		();
		
	}
	
	

@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	if(arg0.getSource()==b1&& n==1)
	{
		String a=t1.getText();
		String b=t2.getText();
		try
		{
			st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from loginadmin");
			
			while(rs.next())
			{
			String s1=rs.getString(1);
			String s2=rs.getString(2);
			if(s1.equals(a)&&s2.equals(b))
			{
				new admin();
				break;
			}

			}
			t1.setText("");
			t2.setText("");
		
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	



	if(arg0.getSource()==b1&& n==2)
	{
		String a=t1.getText();
		String b=t2.getText();
		try
		{
			st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from loginuser");
			
			while(rs.next())
			{
			String s1=rs.getString(1);
			String s2=rs.getString(2);
			if(s1.equals(a)&&s2.equals(b))
			{
				new user1();
				
				break;
			}
			}
		t1.setText("");
		t2.setText("");
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	if(arg0.getSource()==b2)
	{
		new newuser();
		//setVisible(false);
		this.dispose();
	}
	
	
	if(arg0.getSource()==b3)
	{
		new guide();
	}
	if(arg0.getSource()==b4)
	{
		new bcard();
	}
	if(arg0.getSource()==b5)
	{
		new ccard();
	}
	if(arg0.getSource()==b6)
		new facts();
	
	if(arg0.getSource()==b7)
		new contact();
	
	if(arg0.getSource()==b8)
		new about();
		
}
@Override
public void itemStateChanged(ItemEvent arg0) {
	// TODO Auto-generated method stub
	if(r1.isSelected())
		n=1;
	else if(r2.isSelected())
		n=2;
	
}}