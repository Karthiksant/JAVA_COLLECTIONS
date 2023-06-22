package LIST;
import java.util.*;
public class ARRAY_LIST 
{
	public static void main(String[]args)
	{	
		// generic type with size
		ArrayList <Integer> al=new ArrayList<>(1);
		al.add(10);//al.add(9,10); BUT WITH INDEX IT SHOWS ERROR
		al.add(null);	
		al.add(10);
		al.add(20);	// [10, 20, 10, 20]
		// size is fixed only with one but added three noerror its expanding
		System.out.println(al);
		
		// generic type without size
		ArrayList <String> al1=new ArrayList<>();
		al1.add("karu");
		al1.add("insane");//[karu, insane]
	//	System.out.println(al1);
		
		// rawtype 
		//ArrayList <> al2=new ArrayList <>();
		ArrayList al2=new ArrayList ();
		al2.add(22);
		al2.add('k');
		al2.add("karthik");
		al2.add("kallu"); //[22, k, karthik, false]
		Object obj1="insane";
		al2.add(obj1);
		// we can also add objects in collections
		System.out.println(al2);
		ArrayList al3=new ArrayList();
		
		al3.addAll(al2);
		System.out.println(al3);
		
		 Iterator i=al3.iterator ();
		 int j=0;
		 while(i.hasNext())
		 {
			 System.out.println(""+i.hasNext()+j); j++;
			 System.out.println(i.next()+"**");
			 
			 
		 }
		// arraylist finding datatypes
		//can be done
		 // breakthrough only :)
		 Iterator finding_datatype=al3.iterator ();
		 while(finding_datatype.hasNext())
		 {
			 Object obj=finding_datatype.next();
			System.out.println("  datatype is "+obj.getClass().getSimpleName());
		 }
		
	}

}
