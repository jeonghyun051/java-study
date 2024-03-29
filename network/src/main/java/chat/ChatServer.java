package chat;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class ChatServer {
	
	public static final int PORT = 7000;
			
	public static void main(String[] args) {
		List<PrintWriter> listPrintWriter =
				new ArrayList<PrintWriter>();
		ServerSocket serverSocket = null;
		
		try {
			
			serverSocket = new ServerSocket();
			serverSocket.bind(new InetSocketAddress("0.0.0.0", PORT));
			
			while(true) {
				Socket socket = serverSocket.accept();
				
				Thread thread = new ChatServerThread(socket, listPrintWriter);
				thread.start();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(serverSocket != null && serverSocket.isClosed() == false) {
					serverSocket.close();

				}
				
			} catch (IOException e) {

				e.printStackTrace();
			}
		}
	}
	public static void consoleLog( String message ) {
		System.out.println( "[chat server]" + message );
	}
}