package in.prec.ioniopackages.basicoperations;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

import in.prec.ioniopackages.basicoperations.entities.Movies;

public class ServerChannel {
	public static void main(String[] args) {
//		port number to be bind
	int port = 9090;
		try (ServerSocketChannel server = ServerSocketChannel.open();) {
			server.bind(new InetSocketAddress(port));
			System.out.println("Server Started At:" + port);
			while (true) {
				try (SocketChannel client = server.accept()) {
				System.out.println("Cleint connected at:" + client.getRemoteAddress());
				ByteBuffer buffer = ByteBuffer.allocate(1024);
				int charVal = client.read(buffer);
				if (charVal != -1) {
//					Flip buffer for reading
					buffer.flip();
					byte[] byteArray = new byte[buffer.remaining()];
					buffer.get(byteArray);
					try (
							ByteArrayInputStream bais = new ByteArrayInputStream(byteArray);
							ObjectInputStream ois = new ObjectInputStream(bais);
	) {
						Movies movie = (Movies) ois.readObject();
						System.out.println(movie);
					} catch (ClassNotFoundException e) {
						e.printStackTrace();
					}
				}
			}
	}
	} catch (IOException e) {
	e.printStackTrace();
	}
	}

}
