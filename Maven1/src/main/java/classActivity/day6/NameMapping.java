package classActivity.day6;

import java.util.HashMap;
import java.util.Map;

public class NameMapping {

	public static void main(String[] args) {
		 String name = "baskar duraisamy";
		 char[] c = name.toCharArray();
		 Map <Character, Integer> map = new HashMap <Character, Integer>();
		 for(char each:c) {
			if(map.containsKey(each)) {
				map.put(each,map.get(each)+1);
			}                                                      
			else
				map.put(each, 1); 
		 }


		 System.out.println(map.entrySet());
	}
}
