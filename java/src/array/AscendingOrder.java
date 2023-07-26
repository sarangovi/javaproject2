package array;

import java.util.Arrays;
import java.util.Scanner;

public class AscendingOrder {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array length");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("enter the array element");
		for (int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			
		}
	Arrays.sort(a);
	System.out.println("Ascending order for the given number is");
	for(int i=a.length-1;i>=0;i--)
	{
		System.out.println(a[i]);
	}
	
		
	}
}
