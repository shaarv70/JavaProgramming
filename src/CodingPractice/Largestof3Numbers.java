package CodingPractice;

public class Largestof3Numbers {

	public static void main(String[] args) {
		
		int a=23;
		int b=56;
		int c=67;
		int largest=0;
		
		largest=a>b?b:a;
		
		largest=b>c?b:c;
		
		System.out.println(largest);
	}

}
