package classActivity.day3;

public class America {

	public static void main(String[] args) {
		String s = "america";
		String x = "testleaf";
		String y = "AC1SFc45c2";
		char a[] = s.toCharArray();
		char b[] = x.toCharArray();
		char nums[] = y.toCharArray();
		StringBuffer str3 = new StringBuffer();
		int count = 0, sum=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]=='a')
				count++;
		}
		
		System.out.println("There are "+count+" occurences of a in the word " +s);
		
		for(int i=0;i<b.length;i++) {
			char c = b[i];
			if(i%2!=0)
				c = Character.toUpperCase(c);
			str3.append(c);
		}
		
		System.out.println(str3);
		
		for(int i=0;i<nums.length;i++) {
			if(Character.isDigit(nums[i])) {
				int temp = Character.getNumericValue(nums[i]);
				sum+=temp;
			}
		}
		
		System.out.println("The sum of the numbers in the string "+y+" is "+sum);
		
			
	}
	
	

}
