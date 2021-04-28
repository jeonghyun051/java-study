package prob01;

import java.util.Scanner;

public class Prob01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in  );

		final int[] MONEYS = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1 };

		/* 코드 작성 */
		System.out.println("금액을 입력하시오");
		int money = scanner.nextInt();
		if (money >= 50000) {
			int count = money/50000;
			int money2 = money%50000;
			
			int count2 = money2/10000;
			int money3 = money2%10000;
			
			int count3 = money3/5000;
			int money4 = money3%5000;
			
			int count4 = money4/1000;
			int money5 = money4%1000;
			
			int count5 = money5/500;
			int money6 = money5%500;
			
			
			System.out.println("50000원 : " + count);
			System.out.println("10000원 : " + count2);
			System.out.println("5000원 : " + count3);
			System.out.println("1000원 : " + count4);
			System.out.println("500원 : " + count5);
			
		}
		
		scanner.close();
	}

}
