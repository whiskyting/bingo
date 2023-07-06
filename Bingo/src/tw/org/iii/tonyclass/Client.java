package tw.org.iii.tonyclass;

import java.io.BufferedReader;
import java.io.PrintStream;
import java.net.Socket;

public class Client {
	public static Client core = new Client(new WinFrame());
	public final static int port = 2525;
	
	private final WinFrame frame;
	private String name;
    private Socket sock;
    BufferedReader reader;
    PrintStream writer;


	public static void main(String[] args) {
		
		Client.core = new Client(new WinFrame());

	}

	public  Client(WinFrame frame) {
		this.frame = frame;
		frame.setVisible(true);
		
	}
	
	private void sendData(PrintStream writer) {
		if (this.writer == null) {
			return;
			
		}
		

	} 
	
	public void connect(String ip) {
		
		
	}
	
//	public class IncomingReader
}
