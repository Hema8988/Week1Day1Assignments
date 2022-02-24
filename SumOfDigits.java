package week1.day1.assignments;

public class SumOfDigits {

	public static void main(String[] args) {
		int sum,n;
		n=123;
		sum=0;
		while (n>0) {
			int a=n%10;
					System.out.println("Remainder is" +a);
					 sum=sum+a;
					System.out.println("value is " +sum);
					n=n/10;
					System.out.println("Quotient is " +n);
					
					
			
		}
		System.out.println("sum of digits" +sum);
	}

}
