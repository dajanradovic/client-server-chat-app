package chatApp;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class ChatClientService {

	public static void main(String[] args) throws UnknownHostException, IOException {
		String ip = "localhost";
		int port = 9959;
		
		
		Socket s = new Socket(ip, port);
		
		ChatThreadCLientOutput clientOutput = new ChatThreadCLientOutput(s);
		ChatThreadClientInput clientInput = new ChatThreadClientInput(s);
		
		clientOutput.start();
		clientInput.start();

	}

}
