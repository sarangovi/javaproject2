package array;

public class arrayexception {
public static void main(String[] args) {
	
	String s[]={"Hello"};
	try
	{
		for (int i=0;i<=5;i++)
		{
			System.out.println(s[i]);
		}

		}
	catch(ArrayIndexOutOfBoundsException e)
	{
		
	}
}
}
