package September;

public class Search2DMatrix {
	
	public boolean searchMatrix(int[][] matrix, int target){
		if(matrix.length == 0) return false;
		int i = 0;
		int j = matrix[0].length-1;
		while(i < matrix.length && j >= 0){
			if(matrix[i][j] == target)
				return true;
			else if(matrix[i][j] < target) i++;
			else j--;
		}
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = {};
		Search2DMatrix test = new Search2DMatrix();
		System.out.println(test.searchMatrix(a, 1));
	}

}
