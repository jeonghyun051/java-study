package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

public class PhoneList01 {

	public static void main(String[] args) {
		BufferedReader br = null;
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
			String lastModifiedDate = sdf.format(new Date(file.lastModified()));
			System.out.println(lastModifiedDate); // 업데이트 시간

			// 1. 기반 스트림
			FileInputStream fis = new FileInputStream(file);
			
			// 2 보조스트림1(byte -> char)
			InputStreamReader isr =new InputStreamReader(fis);
			
			// 3 보조스트림2(char1 | char2 | char3 |\n -> "char1char2char3")
			 br = new BufferedReader(isr);
			
			 // 4.처리
			 String line = null;
			 while((line = br.readLine()) != null) {
				 System.out.println(line);
				 StringTokenizer st = new StringTokenizer(line,"\t "); // 탭과 스페이스를 쪼갠다 하나하나
				 
				 int index = 0;
				 while(st.hasMoreTokens()) {
					 String token = st.nextToken();
					 if (index == 0) {	// 이름
						System.out.print(token + ":");
					}else if (index == 1) {	// 전화번호 첫번째
						System.out.print(token + "-");
					}else if(index ==2 ) {	// 전화번호 두번째
						System.out.print(token + "-");
					}else {	// 전화번호 마지막
						System.out.print(token);
					}
					 index++;
				 }
				 
				 System.out.println("");
			 }
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("error:" + e);
			e.printStackTrace();
		}finally {
			try {
				if (br != null) {
					br.close();
						
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
}