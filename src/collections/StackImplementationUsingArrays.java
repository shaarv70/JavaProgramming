package collections;

public class StackImplementationUsingArrays {
	
	
	public static class StackImp{
		int size;
		int top;
		int arr[]; 
		
		 StackImp(int size) {
			this.size=size;
			this.arr=new int[size];
			this.top=-1;
		}
		
		public boolean isEmpty() {
			
			return(top==-1);
		}
		
		public boolean isFull() {
			return(size-1==top);
			
		}
		
		public void push(int element) {
			
			if(!this.isFull()) {
				top++;
				arr[top]=element;
				System.out.println("Pushed Element is:"+element );
			}
			
	      else 
					System.out.println("Stack is full");
				
		    }
		
		public int pop() {
			
			if(!this.isEmpty())
			{
				int popelement=top;
				top--;
				System.out.println("Poped Element is:"+arr[popelement]);
				return (arr[popelement]);		
			}
		
			else 
				System.out.println("Stack is empty");
			    return -1;
		   }
		
		public int peek() {     // it will return the topmost element in the current time of stack
			
			if(!this.isEmpty())
			{
				int peekelement=arr[top];
				System.out.println("Peek element is:"+arr[top] );
				return peekelement;
			}
			
			else { 
				System.out.println("Stack is empty");
			    return -1;
				
			}
		}
		
		
				
		}
		
	
 public static void main(String[] args) 
{
		
	StackImp stackimp= new StackImp(4);
	stackimp.push(48);
	stackimp.push(67);
	stackimp.push(90);
	stackimp.push(110);
	stackimp.push(90);
	stackimp.pop();
	stackimp.peek();
	
	

	}

}
