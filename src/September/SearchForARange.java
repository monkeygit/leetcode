package September;

public class SearchForARange {
	
	public int[] searchRange(int[] A, int target){

		int pos = binarySearch(A, target);
		if(pos == -1) return new int[]{-1,-1};
		int left = pos, right = pos;
		while(left >= 0 && A[left] == A[pos])
			left--;
		while(right < A.length && A[right] == A[pos])
			right++;
		return new int[]{left+1, right-1};
	}
	
	private int binarySearch(int[] A, int target){
		int l = 0, r = A.length-1;
		while(l <= r){
			int mid = (l + r) / 2;
			if(A[mid] == target)
				return mid;
			else if(A[mid] > target)
				r = mid - 1;
			else l = mid + 1;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		SearchForARange test = new SearchForARange();
		int[] a = {};
		int[] r = null;
		r = test.searchRange(a, 8);
		for(int i=0; i<r.length; i++)
			System.out.println(r[i]+" ");
	}

}
