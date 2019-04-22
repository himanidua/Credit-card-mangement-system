import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


public class guide extends JFrame implements ActionListener{


	JTextArea t2 = new JTextArea(),t6 = new JTextArea(),t4 = new JTextArea(),t10 = new JTextArea();
	JTextArea t7 = new JTextArea(),t5 = new JTextArea(),t8 = new JTextArea(),t12 = new JTextArea();
	JTextArea t1 = new JTextArea(),t3 = new JTextArea(),t9 = new JTextArea(),t11 = new JTextArea();
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,lt1,lt2;
	Container c;
	guide()
	{
		setVisible(true);
		setTitle("User Guide");
		c=getContentPane();
		c.setBackground(Color.white);
		setSize(getMaximumSize());
		
		t2.setWrapStyleWord(true);
		t2.setLineWrap(true);
		t1.setWrapStyleWord(true);
		t1.setLineWrap(true);
		t3.setWrapStyleWord(true);
		t3.setLineWrap(true);
		t6.setWrapStyleWord(true);
		t6.setLineWrap(true);
		t7.setWrapStyleWord(true);
		t7.setLineWrap(true);
		t4.setWrapStyleWord(true);
		t4.setLineWrap(true);
		t5.setWrapStyleWord(true);
		t5.setLineWrap(true);
		t8.setWrapStyleWord(true);
		t8.setLineWrap(true);
		t9.setWrapStyleWord(true);
		t9.setLineWrap(true);
		t10.setWrapStyleWord(true);
		t10.setLineWrap(true);
		t11.setWrapStyleWord(true);
		t11.setLineWrap(true);
		t12.setWrapStyleWord(true);
		t12.setLineWrap(true);
		
		l1 = new JLabel(" Credit Card :-"); 
		l1.setForeground(Color.blue);
		l1.setFont(new Font("Century",Font.TRUETYPE_FONT,20));
		
		l2 = new JLabel(" Credit limit :-"); 
		l2.setForeground(Color.blue);
		l2.setFont(new Font("Century",Font.TRUETYPE_FONT,20));
		
		l3 = new JLabel(" Annual fee :-"); 
		l3.setForeground(Color.blue);
		l3.setFont(new Font("Century",Font.TRUETYPE_FONT,20));
		
		l4 = new JLabel(" Teaser Rate :-");
		l4.setForeground(Color.blue);
		l4.setFont(new Font("Century",Font.TRUETYPE_FONT,20));
		
		l5 = new JLabel(" Joint Credit :-");
		l5.setForeground(Color.blue);
		l5.setFont(new Font("Century",Font.TRUETYPE_FONT,20));
		
		l6 = new JLabel(" Revolving Line :-");
		l6.setForeground(Color.blue);
		l6.setFont(new Font("Century",Font.TRUETYPE_FONT,20));
		
		l7 = new JLabel(" PIN :-");
		l7.setForeground(Color.blue);
		l7.setFont(new Font("Century",Font.TRUETYPE_FONT,20));
		
		l8 = new JLabel(" MasterCard :-");
		l8.setForeground(Color.blue);
		l8.setFont(new Font("Century",Font.TRUETYPE_FONT,20));
		
		l9 = new JLabel(" VISA Card :-");
		l9.setForeground(Color.blue);
		l9.setFont(new Font("Century",Font.TRUETYPE_FONT,20));
		
		l10 = new JLabel(" Gold Card/ :-");
		l10.setForeground(Color.blue);
		l10.setFont(new Font("Century",Font.TRUETYPE_FONT,20));
		
		l11 = new JLabel(" Secured Card :-");
		l11.setForeground(Color.blue);
		l11.setFont(new Font("Century",Font.TRUETYPE_FONT,20));
		
		l12 = new JLabel(" Smart Card :-");
		l12.setForeground(Color.blue);
		l12.setFont(new Font("Century",Font.TRUETYPE_FONT,20));
		
		t1.setFont(new Font("Arial",Font.TRUETYPE_FONT,15));
		t1.setBackground(Color.yellow);
		t2.setFont(new Font("Arial",Font.TRUETYPE_FONT,15));
		t2.setBackground(Color.green);
		t3.setFont(new Font("Arial",Font.TRUETYPE_FONT,15));
		t3.setBackground(Color.yellow);
		t4.setFont(new Font("Arial",Font.TRUETYPE_FONT,15));
		t4.setBackground(Color.green);
		t5.setFont(new Font("Arial",Font.TRUETYPE_FONT,15));
		t5.setBackground(Color.yellow);
		t6.setFont(new Font("Arial",Font.TRUETYPE_FONT,15));
		t6.setBackground(Color.green);
		t7.setFont(new Font("Arial",Font.TRUETYPE_FONT,15));
		t7.setBackground(Color.yellow);	
		t8.setFont(new Font("Arial",Font.TRUETYPE_FONT,15));
		t8.setBackground(Color.green);
		t9.setFont(new Font("Arial",Font.TRUETYPE_FONT,15));
		t9.setBackground(Color.yellow);	
		t10.setFont(new Font("Arial",Font.TRUETYPE_FONT,15));
		t10.setBackground(Color.green);
		t11.setFont(new Font("Arial",Font.TRUETYPE_FONT,15));
		t11.setBackground(Color.yellow);
		t12.setFont(new Font("Arial",Font.TRUETYPE_FONT,15));
		t12.setBackground(Color.green);
		
		lt1 = new JLabel("Cyber Credit Card System");
		lt1.setForeground(Color.blue);
		lt1.setFont(new Font("Century",Font.TYPE1_FONT,40));
		lt2 = new JLabel("Glossary Of Terms");
		lt2.setForeground(Color.green);
		lt2.setFont(new Font("Arial",Font.TRUETYPE_FONT,30));
		
		t1.setText(" A credit card is a financial instrument, which can be used more than once to borrow money or buy products and services on credit. Banks, retail stores and other businesses generally issue these.");
		t2.setText(" The maximum amount of charges a cardholder may apply to the account.");
		t3.setText(" A bank charge for use of a credit card levied each year, which ranges depending upon the type of card one possesses. Banks usually take an initial fixed amount in the first year and then a lower amount as yearly renewal fees.");
		t4.setText(" Often called the introductory rate, it is the below-market interest rate offered to entice customers to switch credit cards.");
		t5.setText(" Issued to a couple based on both of their assets, incomes and credit reports. It generally results in a higher credit limit, but makes both parties responsible for repaying the debt.");
		t6.setText(" An agreement to lend a specific amount to a borrower and to allow that amount to be borrowed again once it has been repaid. Most credit cards offer revolving credit.");
		t7.setText(" As a security measure, some cards require a number to be punched into a keypad before transaction can be completed. The number can usually be changed by the cardholder.");
		t8.setText(" MasterCard is a product of MasterCard International and along with VISA are distributed by financial institutions around the world. Cardholders borrow money against a line of credit and pay it back with interest if the balance is carried over from month to month.");
		t9.setText(" VISA cards is a product of VISA USA and along with MasterCard is distributed by financial institutions around the world. A VISA cardholder borrows money against a credit line and repays the money with interest if the balance is carried over from month to month in a revolving line of credit.");
		t10.setText(" A credit card that offers a higher line of credit than a standard card Income eligibility is also higher. In addition, issuers provide extra perks or incentives to cardholders.");
		t11.setText(" A credit card that a cardholder secures with a savings deposit to ensure payment of the outstanding balance if the cardholder defaults on payments. It is used by people new to credit, or people trying to rebuild their poor credit ratings.");
		t12.setText(" Smart cards, sometimes called chip cards, contain a computer chip embedded in the plastic. Where a typical credit card's magnetic stripe can hold only a few dozen characters, smart cards are now available with 16K of memory. When read by a special terminals, the cards can perform a number of functions or access data stored in the chip. These cards can be used as cash cards or as credit cards with a preset credit limit, or used as ID cards with stored-in passwords.");
		
		add(lt1);
		add(lt2);
		add(t1);
		add(t2);
		add(t3);
		add(t4);
		add(t5);
		add(t6);
		add(t7);
		add(t8);
		add(t9);
		add(t10);
		add(t11);
		add(t12);
		add(l1);
		add(l2);
		add(l3);
		add(l4);
		add(l5);
		add(l6);
		add(l7);
		add(l8);
		add(l9);
		add(l10);
		add(l11);
		add(l12);
		
		setLayout(null);
		lt1.setBounds(360, 05, 700, 50);
		lt2.setBounds(490, 50, 400, 40);
		l1.setBounds(40, 95, 200, 45);
		l2.setBounds(40, 133, 200 , 50);
		l3.setBounds(40, 185, 200, 50);
		l4.setBounds(40, 225, 250, 50);
		l5.setBounds(40, 270, 250, 50);
		l6.setBounds(40, 320, 350, 50);
		l7.setBounds(40, 360, 600, 50);
		l8.setBounds(40, 410, 250, 50);
		l9.setBounds(40, 450, 250, 50);
		l10.setBounds(40, 495, 400, 50);
		l11.setBounds(40, 540, 250, 50);
		l12.setBounds(40, 585, 250, 50);
		
		t1.setBounds(200, 100 ,1100, 40);
		t2.setBounds(200, 145, 1100, 40);
		t3.setBounds(200, 190, 1100, 40);
		t4.setBounds(200, 235, 1100, 40);
		t5.setBounds(200, 280, 1100, 40);
		t6.setBounds(200, 325, 1100, 40);
		t7.setBounds(200, 370, 1100, 40);
		t8.setBounds(200, 415, 1100, 40);
		t9.setBounds(200, 460, 1100, 40);
		t10.setBounds(200, 505, 1100, 40);
		t11.setBounds(200, 550, 1100, 40);
		t12.setBounds(200, 595, 1100, 60);		
		
		t2.setEditable(false);
		t1.setEditable(false);
		t3.setEditable(false);
		t6.setEditable(false);
		t7.setEditable(false);
		t4.setEditable(false);
		t5.setEditable(false);
		t8.setEditable(false);
		t9.setEditable(false);
		t10.setEditable(false);
		t11.setEditable(false);
		t12.setEditable(false);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}



class bcard extends JFrame implements ActionListener{
	
