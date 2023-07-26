package collection;

import java.util.ArrayList;

public class AL {

	public static void main(String[] args) {
		ArrayList <Character>ch=new ArrayList<Character>();
		ch.add('a');
		ch.add('e');
		ch.add('d');
		ch.add('E');
		System.out.println(ch.size());
		System.out.println("printing by using for each loop");
		for(Character c:ch)
		{
			System.out.println(c);
		}
		System.out.println("adding index in 2");
		ch.add(2,'z');
		System.out.println(ch);
		ArrayList<Object> ob=new ArrayList<Object> ();
		ob.add("hai");
		ob.add(123);
		ob.add(1.25f);
		ob.add(100);
		ob.addAll(ch);
		System.out.println(ob);
		ob.clear();
		System.out.println(ob);


	}

}
