package chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class ChatClient {

	private static final String SERVER_IP = "127.0.0.1";
	private static final int SERVER_PORT = ChatServer.PORT;

	public static void main(String[] args) {

		Scanner scanner = null;
		Socket socket = null;
		try {
			// 1. 키보드 연결
			scanner = new Scanner(System.in);

			// 2. socket 생성
			socket = new Socket();

			// 3. 연결
			socket.connect(new InetSocketAddress(SERVER_IP, SERVER_PORT));

			// 4. reader/writer 생성
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream(), "utf-8"));
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream(), "utf-8"), true);

			// 5. join 프로토콜
			System.out.print("닉네임>>");
			String nickname = scanner.nextLine();
			pw.println("JOIN:" + nickname);
			String line = br.readLine();
			if("JOIN:OK".equals(line)) {
				System.out.println( "입장하였습니다. 즐거운 채팅 되세요" );
			}
			
			//pw.flush();

			// 6. ChatClientReceiveThread 시작
			new ChatClientThread(socket).start();
			
			//7.input message
//			while( true ) {
//				if( scanner.hasNextLine() == false ) {
//					continue;
//				}
//				
//				String message = scanner.nextLine();
//				
//				if("quit".equals(message)) {
//					pw.println("QUIT");
//					//System.exit(0);
//					break;
//				}
//				
//				if("".equals(message) == false){
//					pw.println("MESSAGE:" + message);
//				}
//			}
			
			// 7. 키보드 입력 처리
			while(true) {
				//System.out.print(">>");
				String input = scanner.nextLine();

				if ("quit".equals(input) == true) {
					// 8. quit 프로토콜 처리
					pw.println( "QUIT" );
					break;
				} else {
					// 9. 메시지 처리
					pw.println("MESSAGE:" + input);
					
					// 8. 콘솔 출력
					//System.out.println(nickname + ":" + input);
					//continue;
				}
			}
		} catch (ConnectException ex) {
			consoleLog( "서버[" + SERVER_IP + ":" + SERVER_PORT + "]에 연결할 수 없습니다." );	
		} catch (Exception ex) {
			consoleLog( "다음 이유로 프로그램을 종료 합니다 :" + ex );	
		} finally {
			try {
				if( scanner != null ) {
					scanner.close();
				}
				if( socket != null && socket.isClosed() == false ){
					socket.close();
				}
			}catch( IOException ex ) {
				consoleLog( "다음 이유로 프로그램을 종료 합니다 :" + ex );	
			}
		}
	}
	
	public static void consoleLog( String message ) {
		System.out.println( "\n[chat client]" + message );
	}
}
