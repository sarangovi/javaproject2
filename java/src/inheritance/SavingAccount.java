package inheritance;

public class SavingAccount extends Account {
	public SavingAccount(int pin,double balance)
	{super(pin,balance);
		
	}
public static void main(String[] args) {
	SavingAccount s=new SavingAccount(1234,20000d);
	s.setPin();
	s.getBalance();
}
}
