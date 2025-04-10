package in.prec.ioniopackages.basicoperations;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

import in.prec.ioniopackages.basicoperations.entities.Movies;

public class ClientChannel2 {
	public static void main(String[] args) {
		int port=9090;
		String host="localhost";
		try(
				SocketChannel client = SocketChannel.open();
				ByteArrayOutputStream baos = new ByteArrayOutputStream();
				ObjectOutputStream oos=new ObjectOutputStream(baos);
				
			){
			client.connect(new InetSocketAddress(host, port));
			Movies movie = new Movies("Hera Pheri","Akshay");
			oos.writeObject(movie);
			oos.flush();
			ByteBuffer buffer = ByteBuffer.wrap(baos.toByteArray());
			client.write(buffer);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
