package CodingPractice;

import java.util.Scanner;

public class JavaCalculator {

	public static void main(String[] args) {
	
		Scanner sc= new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		char ch=sc.next().charAt(0);
		
		switch(ch)
		{
		case '+':
		int sum=num1+num2;
		System.out.println(sum);
		break;
		case '-':
			int diff=num1-num2;
			System.out.println(diff);
			break;
		case '*':
			int pro=num1 *num2;
			System.out.println(pro);
			break;
		case '/':
			int div=num1/num2;
			System.out.println(div);
		    break;	
		default:
			System.out.println("wrong choice");	
			break;
		}
		
		
		
		}

	}


