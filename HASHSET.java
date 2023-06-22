package SET;
import java.util.*;
public class HASHSET
{
	public static void main(String[]args)
	{	
				//
				HashSet <Character> hs=new HashSet<> ();
				hs.add(null); 
				// allows only one null value
				hs.add(null);
				hs.add('k');  
				// no duplicates are allowed
				hs.add('k');
				hs.add('d'); 
				// it arranges output in order like dictionary
				hs.add('c');
				hs.add('b');
				// it arranges output in order
				// i.e data structure is tree
				hs.add('a');
				//  hs.add(2,'A'); does not support  indexing
				// and is unordered collection cause no indexbased adding removing possible	
				System.out.print(hs+" ** ");
				
			Iterator  it=hs.iterator();
			// ListIterator is not allowed cause its unidirectional hashset
				while(it.hasNext())
				{
					System.out.println(it.next());
				}
			// actually its raw but only character are used there fore its accepting
			for(Character i:hs)
			{ System.out.println(i);}
			
			// undefined
//			LitIterator  it1=hs.listIterator();
//			while(it1.hasPrevious())
//			{
//				System.out.println(it1.next());
//			}
   }
}
