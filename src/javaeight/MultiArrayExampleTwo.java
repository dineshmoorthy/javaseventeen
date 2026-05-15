package javaeight;

import java.util.Arrays;

public class MultiArrayExampleTwo {
	    public static void main(String[] args) {
	        int[][] jagged = new int[3][];
	        jagged[0] = new int[] {1, 2};
	        jagged[1] = new int[] {3, 4, 5};
	        jagged[2] = new int[] {6};

	        for (int i = 0; i < jagged.length; i++) {
	            for (int j = 0; j < jagged[i].length; j++) {
	                System.out.print(jagged[i][j] + " ");
	            }
	            System.out.println();
	        }
	        
	        // part 2
	        
	        int[][] a = {{1, 2, 3}, {4, 5, 6}};
	        int[][] b = {{7, 8, 9}, {10, 11, 12}};

            System.out.print("Print a: "+Arrays.toString(a));

            
	        int[][] sum = new int[2][3]; // same size as a and b

	        for (int i = 0; i < a.length; i++) {
	            for (int j = 0; j < a[i].length; j++) {
	                sum[i][j] = a[i][j] + b[i][j];
	            }
	        }

	        // Print result
	        for (int[] row : sum) {
	            for (int val : row) {
	                System.out.print(val + " ");
	            }
	            System.out.println();
	        }
	        
	        
	        // 3d array
	        
	        int[][][] cube = {
	                { {1, 2}, {3, 4} },
	                { {5, 6}, {7, 8} }
	            };

	            for (int i = 0; i < cube.length; i++) {
	                for (int j = 0; j < cube[i].length; j++) {
	                    for (int k = 0; k < cube[i][j].length; k++) {
	                        System.out.print(cube[i][j][k] + " ");
	                    }
	                    System.out.println();
	                }
	                System.out.println("------");
	            }
	    }
	}
