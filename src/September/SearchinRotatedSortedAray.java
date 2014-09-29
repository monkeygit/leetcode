package September;

public class SearchinRotatedSortedAray {
	
	public int search(int[] A, int target){
		int l = 0, r = A.length-1, m;
		while(l <= r){
			m = l + ((r - l)>>1);
			if(A[m] == target) return m;
			if(A[m] >= A[l]){
				if(target < A[m] && target >= A[l])
					r = m - 1;
				else 
					l = m + 1;
			}
			else{
				if(target > A[m] && target <= A[r])
					l = m + 1;
				else
					r = m - 1;
			}
		}
		
		return -1;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
