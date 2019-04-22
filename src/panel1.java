import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class panel1 extends JPanel implements ActionListener {

	JButton b1,b2;
	JTextField t1;
	JLabel l1;
	panel1( String s)
	{
		l1=new JLabel(s);
		t1=new JTextField(10);
		b1=new JButton("ok");
		b2=new JButton("cancel");
		add(b1);
		add(b2);
		add(l1);
		add(t1);
		b1.addActionListener(this);
		b2.addActionListener(this);
		setLayout(new FlowLayout());
		JFrame f=new JFrame();
		f.setVisible(true);
		f.setSize(300,300);
		f.setLocation(400,400);
		f.add(this);
		f.setLayout(new FlowLayout());
	}
	
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

		if(arg0.getSource()==b2)
			JOptionPane.showMessageDialog(null, "u pressed cancel");
		if(arg0.getSource()==b1)
		{
			String s=t1.getText();
		showinput(s);
			
		}
		
	}


	public String showinput(String s) {
		// TODO Auto-generated method stub
	return s;	
	}

	
}
