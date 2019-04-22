import java.awt.Color;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class user1 extends JFrame implements ActionListener{


		JLabel l1,l2;
		JButton b1,b2;
		JTextField t2,t3,t4;
		Connection con;
		Statement st;
		Container c1;
		
		public user1()
		{
			setTitle("User Check");
			c1=getContentPane();
			c1.setBackground(Color.cyan);
			setVisible(true);
			setSize(getMaximumSize());
			l1 = new JLabel("WELCOME TO CREDIT CARD SYSTEM");
			l1.setFont(new Font("Century",Font.ROMAN_BASELINE,60));
			l1.setForeground(Color.magenta);
			l2 = new JLabel("What Do You Want To Do");
			l2.setFont(new Font("Times New Roman",Font.CENTER_BASELINE,40));
			l2.setForeground(Color.magenta);
			b1 = new JButton("View Balance");
			b2 = new JButton("Operate");
			b1.setForeground(Color.magenta);
			b2.setForeground(Color.magenta);
			b1.setBackground(Color.green);
			b2.setBackground(Color.green);
			b1.setFont(new Font("Times New Roman",Font.PLAIN,20));
			b2.setFont(new Font("Times New Roman",Font.PLAIN,20));
			
			add(l1);
			add(l2);
			add(b1);
			add(b2);
			
			setLayout(null);
			l1.setBounds(90, 50, 1200, 60);
			l2.setBounds(400, 220, 600, 50);
			b1.setBounds(350, 370, 200, 50);
			b2.setBounds(750, 370, 150, 50);
			
			b1.addActionListener(this);
			b2.addActionListener(this);
			
			
			try {
				con = DriverManager.getConnection("jdbc:odbc:data1");
				}
			catch (Exception e)	
			{
				
			}
		}
	
		
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if(arg0.getSource()==b1)
		{
			new bal();
			this.dispose();
			//setVisible(false);
			
		}
		
		if(arg0.getSource()==b2)
			new operate();
		this.dispose();
		//setVisible(false);
					
	}
	

}


class bal extends JFrame implements ActionListener{
	
	JTextField t1;
	JLabel l1;
	Container ct;
	JButton b1;
	Connection con;;
	Statement st;
	
	bal()
	{
		setTitle("Checking Balance");
		ct=getContentPane();
		ct.setBackground(Color.cyan);
		setVisible(true);
		setSize(getMaximumSize());
		t1 = new JTextField();
		l1 = new JLabel("Account Balance");
		l1.setFont(new Font("Century",Font.CENTER_BASELINE,70));
		l1.setForeground(Color.red);
		b1 = new JButton("back");
		b1.setForeground(Color.red);
		t1.setFont(new Font("Century",Font.CENTER_BASELINE,50));
		b1.addActionListener(this);
		
		add(l1);
		add(t1);
		add(b1);
		
		setLayout(null);
		l1.setBounds(350, 100, 700, 100);
		t1.setBounds(500, 250, 200, 100);
		b1.setBounds(80, 550, 100, 50);
		t1.setEditable(false);
		
		
		try {
			con = DriverManager.getConnection("jdbc:odbc:data1");
			String an = JOptionPane.showInputDialog("Enter AccountNo");		
			st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from bank where AccountNo='"+an+"'");
		
			rs.next();
			String s5=rs.getString(5);
			t1.setText(s5);
	
			}
		catch (Exception e)	
		{
			System.out.println(e.getMessage());
		}
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if(arg0.getSource()==b1)
		{
			new user1();
			this.dispose();
			//setVisible(false);
		}
	}
}


class operate extends JFrame implements ActionListener{
	
	JLabel w;
	JButton cv,s,sc,m,b1;
	Container ct;
	Connection con;
	Statement st;
	operate()
	{
		setTitle("Operate");
		ct=getContentPane();
		ct.setBackground(Color.cyan);
		setVisible(true);
		setSize(getMaximumSize());
		w = new JLabel("Welcome To Cyber Cash");
		w.setForeground(Color.magenta);
		w.setFont(new Font("Bell MT",Font.BOLD,80));
		cv = new JButton("Card Validation");
		s = new JButton("Statement");
		sc = new JButton("Subholder Creation");
		m = new JButton("Missed Card Options");
		b1 = new JButton("back");
		cv.setForeground(Color.magenta);
		cv.setBackground(Color.orange);
		s.setForeground(Color.magenta);
		s.setBackground(Color.yellow);
		sc.setBackground(Color.green);
		sc.setForeground(Color.magenta);
		m.setBackground(Color.white);
		m.setForeground(Color.magenta);
		b1.setForeground(Color.magenta);
		b1.setBackground(Color.orange);
		
		add(w);
		add(cv);
		add(s);
		add(sc);
		add(m);
		add(b1);
		
		cv.addActionListener(this);
		s.addActionListener(this);
		sc.addActionListener(this);
		m.addActionListener(this);
		b1.addActionListener(this);
		
		setLayout(null);
		w.setBounds(220, 60, 900, 90);
		cv.setBounds(525, 200, 180, 50);
		s.setBounds(525, 280, 180, 50);
		sc.setBounds(525, 360, 180, 50);
		m.setBounds(525, 440, 180, 50);
		b1.setBounds(80, 600, 100, 50);
		

		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
		if(arg0.getSource()==cv)
		{
			new valid();
			this.dispose();
		//setVisible(false);
		}
		
		if(arg0.getSource()==b1)
		{
			new user1();
			this.dispose();
			//setVisible(false);
		}
		if(arg0.getSource()==sc)
		{
			new sub();
			this.dispose();
			//setVisible(false);
		}
		if(arg0.getSource()==m)
		{
			new missed();
			this.dispose();
//			setVisible(false);
		}
		if(arg0.getSource()==s)
		{
			new state();
			this.dispose();
			//setVisible(false);
		}
	}
	
}


