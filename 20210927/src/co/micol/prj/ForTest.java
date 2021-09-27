package co.micol.prj;

public class ForTest {

	private int x;
	private int y;

	public void calSum(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void sum() {

		int sum = 0;
		for (int i = x; i <= y; i++) {
			sum += i;
		}
		System.out.println("두 수의 합은 : " + sum);
	}

	public void run() {
		sum();
	}
}
