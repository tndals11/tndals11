package test;


public class Test5 {
	public static void main(String[] args) {
		Test5 test5 = new Test5();
		int sum = 0;
		
		int[] arry = {8, 3, 1, 6, 2, 4, 5, 9};
		for(int i = 0; i < arry.length; i++) {
			sum = sum + arry[i];
		}
		
		System.out.println("평균은 : " + test5.avg(sum));
	}
	double avg(int sum) {
		double avg = (double) sum /  8;
		return avg;
	}
}
