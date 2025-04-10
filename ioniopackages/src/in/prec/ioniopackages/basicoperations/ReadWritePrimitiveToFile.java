package in.prec.ioniopackages.basicoperations;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadWritePrimitiveToFile {
	public static void main(String[] args) {
//		Writing to file
//		try(
//				InputStreamReader iStreamReader = new InputStreamReader(System.in);
//				BufferedReader bReader = new BufferedReader(iStreamReader);
//				FileOutputStream fOutputStream = new FileOutputStream("primitive.dat");
//				DataOutputStream dOutputStream = new DataOutputStream(fOutputStream);
//			){
//			
//			System.out.println("Enter a int Number:");
//			int number = Integer.parseInt(bReader.readLine());
//			dOutputStream.writeInt(number);
//			System.out.println("Enter a boolean value:");
//			boolean flag = Boolean.parseBoolean(bReader.readLine());
//			dOutputStream.writeBoolean(flag);
//			
//		}catch (IOException e) {
//			System.out.println(e.getMessage());
//		}
//		Reading from file
		try(
				FileInputStream fInputStream = new FileInputStream("primitive.dat");
				DataInputStream dInputStream = new DataInputStream(fInputStream);
			){
			
			int number=dInputStream.readInt();
			System.out.println(number+10);
			
			boolean flag = dInputStream.readBoolean();
			System.out.println(flag);
			
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
		
	}
}	
