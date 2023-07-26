package array;
import java.util.Scanner;
public class CharArray {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the value");
		int n=s.nextInt();
		char  a[]=new char[n];
		System.out.println("enter the "+n+ " character ");
		
		
		for(int i=0;i<n;i++)
		{
			a[i]=s.next().charAt(0);
	
		}
		
		System.out.println("entered  character ");
		
		for(int i=0;i<n;i++)
		{
			int b=(int)a[i];
			System.out.println(b);
		}

}}

