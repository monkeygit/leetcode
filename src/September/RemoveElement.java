package September;

public class RemoveElement {
	
	public int removeElement(int[] A, int elem){
		int l = A.length;
		for(int i=0; i<l; i++)
			if(A[i] == elem){
				for(int j=i; j<l-1; j++)
					A[j] = A[j+1];
				l--;
				i--;
			}
		return l;
	}
	
	/*Faster*/
	public int removeElementV2(int[] A, int elem){
		int i=0;
		int n = A.length;
		while(i < n){
			if(A[i] == elem){
				A[i] = A[n-1];
				n--;
			}
			else
				i++;
		}
		
		return n;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoveElement re = new RemoveElement();
		int[] a = new int[]{1,2,2,2};
		int newLength = re.removeElement(a, 3);
		System.out.println(newLength);
		for(int i=0; i<newLength; i++)
			System.out.print(a[i]+" ");
	}

}
