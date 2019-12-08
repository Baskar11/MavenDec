package classActivity.day3;

public class WordReverse {

	public static void main(String[] args) {
		String a = "hi how";
		String b[] = a.split(" ");
		char[] x = b[0].toCharArray();
		char[] y = b[1].toCharArray();
		for (int i=0, j=x.length-1;i<x.length&&j>0;i++,j--) {
			char temp = x[i];
			x[i]=x[j];
			x[j]=temp;
		}
		
		for (int i=0, j=y.length-1;i<y.length-1&&j>=0;i++,j--) {
			char temp = y[i];
			y[i]=y[j];
			y[j]=temp;
		}
		String str1 = String.copyValueOf(x);
		String str2 = String.copyValueOf(y);
		a=str1.concat(" ").concat(str2);
		System.out.println(a);
	}

}
