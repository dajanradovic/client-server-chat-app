package chatApp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class ChatThreadCLientOutput extends Thread {
	boolean konekcija = true;
	Socket s;
	 String str;
	public ChatThreadCLientOutput(Socket s) {
		
		this.s = s;
	};
	

			public void run () {
				
				while(konekcija) {
					
					BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
					//System.out.println("Klijent govori:");
					
					try {
						str = userInput.readLine() + "\n";
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					OutputStreamWriter os = null;
					try {
						os = new OutputStreamWriter(s.getOutputStream());
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					PrintWriter out = new PrintWriter(os);
					out.write(str);
					out.flush();}
				
				
			}
}
