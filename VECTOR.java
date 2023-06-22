package LIST;
import java.util.*;
public class VECTOR 
{
	public static void main(String[]args)
	{	
		Vector v=new Vector ();
		v.add("insane");
		v.add(567);
	//	in some cases if we do not mention Long as l it shows compilation error
		v.add(98765432345l);
		ListIterator li=v.listIterator();
		while(li.hasNext())
		{
			System.out.print(li.next()+"  ");
		}
		
		System.out.println("****************");
		
		while(li.hasPrevious())
		{
			System.out.println(li.previous()+"  ");
		}		
	}

}
