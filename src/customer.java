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


public class customer  extends JFrame implements ActionListener,ItemListener{

	JMenuBar jm;
	JMenu cust;
	JButton b1;
	JMenuItem m1,m2,m3,m4,m5;
	JRadioButton r1,r2,r3,r4;
	JLabel lc1,lc2,lc3,lc4,lc5,lc6,lc7,lc8,lc9,lc10,lc11,lc12,lc13,lc14;
	JTextField tc1,tc2,tc7,tc8,tc9,tc10,tc12,tc13,tc14;
	JTextArea tc6;
	String nt,s,s1,s2;
	JComboBox jc4;
	JComboBox jc1,jc2,jc3;
	
	Connection con;
	Statement st;
	Container c;
	public customer()
	{
		setTitle("Personal Details Of Customer");
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
		for(int i=1900;i<=2013;i++)
			jc3.addItem(i);
		add(jc3);
		
		b1 = new JButton("back");
		r1 = new JRadioButton("Male");
		r2 = new JRadioButton("Female");
		r3 = new JRadioButton("Indian");
		r4 = new JRadioButton("Non-Indian");
		add(r1);
		add(r2);
		add(r3);
		add(r4);
		add(b1);
		
		r1.addItemListener(this);
		r2.addItemListener(this);
		r3.addItemListener(this);
		r4.addItemListener(this);
		b1.addActionListener(this);
				
		jc4=new JComboBox();
		jc4.addItem("Married");
		jc4.addItem("Unmarried");
		jc4.addItem("Other");
		add(jc4);
		jc1.addItemListener(this);
		jc2.addItemListener(this);
		jc3.addItemListener(this);
		jc4.addItemListener(this);
		
		lc1 = new JLabel("First Name");
		lc2 = new JLabel("Last Name");
		lc3 = new JLabel("Sex");
		lc4 = new JLabel("Date Of Birth");
		lc5 = new JLabel("Nationality");
		lc6 = new JLabel("Permanent Address");
		lc7 = new JLabel("Phone Number");
		lc8 = new JLabel("Email Id");
		lc9 = new JLabel("Occuption");
		lc10 = new JLabel("Income");
		lc11 = new JLabel("Marital Status");
		lc12 = new JLabel("Nominee");
		lc13 = new JLabel("PAN Number");
		lc14 = new JLabel("Account Number");
		tc1 = new JTextField();
		tc2 = new JTextField();
		
		tc6 = new JTextArea();
		tc7 = new JTextField();
		tc8 = new JTextField();
		tc9 = new JTextField();
		tc10 = new JTextField();
		tc12 = new JTextField();
		tc13 = new JTextField();
		tc14 = new JTextField();
		
		add(tc1);
		add(tc2);
		add(tc6);
		add(tc7);
		add(tc8);
		add(tc9);
		add(tc10);
		
		add(tc12);
		add(tc13);
		add(tc14);
		
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
		add(lc14);
		
		
		jm=new JMenuBar();
		setJMenuBar(jm);
		cust=new JMenu("Details");
		jm.add(cust);
		m1=new JMenuItem("Insert");
		cust.add(m1);
		m1.addActionListener(this);
		
		m2=new JMenuItem("Delete");
		cust.add(m2);
		m2.addActionListener(this);
		
		m3=new JMenuItem("Update");
		cust.add(m3);
		m3.addActionListener(this);
		
		m4=new JMenuItem("View");
		cust.add(m4);
		m4.addActionListener(this);
		
		m5=new JMenuItem("Exit");
		cust.add(m5);
		m5.addActionListener(this);
		
		setLayout(null);
		lc1.setBounds(180, 80, 100, 50);
		lc2.setBounds(180, 150, 100, 50);
		lc3.setBounds(180, 210, 100, 50);
		lc4.setBounds(180, 280, 100, 50);
		lc5.setBounds(180, 350, 100, 50);
		lc6.setBounds(180, 420, 120, 50);
		lc7.setBounds(180, 490, 110, 50);
		lc8.setBounds(180, 560, 100, 50);
		lc9.setBounds(800, 80, 100, 50);
		lc10.setBounds(800, 150, 100, 50);
		lc11.setBounds(800, 210, 100, 50);
		lc12.setBounds(800, 280, 100, 50);
		lc13.setBounds(800, 350, 100, 50);
		lc14.setBounds(800, 420, 160, 50);
		
		jc1.setBounds(350,280,50,40);
		jc2.setBounds(400, 280, 50, 40);
		jc3.setBounds(450, 280, 80, 40);
		
		tc1.setBounds(350, 80, 100, 50);
		tc2.setBounds(350, 150, 100, 50);
		r1.setBounds(350, 210, 100, 50);
		r2.setBounds(500, 210, 100, 50);
		r3.setBounds(350, 350, 100, 50);
		r4.setBounds(500,350,100,50);
		tc6.setBounds(350, 420, 100, 50);
		tc7.setBounds(350, 490, 100, 50);
		tc8.setBounds(350, 560, 100, 50);
		tc9.setBounds(970, 80, 100, 50);
		tc10.setBounds(970,150,100,50);
		jc4.setBounds(970, 210, 100, 50);
		tc12.setBounds(970, 280, 100, 50);
		tc13.setBounds(970, 350, 100, 50);
		tc14.setBounds(970, 420, 100, 50);
		
		b1.setBounds(1150, 550, 100, 50);
		
		ButtonGroup bg1=new ButtonGroup();
		bg1.add(r1);
		bg1.add(r2);
		ButtonGroup bg2=new ButtonGroup();
		bg2.add(r3);
		bg2.add(r4);
		
		try {

			con = DriverManager.getConnection("jdbc:odbc:data1");
			}
		catch (Exception e)	
		{
			
		}
		
	}
	
public static void main(String[] args) {
	new customer();
}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
	
