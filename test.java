package org.yccair.demo_project;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="ABONDENED";
		
		String[][] st=new String [3][3];
		
		int k=0;
		
		for(int i=0;i<st.length;i++) {
			for(int j=0;j<st.length;j++) {
				
				st[i][j]= String.valueOf(s.charAt(k));
				k++;
			}
		}
		
		for(int i=0;i<st.length;i++) {
			for(int j=0;j<st.length;j++) {
				System.out.print(st[i][j]+" ");
			}
			System.out.println();
		}
		
		
		Scanner sc=new Scanner(System.in);
		String res=sc.next();
		if(res.equalsIgnoreCase(s)) {
			System.out.println("won");
		}
	}

}
