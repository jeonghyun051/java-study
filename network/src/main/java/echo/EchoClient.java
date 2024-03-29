package echo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketException;
import java.util.Scanner;

public class EchoClient {

	//private static final String SERVER_IP = "127.0.0.1";
	private static String SERVER_IP = "";
	private static final int SERVER_PORT = EchoServer.PORT;

	public static void main(String[] args) {

		if (args.length == 0) {
			System.out.println("실행방법: Java EchoClient ServerIP");
			return;
		}
		
		SERVER_IP = args[0];
		
		Socket socket = null;
		Scanner scanner = null;
		try {
			// 1. Scanner 생성
			scanner = new Scanner(System.in);
			
			// 1. 소켓 생성
			socket = new Socket();

			// 2. 서버 연결
			socket.connect(new InetSocketAddress(SERVER_IP, SERVER_PORT));
			log("connected");
			
			// 3. IO Stream 받아오기
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream(),"utf-8"));
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream(), "utf-8"), true);
			
			while(true) {
				// 5. 키보드 입력 받기
				System.out.println(">");
				String line = scanner.nextLine();
				
				if("exid".equals(line)) {
					break;
				}
				
				pw.println(line);
				
				// 7. 데이터 읽기
				String data = br.readLine();
				if (data == null) {
					log("closed by server");	
				}
				
				// 8. 콘솔 출력
				System.out.println("<" + data);
			}
			
		}catch (SocketException e) {
			log("suddenly closed by server");
		}  
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		finally {
			try {
				if (scanner != null) {
					scanner.close();	
				}
				if(socket != null && socket.isClosed() == false) {
					socket.close();
				}
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	private static void log(String log) {
		System.out.println("[EchoClient]" + log );
	}
}