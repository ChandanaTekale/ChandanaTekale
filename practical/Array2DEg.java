package com;

public class Array2DEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int arr[][] = {{1,2,},{4,5,},{7,8,}};
 
 //printing 2d array
 for(int i=0;i<3;i++) { //fetch row
	 for(int j=0;j<2;j++) { //fetch col
		 System.out.print(arr[i][j]);
		 
	 }
	 System.out.println();
 }
	}

}
