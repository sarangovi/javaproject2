package upcasting;

public class ExecuteCoffeTea {

	public static void main(String[]args)
	{
		Drink d=new Coffee();
		d.welcome();
		d.ready();
		Coffee c =(Coffee) d;
		c.typesC();
		Drink d1=new Tea();
		d1.welcome();
		d1.ready();
		Tea t=(Tea)d1;
		t.typesT();
		
		
	}
}
