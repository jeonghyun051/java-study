package test;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;

public class TCPClientt {

	private static final String SERVER_IP = "127.0.0.1";
	private static final int SERVER_PORT = 5000;

	public static void main(String[] args) {
		Socket socket = null;
		
		try {
			// 1. 소켓 생성
			socket = new Socket();
			
			// 1-1. 소켓 버퍼사이즈 확인
			int receiveBufferSize = socket.getReceiveBufferSize();
			int sendBufferSize = socket.getSendBufferSize();
			System.out.println("[client]" + receiveBufferSize + ":" + sendBufferSize);
			
			// 1-2. 소켓 버퍼사이즈 변경
			socket.setReceiveBufferSize(1024 * 10);
			socket.setSendBufferSize(1024 * 10);
			receiveBufferSize = socket.getReceiveBufferSize();
			sendBufferSize = socket.getSendBufferSize();
			System.out.println("[client]" + receiveBufferSize + ":" + sendBufferSize);
			
			// 1.3 SO_NODELAY(Nagle Algorithm off)
			socket.setTcpNoDelay(true);
			
			// 1.4 SO_TIMEOUT
			socket.setSoTimeout(1000);
			
			// 2. 서버 연결
			socket.connect(new InetSocketAddress(SERVER_IP, SERVER_PORT));
			System.out.println("[client] connected");
			
			// 3. IO Stream 받아오기
			InputStream is = socket.getInputStream();
			OutputStream os = socket.getOutputStream();
			
			// 4. 쓰기
			String data = "hello World\n";
			os.write(data.getBytes("utf-8"));
			
			// 5. 읽기
			byte[] buffer = new byte[255];
			int readByteCount = is.read(buffer); // blocking
			if(readByteCount == -1) {
				System.out.println("[client] close by server");
				return;
			}
			
			data = new String(buffer,0,readByteCount,"utf-8");
			System.out.println("[client] received:" + data);
			
			// 6. 데이터 쓰기
			try {
				Thread.sleep(2000);
				os.write(data.getBytes("utf-8"));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (SocketTimeoutException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				if (socket != null && socket.isClosed()) {
					socket.close();	
				}
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}