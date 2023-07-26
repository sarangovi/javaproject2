package inheritance;

public class Employee extends Person{
int eid;
	public Employee(String name,int age,long contact,int eid) {
		// TODO Auto-generated constructor stub
		super(name,age,contact);
		this.eid=eid;
	}
	public void display()
	{
		super.display();
		System.out.println("Employee id is "+ eid);
	}

}
