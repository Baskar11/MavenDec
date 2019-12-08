package classActivity.day3;

public class TotalReverse {

	public static void main(String[] args) {
		String x = "Hi how are you";
		char[] y = x.toCharArray();
		for (int i=y.length-1; i>=0;i--) {
			System.out.print(y[i]);
		}

	}

}
