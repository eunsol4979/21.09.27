package co.micol.prj;

public class Calculator { //Class ����, Class �����

	private int firstNum;
	private int secondNum;

	// private�϶� ���� �����ϴ� 2���� ���

	// �����ڸ� ���� �� ���� ���
	public Calculator() { // �⺻������

	}

	Calculator(int n, int m) {
		this.firstNum = n;
		this.setSecondNum(m);
	}
	
	public Calculator(int n) {
		this.firstNum = n;
	}
	
	// set get ���� ���
	public void setFirstNum(int n) { // setter -> ���� ��� ����
		this.firstNum = n;
	}

	public int getFirstNum() { // getter -> ���� �������� ����
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
