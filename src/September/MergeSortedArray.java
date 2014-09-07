package September;

import java.util.LinkedList;

public class MergeSortedArray {
	
	public void merge(int[] A, int m, int[] B, int n){
		int[] tmp = new int[A.length];
		int pA = 0, pB = 0, pT = 0;
		while(pA < m && pB < n){
			if(A[pA] < B[pB]){
				tmp[pT] = A[pA];
				pA++;
			}
			else{
				tmp[pT] = B[pB];
				pB++;
			}
			pT++;
		}
		if(pA == m){
			while(pB < n){
				tmp[pT] = B[pB];
				pB++;
				pT++;
			}
		}
		if(pB == n){
			while(pA < m){
				tmp[pT] = A[pA];
				pA++;
				pT++;
			}
		}
		for(int i=0; i<tmp.length; i++)
			A[i] = tmp[i];
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MergeSortedArray test = new MergeSortedArray();
		int[] a = new int[9];
		int[] b = new int[4];
		a[0] = 1;
		a[1] = 3;
		a[2] = 5;
		a[3] = 7;
		a[4] = 9;
		b[0] = 2;
		b[1] = 4;
		b[2] = 6;
		b[3] = 8;
		test.merge(a, 5, b, 4);
		for(int i=0; i<a.length; i++)
			System.out.print(a[i]+" ");
		
	}

}
