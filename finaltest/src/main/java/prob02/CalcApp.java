package prob02;

import java.util.Scanner;

public class CalcApp{
	


	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );
		System.out.print( "두 정수와 연산자를 입력하시오 >> " );
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		String operation = scanner.next();
		
		/* operation에 따라 4칙 연산 객체를 생성하고 caculate 메서드를 호출합니다. */
		switch (operation) {
		case "+":
			Arithmetic add = new Add();
			int add2 = add.calculate(a, b);
			System.out.println(add2);
			break;

		case "-":
			Arithmetic sub = new Sub();
			int sub2 = sub.calculate(a, b);
			System.out.println(sub2);
			break;
			
		case "*":
			Arithmetic mul = new Mul();
			int mul2 = mul.calculate(a, b);
			System.out.println(mul2);
			break;
			
		case "/":
			Arithmetic div = new Div();
			int div2 = div.calculate(a, b);
			System.out.println(div2);
			break;
		default:
			break;
		}
	}
}