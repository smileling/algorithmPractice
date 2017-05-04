package algorithm;

public class RotateImage {
	
	public void rotate(int[][] matrix) {
        int len = matrix.length;
        if(len == 0|| len == 1)return;
		int[][] m = new int[len][len];
		
		for(int i = 0; i < len; i++){
			for(int j = 0; j < len; j++){
				m[i][j] = matrix[len-j-1][i];
			}
		}
		
		for(int i = 0; i < len; i++){
			for(int j = 0; j < len; j++) {
				matrix[i][j] = m[i][j];
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int[][] m = new int[20][30];
//		System.out.print(m.length);

	}

}
