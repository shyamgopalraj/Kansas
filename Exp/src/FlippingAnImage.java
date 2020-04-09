
public class FlippingAnImage {
	
    public int[][] flipAndInvertImage(int[][] A) {
    	return invert(flip(A));
    }
    
    public int[][] invert(int[][] A) {
        int length = A.length;
        //row
        for(int i=0;i<length;i++) {
        	//col
        	for(int j=0;j<A[0].length;j++) {
        		if(A[i][j] == 0) {
        			A[i][j] = 1;
        		}
        		else
        			A[i][j] = 0;
        	}
        }
        
       return A;
	}

	public int[][] flip(int[][] A) {
        int length = A.length;
        //row
        for(int i=0;i<length;i++) {
        	//col
        	for(int j=0;j<(A[0].length/2);j++) {
        		int end = A[0].length-1-j;
        		int start = j;
        		swap(A, start, end, i);
        	}
        }
        return A;
        
    }

	public void swap(int[][] a, int start, int end, int row) {
		int temp = a[row][start];
		a[row][start] = a[row][end];
		a[row][end] = temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FlippingAnImage flippingAnImage = new FlippingAnImage();
		int[][] A = new int[][]{{1,1,0},{1,0,1},{0,0,0}};
		int[][] result = flippingAnImage.flipAndInvertImage(A);
        for(int i=0;i<result.length;i++) {
        	for(int j=0;j<result.length;j++) {
        		System.out.print(A[i][j]+",");
        	}
        	System.out.println();
        }
	}

}
