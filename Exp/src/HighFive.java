import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;

public class HighFive {
	
    public static int[][] highFive(int[][] items) {
    	
    	HashMap<Integer, ArrayList<Integer>> hashMap = new HashMap<>();
    	ArrayList<Integer> scores;
    	
        for(int[] item:items) {
        	int studentId = item[0];
        	int mark = item[1];
        	if(hashMap.containsKey(studentId)) {
        		scores = hashMap.get(studentId);
        		scores.add(mark);
        		hashMap.put(studentId, scores);
        	}
        	else {
        		scores = new ArrayList<>();
        		scores.add(mark);
        		hashMap.put(studentId, scores);
        	}
        }
        
        int[][] result = new int[hashMap.size()][2];
        int index = 0;
        for(int studentId: hashMap.keySet()) {
        	scores = hashMap.get(studentId);
        	result[index][0] = studentId;
        	Collections.sort(scores);
        	Collections.reverse(scores);
        	int count = 0;
        	int sum = 0;
        	Iterator<Integer> iterator = scores.iterator();
        	while(iterator.hasNext() && count < 5) {
        		count++;
        		sum = sum + iterator.next();
        	}
        	result[index][1] = (sum/5);
        	index++;
        }
        
        return result;
        
    }
    
    public static int[][] betterSolution(int[][] items) {
    	Arrays.sort(items, new Comparator<int[]>() {

			public int compare(int[] student1, int[] student2) {
				if(student1[0] == student2[0]) {
					return student2[1] - student1[1];
				}
				return student1[1] - student2[1];
			};
    	});
			
    		//size of result array is obtained by last student id of sorted array
    		int size = items[items.length-1][0];
			int[][] result = new int[size][2];
			int count = 0;
			int sum = 0;
			int index = 0;
			int id = 1;
			for(int i=0;i<items.length;i++) {
				int studentId = items[i][0];
				if(count < 5 && id == studentId) {
					sum += items[i][1];
					count++;
				}
				if(count == 5) {
					int avg = sum/5;
					count = 0;
					sum = 0;
					id++;
					result[index][0] = studentId;
					result[index][1] = avg;
					index++;
				}
			}
			
			return result;
		}
    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(highFive(new int[][]{{1,91},{1,92},{2,93},{2,97},{1,60},{2,77},{1,65},{1,87},{1,100},{2,100},{2,76}}));
		System.out.println(betterSolution(new int[][]{{1,91},{1,92},{2,93},{2,97},{1,60},{2,77},{1,65},{1,87},{1,100},{2,100},{2,76}}));
	}

}