class valid extends JFrame implements ActionListener{

	JLabel cn,sc,d;
	JTextField t1,t2;
	JButton b1,b2;
	Container ct;
	Connection con;
	Statement st;
	valid()
	{
		setTitle("Card Validation Check");
		ct=getContentPane();
		ct.setBackground(Color.WHITE);
		setVisible(true);
		setSize(getMaximumSize());
		d = new JLabel("Enter Details");
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
		
		d.setBounds(370, 60, 900, 90);
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
			String a=t1.getText();
			String b=t2.getText();
			try {
				con = DriverManager.getConnection("jdbc:odbc:data1");	
				st=con.createStatement();
				ResultSet rs=st.executeQuery("select * from bank ");
			int flag=0;	
			
				while(rs.next())
				{
					String s12=rs.getString(12);
					String s4=rs.getString(4);
					String s5=rs.getString("state");
					System.out.println("val is"+s5);
					t1.setText(s4);
					t2.setText(s12);
				
				if(s4.equals(a) && s12.equals(b))
					{
					if(s5.equals("1"))
					{
					flag=1;
					new avalid(s4);					
					setVisible(false);
					}
					else
					{
						JOptionPane.showMessageDialog(null, "u r not valid user");
					}
					}
				}
				
				
			if(flag==0)
			{
			t1.setText("");
			t2.setText("");
					JOptionPane.showMessageDialog(null, "Please Fill Correct Details");
			
			
			}
			}
			catch (Exception e)	
			{
				System.out.println(e.getMessage());
			}
		}
		
		if(arg0.getSource()==b2)
		{
			new operate();
			setVisible(false);
		}
		
	}
	
}



class avalid extends JFrame implements ActionListener{

	JLabel cn,p,d;
	JTextField t1,t2;
	JButton b1,b2;
	Container ct;
	Connection con;
	Statement st;
	String s4;
	avalid(String s4)
	{
		this.s4=s4;
		setTitle("Amount Validation Check");
		ct=getContentPane();
		ct.setBackground(Color.green);
		setVisible(true);
		setSize(getMaximumSize());
		d = new JLabel("Amount Validation");
		d.setForeground(Color.BLUE);
		d.setFont(new Font("Bell MT",Font.BOLD,80));
		cn = new JLabel("Credit Card No.");
		p = new JLabel("Purchase Amount");
		t1 = new JTextField(s4);
		t2 = new JTextField();
		b1 = new JButton("Submit");
		b2 = new JButton("back");
		cn.setForeground(Color.blue);
		p.setForeground(Color.blue);
		b1.setForeground(Color.blue);
		b2.setForeground(Color.blue);
		
		add(d);
		add(cn);
		add(p);
		add(t1);
		add(t2);
		add(b1);
		add(b2);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		
		setLayout(null);
		
		d.setBounds(340, 60, 900, 90);
		cn.setBounds(450, 250, 120, 50);
		p.setBounds(450, 350, 120, 50);
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
			String a=t2.getText();
			int a1=Integer.parseInt(a);
					
			try 
			{
				con = DriverManager.getConnection("jdbc:odbc:data1");	
				st=con.createStatement();
				ResultSet rs=st.executeQuery("select * from bank where CreditCardNo='"+s4+"'");
				rs.next();
				int s5=rs.getInt(5);
				
				if(s5>a1)
					
				{
					JOptionPane.showMessageDialog(null, "Amount Is Sufficient");
					int d=JOptionPane.showConfirmDialog(null,"DO U WANT TO PURCHASE ??");
					if(d==JOptionPane.YES_OPTION)
					{
						new deduce(s5,a1,s4);
					setVisible(false);
					}
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Amount Is Not Sufficient");
					
				}
			}
				
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
			
		}
		
		
		if(arg0.getSource()==b2)
		{
			new valid();
			setVisible(false);
		}
	}
	
}


class deduce extends JFrame implements ActionListener{

	JButton b1;
	Container ct;
	Connection con;
	Statement st;
	
	deduce(int s5,int a1,String s4)
	{
		setTitle("Amount Deduction");
		ct=getContentPane();
		ct.setBackground(Color.gray);
		setVisible(true);
		setSize(getMaximumSize());
		b1 = new JButton("Back");
		b1.addActionListener(this);
		
		add(b1);
		
		setLayout(null);
		b1.setBounds(500, 300, 100, 50);
		
		try
		{
			con = DriverManager.getConnection("jdbc:odbc:data1");
			st=con.createStatement();
			st.executeUpdate("update bank set AccountBal = "+(s5-a1)+" where CreditCardNo='"+s4+"'");
			JOptionPane.showMessageDialog(null, "ur pur amt is deducted and ur curr bal is "+(s5-a1));
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if(arg0.getSource()==b1)
		{
			new valid();
			setVisible(false);
		}
	}
	
}
