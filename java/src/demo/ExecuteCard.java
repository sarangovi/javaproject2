package demo;

public class ExecuteCard {

	public static void main(String[] args) {
		DebitCard dc=new DebitCard(78946123l,"sam","20/05",1234,5000.0);
		dc.printDC();
		CreditCard cc=new CreditCard(321498l,"tina","10/10",8523,200.0);
		cc.printCC();
	}

}
