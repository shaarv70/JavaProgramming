package CodingPractice;

import java.util.Scanner;

public class CountVowelsinString {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		String str=sc.nextLine();
		int count=0;
		char[] p=str.toCharArray();
		for (char c:p)
		{
			switch(c)
			{
			case 'a':
			case 'e':
			case 'i':		
			case 'o':
			case 'u':
			count ++;
			break;
			}
		}

		System.out.println(count);
	}

}
