/**
 * 
 */
package com.rakesh.matrix.bo;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * @author Rakesh KR
 * @since  August 19th 13:17 2k17
 */
public class MatrixUtils {
	
	public int m;
	public int n;
	public int[][] matrix;
	
	public void makeMartix(){
		
		Scanner sc = new Scanner(System.in);
		
		try{
			System.out.println("Size Of Matrix (mxn) : ");
			n = sc.nextInt();
			m = sc.nextInt();
			matrix = new int[n][m];
		//	System.out.println("Enter the details to matrix : ");
			int    max    = 99;
			int    min    = -99;
			Random random = new Random();
			for(int i=0; i<n; i++){
				for(int j=0; j<m; j++){
		//			matrix[i][j] = sc.nextInt();
					matrix[i][j] = random.nextInt(max + 1 -min) + min; 
				}
			}
		} catch(Exception e){
			e.printStackTrace();
		} finally{
			sc.close();
		}
		
	}
	
	public void printMatrix(){
		
		try{
			System.out.print("The matrix is : \n");
			for(int i=0; i<n; i++){
				for(int j=0; j<m; j++){
					System.out.print(" "+matrix[i][j]+" ");
				}
				System.out.print("\n");
			}
			System.out.print("\n");
		} catch(Exception e){
			e.printStackTrace();
		} finally{
			
		}
		
	}
	
	public void sortRowMatrix(){
		
		try{
			for(int i=0; i<matrix.length; i++){
				Arrays.sort(matrix[i]);
			}
		} catch(Exception e){
			e.printStackTrace();
		} finally{
			
		}
		
	}
	
	public void transpose(){
	    for (int i = 0; i < matrix.length; i++) {
	        for (int j = i; j < matrix[0].length; j++) {
	            int tmp1 = matrix[i][j];
	            int tmp2 = matrix[j][i];
	            matrix[j][i] = tmp1;
	            matrix[i][j] = tmp2;
	        }
	    }
	}
	
	public int countNegativeNumbersNormal(){
		
		int count = 0;
		
		try{
			for(int i=0; i<n; i++){
				for(int j=0; j<m; j++){
					if(matrix[i][j]<0){
						count ++;
					}
				}
			}
		} catch(Exception e){
			e.printStackTrace();
		} finally{
			
		}
		
		return count;
	}
	
	public int countNegativeNumbersOptimized(){
		
		int count = 0;
		
		try{
			int i = 0;
			int j = m-1;
			while(j>=0 && i<n){
				if(matrix[i][j]<0){
					count+=(j+1);
					i+=1;
				} else{
					j-=1;
				}
			}
		} catch(Exception e){
			e.printStackTrace();
		} finally{
			
		}
		
		return count;
	}
	
}
