package collections;

import java.util.EnumSet;
import java.util.Iterator;

//it is not synchronized
//its a highly performance java collection member
//faster than hashset
//all the methods implemented here using bitwise arithematic operations

public class EnumSetDemo {
	
	enum Lang
	{
		Ruby,
		Javascript,
		Python,
		GoLnag,
		CSharp,
		C
	}

	public static void main(String[] args)
	{
		EnumSet<Lang> l= EnumSet.allOf(Lang.class);   //Created new EnumSet using Enum
		System.out.println(l);

		
		EnumSet<Lang> empty=EnumSet.noneOf(Lang.class);  //Empty EnumSet
		System.out.println(empty);
		
		//range (e1,e2)
		EnumSet<Lang> range= EnumSet.range(Lang.Ruby, Lang.Python);  //Creating with in a range 
		System.out.println(range);
		
		EnumSet<Lang> single= EnumSet.of(Lang.CSharp);// Creating with a single element
		System.out.println(single);
		
		EnumSet<Lang> multiple= EnumSet.of(Lang.CSharp,Lang.Ruby); // Creating with multiple element
		System.out.println(multiple);
		
		//add & addall
		empty.add(Lang.C);
		empty.addAll(l);
		System.out.println(empty);
		
		
		//iterate enum set
		
		Iterator it = l.iterator();
		while (it.hasNext())
		{
			System.out.println(it.next());
		}
		
		//remove() and removeAll()
		
		l.remove(Lang.C);
		System.out.println(l);
		
		l.clear();
		System.out.println(l);
		
		
		
		
		
		
		
		
		
	}

}
