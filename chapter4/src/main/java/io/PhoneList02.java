package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class PhoneList02 {

	public static void main(String[] args) {
		
		Scanner sc = null;
		
		try {
			File file = new File("phone.txt");

			// 파일이 존재하지 않을 때
			if (!file.exists()) {
				System.out.println("file not found");
				return;
			}

			System.out.println("=======파일 정보=========");
			System.out.println(file.getAbsolutePath()); // 파일 절대 경로
			System.out.println(file.length() + "bytes");

			// 날짜 포멧하기
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
			
			System.out.println("=======전화 번호=========");
			
			sc = new Scanner(file);
			while(sc.hasNextLine()) {
				sc.next();
				String name = sc.next();
				String phone1 = sc.next();
						String phone2 = sc.next();
						String phone3 = sc.next();
			}
	
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("error:" + e);
			e.printStackTrace();
		}finally {
			if (sc != null) {
				sc.close();	
			}
			
		}

	}
}