package classActivity.day1;

public class SumOfDigits {

	public static void main(String[] args) {
		int x=15673, sum=0;
		for (int i=0;i<=5;i++) {
			sum=sum+(x%10);
			x=x/10;
		}
		System.out.println("Sum of the digits is " +sum);
	}

}
