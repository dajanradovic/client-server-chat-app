package chatApp;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatServerService {

	public static void main(String[] args) throws IOException {
		
		ServerSocket ss = new ServerSocket(9959);
		
		System.out.println("Server is waiting for client request:");
		Socket s = ss.accept();
		
		System.out.println("Client connected");
		
		
		ChatThreadServerInput serverInput = new ChatThreadServerInput(s);
		ChatThreadServerOutput serverOutput = new ChatThreadServerOutput(s);
		serverInput.start();
		serverOutput.start();
	}

}
