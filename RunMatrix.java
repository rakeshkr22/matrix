/**
 * 
 */
package com.rakesh.matrix.bo;

/**
 * @author Rakesh KR
 * @since  August 19th 13:15 2k17
 */
public class RunMatrix {

	public static void main(String[] args) {
		
		MatrixUtils matrixUtils = new MatrixUtils();
		
		try{
			
			System.out.println("------ Matrix ------");
			
			matrixUtils.makeMartix();
		//	matrixUtils.printMatrix();
			
			matrixUtils.sortRowMatrix();
			matrixUtils.transpose();
			matrixUtils.sortRowMatrix();
			matrixUtils.transpose(); 
		//	matrixUtils.printMatrix();
			
			long t1 = System.currentTimeMillis();
			System.out.println("NegativeNumbers Count Normal    Way : "+matrixUtils.countNegativeNumbersNormal());
			long t2 = System.currentTimeMillis();
			System.out.println("Time for Normal Way :"+(t2-t1));
			t1 = System.currentTimeMillis();
			System.out.println("NegativeNumbers Count Optimized Way : "+matrixUtils.countNegativeNumbersOptimized());
			t2 = System.currentTimeMillis();
			System.out.println("Time for Optimized Way :"+(t2-t1));
			
		} catch(Exception e){
			e.printStackTrace();
		} finally{
			matrixUtils = null;
		}

	}

}
