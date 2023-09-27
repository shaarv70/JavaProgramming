package CodingPractice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class FindNumberofWordsLinesCharactersintextFile {

	public static void main(String[] args) throws IOException {
		
		 String line, word = "";    
	        int count = 0, maxCount = 0;    
	        ArrayList<String> words = new ArrayList<String>();    
	           int lines=0; 
	        //Opens file in read mode    
	        FileReader file = new FileReader("C:\\Users\\arvind.sharma3\\Desktop\\New Text Document.txt");    
	        BufferedReader br = new BufferedReader(file);    
	            //Reads each line    
	        while((line = br.readLine()) != null) {    
	            String string[] = line.toLowerCase().split(" ");  
	            lines++;
	            //Adding all words generated in previous step into words    
	            for(String s : string){    
	                words.add(s);    
	            }    
	        }    
	            System.out.println("Number of words in file is:"+words.size());
	     
	            int counti =0;
	            
	            for (String h:words)
	            {
	            	counti = counti+h.length();
	            }
	           System.out.println("Number of characters in File are : "+counti);
	        System.out.println("Number of lines in File are : "+lines);
	            
	           
	        br.close();    

	}

}
