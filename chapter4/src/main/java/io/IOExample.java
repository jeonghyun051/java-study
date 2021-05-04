package io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

public class IOExample {
	public static void main(String[] args) throws IOException{
		byte[] src = {1,2,3,4};
		byte[] dest = null;
		
		InputStream is = new ByteArrayInputStream(src);
		OutputStream os = new ByteArrayOutputStream();
		
		// 1byte만 읽는것 그래서 while문 돌려야 함
		int data = -1;
		while((data = is.read()) != -1) {
			os.write(data);
			// is.read();
		}
		
		dest = ((ByteArrayOutputStream)os).toByteArray();
	    
		System.out.println(Arrays.toString(src)); // 배열을 String으로
		System.out.println(Arrays.toString(dest));
	}
}
