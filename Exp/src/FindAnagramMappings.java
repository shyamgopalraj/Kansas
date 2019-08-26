import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class FindAnagramMappings {

	public static int[] anagramMappings(int[] A, int[] B) {
		if(A.length == 0) {
			return A;
		}
		int[] result = new int[B.length];
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int index = 0; index <B.length;index++) {
			int val = B[index];
			map.put(val, index);
		}
		
		for(int index = 0; index <A.length;index++) {
			int val = A[index];
			result[index] = map.get(val);
		}
		return result;
	}

	public static void main(String[] args) {
		int[] A = new int[]{21,5,74,5,74,21};
		int[] B = new int[]{21,5,74,74,5,21};
		int[] result = anagramMappings(A, B);
		for(int index:result) {
			System.out.print(index+",");
		}
	}
	
}
