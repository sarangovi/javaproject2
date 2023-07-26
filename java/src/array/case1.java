package array;

public class case1 {
	public static void main(String[] args) {

		div();
		
		
		System.out.println("okay");
	}
	public static void div()
	{
		System.out.println(10/2);
		try
		{
			
		
		System.out.println(10/0);
		}
		catch(ArithmeticException e)
		{
			
		}
		System.out.println(10+2);
	}

}
