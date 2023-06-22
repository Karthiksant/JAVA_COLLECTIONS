package QUEUELINE;
import java.util.*;
public class PRIORITYQUELINE 
{
	public static void main(String[]args)
	{	
		PriorityQueue pq=new PriorityQueue();
		pq.add(22);
		pq.add(1);
		pq.add(15);
		//pq.add("karu");
		// only homogenous data is allowed
		//pq.add(null);
		// null values are not allowed
		pq.add(15);
		//duplicates are allowed
		System.out.println(pq);
		// peek() & poll()
		System.out.println(pq.peek());
		//only first value is taken without deleting
		System.out.println(pq.poll());
		//only first value taken and deleting it
		System.out.println(" removing first element "+pq);
		
	}

}
