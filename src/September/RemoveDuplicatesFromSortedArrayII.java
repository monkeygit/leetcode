package September;

public class RemoveDuplicatesFromSortedArrayII {

	public int removeDuplicates(int[] A){
		int newLength = A.length;
		for(int i=0; i<newLength-2; ){
			if(A[i] == A[i+2]){
				for(int j=i+1; j<newLength-1; j++)
					A[j] = A[j+1];
				newLength--;
			}else i++;
		}

		return newLength;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoveDuplicatesFromSortedArrayII test = new RemoveDuplicatesFromSortedArrayII();
		int[] t = {0,0,0,0,0,1,1,1};
		System.out.println("Old Length: "+t.length);
		int nl = test.removeDuplicates(t);
		System.out.println("New Length: "+ nl);
		for(int i=0; i<nl; i++)
			System.out.print(t[i]+" ");
	}

}
