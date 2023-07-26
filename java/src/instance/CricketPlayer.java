package instance;

public class CricketPlayer extends Player {
String team;
String category;
public CricketPlayer(String name,int age,String gender,String country,boolean captancy,String team,String category)
{
	super(name,age,gender,country,captancy);
	this.team=team;
	this.category=category;
	
}
public void display()
{
	System.out.println("Name is "+name);
	System.out.println("Age is "+age);
	System.out.println("Gender is "+ gender);
	System.out.println("Country is "+country);
	System.out.println("Captancy is "+captancy);
	System.out.println("Team is "+ team);
	System.out.println("Category is "+category);
}
public void view()
{System.out.println("I LOVE CRICKET");
}
}
