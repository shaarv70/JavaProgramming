package strings;

//String is a predefined class, we can use it like a primitivbe datatype also 
//Strings are immutable their values cannot be changes, we can just the change the refrence of the string from one to another 

public class Strings {

	public static void main(String[] args) 
	{
    	String name="John";// acting as  a variable
    	String name1= new String("John");// acting as a object of string class
    	String name2= " to Papa";
    	String name3= " and mumma";   
    	System.out.println(name1);
    	
    	int a=9;    //%d- int , %f- float, %s- string, %c- char
    	double l= 6.99;
    	System.out.format("The value of a is %d and value of b is %f ",a,l);
    	
    	//length of a string 
    	System.out.println(name.length());// total number of characters

    	//concat- join multiple strings 
    	
    	System.out.println(name + name2);//first approach
    	System.out.println(name.concat(name2));//second approach
        System.out.println(name.concat(name2).concat(name3));//concatinating 3 strings
        
        
        name= "   automation   ";
        
        //trim()- for removing right and left spaces
        
        System.out.println(name.trim());   //will remove spaces
        
        // charAt(index)- extractig a particular character from string(should starting index count from 0)
        
        System.out.println(name2.charAt(4));
        
        //contains - it will check whether a particular value is present in string or not (it will always return b oolean value)
        
        System.out.println(name3.contains("mm"));// true
        
        //equals, equalIgnoreCase- compare two strings
        
        System.out.println(name.equals(name1));
        System.out.println(name.equalsIgnoreCase(name1));
        
        //replace - it will replace single or multiple characters in string
        
        String s ="Welcome to the home";
        
        System.out.println(s.replace('e', 's'));
        System.out.println(s.replace("home","java" ));
        
        
        // substring - it is used to extract substring from main string 
        // starting index starts from 0, ending index starts from 1
        String n= "Java is best";
        System.out.println(n.substring(2));//from index 2 it will return the string to the end
        System.out.println(n.substring(2, 9));// va is b
        System.out.println(n.substring(1, 7));//ava is
        System.out.println(n.substring(0, 7));//Java is
        
        
        //split - divide the string into multiple parts using delimeter
        // we cant use - .  ^  * $ ? + - we cant use them as a delimeter
        
        String z= "abc@gmail.com";
        String d[]=z.split("@");// it will divide the string into 2 parts by @
        System.out.println(d[0]);//abc
        System.out.println(d[1]);//gmail.com
        
       
        //toUpperCase   toLowerCase
        
        String k="Showing 1 to 10 of 15028 (1503 Pages)";
        System.out.println(k.toLowerCase());
      String h=  k.substring(k.indexOf("(")+1,k.indexOf("Pages")-1);
      System.out.println(k.indexOf("(")+1);
      System.out.println(k.indexOf("Pages")-1);
      System.out.println(h);
        
   /*     //equals() - compare 2 strings 
        
        //     ==  - used to compare primitive datatypes, it always compare objects
         //    equals()- used to compare nom primitive datatypes, it always compares the value of objects
        
        String g= new String("IAM GOODis ");
        String h= new String("IAM GOODis ");
        String j=h;
        System.out.println(g.equals(h));//true (here we have created the objects and their values are equal)
        System.out.println(g==h);//false because here we are creating the objects, g & h are diiferent objects
        System.out.println(k.equals(g));//true
        System.out.println(g==j);//false - different objects
	    System.out.println(h.equals(j));//true because both are pointing same object having same value 
	   
	
	   // starts-with, ends- with
	    
	    System.out.println(k.startsWith("IAM"));//true
	    System.out.println(k.endsWith("is"));//false
	    
	    
	    String lk= "Haryryryryyyyyy";
	    
	    
	    // indexof- it will return the index of  substring which is lying first 
	    System.out.println(k.indexOf("GO"));//4
	    System.out.println(lk.indexOf("ry"));//2
	    System.out.println(lk.indexOf("ry", 7));//8
	    
	    
	    //lastindexof - it will return the index of substring wjhich is lying  last 
	     System.out.println(lk.lastIndexOf("ry"));//8
	     System.out.println(lk.lastIndexOf("ar"));//1
	     
	     System.out.println(lk.lastIndexOf("ry", 7));//6- it will count upto the index then in that substring will fetch the index of last substring
	    
	  /*Esacpe characters: 
	   \n - new line 
	   \" -insert double quote in a string
	   \- will insert a backslash
	   \t- tab space
	   \s - space
	   
	System.out.println("The line is \"double quote");//The line is "double quote
	System.out.println("The line is \\ double quote ");//The line is \ double quote
	System.out.println("The line is \n double quote ");
	System.out.println("The line is \t double quote ");*/
	
	

	
	}

	
	
	
}
