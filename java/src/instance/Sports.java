package instance;

public class Sports {
public static void event(Player ob)
{
	ob.display();
	if (ob instanceof FootBallPlayer)
	{
		FootBallPlayer fb=(FootBallPlayer)ob;
		fb.show();
	}
	else
	{
		CricketPlayer c=(CricketPlayer)ob;
		c.view();
	}
}
public static void main(String[] args) {
	FootBallPlayer p1=new FootBallPlayer("sam",20,"male","india",true,"xyz","member");
	event(p1);
	System.out.println("****************************************************************");
	CricketPlayer p2=new CricketPlayer("tina",22,"female","uk",false,"england","player");
	event(p2);
	
}
}
