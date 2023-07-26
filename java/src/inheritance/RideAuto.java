package inheritance;

public class RideAuto {
public static void book(Ola o) {

o.ride();
if (o instanceof Auto)
{Auto a=(Auto)o;
a.rateA();

}
else {
	Mini m=(Mini)o;
	m.rateM();
}
}
public static void main(String[] args) {
	Auto a1= new Auto();
	book(a1);
	Mini m1= new Mini();
	book(m1);
	}
}
