package array;
import java.util.Scanner;
public class Numbers {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the value");
		int n=s.nextInt();
		int a[]=new int[n];
		System.out.println("enter the numbers");
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
			
		}
		System.out.println("entered numbers are");
		for(int i=n-1;i>0;i--) {
			System.out.println(a[i]);
		}
	}

}
