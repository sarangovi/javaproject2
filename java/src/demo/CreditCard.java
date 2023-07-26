package demo;

public class CreditCard extends Card{
	double limit;

	public CreditCard(long cardno,String holder,String expdate,int pin,double limit) {
	super(cardno,holder,expdate,pin);
	this.limit=limit;
	}
public void printCC()
{
	System.out.println("Limit is "+ limit);
}
}
