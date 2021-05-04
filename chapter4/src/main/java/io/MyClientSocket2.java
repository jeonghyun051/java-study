package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.*;
import java.util.Scanner;

public class MyClientSocket2 {

	private Socket socket;
	private Scanner sc;
	private BufferedWriter writer;
	private BufferedReader reader;
	
	public MyClientSocket2() {
		try {
			socket = new Socket("127.0.0.1",10000);
			
			//키보드로 입력받아서
			sc = new Scanner(System.in);
			
			//소켓에 버퍼 달기 쓰는법
			writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			//나중에 힙변수에 안들어가있으면 내부클래스에서 못써서 위에 private 했음
			
			reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			//이거는 익명클래스 newThread(new Run).statr(); 후 ctrl + space
			new Thread(new Runnable() {
				
				@Override
				public void run() {
					String input = null;
					try {
						while((input = reader.readLine()) != null) {
							System.out.println("서버로부터온 메시지 : " + input);
						}
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
			}).start();
			
			//메인 스레드는 키보드로부터 입력을 받은 뒤 클라이언트소켓에 전송
			while (true) {
				String input = sc.nextLine(); //문자열 받기
				//서버에 전송
				writer.write(input + "\n");
				writer.flush(); // 전송이 된다.
			}	
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {

		new MyClientSocket2();
	}
}