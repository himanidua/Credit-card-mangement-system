import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class bank extends JFrame implements ActionListener,ItemListener{

	JMenuBar jm1;
	JMenu bank;
	JButton b1;
	JMenuItem m1,m2,m3,m4,m5;
	JLabel lc1,lc2,lc3,lc4,lc5,lc6,lc7,lc8,lc9,lc10,lc11,lc12,lc13;
	JTextField tc1,tc2,tc4,tc5,tc6,tc7,tc9,tc11,tc12;
	JTextArea tc13;
	JRadioButton r1,r2,r3,r4;
	JComboBox jc1,jc2,jc3;
	JComboBox jc4;
	String a,s1,s2;
	Connection con;
	Statement st;
	Container c;
	bank()
	{
		setTitle("Bank Details Of Customer");
		c=getContentPane();
		 c.setBackground(Color.magenta);
		setVisible(true);
		setSize(getMaximumSize());
		
		jc1=new JComboBox();
		for(int i=1;i<=31;i++)
			jc1.addItem(i);
		add(jc1);
		jc2=new JComboBox();
		for(int i=1;i<=12;i++)
			jc2.addItem(i);
		add(jc2);
		jc3=new JComboBox();
		for(int i=2014;i<=2050;i++)
			jc3.addItem(i);
		add(jc3);
		
		jc4=new JComboBox();
		jc4.addItem("Master Card");
		jc4.addItem("Visa");
		jc4.addItem("Amex");
		jc4.addItem("Other");
		add(jc4);
		jc1.addItemListener(this);
		jc2.addItemListener(this);
		jc3.addItemListener(this);
		jc4.addItemListener(this);
		
		lc1 = new JLabel("Issuing Bank");
		lc2 = new JLabel("Account Number");
		lc3 = new JLabel("Account Type");
		lc4 = new JLabel("Credit Card Number");
		lc5 = new JLabel("Account Balance");
		lc6 = new JLabel("Branch Code");
		lc7 = new JLabel("Ifse Code");
		lc8 = new JLabel("Card Type");
		lc9 = new JLabel("Name on Card");
		lc10 = new JLabel("Expiry Date");
		lc11 = new JLabel("Credit Limit");
		lc12 = new JLabel("Security Code");
		lc13 = new JLabel("Billing Address");
		tc1 = new JTextField();
		tc2 = new JTextField();
		b1 = new JButton("back");
		r1 = new JRadioButton("Savings");
		r2 = new JRadioButton("Current");
		tc4 = new JTextField();
		tc5 = new JTextField();
		tc6 = new JTextField();
		tc7 = new JTextField();
		tc9 = new JTextField();
		tc11 = new JTextField();
		tc12 = new JTextField();
		tc13 = new JTextArea();
		
		add(tc1);
		add(tc2);
		add(r1);
		add(r2);
		add(tc4);
		add(tc5);
		add(tc6);
		add(tc7);
		add(tc9);
		add(tc11);
		add(tc12);
		add(tc13);
		
		add(lc1);
		add(lc2);
		add(lc3);
		add(lc4);
		add(lc5);
		add(lc6);
		add(lc7);
		add(lc8);
		add(lc9);
		add(lc10);
		add(lc11);
		add(lc12);
		add(lc13);
		add(b1);
		
		r1.addItemListener(this);
		r2.addItemListener(this);
		b1.addActionListener(this);
		
		jm1=new JMenuBar();
		setJMenuBar(jm1);
		bank=new JMenu("Details");
		jm1.add(bank);
		m1=new JMenuItem("Insert");
		bank.add(m1);
		m1.addActionListener(this);
		
		m2=new JMenuItem("Delete");
		bank.add(m2);
		m2.addActionListener(this);
		
		m3=new JMenuItem("Update");
		bank.add(m3);
		m3.addActionListener(this);
		
		m4=new JMenuItem("View");
		bank.add(m4);
		m4.addActionListener(this);
		
		m5=new JMenuItem("Exit");
		bank.add(m5);
		m5.addActionListener(this);
		
		setLayout(null);
		
		lc1.setBounds(180, 80, 100, 50);
		lc2.setBounds(180, 150, 100, 50);
		lc3.setBounds(180, 210, 100, 50);
		lc4.setBounds(180, 280, 120, 50);
		lc5.setBounds(180, 350, 100, 50);
		lc6.setBounds(180, 420, 120, 50);
		lc7.setBounds(180, 490, 110, 50);
		lc8.setBounds(180, 560, 100, 50);
		lc9.setBounds(800, 80, 100, 50);
		lc10.setBounds(800, 150, 100, 50);
		lc11.setBounds(800, 210, 100, 50);
		lc12.setBounds(800, 280, 100, 50);
		lc13.setBounds(800, 350, 100, 50);
		
		tc1.setBounds(350, 80, 100, 50);
		tc2.setBounds(350, 150, 100, 50);
		r1.setBounds(350, 210, 100, 50);
		r2.setBounds(500, 210, 100, 50);
		tc4.setBounds(350,280,100,50);
		tc5.setBounds(350, 350, 100, 50);
		tc6.setBounds(350, 420, 100, 50);
		tc7.setBounds(350, 490, 100, 50);
		jc4.setBounds(350, 560, 100, 40);
		tc9.setBounds(970, 80, 100, 50);
		jc1.setBounds(970,150,50,40);
		jc2.setBounds(1020, 150, 50, 40);
		jc3.setBounds(1070, 150, 80, 40);
		tc11.setBounds(970,210,100,50);
		tc12.setBounds(970, 280, 100, 50);
		tc13.setBounds(970, 350, 100, 50);
		b1.setBounds(1150, 550, 100, 50);
		
		ButtonGroup bg1=new ButtonGroup();
		bg1.add(r1);
		bg1.add(r2);
		
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
		
		if(arg0.getSource()==m1)
		{
			if(tc1.getText().equals("")||tc2.getText().equals("")||tc4.getText().equals("")||tc5.getText().equals("")||tc6.getText().equals("")||tc7.getText().equals("")||tc9.getText().equals("")||tc11.getText().equals("")||tc12.getText().equals("")||tc13.getText().equals(""))
			{
				JOptionPane.showMessageDialog(null, "Please fill all the fields");
				
			}
			else
			{
			try
			{
				st=con.createStatement();
				st.executeUpdate("insert into bank(IssuingBank,AccountNo,AccountType,CreditCardNo,AccountBal,BranchCode,Ifse,CardType,NameOnCard,ExpiryDate,CreditLimit,SecurityCode,BillingAdd) values('"+tc1.getText()+"','"+tc2.getText()+"','"+a+"','"+tc4.getText()+"',"+tc5.getText()+",'"+tc6.getText()+"','"+tc7.getText()+"','"+s2+"','"+tc9.getText()+"','"+s1+"','"+tc11.getText()+"','"+tc12.getText()+"','"+tc13.getText()+"')");
				JOptionPane.showMessageDialog(null, "inserted");
				
				tc1.setText("");
				tc2.setText("");
				r1.setSelected(false);
				r2.setSelected(false);
				jc1.setSelectedIndex(0);
				jc2.setSelectedIndex(0);
				jc3.setSelectedIndex(0);
				tc4.setText("");
				tc5.setText("");
				tc6.setText("");
				tc7.setText("");
				jc4.setSelectedItem("");
				tc9.setText("");
				tc12.setText("");
				tc13.setText("");
				tc11.setText("");
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
			}
		}
		
		
		if(arg0.getSource()==m2)
		{ 
			String sn=JOptionPane.showInputDialog("Enter Accno");
			try
			{
			if(!sn.equals(""))
			{
			try
			{
				st=con.createStatement();
				ResultSet rs=st.executeQuery("select * from bank where AccountNo='"+sn+"'");
				
				if(rs.next())
				{
					st.executeUpdate("delete from bank where AccountNo='"+sn+"'");
					JOptionPane.showMessageDialog(null, "deleted");
					
				}
					else
						JOptionPane.showMessageDialog(null, "AccountNo not exits");
			}
			
			
			catch(Exception e)
			{
				//System.out.print(e.getMessage());
			}
			}
			else
			{
				JOptionPane.showMessageDialog(null, "accno not filled");
			}
			}
			catch(Exception e)
			{
			//	System.out.println(e.getMessage());
			}
		}
		
		
		if(arg0.getSource()==m3)
		{
			String c=JOptionPane.showInputDialog("Enter Ifse");
			
			try
			{
				st=con.createStatement();
				st.executeUpdate("update bank set BranchCode='"+tc6.getText()+"' where Ifse='"+c+"'");
				JOptionPane.showMessageDialog(null, "updated");
			}
			catch(Exception e)
			{
				System.out.print(e.getMessage());
			}
			
		}
		
		
		if(arg0.getSource()==m4)
		{
			String sb=JOptionPane.showInputDialog("Enter AccountNO");
			System.out.println(JOptionPane.OPTION_TYPE_PROPERTY);
			System.out.println(sb);			
			ResultSet rs=null;
			try
			{
				st=con.createStatement();
				 rs=st.executeQuery("select * from bank where AccountNo='"+sb+"'");
				if(rs.next())
				{
				String s1 = rs.getString(1);
				String s2 = rs.getString(2);
				String s3 = rs.getString(3);
				String s4 = rs.getString(4);
				int s5 = rs.getInt(5);
				String s6 = rs.getString(6);
				String s7 = rs.getString(7);
				String s8 = rs.getString(8);
				String s9 = rs.getString(9);
				String s10=rs.getString(10);
				String a[]=s10.split("-");
				String s11 = rs.getString(11);
				String s12 = rs.getString(12);
				String s13 = rs.getString(13);
				
				tc1.setText(s1);
				tc2.setText(s2);
				if(s3.equals("Savings"))
					r1.setSelected(true);
				else
					r2.setSelected(true);
				
				tc4.setText(s4);
				tc5.setText(""+s5);
				tc6.setText(s6);
				tc7.setText(s7);	
				jc4.setSelectedItem(s8);
				tc9.setText(s9);
				jc1.setSelectedItem(Integer.parseInt(a[0]));
				jc2.setSelectedItem(Integer.parseInt(a[1]));
				jc3.setSelectedItem(Integer.parseInt(a[2]));
				tc11.setText(s11);
				tc12.setText(s12);
				tc13.setText(s13);
				}
				else
				{
					JOptionPane.showMessageDialog(null, "data not found");
				}
				
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
	
			System.out.println(rs);
		}
		
		if(arg0.getSource()==m5)
		{
			new admin();
			this.dispose();
			//setVisible(false);
		}
		if(arg0.getSource()==b1)
		{
			new admin();
			this.dispose();
		//	setVisible(false);
		}
	}

	@Override  
	public void itemStateChanged(ItemEvent arg0) {
		// TODO Auto-generated method stub
		if(r1.isSelected())
			a="Savings";
		else if(r2.isSelected())
			a="Current";
		
		s1=jc1.getSelectedItem().toString()+"-"+jc2.getSelectedItem().toString()+"-"+jc3.getSelectedItem().toString();	
		s2=jc4.getSelectedItem().toString();
	}
	
}