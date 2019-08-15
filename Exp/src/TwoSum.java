import java.util.HashMap;

public class TwoSum {
	
	public static int[] solution(int[] a, int sum) {
		
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(int i=0;i<a.length;i++) {
			
			if(map.containsKey(a[i])) {
				return new int[] {map.get(a[i]),i};
			}
			else {
				map.put(sum - a[i], i);
			}
		}
		
		throw new IllegalArgumentException("No two elements sum");
	}

	public static void main(String[] args) {
		
		int[] a = new int[]{2, 7, 11, 15};
		int target = 9;
		int[] result = solution(a, target);
		for(int i:result)
			System.out.print(i+",");
		
	}

}
