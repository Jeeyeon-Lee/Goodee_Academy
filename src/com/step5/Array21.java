package com.step5;

public class Array21 {

	public static void main(String[] args) {
		/*면이 존재하는 것처럼 코드 전개*/
		int is[][] = new int[2][3];
		is = new int [][] {{1,2,3},{4,5,6}};
		System.out.println(is.length);
		System.out.println(is[0].length);
		for(int x=0;x<is.length;x++) {
			for(int y=0;y<is[x].length;y++) {
				System.out.println("is["+x+"]"+"is["+y+"] : "+is[x][y]);
			}
				
		}
	}
}