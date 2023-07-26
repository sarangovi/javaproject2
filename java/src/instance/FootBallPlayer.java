package instance;

public class FootBallPlayer extends Player {
String club;
String position;
public FootBallPlayer(String name,int age,String gender,String country,boolean captancy,String club,String position)
{
	super(name,age,gender,country,captancy);
this.club=club;
this.position=position;

}
public void display()
{
	System.out.println("Name is "+name);
	System.out.println("Age is "+age);
	System.out.println("Gender is "+ gender);
	System.out.println("Country is "+country);
	System.out.println("Captancy is "+captancy);
	System.out.println("club is "+club);
	System.out.println("Position is "+position);
	
}
public void show()
{
	System.out.println("I LOVE FOOTBALL");
}
}
