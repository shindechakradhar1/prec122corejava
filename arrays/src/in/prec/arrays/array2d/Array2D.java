package in.prec.arrays.array2d;

import java.util.Arrays;

public class Array2D {
	
	public static void main(String[] args) {
		int[][] array2D = new int[3][];
		
		array2D[0] = new int[] {1,2}; 
		array2D[1] = new int[] {1,2,4}; 
		array2D[2] = new int[] {1,2,4,8,9,0}; 
		
		System.out.println(Arrays.deepToString(array2D));
		
		for(int i=0;i<array2D.length;i++) 
			for(int j=0;j<array2D[i].length;j++)
				System.out.println(array2D[i][j]);
		
		for(int[] rows:array2D) {
			for(int col:rows)
				System.out.print(col);
			System.out.println();
		}
	}
}
