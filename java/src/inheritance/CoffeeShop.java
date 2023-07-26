package inheritance;

public class CoffeeShop {
	public static void main(String[] args) {
		
	
Drink c=new Coffee();
c.welcome();
c.ready();

Coffee c1=(Coffee)c;
c1.typesC();

Drink c2=new Tea();
c2.welcome();
c2.ready();

Tea t=(Tea)c2;
t.typesT();
}
}