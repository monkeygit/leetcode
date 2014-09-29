package September;

public class SetMatrixZeros {
	
	public void setZeroes(int[][] matrix){
		for(int i=0; i<matrix.length; i++)
			for(int j=0; j<matrix[0].length; j++)
				if(matrix[i][j] == 0){
					for(int k=0; k<matrix[0].length; k++)
						matrix[i][k] = 0;
					for(int l=0; l<matrix.length; l++)
						matrix[l][j] = 0;
					
				}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
