package programming;
import java.util.Scanner;
public class Number {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the value");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for (int j=1;j<=n-i;j++)
			{
				System.out.println("");
				
			}
			for(int j=1;j<=2*i-1;j++)
			{
				System.out.println(j+"");
				
			}
			System.out.println();
		}
	}

}
