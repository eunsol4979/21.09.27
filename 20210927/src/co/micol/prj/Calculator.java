package co.micol.prj;

public class Calculator { //Class 정의, Class 만들기

	private int firstNum;
	private int secondNum;

	// private일때 값을 전달하는 2가지 방법

	// 생성자를 통한 값 전달 방법
	public Calculator() { // 기본생성자

	}

	Calculator(int n, int m) {
		this.firstNum = n;
		this.setSecondNum(m);
	}
	
	public Calculator(int n) {
		this.firstNum = n;
	}
	
	// set get 전달 방법
	public void setFirstNum(int n) { // setter -> 값을 담는 변수
		this.firstNum = n;
	}

	public int getFirstNum() { // getter -> 값을 가져오는 변수
		return firstNum;
	}

	public int getSecondNum() {
		return secondNum;
	}

	public void setSecondNum(int secondNum) {
		this.secondNum = secondNum;
	}

	public int sum() {
		return firstNum + secondNum;
	}
	
	public int sub() {
		return firstNum - secondNum;
	}
	
	
	
	
}
