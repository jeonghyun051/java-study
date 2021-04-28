package prob3;

import java.util.Iterator;
import java.util.Scanner;

public class Prob3 {

	public static void main(String[] args) {

		boolean state = true;

		/* 코드 작성 */
		while (state) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("숫자를 입력하세요(0 입력 시 종료) :");
			int number = scanner.nextInt();
			int b = 0;

			if (number % 2 == 0 && number != 0) { // 짝수
				for (int i = 2; i <= number; i += 2) {
					b += i;
					// System.out.println(i);
				}
				System.out.println("결과값 : " + b);
			} else if (number % 2 != 0) { // 홀수
				for (int i = 1; i <= number; i += 2) {
					b += i;
				}
				System.out.println("결과값 : " + b);
			} else if (number == 0) { // 0입력 시 종료
				System.out.println("종료");
				state = false;
				//scanner.close();
				//break;
			}
			System.out.println("");

			scanner.close();
		}
	}
}