	JTextArea t2=new JTextArea(),t6 = new JTextArea(),tb = new JTextArea();
	JTextArea t7 = new JTextArea(),tc = new JTextArea();
	JTextArea tr = new JTextArea(), ti = new JTextArea();
	JLabel l1,l2,l3,l4,l5,l6,l7,ln;
	Container c;
	
	bcard()
	{
		setVisible(true);
		setTitle("User Guide");
		c=getContentPane();
		c.setBackground(Color.white);
		setSize(getMaximumSize());
		t2.setWrapStyleWord(true);
		t2.setLineWrap(true);
		tr.setWrapStyleWord(true);
		tr.setLineWrap(true);
		ti.setWrapStyleWord(true);
		ti.setLineWrap(true);
		t6.setWrapStyleWord(true);
		t6.setLineWrap(true);
		t7.setWrapStyleWord(true);
		t7.setLineWrap(true);
		tb.setWrapStyleWord(true);
		tb.setLineWrap(true);
		tc.setWrapStyleWord(true);
		tc.setLineWrap(true);
		
		l1 = new JLabel("Choose The Best Card");
		l1.setFont(new Font("Century",Font.TRUETYPE_FONT,50));
		l1.setForeground(Color.blue);
		
		ln = new JLabel(" Acceptability :");
		ln.setFont(new Font("Century",Font.TRUETYPE_FONT,20));
		ln.setForeground(Color.blue);
		
		l2 = new JLabel(" Eligibility :"); 
		l2.setForeground(Color.blue);
		l2.setFont(new Font("Century",Font.TRUETYPE_FONT,20));
		
		l3 = new JLabel(" Credit period :"); 
		l3.setForeground(Color.blue);
		l3.setFont(new Font("Century",Font.TRUETYPE_FONT,20));
		
		l4 = new JLabel(" Fees Paid :");
		l4.setForeground(Color.blue);
		l4.setFont(new Font("Century",Font.TRUETYPE_FONT,20));
		
		l5 = new JLabel(" Other Charges :");
		l5.setForeground(Color.blue);
		l5.setFont(new Font("Century",Font.TRUETYPE_FONT,20));
		
		l6 = new JLabel(" Cash Advance :");
		l6.setForeground(Color.blue);
		l6.setFont(new Font("Century",Font.TRUETYPE_FONT,20));
		
		l7 = new JLabel(" Insurance Cover :");
		l7.setForeground(Color.blue);
		l7.setFont(new Font("Century",Font.TRUETYPE_FONT,20));
		
		t2.setFont(new Font("Arial",Font.TRUETYPE_FONT,17));
		t2.setBackground(Color.orange);
		tr.setFont(new Font("Arial",Font.TRUETYPE_FONT,17));
		tr.setBackground(Color.orange);
		ti.setFont(new Font("Arial",Font.TRUETYPE_FONT,17));
		ti.setBackground(Color.pink);
		t6.setFont(new Font("Arial",Font.TRUETYPE_FONT,17));
		t6.setBackground(Color.pink);
		t7.setFont(new Font("Arial",Font.TRUETYPE_FONT,17));
		t7.setBackground(Color.orange);	
		tb.setFont(new Font("Arial",Font.TRUETYPE_FONT,17));
		tb.setBackground(Color.pink);
		tc.setFont(new Font("Arial",Font.TRUETYPE_FONT,17));
		tc.setBackground(Color.orange);
		
		t2.setText(" This determines how widely is the card accepted. It depends on the network and the affiliation. For instance, Visa and Master Cards are more widely accepted than Diners or American Express. Also, a global card scores higher on acceptability than a domestic one.");
		tr.setText(" All cards have basic minimum income criterion for issuing cards. This ranges from Rs 60,000 p.a. for Cancard and Stanchart-Classic to Rs 200,000 p.a. for Amex-Gold and BoI Gold cards.");
		ti.setText("  That's what its all about! Buy now pay later. Most cards have different credit periods ranging from 30 days to 50 days. That is the length of the billing cycle. This implies that the bill comes to you every nth day where n is the credit period. Also, credit covers finance charges. Most cards carry heavy credit charges ranging from 2.5% per month to 3% p.m.- works out to 34% and 42% p.a. respectively. There is a minimum payment required by most cards - from 5% of total value of the bill to 20%.");
		t6.setText(" One of the most important factors, the fees include joining fees, annual subscription and fees for add on cards. All these fees are billed in the first bill and are not charged upfront.");
		t7.setText(" Its always better to pay on time. Otherwise you pay charges for late payment. These are only in case you do not pay the minimum required amount. Late payment charges range from 2.5% of outstanding to 15% of minimum payment.");
		tb.setText(" You can also borrow money from the card, but obviously pay interest charges on that. You also have to pay cash withdrawal charges - generally 2.5% of the amount withdrawn. Interest is also charged on the amount withdrawn - again around 2.5% p.m. Every card has a limit for the amount withdrawn - some cards have an absolute limit like Rs10,000 p.m. while most cards have a cash withdrawal limit as a %age of total credit limit.");
		tc.setText(" Insurance cover on cards is available only in the case of an accident. The limits are higher for air accidents than for other types.");
		
		add(t2);
		add(ln);
		add(l1);
		add(l2);
		add(tr);
		add(ti);
		add(t6);
		add(t7);
		add(l3);
		add(l4);
		add(l5);
		add(l6);
		add(l7);
		add(tb);
		add(tc);
		
		setLayout(null);
		l1.setBounds(400, 10, 700, 45);
		l3.setBounds(85, 170, 400, 50);
		ln.setBounds(85, 90, 350, 45);
		t2.setBounds(262, 95, 1000, 45);
		l2.setBounds(85, 275, 350, 45);
		ti.setBounds(262, 160, 1000, 95);
		tr.setBounds(262, 275 ,1000, 50);
		l4.setBounds(85, 342, 250, 50);
		t6.setBounds(262, 345, 1000, 45);
		t7.setBounds(262, 410, 1000, 45);
		l5.setBounds(85, 410, 250, 50);
		l6.setBounds(85, 495, 250, 50);
		tb.setBounds(262, 475, 1000, 90);
		l7.setBounds(80, 572, 250, 50);
		tc.setBounds(262, 585, 1000, 50);
		
		t2.setEditable(false);
		tr.setEditable(false);
		ti.setEditable(false);
		t6.setEditable(false);
		t7.setEditable(false);
		tb.setEditable(false);
		tc.setEditable(false);
		
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}



class ccard extends JFrame implements ActionListener {
	JTextArea t2=new JTextArea(),t6 = new JTextArea(),tb = new JTextArea();
	JTextArea t3 = new JTextArea(),t7 = new JTextArea(),tc = new JTextArea();
	JTextArea tr = new JTextArea(), ti = new JTextArea();
	
	
	JLabel l1,l2,l3,l4,l5,l6,l7;
	Container c;
	ccard()
	{
		setVisible(true);
		setTitle("User Guide");
		c=getContentPane();
		c.setBackground(Color.white);
		setSize(getMaximumSize());
		t2.setWrapStyleWord(true);
		t2.setLineWrap(true);
		t3.setWrapStyleWord(true);
		t3.setLineWrap(true);
		tr.setWrapStyleWord(true);
		tr.setLineWrap(true);
		ti.setWrapStyleWord(true);
		ti.setLineWrap(true);
		t6.setWrapStyleWord(true);
		t6.setLineWrap(true);
		t7.setWrapStyleWord(true);
		t7.setLineWrap(true);
		tb.setWrapStyleWord(true);
		tb.setLineWrap(true);
		tc.setWrapStyleWord(true);
		tc.setLineWrap(true);
		
		l1 = new JLabel("Cost Of The Cards");
		l1.setFont(new Font("Century",Font.TRUETYPE_FONT,45));
		l1.setForeground(Color.blue);
		
		l2 = new JLabel(" Renewal Of Card :"); 
		l2.setForeground(Color.blue);
		l2.setFont(new Font("Century",Font.TRUETYPE_FONT,20));
		
		l3 = new JLabel(" Interest-Free Period :"); 
		l3.setForeground(Color.blue);
		l3.setFont(new Font("Century",Font.TRUETYPE_FONT,20));
		
		l4 = new JLabel(" Purchases On Credit :");
		l4.setForeground(Color.blue);
		l4.setFont(new Font("Century",Font.TRUETYPE_FONT,20));
		
		l5 = new JLabel(" Fuel On Credit :");
		l5.setForeground(Color.blue);
		l5.setFont(new Font("Century",Font.TRUETYPE_FONT,20));
		
		l6 = new JLabel(" Billing Period :");
		l6.setForeground(Color.blue);
		l6.setFont(new Font("Century",Font.TRUETYPE_FONT,20));
		
		l7 = new JLabel(" Cash Advance :");
		l7.setForeground(Color.blue);
		l7.setFont(new Font("Century",Font.TRUETYPE_FONT,20));
		
		t2.setFont(new Font("Arial",Font.TRUETYPE_FONT,15));
		t2.setBackground(Color.orange);
		t3.setFont(new Font("Century",Font.TRUETYPE_FONT,18));
		t3.setForeground(Color.blue);
		tr.setFont(new Font("Arial",Font.TRUETYPE_FONT,15));
		tr.setBackground(Color.orange);
		ti.setFont(new Font("Arial",Font.TRUETYPE_FONT,15));
		ti.setBackground(Color.pink);
		t6.setFont(new Font("Arial",Font.TRUETYPE_FONT,15));
		t6.setBackground(Color.pink);
		t7.setFont(new Font("Arial",Font.TRUETYPE_FONT,15));
		t7.setBackground(Color.orange);	
		tb.setFont(new Font("Arial",Font.TRUETYPE_FONT,15));
		tb.setBackground(Color.pink);
		tc.setFont(new Font("Arial",Font.TRUETYPE_FONT,15));
		tc.setBackground(Color.orange);
		
		t2.setText(" For those who habitually treat their plastic card as the ever-obedient Genie to every command, taking in the details of the monthly bill is like seeing Cutsie transform into a Frankenstien's monster instead.");
		t3.setText("Putting The Genie Back In The Bottle :");
		t7.setText(" Now that you would say is a real boon. Is it? Every time you fill the tank, the service charge that accompanies each transaction could be 2.5 percent. Small change that adds up to a fat sum in the total.");
		tr.setText(" Check the time of the renewal of the card. Are you used to ignoring the credit card issuer's flood of literature or the details of billing. Often, the card issuer or bank will slip in renewal fees and even an unsolicited upgrade of class of card (say, classic to premium that means higher annual fees) with a mild notice: If you don't say `No', its taken as a 'Yes'.");
		ti.setText(" Not if you have roll over credit. You did take a card not just for convenience. The facility of being able to pay back in bits is very appealing, especially since the interest rates is, say, 2.5 to 3% a month. Did you ever sit down and do some sums to see why the outstanding amount is mounting like crazy? First, the 2.5% averages 30% a year. Next, the outstanding you acquire in the first month has to be cleared in subsequent bills before your fresh purchases can be paid for. Here is how it works. Assuming you have a bill of Rs100 in the first month and you settle Rs25. If you give Rs50 as part payment, the money goes toward clearing the previous outstanding and the current billing is taken as further outstanding.");
		t6.setText(" In some shops or retail outlets, card payments means an extra payment added to the bill by an establishment that does not want to encourage plastic money.");
		tb.setText(" Every cardholder gets the bill in regular monthly cycles. The billing period can be a double-edged sword. If you make a purchase close to the billing date you get shorter payback time and if you buy just after you get a monthly statement, the credit period can be extended to as much as 45 days. This is how. Suppose the first billing date is April 25, after which there is a pay-by-due-date of a fortnight later, around the May 9. A purchase on May 26 will be payable approximately around June 9 but a purchase on April 23 will be payable by May 9, that is a much shorter credit time.");
		tc.setText(" The clock starts ticking straightaway on this facility. Usually, there are two sets of interest that are applied the moment the cash leaves the teller machine. First, there is a flat transaction fee. Second there is a rate of interest that is applied on a daily basis. Thus in the bill you end up with a dual interest. The cash advance payment is not included, usually, in the general bill. So either be circumspect or if you have to flirt with temptation than rein in the hook as fast as you can. Clubbing this outgo to a roll-over credit habit can be especially fatal.");
		
		add(t2);
		add(t3);
		add(l1);
		add(l2);
		add(tr);
		add(ti);
		add(t6);
		add(t7);
		add(l3);
		add(l4);
		add(l5);
		add(l6);
		add(l7);
		add(tb);
		add(tc);
		
		setLayout(null);
		l1.setBounds(500, 05, 700, 45);
		l3.setBounds(150, 165, 400, 50);
		t2.setBounds(362, 70, 885, 60);
		t3.setBounds(155, 70, 200, 45);
		ti.setBounds(362, 145, 885, 115);
		l2.setBounds(150, 275, 200 , 50);
		tr.setBounds(362, 275 ,885, 60);
		l4.setBounds(150, 345, 250, 50);
		t6.setBounds(362, 350, 885, 45);
		t7.setBounds(362, 410, 885, 45);
		l5.setBounds(150, 400, 250, 50);
		l6.setBounds(150, 470, 250, 50);
		tb.setBounds(362, 470, 885, 90);
		l7.setBounds(150, 575, 250, 50);
		tc.setBounds(362, 575, 885, 80);
		
		t2.setEditable(false);
		t3.setEditable(false);
		tr.setEditable(false);
		ti.setEditable(false);
		t6.setEditable(false);
		t7.setEditable(false);
		tb.setEditable(false);
		tc.setEditable(false);
		
		
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}



class facts extends JFrame implements ActionListener{

