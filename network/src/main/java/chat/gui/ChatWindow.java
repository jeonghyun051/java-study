package chat.gui;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.SocketException;

import chat.ChatClient;

public class ChatWindow {

	private PrintWriter pw;
	private BufferedReader br;
	private Socket socket;
	private Frame frame;
	private Panel pannel;
	private Button buttonSend;
	private TextField textField;
	private TextArea textArea;

	public ChatWindow(String name, Socket socket) {
		frame = new Frame(name);
		pannel = new Panel();
		buttonSend = new Button("Send");
		textField = new TextField();
		textArea = new TextArea(30, 80);
		this.socket = socket;
	}

	public void show() throws IOException {

//		ui초기화

		// Button
		buttonSend.setBackground(Color.GRAY);
		buttonSend.setForeground(Color.WHITE);
		buttonSend.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent actionEvent) {
				sendMessage();
			}
		});

		// Textfield
		textField.setColumns(80);
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				char keyCode = e.getKeyChar();
				if (keyCode == KeyEvent.VK_ENTER) {
					sendMessage();
				}
			}
		});

		// Pannel
		pannel.setBackground(Color.LIGHT_GRAY);
		pannel.add(textField);
		pannel.add(buttonSend);
		frame.add(BorderLayout.SOUTH, pannel);

		// TextArea
		textArea.setEditable(false);
		frame.add(BorderLayout.CENTER, textArea);

		// Frame
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				finish();
				System.exit(0);
			}
		});
		frame.setVisible(true);
		frame.pack();

		/* 2. IOStream 생성 */
		pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream(), "utf-8"), true);
		br = new BufferedReader(new InputStreamReader(socket.getInputStream(), "UTF-8"));

		/* 3. Chat Client Thread 생성(Receive Thread) */
		System.out.println("실행됨?1");
		new ChatClientThread().start();

	}

	private void finish() {
		System.out.println("채팅방 나가기 프로토콜 구현");
		System.out.println("소켓 닫기");
		System.exit(0);
		;
	}

	private void sendMessage() {
		String message = textField.getText();
		pw.println( "MESSAGE:" + message );
		System.out.println("MESSAGE:" + message);

		// 프로토콜 구현
		textField.setText("");
		textField.requestFocus();
	}

	private void updateTextArea(String message) {
		System.out.println("message22" + message);
		textArea.append(message);
		textArea.append("\n");
	}

	private class ChatClientThread extends Thread {
		@Override
		public void run() {
			try {
				while (true) {
					String message = br.readLine();
					if( message == null ) {
						break;
					}

					Thread.sleep(1);
					updateTextArea(message);
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			} catch (SocketException ex) {
				ChatClientApp.consoleLog("" + ex);
			} catch (IOException ex) {
				ChatClientApp.consoleLog("" + ex);
			} finally {
				finish();
			}
		}
	}
}