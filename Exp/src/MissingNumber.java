import java.util.Arrays;

public class MissingNumber {
	
    public static int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int i=0;
        for(;i<nums.length;i++) {
        	if(i != nums[i]) {
        		break;
        	}
        }
        return i;
    }
	

	public static void main(String[] args) {
		System.out.println(missingNumber(new int[] {9,6,4,2,3,5,7,0,1}));
	}

}
