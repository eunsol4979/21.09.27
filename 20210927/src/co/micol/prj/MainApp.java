package co.micol.prj;

import java.util.Scanner;

public class MainApp {
	public static void main(String[] args) { //���� �޼ҵ忡�� ������ ���ش� 
		
/*		Calculator calculator = new Calculator(); //����, Instance ������
		calculator.setFirstNum(200); //setter�� ���� ���� �����Ѵ�
		calculator.setSecondNum(20);
		int sum = calculator.sum();
		int sub = calculator.sub();

		Calculator calculator = new Calculator(20, 20); //�����ڿ� ���� ���� ���
		int sum = calculator.sum();
		int sub = calculator.sub();
		System.out.println("������ ��� : " + sum);
		System.out.println("������ ��� : " + sub);
	
		MyCalculator myCalculator = new MyCalculator();
		
		myCalculator.sum(10, 10);
		float f = myCalculator.sum(5.0f, 5); //float���� �����̱� ������ float���� ��ȯ
		System.out.println(f);
		
		int n = myCalculator.sum(5);
		System.out.println(n);
		
		double d = myCalculator.sum(10.2, 10.2);
		System.out.println(d);
		
		double d2 = (double)myCalculator.sum(10.1, 100);
	
		CompareMax compareMax = new CompareMax(100, 50);
		int max = compareMax.getMax();
		System.out.println("�� ���߿� ū ���� : " + max);

		Calculator calculator = new Calculator();
		calculator.setFirstNum(200);
		calculator.setSecondNum(500);
		System.out.println("���޵� �� ���� �� : " + calculator.sum());
*/		 
		Scanner sc = new Scanner(System.in);
		
		ForTest fortest = new ForTest();
		System.out.println("ù ��° �� �Է� : ");
		int x = sc.nextInt();
		System.out.println("�� ��° �� �Է� : ");
		int y = sc.nextInt();
		fortest.calSum(x, y);
		fortest.run();

		
	}
}
