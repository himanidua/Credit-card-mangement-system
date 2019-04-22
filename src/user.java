import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class user extends JFrame implements ActionListener{
	
	Connection con;
	Statement st;
	
	public user()
	{
		setTitle("User Login");
		setVisible(true);
		setSize(getMaximumSize());
	
		try
		{
			con = DriverManager.getConnection("jdbc:odbc:data1");
			JOptionPane.showMessageDialog(null,"connected");
			String an = JOptionPane.showInputDialog("Enter AccountNo");		
			st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from bank");
		
		while(rs.next())
		{
		
		String s2=rs.getString(2);
		if(s2.equals(an))
		{
			new user1();
			this.dispose();
			//setVisible(false);
		}
		System.out.println(s2);
		}
		
	}
catch (Exception e) {
	// TODO: handle exception
	System.out.println(e.getMessage());
}
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}


class newuser extends JFrame implements ActionListener{
	JTextField t11;
	JLabel l11,l12,l13;
	JButton b11,b12;
	JPasswordField t12;
	Connection con;
	Statement st;
	public newuser()
	{
		setTitle("Information Of New User");
		
		setVisible(true);
		setSize(getMaximumSize()) ;
		t11 = new JTextField();
		t12 = new JPasswordField();
		l11 = new JLabel("Username");
		l12 = new JLabel("Password");
		l13 = new JLabel("New User");
		b11 = new JButton("submit");
		b12 = new JButton("Back");
		l13.setFont(new Font("Century",Font.ROMAN_BASELINE,50));
		l13.setForeground(Color.red);
		
		add(l11);
		add(l12);
		add(b11);
		add(b12);
		add(t11);
		add(t12);
		add(l13);
		
		setLayout(null);
		l11.setBounds(80,130,100,50);
		t11.setBounds(200,130,100,50);
		l12.setBounds(80,210,100,50);
		t12.setBounds(200,210,100,50);
		b11.setBounds(400,130,100,50);
		b12.setBounds(400, 210, 100, 50);
		l13.setBounds(200,30,500,50);
		b11.addActionListener(this);
		b12.addActionListener(this);
		
		try {
			con = DriverManager.getConnection("jdbc:odbc:data1");
					JOptionPane.showMessageDialog(null,"connected");
			}
		catch (Exception e)	
		{
	System.out.println(e.getMessage());		
		}
	 
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if(arg0.getSource()==b11)
		{
			try
			{
				st=con.createStatement();
				st.executeUpdate("insert into loginuser values('"+t11.getText()+"','"+t12.getText()+"')");
				JOptionPane.showMessageDialog(null, "inserted");
				t11.setText("");
				t12.setText("");
			}
			catch(Exception e){
				System.out.println(e.getMessage());
			}
		}
		if(arg0.getSource()==b12)
		{
			new login();
			this.dispose();
			//setVisible(false);
		}
		
	}
	
}
