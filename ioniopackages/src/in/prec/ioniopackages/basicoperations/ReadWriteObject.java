package in.prec.ioniopackages.basicoperations;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

import in.prec.ioniopackages.basicoperations.entities.Movies;

public class ReadWriteObject {
	public static void main(String[] args) {
//		Writing to file
//		Movies sholay = new Movies();
//		try(
//				InputStreamReader iStreamReader = new InputStreamReader(System.in);
//				BufferedReader bReader = new BufferedReader(iStreamReader);
//				FileOutputStream fOutputStream = new FileOutputStream("movies.txt");
//				ObjectOutputStream oOutputStream = new ObjectOutputStream(fOutputStream);
//			){
//			
//			System.out.println("Enter Movie name:");
//			sholay.setName(bReader.readLine());
//			System.out.println("Enter Actor name:");
//			sholay.setActor(bReader.readLine());
//			
//			oOutputStream.writeObject(sholay);
//			
//		}catch(IOException e) {
//			e.printStackTrace();
//		}
		
//		Reading From file
//		try(
//				FileInputStream fInputStream = new FileInputStream("movies.txt");
//				ObjectInputStream oInputStream = new ObjectInputStream(fInputStream);
//			){
//			
//			Movies demo=(Movies)oInputStream.readObject();
//			System.out.println(demo.getName());
//			System.out.println(demo.getActor());
//			
//		}catch(IOException e) {
//			e.printStackTrace();
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		}
		
//		List<Movies> movieList = new ArrayList<>();
//		movieList.add(new Movies("Shawshank Redemption", "Tom"));
//		movieList.add(new Movies("God Father", "Al Pacino"));
//		movieList.add(new Movies("Schindlers List", "Liam"));
//		try(
//				FileOutputStream fOutputStream = new FileOutputStream("movielist.bin");
//				ObjectOutputStream oOutputStream = new ObjectOutputStream(fOutputStream);
//			){
//			oOutputStream.writeObject(movieList);
//			
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		
		try(
				FileInputStream fInputStream = new FileInputStream("movielist.bin");
				ObjectInputStream oInputStream = new ObjectInputStream(fInputStream);
			){
			
			List<Movies> movieList= (ArrayList<Movies>)oInputStream.readObject();
			movieList.forEach(System.out::println);
			
		}catch(IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}
