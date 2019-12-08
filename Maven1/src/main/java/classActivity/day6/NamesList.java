package classActivity.day6;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class NamesList {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("a");
		list.add("b");
		list.add("a");
		list.add("b");
		list.add("d");
		Set<String> set = new LinkedHashSet<String>();
		Set<String> setDup = new LinkedHashSet<String>();
		for (String eachItem : list) {
			boolean result = set.add(eachItem);
			if (result == false) {
				setDup.add(eachItem);
			}
		}
		System.out.println(setDup);
		set.removeAll(setDup);
		System.out.println(set);

	}

}
