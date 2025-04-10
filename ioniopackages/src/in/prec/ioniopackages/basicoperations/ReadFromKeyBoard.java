package in.prec.ioniopackages.basicoperations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadFromKeyBoard {
	public static void main(String[] args) throws IOException {
		InputStreamReader iReader = new InputStreamReader(System.in);
		BufferedReader bReader = new BufferedReader(iReader);
		System.out.println("Enter a String:");
//		int result;
//		while((result=bReader.read())!=65)
//			System.out.println((char)result);
		
		String result="";
		while(!(result=bReader.readLine()).equals("%"))
			System.out.println(result);
		
		iReader.close();
		bReader.close();
	}

}