	JTextArea t1=new JTextArea();
	JLabel l1;
	Container c;
	facts()
	{
		setVisible(true);
		setTitle("Facts");
		c=getContentPane();
		c.setBackground(Color.white);
		setSize(getMaximumSize());
		l1 = new JLabel("Hard Facts");
		t1.setWrapStyleWord(true);
		t1.setLineWrap(true);
		l1.setFont(new Font("Century",Font.TRUETYPE_FONT,80));
		l1.setForeground(Color.blue);
		t1.setFont(new Font("Arial",Font.TRUETYPE_FONT,40));
		t1.setBackground(Color.green);
		t1.setText("  Visa International has the largest global ATM network in over 113 countries.\nMastercard International has over 23,000 member financial institutions serving consumers in 220 countries and territories and has over 3,50,000 ATM locations around the globe.\nThe first card was issued in India by Visa in 1981. The country's first Gold Card was also issued from Visa in 1986.\nThe first international credit card was issued to a restricted number of customers by Andhra Bank in 1987 through the Visa program, after getting special permission from the Reserve Bank of India.");
		add(t1);
		add(l1);
		
		setLayout(null);
		l1.setBounds(400, 30, 700, 80);
		t1.setBounds(120, 130, 1100, 540);
		t1.setEditable(false);
		

		
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}



class contact extends JFrame implements ActionListener{
	JTextArea t1=new JTextArea();
	JLabel l1;
	Container c;
	contact()
	{
		setVisible(true);
		setTitle("Contact Us");
		c=getContentPane();
		c.setBackground(Color.white);
		setSize(getMaximumSize());
		l1 = new JLabel("Contact Details");
		l1.setForeground(Color.blue);
		l1.setFont(new Font("Century",Font.CENTER_BASELINE,80));
		t1.setWrapStyleWord(true);
		t1.setLineWrap(true);
		t1.setBackground(Color.green);
		t1.setForeground(Color.DARK_GRAY);
		t1.setFont(new Font("Verdana",Font.TRUETYPE_FONT,30));
		t1.setText("\n  Himani \n  D/o Ashwani kumar Dua \n  521,Krishna nagar\n  Hisar (HARYANA)\n  PH: 9896225064\n  E-mail:himanidua2911@gmail.com");
		add(t1);
		add(l1);
		
		setLayout(null);
		l1.setBounds(310, 50, 800, 80);
		t1.setBounds(310, 180, 650, 310);
		t1.setEditable(false);

		
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}



class about extends JFrame implements ActionListener{

