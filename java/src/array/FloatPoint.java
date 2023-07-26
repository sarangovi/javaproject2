package array;
import java.util.Scanner;
public class FloatPoint {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the size");
		int n=s.nextInt();
		float a[]=new float[n];
		System.out.println("enter the values");
		for (int i=0;i<n;i++)
		{
			a[i]=s.nextFloat();
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
			
	}

}
