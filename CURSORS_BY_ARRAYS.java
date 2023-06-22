package LIST;
import java.util.*;
public class CURSORS_BY_ARRAYS
{
	public static void main(String[]args) // throws InterruptedException
	{	
		ArrayList ar=new ArrayList();
		ar.add(null);
		ar.add('k');
		ar.add("karthik");
		ar.add(88);
		ar.add("insane");
		System.out.println("***********Iterator*******");
		// ITERATOR while loop
		Iterator it=ar.iterator();
		// hasNext	
		while(it.hasNext())
		{
			System.out.print(it.next()+"  ");
			System.out.println(it.hasNext());		
		}
		// next() hasNext()
		Iterator it2=ar.iterator();
		System.out.println(it2.hasNext());
		System.out.println(it2.hasNext());
		System.out.println(it2.hasNext());
		
		System.out.print(it2.next()+"  ");
		System.out.print(it2.next()+"  ");
		System.out.print(it2.next()+"  ");
		System.out.print(it2.next()+"  ");	
		System.out.print(it2.next()+"  ");
	// exception cause nosuch elelmemt
	// System.out.print(it2.next()+"  ");
		System.out.println(it2.hasNext());
		
		System.out.println("***********ListIterator*******");
		ArrayList ar1=new ArrayList();
		ar1.addAll(ar);
		
		// ListIterator
		ListIterator li=ar1.listIterator();
		// making pointer to move last
		while(li.hasNext())
		{
			System.out.println(li.next()+"   <=== moving cursor to last");
		}
		while(li.hasPrevious())
		{
			System.out.println(li.previous());
		}
		// previous() hasPrevious()
		//  again moving cursor last
		while(li.hasNext())
		{
			System.out.println(li.next()+"   <=== moving cursor to last");
		}
		System.out.println(li.hasPrevious());
		System.out.println(li.hasPrevious());
		System.out.println(li.hasPrevious());
		System.out.println(li.previous());
		System.out.println(li.previous());
		System.out.println(li.previous());
		System.out.println(li.previous());
		System.out.println(li.previous());
	//exception	System.out.println(li.previous());
		
//	  infinte looping with sleep and throws interrupted exception	
//		while(li.hasNext())
//		{
//			System.out.println(li.next());
//			System.out.println(li.previous());
//			Thread.sleep(2000);
//			
//		}
		
		// for each loop works for only generic type
		ArrayList <Character> ar3=new ArrayList <> ();
		ar3.add('k');
		ar3.add('a');
		ar3.add('r');
		ar3.add('u');
		for(Character i:ar3)
		{ System.out.print(i+" ");}
	}

}
