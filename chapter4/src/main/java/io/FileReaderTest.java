package io;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

public class FileReaderTest {

	public static void main(String[] args) {

		Reader in = null;
		InputStream is = null;
		
		
		try {
			in = new FileReader("1234.txt");
			int count = 0;
			int data = -1; // 파일의 문자 하나당 3byte, int는 4byte
			while ((data = in.read()) != -1) {
				System.out.print((char) data);
				count++;
			}
			System.out.println("");
			System.out.println("count:" + count);
			System.out.println("=============================");
			
			// 21번 읽는다.
			count = 0;
			data = -1;
			is = new FileInputStream("1234.txt");
			while ((data = in.read()) != -1) {
				System.out.print((char) data);
				count++;
			}
			System.out.println("");
			System.out.println("count:" + count);
			
		} catch (Exception e) {
			System.out.println("file not found : " + e);
		} finally {
			try {
				if (in != null) {
					in.close();

				}
				if(in == null) {
					
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}