package week1.day1.assignments;

public class FibonacciSeries {

	public static void main(String[] args) {
		int num1 = 0,num2 = 1, range=7;
		System.out.println(num1+" ");
		for ( int i = 1; i < range; ++i) {
			int sum=num1+num2;
			num1= num2;
			num2 = sum;
			System.out.println(sum);
		}
	}

}
