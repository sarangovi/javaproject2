package instance;
public class Player {
String name;
int age;
String gender;
String country;
boolean captancy;
public Player(String name,int age,String gender,String country,boolean captancy)
{this.name=name;
this.age=age;
this.gender=gender;
this.country=country;
this.captancy=captancy;
}
public void display()
{System.out.println("THE TEAM IS READY TO PLAY");
}
}

