package September;

import java.util.ArrayList;
import java.util.List;

public class SetMatrixZeros {
    public void setZeroes(int[][] matrix) {
        List<Integer> x = new ArrayList<Integer>();
              
        for(int i=0; i<matrix.length; i++){
        	boolean hasZero = false;
        	for(int j=0; j<matrix[0].length; j++){
        		if(matrix[i][j] == 0){ 
        			hasZero = true;
        			if(!x.contains(Integer.valueOf(j))) x.add(Integer.valueOf(j));
        		}
        	}
        	
        	for(int l=0; l<x.size(); l++)
        		System.out.print(x.get(l)+" ");
        	System.out.println();
        	
        	if(hasZero)
        		for(int k=0; k<matrix[0].length; k++)
        			matrix[i][k] = 0;
        }
        
        for(int i=0; i<x.size(); i++)
        	for(int k=0; k<matrix.length; k++)
        		matrix[k][x.get(i)] = 0;
    }
    
    
    public void print(int[][] m){
    	for(int i=0; i<m.length; i++){
    		for(int j=0; j<m[0].length; j++)
    			System.out.print(m[i][j]+" ");
    		System.out.println();
    	}
    	
    }
    
    public static void main(String[] args){
    	int[][] m = {{0,1,1,1},{1,1,1,1},{1,1,1,0}};
    	SetMatrixZeros test = new SetMatrixZeros();
    	test.print(m);
    	test.setZeroes(m);
    	test.print(m);
    }
}
