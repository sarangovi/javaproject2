package array;

public class Reverse {
public static void main(String[] args) {
	String s[]= {"hai","hello","how are you","fine","bye"};
	String b=" ";
	for (int i=s.length-1;i>=0;i--)
	{
		b=b+s[i]+",";
	}System.out.println(b);
}
}
