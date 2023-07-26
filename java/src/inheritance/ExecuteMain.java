package inheritance;

public class ExecuteMain {
public static void main(String[] args) {
	Circle c=new Circle();
	Drawable d=c;
	
	Rectangle r=new Rectangle ();
	Drawable d1=r;
	d1.draw();
	d.draw();
}
}
