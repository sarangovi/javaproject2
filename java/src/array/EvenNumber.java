package array;

public class EvenNumber {
	public static void main(String[] args) {
		int a[]= {2,3,4,5,10,15,20,22};
		String s="";
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				s=s+a[i]+" ";
						
			}
		}
		System.out.println("Even numbers are "+s );
	}

}



