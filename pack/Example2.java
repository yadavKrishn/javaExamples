package com.pack;

public class Example2 {

	public static void main(String[] args) {
		int a8[]=new int[4];
		a8[0]=10;
		a8[1]=11;
		a8[2]=12;
		a8[3]=13;
		
		for(int i=0; i<a8.length; i++)
			System.out.println(a8[i]);
		System.out.println();
		for(int j:a8)
			System.out.println(j);
		
		int b[][]= {{1,2},{3,4}};  //correct
		
		//int b1[2][2]= {{1,2},{3,4}};
		int b1[][]=new int[2][2];
		int[][] b2=new int[2][2];
		int[] b3[]=new int[2][2];
		
		int b4[][]=new int[2][2];
		b4[0][0]=1; b4[0][1]=2;
		b4[1][0]=3; b4[1][1]=4;
		
		for(int i=0;i<b4.length;i++) {
			for(int j=0;j<b4.length;j++) {
				System.out.println(b4[i][j]);
			}
		}
		
		System.out.println();
		for(int c1[]:b4)
			for(int d1:c1)
				System.out.println(d1);

	
	}
}
