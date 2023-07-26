package inheritance;
import java.util.Scanner;
public class Sbi extends Rbi implements Atm{
	long accno;
	private int pin;
	private double  balance;
	Scanner s =new Scanner(System.in);
	public Sbi(long accno,int pin, double balance )
	{
		this.accno=accno;
		this.pin=pin;
		this.balance=balance;
		
	}
	public void checkBal()
	{
		System.out.println("enter your pin");
		int p=s.nextInt();
		if (p==pin)
		{
			System.out.println("your balance is "+ balance);
		}
		else
		{
			System.out.println("you have entered a wrong pin");
		}
	}
	public void withdraw ()
	{		System.out.println("enter your pin");
	int p=s.nextInt();
	if (p==pin)
	{
		System.out.println("enter the amount");
		double amount=s.nextDouble();
		balance=balance-amount;
		System.out.println("your balance is "+balance);
		
		
	}
	else
	{
		System.out.println("you have entered wrong pin ");
		

	}
	}
}
