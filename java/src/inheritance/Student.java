package inheritance;

public class Student extends Person{
int sid;
	public Student(String name,int age,long contact,int sid) 
	{
	
		super(name,age,contact);
		this.age=age;
		this.contact=contact;
		this.sid=sid;// TODO Auto-generated constructor stub
	}
public void display()
{
	super.display();
	System.out.println("Student id is "+sid);
}
}
