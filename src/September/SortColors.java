package September;

public class SortColors {
	
	public void sortColors(int[] A){
		int[] counter = new int[3];
		for(int i=0; i<A.length; i++)
			counter[A[i]]++;
		for(int i=0; i<counter[0]; i++)
			A[i] = 0;
		for(int i=0; i<counter[1]; i++)
			A[i+counter[0]] = 1;
		for(int i=0; i<counter[2]; i++)
			A[i+counter[0]+counter[1]] = 2;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortColors test = new SortColors();
		int[] t = {0,1,2,0,2,1,0,0,2,1,0};
		test.sortColors(t);
		for(int i=0; i<t.length; i++)
			System.out.println(t[i]);
	}

}
