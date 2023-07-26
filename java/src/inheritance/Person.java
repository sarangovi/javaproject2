package inheritance;

public class Person {
String name;
int age;
long contact;
public Person(String name,int age ,long contact)
{
	this.name=name;
	this.age=age;
	this.contact=contact;
	
}
public void display()
{
	System.out.println("Name is "+name);
	System.out.println("Age is "+age);
	System.out.println("Contact is "+contact);
}
}
