package demo;

public class DebitCard extends Card {
	double balance;
	

	public DebitCard(long cardno, String holder ,String expdate, int pin,double balance) {
	super(cardno,holder,expdate,pin);
	this.balance=balance;
	}
public void printDC()
{System.out.println("Balance is "+ balance);
}
}
