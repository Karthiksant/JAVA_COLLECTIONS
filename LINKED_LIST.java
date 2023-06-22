package LIST;
import java.util.*;
public class LINKED_LIST 
{
	public static void main(String[]args)throws InterruptedException
	{	
		//LinkedList generic type
		LinkedList <Integer> ll=new LinkedList <> ();
		ll.add(11);
		ll.add(22);
		ll.add(33);
		ll.add(44);	
		System.out.println(ll);
		// LinkedList raw type data
		LinkedList l1=new LinkedList ();
		l1.add("karu");
		l1.add("insane");
		l1.add(99);
		l1.add('K');
		
		ListIterator li=l1.listIterator();
		
		while(li.hasNext())
		{
			System.out.println(li.next());
			while(li.hasPrevious())
			{
				System.out.println(li.previous());
				Thread.sleep(3000);
			}
			
		}
		
		
	}

}
