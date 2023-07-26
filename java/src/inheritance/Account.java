package inheritance;

import java.util.Scanner;

public class Account {
	private int pin;
	private double balance;
	Scanner sc=new Scanner(System.in);
	public Account(int pin,double balance)
	{
		this.pin=pin;
		this.balance=balance;
	}
	public void setPin()
	{
		System.out.println("enter your pin");
		int p=sc.nextInt();
		if(pin==p)
		{
			System.out.println("enter your new pin");
			pin=sc.nextInt();
			System.out.println("your new pin is " +pin);
			
		}
		else {
			System.out.println("you have entered a wrong pin");
		}
		
	}
	public void getBalance()
	{
		System.out.println("enter your pin");
		int c=sc.nextInt();
		if (c==pin)
		{
			System.out.println("your balance is "+balance);
		}
		else
		{
			System.out.println("you have entered a wrong pin");
		}
	}
}
