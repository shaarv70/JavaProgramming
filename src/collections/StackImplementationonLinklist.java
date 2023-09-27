package collections;

import org.w3c.dom.Node;

public class StackImplementationonLinklist {
	
	Node head;
	
	class Node{
		
		Node next;
		int value;
	   }
	
	public StackImplementationonLinklist() {
		head =null;
	}
	
	public void push (int value) {
	
		Node extrahead= head;
		head= new Node();
		head.value=value;
		head.next=extrahead;
	}
	
	public int pull() {
		if(head==null)
		{	System.out.println("Stack is empty");
		}
		
		int value = head.value;
		head=head.next;
		return value;
		}
	
	public int peek() {
		if (head==null) {
			System.out.println("Stack is empty");
		}
		
		return head.value;
		
	}
	
	
	public static void main(String[] args) {
		   StackImplementationonLinklist ls= new StackImplementationonLinklist();
		   ls.push(34);
		   ls.push(67);
		   ls.push(78);
		   ls.push(98);
		   System.out.println(ls.pull());
		   System.out.println(ls.pull());
		   System.out.println(ls.peek());

	}

}
