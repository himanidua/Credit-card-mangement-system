import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
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
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class sub extends JFrame implements ActionListener ,ItemListener{

	JMenuBar jm;
	JMenu cust;
	JMenuItem m1,m2,m4,m5;
	JRadioButton r1,r2;
	JLabel lc1,lc2,lc3,lc4,lc5,lc8,lc6,lt;
	JTextField tc1,tc2,tc3,tc5,tc8,tc14;
	String nt,s,s1,s2;
	JButton b1;
	
	Connection con;
	Statement st;
	Container c;
	public sub()
	{
		setTitle("Details Of Subholder");
		c=getContentPane();
		 c.setBackground(Color.CYAN);
		setVisible(true);
		setSize(getMaximumSize());
		
		r1 = new JRadioButton("Male");
		r2 = new JRadioButton("Female");
		add(r1);
		add(r2);
		b1 = new JButton("back");
		
		r1.addItemListener(this);
		r2.addItemListener(this);	
		b1.addActionListener(this);
		
		lt = new JLabel("Enter Details");
		lt.setForeground(Color.red);
		lt.setFont(new Font("Century",Font.TYPE1_FONT,80));
		
		lc1 = new JLabel("Credit Card No.");
		lc2 = new JLabel(" Sub-Name");
		lc3 = new JLabel("Relation With Card Holder");
		lc4 = new JLabel("Sex");
		lc5 = new JLabel("Age");
		lc6 = new JLabel("Account Number");
		lc8 = new JLabel("Email Id");
		
		lc1.setForeground(Color.red);
		lc2.setForeground(Color.red);
		lc3.setForeground(Color.red);
		lc4.setForeground(Color.red);
		lc5.setForeground(Color.red);
		lc6.setForeground(Color.red);
		lc8.setForeground(Color.red);
		r1.setForeground(Color.red);
		r2.setForeground(Color.red);
		b1.setForeground(Color.red);
		
		tc1 = new JTextField();
		tc2 = new JTextField();
		tc3 = new JTextField();
		tc5 = new JTextField();
		tc8 = new JTextField();
		tc14 = new JTextField();
		
		add(tc1);
		add(tc2);
		add(tc3);
		add(tc5);
		add(tc8);
		add(tc14);
		add(lc1);
		add(lc2);
		add(lc3);
		add(lc4);
		add(lc5);
		add(lc8);
		add(lc6);
		add(lt);
		add(b1);
		
		jm=new JMenuBar();
		setJMenuBar(jm);
		cust=new JMenu("Details");
		jm.add(cust);
		m1=new JMenuItem("Insert");
		cust.add(m1);
		m1.addActionListener(this);
		
		m2=new JMenuItem("Change");
		cust.add(m2);
		m2.addActionListener(this);
		m2.setEnabled(false);
		m4=new JMenuItem("View");
		cust.add(m4);
		m4.addActionListener(this);
		
		m5=new JMenuItem("Exit");
		cust.add(m5);
		m5.addActionListener(this);
		
		setLayout(null);
		lt.setBounds(400, 20, 560, 100);
		lc1.setBounds(180, 170, 100, 50);
		lc2.setBounds(180, 280, 100, 50);
		lc3.setBounds(180, 390, 150, 50);
		lc4.setBounds(180, 500, 100, 50);
		lc5.setBounds(800, 170, 100, 50);
		lc6.setBounds(800, 280, 160, 50);
		lc8.setBounds(800, 390, 100, 50);
		
		tc1.setBounds(350, 170, 130, 50);
		tc2.setBounds(350, 280, 130, 50);
		tc3.setBounds(350, 390, 130, 50);
		r1.setBounds(350, 500, 100, 50);
		r2.setBounds(500, 500, 100, 50);
		tc5.setBounds(970, 170, 130, 50);
		tc8.setBounds(970, 280, 130, 50);
		tc14.setBounds(970, 390, 130, 50);
		b1.setBounds(1150, 550, 100, 50);
		
		ButtonGroup bg1=new ButtonGroup();
		bg1.add(r1);
		bg1.add(r2);
		int flag=0;
		String cn = JOptionPane.showInputDialog("Enter Credit Card No.");	
		try {
			con = DriverManager.getConnection("jdbc:odbc:data1");
					
			st=con.createStatement();		
			
	
		ResultSet rs=st.executeQuery("select * from bank ");
		
	
			while(rs.next())
			{
				
				String s4=rs.getString(4);
				
				
			if(s4.equals(cn))
				{
				tc1.setText(s4);
				flag=1;
				break;
				}
			}
		
		}
	catch (Exception e)	
	{
		
	}
		if(flag==0)
		{
			JOptionPane.showMessageDialog(null, "ur ccno does not exist");
			new operate();
			setVisible(false);
		}	
		
		try {
			con = DriverManager.getConnection("jdbc:odbc:data1");
					
			st=con.createStatement();		
			
	
		ResultSet rs=st.executeQuery("select * from sub ");
		
	
			while(rs.next())
			{
				
				String s4=rs.getString(1);
				
			if(s4.equals(cn))
				{
				String s1= rs.getString(2);
				String s2=rs.getString(3);
				String s3=rs.getString(4);
				String s5=rs.getString(5);
				String s6=rs.getString(6);
				String s7=rs.getString(7);
				tc2.setText(s1);
				
				tc3.setText(s2);
				if(s3.equals("Male"))
					r1.setSelected(true);
				else
					r2.setSelected(true);
				tc5.setText(s5);
				tc8.setText(s6);
				tc14.setText(s7);
				
				JOptionPane.showMessageDialog(null, "subholder exits");
				int c = JOptionPane.showConfirmDialog(null, "whould u want to update");
				if(c==JOptionPane.YES_OPTION)
					m2.setEnabled(true);
				flag=1;
				break;
				}
			}
		
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
			if(tc1.getText().equals("")||tc2.getText().equals("")||tc3.getText().equals("")||tc5.getText().equals("")||tc8.getText().equals("")||tc14.getText().equals(""))
			{
				JOptionPane.showMessageDialog(null, "Please fill all the fields");
				
			}
			else if(!(tc14.getText().contains("@"))||!(tc14.getText().contains(".com")))
			{
				JOptionPane.showMessageDialog(null, "Enter correct Email address");
			}
			
			else
			{
			try
			{
				st=con.createStatement();
				st.executeUpdate("insert into sub values('"+tc1.getText()+"','"+tc2.getText()+"','"+tc3.getText()+"','"+s+"','"+tc5.getText()+"','"+tc8.getText()+"','"+tc14.getText()+"')");
				JOptionPane.showMessageDialog(null, "inserted");
				
				tc1.setText("");
				tc2.setText("");
				tc3.setText("");
				r1.setSelected(false);
				r2.setSelected(false);
				tc5.setText("");
				tc8.setText("");
				tc14.setText("");
				
			}
			catch(Exception e)
			{
				JOptionPane.showMessageDialog(null, "already exists");
				System.out.println(e.getMessage());
			}
			}
		}
		
		if(arg0.getSource()==m2)
		{
			try
			{
				st=con.createStatement();
				st.executeUpdate("update sub set Name='"+tc2.getText()+"', Relation='"+tc3.getText()+"',Sex='"+s+"', Age='"+tc5.getText()+"',AccNo='"+tc8.getText()+"',Email='"+tc14.getText()+"' where CreditCardNo='"+tc1.getText()+"'");
				JOptionPane.showMessageDialog(null, "updated");
			}
			catch(Exception e)
			{
				System.out.print(e.getMessage());
			}
			
		}
		
		
		if(arg0.getSource()==m4)
		{
			String id=JOptionPane.showInputDialog("Enter AccountNo of the sub");
			//int id=Integer.parseInt(s);
			try
			{
				st=con.createStatement();
				ResultSet rs=st.executeQuery("select * from sub where AccNo='"+id+"'");
				rs.next();

				String s1 = rs.getString(1);
				String s2 = rs.getString(2);
				String s3 = rs.getString(3);
				String s4=rs.getString(4);
				String s5 = rs.getString(5);
				String s6 = rs.getString(6);
				String s7 = rs.getString(7);
				
				
				tc1.setText(s1);
				tc2.setText(s2);
				tc3.setText(s3);
				if(s4.equals("Male"))
					r1.setSelected(true);
				else
					r2.setSelected(true);
				
				tc5.setText(s5);
				tc8.setText(s6);
				tc14.setText(s7);
			}
			
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
			
		}
		
		
		if(arg0.getSource()==m5)
		{
			new operate();
			setVisible(false);
		}
		
		if(arg0.getSource()==b1)
		{
			new operate();
			setVisible(false);
		}
		
	}
	@Override
	public void itemStateChanged(ItemEvent arg0) {
		// TODO Auto-generated method stub
		if(r1.isSelected())
			s="Male";
		else if(r2.isSelected())
			s="Female";
	}

}