	JTextArea t1=new JTextArea();
	Container c;
	JLabel l1;
	about()
	{
		setVisible(true);
		setTitle("About Us");
		c=getContentPane();
		c.setBackground(Color.white);
		setSize(getMaximumSize());
		l1 = new JLabel("About");
		l1.setForeground(Color.blue);
		l1.setFont(new Font("Century",Font.CENTER_BASELINE,80));
		t1.setWrapStyleWord(true);
		t1.setLineWrap(true);
		t1.setBackground(Color.green);
		t1.setForeground(Color.DARK_GRAY);
		t1.setFont(new Font("Verdana",Font.TRUETYPE_FONT,30));
		t1.setText("This is Java Projects on Credit Card Approval System, which provided a lot of facility to their user.This application takes care of the complete internal Card Processing activities of a Bank (management and maintenance of cards). It mainly involves the maintenance and management of card - related information in a Bank. This product caters to all the Credit based functions of a bank like Registration of Customers for card issue, Opening Card Accounts for the registered customer, Creation of Cards for registered customers, Hot Carding, making the Card ready for Embossing by creation of Card Data file etc. The purpose is to build a Card Management System which provides complete card processing, to meet the needs of full-fledged Credit card.The objective and scope of my Project is to record the details various activities of user. It will simplifies the task and reduse the paper work. ");
		
		add(t1);
		add(l1);
		
		setLayout(null);
		l1.setBounds(550, 20,500,80);
		t1.setBounds(120, 120, 1100, 550);
		t1.setEditable(false);

		
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
