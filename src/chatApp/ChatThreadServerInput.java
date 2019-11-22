package chatApp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatThreadServerInput extends Thread {

	boolean konekcija = true;
	Socket s;
	String str;
	
	public ChatThreadServerInput(Socket s) {
		
		this.s = s;
	};
	
	
	public void run () {
		while (konekcija) {
			BufferedReader br = null;
			try {
				br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 try {
				str = br.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 
			 if (str!=null)
			System.out.println ("Client says: " + str);
							}
		
	}
	
}
