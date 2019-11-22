package chatApp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ChatThreadClientInput extends Thread {
	
	boolean konekcija = true;
	
	
	Socket s;
	String povrat;
	public ChatThreadClientInput(Socket s) {
		
		this.s = s;
	};
	
	
	public void run () {
		
			while(konekcija) {

		BufferedReader br = null;
		try {
			br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try {
			povrat = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if (povrat!=null)
			
		System.out.println("Server says: " + povrat);}
		
	
	
}
	
}
