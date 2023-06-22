package SET;
import java.util.*;
public class TREESET 
{
	public static void main(String[]args)
	{	
		// actually raw type canbe created
		// but it does not allows heterogenous objects
		TreeSet ts=new TreeSet();
		//ts.add(null);
		// no null objects are allowed it shows null pointer exception
		ts.add("karthik");
		// duplicates are allowed but only one value is shown
		ts.add("karthik");
		//ts.add(2,33);
		//indexing not supported and unordered collection
		ts.add("karthi");
		// it arranges output in order
		// i.e data structure is tree
		ts.add("kallu");
		ts.add("kallu");
		//ts.add(234567834l);
		//heterogenous objects are not allowed 
		System.out.println(ts);
		
		Iterator it=ts.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		//first() pollFirst()
		//last() pollLast()
		TreeSet ts1=new TreeSet();
		ts1.add(55);
		ts1.add(66);
		ts1.add(22);
		ts1.add(33);
		ts1.add(44);	
		// no iterator is required cause it directly provides element
		//treeset_object.first();
	    System.out.println(ts1.first());
		System.out.println(ts1.last());
		System.out.print(ts1+" ");
		System.out.println();
		//pollFirst();
		System.out.println(ts1.pollFirst());
		System.out.print(ts1+" ");
		System.out.println();
		//pollLast();
		System.out.println(ts1.pollLast());
		System.out.println(ts1+" ");
	}

}
