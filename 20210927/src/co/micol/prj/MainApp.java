package co.micol.prj;

import java.util.Scanner;

public class MainApp {
	public static void main(String[] args) { //메인 메소드에서 조립만 해준다 
		
/*		Calculator calculator = new Calculator(); //생성, Instance 만들자
		calculator.setFirstNum(200); //setter를 통해 값을 전달한다
		calculator.setSecondNum(20);
		int sum = calculator.sum();
		int sub = calculator.sub();

		Calculator calculator = new Calculator(20, 20); //생성자에 의한 전달 방법
		int sum = calculator.sum();
		int sub = calculator.sub();
		System.out.println("덧셈의 결과 : " + sum);
		System.out.println("뺄셈의 결과 : " + sub);
	
		MyCalculator myCalculator = new MyCalculator();
		
		myCalculator.sum(10, 10);
		float f = myCalculator.sum(5.0f, 5); //float으로 리턴이기 때문에 float으로 변환
		System.out.println(f);
		
		int n = myCalculator.sum(5);
		System.out.println(n);
		
		double d = myCalculator.sum(10.2, 10.2);
		System.out.println(d);
		
		double d2 = (double)myCalculator.sum(10.1, 100);
	
		CompareMax compareMax = new CompareMax(100, 50);
		int max = compareMax.getMax();
		System.out.println("두 수중에 큰 값은 : " + max);

		Calculator calculator = new Calculator();
		calculator.setFirstNum(200);
		calculator.setSecondNum(500);
		System.out.println("전달된 두 수의 합 : " + calculator.sum());
*/		 
		Scanner sc = new Scanner(System.in);
		
		ForTest fortest = new ForTest();
		System.out.println("첫 번째 수 입력 : ");
		int x = sc.nextInt();
		System.out.println("두 번째 수 입력 : ");
		int y = sc.nextInt();
		fortest.calSum(x, y);
		fortest.run();

		
	}
}
