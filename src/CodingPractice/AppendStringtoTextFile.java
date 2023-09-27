package CodingPractice;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class AppendStringtoTextFile {

	public static void main(String[] args) throws IOException {

		
		
		String path="C:\\Users\\arvind.sharma3\\Desktop\\New Text Document.txt";
		FileWriter fw = new FileWriter(path, true);//true we are using so that data append at end of file ant not in begg
	    BufferedWriter bw = new BufferedWriter(fw);
	    bw.write("Spain");
	    bw.newLine();
	    bw.close();

	}

}
