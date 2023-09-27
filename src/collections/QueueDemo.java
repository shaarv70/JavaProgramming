package collections;

import java.util.PriorityQueue;

public class QueueDemo {

	public static void main(String[] args) 
	{
	    PriorityQueue l= new PriorityQueue();
	    PriorityQueue m= new PriorityQueue();
	    
	    //Adding elemets
	    l.add("A"); // it will return exception if not able to add
	    l.add("Z");
	    l.add("B");
	    l.offer("D"); // it will return false
	  //l.offer(45);//not allowed heterogenous data
	    System.out.println(l);  //ascending order

	    //get head element     element()  peak()
	    
	    System.out.println(l.element());//return head element
	    System.out.println(l.peek());//return head element
	    
	   // System.out.println(m.element());//No such element exception
	    System.out.println(m.peek());   // null
	    
	    
	    //return & remove element fropm queue -  remove()   poll()  	
	     
	    l.remove();  //remove the header element and will throw exception if queue is empty    //A
	    System.out.println(l);
	    
	    l.poll(); //remove header element and will throw null if queue is empty       //B
	System.out.println(l);
	
	           for (Object a:l)
	           {
	        	   System.out.println(a);
	           }
	
	
	}

}
