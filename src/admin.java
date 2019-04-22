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
import javax.swing.ImageIcon;
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

public class admin  extends JFrame implements ActionListener{
	 
	JButton b21,b22,b23;
	Container c;
	
	public admin()
	{
		setTitle("Admin");
		 c=getContentPane();
		 c.setBackground(Color.magenta);
		setVisible(true);
		setSize(getMaximumSize());
		
		b21 = new JButton("Customer Details");
		b22 = new JButton("Bank Details");
		b23 = new JButton("Defaulters List");
		b21.setBackground(Color.green);
		b22.setBackground(Color.cyan);
		b23.setBackground(Color.green);
		b21.setForeground(Color.blue);
		b22.setForeground(Color.black);
		b23.setForeground(Color.red);
		b21.addActionListener(this);
		b22.addActionListener(this);
		b23.addActionListener(this);
		
		add(b21);
		add(b22);
		add(b23);
		
		setLayout(null);
		b21.setBounds(500, 150, 200, 70);
		b22.setBounds(500, 300 , 200, 70);
		b23.setBounds(500, 450, 200, 70);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if(arg0.getSource()==b21)
		{
			new customer();
			//setVisible(false);
			this.dispose();
		}
		if(arg0.getSource()==b22)
		{
			new bank();
			this.dispose();
			//setVisible(false);
		}
		if(arg0.getSource()==b23)
		{
			new default1();
			this.dispose();
			//setVisible(false);
		}
		this.dispose();
			//setVisible(false);
	}

}


class default1 extends JFrame implements ActionListener{

	JButton b1;
	JLabel l1,l2,l3,l4,l5,l11,l12,l13,l14,l15,m1,m2;
	Container c;
	JLabel ji1=new JLabel(new ImageIcon("C:/credit card management system/src/images/v2.jpg"));
	JLabel ji2=new JLabel(new ImageIcon("C:/credit card management system/src/images/v5.jpg"));
	JLabel ji3=new JLabel(new ImageIcon("C:/credit card management system/src/images/v1.jpg"));
	default1()
	{
		setTitle("Defaulters");
		setVisible(true);
		setSize(getMaximumSize());
		c = getContentPane();
		c.setBackground(Color.magenta);
		b1 = new JButton("back");
		b1.addActionListener(this);
		
		m1 = new JLabel("Name");
		m1.setFont(new Font("Century",Font.ROMAN_BASELINE,30));
		m2 = new JLabel("Account No.");
		m2.setFont(new Font("Century",Font.ROMAN_BASELINE,30));
		l1 = new JLabel("Geeta Kumari");
		l2 = new JLabel("Manoj Chaudhary");
		l3 = new JLabel("Bhuvnesh Goyal");
		l4 = new JLabel("Babita Kundu");
		l5 = new JLabel("Rohan Verma");
		
		l11 = new JLabel("344895");
		l12 = new JLabel("367897");
		l13 = new JLabel("369456");
		l14 = new JLabel("371342");
		l15 = new JLabel("374354");
			
		add(b1);
		add(m1); add(m2); add(ji1); add(ji2); add(ji3);
		add(l1); add(l2); add(l3); add(l4); add(l5); 
		add(l11); add(l12); add(l13); add(l14); add(l15); 
		
		setLayout(null);
		m1.setBounds(140, 10, 200, 100);
		m2.setBounds(280, 10, 350, 100);
		
		l1.setBounds(140, 150, 100, 50);
		l2.setBounds(140, 300, 100, 50);
		l3.setBounds(140, 450, 100, 50);

		l11.setBounds(280, 150, 100, 50);
		l12.setBounds(280, 300, 100, 50);
		l13.setBounds(280, 450, 100, 50);
		
		ji1.setBounds(480, 110, 150, 150);
		ji2.setBounds(480, 260, 150, 150);
		ji3.setBounds(480, 410, 150, 150);
		b1.setBounds(1100, 550, 100, 50);
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if(arg0.getSource()==b1)
		{
			new admin();
			this.dispose();
			//setVisible(false);
		}
		
	}
	
}