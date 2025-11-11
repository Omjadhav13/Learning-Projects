package org.yccair.demo_project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class test {

	public static int nameLength(String name) {
		return name.length();
	}

	public static String randomWords(int length) {
		String randomwords=null;
		List <String> nameList=new ArrayList<String>();
		nameList.add("ABONDENED");
		nameList.add("Adventure");
		nameList.add("Crocodile");
		nameList.add("Butterfly");
		nameList.add("Volcanoes");
		nameList.add("Happiness");
		nameList.add("Dangerous");
		nameList.add("Knowledge");
		nameList.add("Character");
		nameList.add("Important");
		randomwords=nameList.get(length);

		return randomwords;
	}
	public static void displayMatrix(String s) {
		
		
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
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		String res=sc.next();
		String name;
	
		int choice=0;
		do {
			System.out.println("Word Puzzle");
			System.out.println("============");
			System.out.println("Enter your name");
			name=sc.next();
			String s= randomWords(nameLength(name));
			displayMatrix(s);
			if(res.equalsIgnoreCase(s)) {
				System.out.println("You won the game!....");
			}
			else {
				System.err.println("You Gussed wrong word");
				System.err.println("Try again");
			}
			
			
		}while(choice!= -1);
		
		
		
		
		
	}

}