		if(arg0.getSource()==m1)
		{
			if(tc1.getText().equals("")||tc2.getText().equals("")||tc6.getText().equals("")||tc7.getText().equals("")||tc8.getText().equals("")||tc9.getText().equals("")||tc10.getText().equals("")||tc12.getText().equals("")||tc13.getText().equals(""))
			{
				JOptionPane.showMessageDialog(null, "Please fill all the fields");
				
			}
			else if(!(tc8.getText().contains("@"))||!(tc8.getText().contains(".com")))
			{
				JOptionPane.showMessageDialog(null, "Enter correct Email address");
			}
			else if(tc7.getText().length()!=10)
			{
				JOptionPane.showMessageDialog(null, "Enter correct Phone Number");
			}
			else
			{
			try
			{
				st=con.createStatement();
				st.executeUpdate("insert into customer(FirstName,LastName,Sex,DateOfBirth,Nationality,PermanentAddress,PhoneNumber,EmailID,Occupation,Income,MaritalStatus,Nominee,PANNumber,AccountNo) values('"+tc1.getText()+"','"+tc2.getText()+"','"+s+"','"+s1+"','"+nt+"','"+tc6.getText()+"','"+tc7.getText()+"','"+tc8.getText()+"','"+tc9.getText()+"','"+tc10.getText()+"','"+s2+"','"+tc12.getText()+"','"+tc13.getText()+"','"+tc14.getText()+"')");
				JOptionPane.showMessageDialog(null, "inserted");
				
				tc1.setText("");
				tc2.setText("");
				r1.setSelected(false);
				r2.setSelected(false);
				jc1.setSelectedIndex(0);
				jc2.setSelectedIndex(0);
				jc3.setSelectedIndex(0);
				r3.setSelected(false);
				r4.setSelected(false);
				tc6.setText("");
				tc7.setText("");
				tc8.setText("");
				tc9.setText("");
				tc10.setText("");
				jc4.setSelectedItem("");
				tc12.setText("");
				tc13.setText("");
				tc14.setText("");
				
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
			}
		}
		
		if(arg0.getSource()==m2)
		{
			 String sn = JOptionPane.showInputDialog("Enter ID of Customer");
			 int id=Integer.parseInt(sn);
			try
			{
				st=con.createStatement();
				ResultSet rs=st.executeQuery("select * from customer where ID="+id);
				if(rs.next())
				{
				st.executeUpdate("delete from customer where ID="+id);
				JOptionPane.showMessageDialog(null, "deleted");
				}
				else
					JOptionPane.showMessageDialog(null, "ID not exits");
			}
			catch(Exception e)
			{
				System.out.print(e.getMessage());
			}
		}
		
		
		if(arg0.getSource()==m3)
		{
			String sn = JOptionPane.showInputDialog("Enter ID of Customer");
			try
			{
				st=con.createStatement();
				st.executeUpdate("update customer set PhoneNumber='"+tc7.getText()+"' where ID=15");
				JOptionPane.showMessageDialog(null, "updated");
			}
			catch(Exception e)
			{
				System.out.print(e.getMessage());
			}
			
		}
		
		
		if(arg0.getSource()==m4)
		{
			String s=JOptionPane.showInputDialog("Enter ID of the customer");
			int id=Integer.parseInt(s);
			try
			{
				st=con.createStatement();
				ResultSet rs=st.executeQuery("select * from customer where ID="+id);
				if(rs.next())
				{
				String s1 = rs.getString(2);
				String s2 = rs.getString(3);
				String s3 = rs.getString(4);
				String s4=rs.getString(5);
				String a[]=s4.split("-");
				String s5 = rs.getString(6);
				String s6 = rs.getString(7);
				String s7 = rs.getString(8);
				String s8 = rs.getString(9);
				String s9 = rs.getString(10);
				String s10 = rs.getString(11);
				String s11 = rs.getString(12);
				String s12 = rs.getString(13);
				String s13 = rs.getString(14);
				String s14 = rs.getString(15);
				
				
				tc1.setText(s1);
				tc2.setText(s2);
				
				if(s3.equals("Male"))
					r1.setSelected(true);
				else
					r2.setSelected(true);
				
				if(s5.equals("Indian"))
					r3.setSelected(true);
				else
					r4.setSelected(true);
			
				jc1.setSelectedItem(Integer.parseInt(a[0]));
				jc2.setSelectedItem(Integer.parseInt(a[1]));
				jc3.setSelectedItem(Integer.parseInt(a[2]));
				
				tc6.setText(s6);
				tc7.setText(s7);
				tc8.setText(s8);
				tc9.setText(s9);
				tc10.setText(s10);
				jc4.setSelectedItem(s11);
				tc12.setText(s12);
				tc13.setText(s13);
				tc14.setText(s14);
				}
				else
					{
					JOptionPane.showMessageDialog(null,"NOT EXIST");
					tc1.setText("");
					tc2.setText("");
					r1.setSelected(false);
					r2.setSelected(false);
					jc1.setSelectedIndex(0);
					jc2.setSelectedIndex(0);
					jc3.setSelectedIndex(0);
					r3.setSelected(false);
					r4.setSelected(false);
					tc6.setText("");
					tc7.setText("");
					tc8.setText("");
					tc9.setText("");
					tc10.setText("");
					jc4.setSelectedIndex(0);
					tc12.setText("");
					tc13.setText("");
					tc14.setText("");
					}
			}
			
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
			
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
			//setVisible(false);
		}
	}

	@Override
	public void itemStateChanged(ItemEvent arg0) {
		// TODO Auto-generated method stub
	
			if(r1.isSelected())
				s="Male";
			else if(r2.isSelected())
				s="Female";
	
			if(r3.isSelected())
				nt="Indian";
			else if(r4.isSelected())
				nt="Non-Indian";
		
	s1=jc1.getSelectedItem().toString()+"-"+jc2.getSelectedItem().toString()+"-"+jc3.getSelectedItem().toString();	
	s2=jc4.getSelectedItem().toString();
			
	}
	
}