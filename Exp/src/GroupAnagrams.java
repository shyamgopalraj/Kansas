import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;


public class GroupAnagrams {

	public static List<List<String>> groupAnagrams(String[] strs) {
		if(strs == null) {
			return null;
		}
		else {
			Map<String,List<String>> map = new HashMap<>();
			for(String str: strs) {
				char[] cArray = str.toCharArray();
				Arrays.sort(cArray);
				String key = String.valueOf(cArray);
				System.out.println("key: "+key);
				if(map.containsKey(key)) {
					List<String> groupedAnagram = map.get(key);
					groupedAnagram.add(str);
					map.put(key, groupedAnagram);
				}
				else {
					List<String> groupedAnagram = new ArrayList<>();
					groupedAnagram.add(str);
					map.put(key, groupedAnagram);
				}
			}
			return new ArrayList<List<String>>(map.values());
		}
		
	}
	

	public static void main(String[] args) {
		List<List<String>> result = groupAnagrams(new String[] {"eat","tea","tan","ate","nat","bat"});
		for (List<String> groupedAnagrams : result) {
			System.out.println(groupedAnagrams);
		}
	}

}
