
public class FixedPoint {
	
    public int fixedPoint(int[] A) {
        for(int i=0; i<A.length;i++) {
        	if(i==A[i])
        		return A[i];
        }
        return -1;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
