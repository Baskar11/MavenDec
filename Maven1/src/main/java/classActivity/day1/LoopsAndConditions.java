package classActivity.day1;

public class LoopsAndConditions {
	
	public static void main(String[] args) {
		int a=-1, b=1, c=0;
		System.out.println("Fibonacci series until 100:");		
		for(int i=0; c<100 ;i++) {
			c=a+b;
			if(c<100) {
			System.out.println(c);
			
			}else {
				break;
			}
			a=b;
			b=c;
		}
		
	}
}
