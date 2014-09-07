package September;

public class RotateImage {
	
	/*not in-place*/
	public void rotate(int[][] matrix){
		int[][] newMatrix = new int[matrix.length][matrix.length];
		for(int i=0; i<matrix.length; i++)
			for(int j=0; j<matrix.length; j++)
				newMatrix[i][j] = matrix[i][j];
		for(int i=0; i<matrix.length; i++)
			for(int j=0; j<matrix.length; j++)
				matrix[j][matrix.length-1-i] = newMatrix[i][j];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] t = {{0}};
		RotateImage test = new RotateImage();
		for(int i=0; i<t.length; i++){
			for(int j=0; j<t.length; j++)
				System.out.print(t[i][j]);
			System.out.println();
		}
		test.rotate(t);
		for(int i=0; i<t.length; i++){
			for(int j=0; j<t.length; j++)
				System.out.print(t[i][j]);
			System.out.println();
		}
	}

}
