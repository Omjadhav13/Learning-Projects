package org.yccait.demo_projects;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Test {

    public static int nameLength(String name) {
        return name.length();
    }

    public static char[] fisherYates(char[] arr) {
        Random random = new Random();
        for (int i = arr.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        return arr;
    }

    public static String randomWords(int length) {
    	String randomwords=null;
        List<String> nameList = new ArrayList<>();
        nameList.add("ABANDONED");  
        nameList.add("ADVENTURE");
        nameList.add("CROCODILE");
        nameList.add("BUTTERFLY");
        nameList.add("VOLCANOES");
        nameList.add("HAPPINESS");
        nameList.add("DANGEROUS");
        nameList.add("KNOWLEDGE");
        nameList.add("CHARACTER");
        nameList.add("MARKETING");
        randomwords=nameList.get(length);

		return randomwords;

    }

    public static void displayMatrix(String s) {
  
        s = s.toUpperCase();


        if (s.length() != 9) {
            System.out.println("Internal error: selected word is not 9 letters: " + s + " (length=" + s.length() + ")");
            return;
        }

        char[] arr = s.toCharArray();
        arr = fisherYates(arr);

        String[][] st = new String[3][3];
        int k = 0;

        // Fill matrix using shuffled chars
        for (int i = 0; i < st.length; i++) {
            for (int j = 0; j < st[i].length; j++) {
                st[i][j] = String.valueOf(arr[k]);
                k++;
            }
        }

       
        for (int i = 0; i < st.length; i++) {
            for (int j = 0; j < st[i].length; j++) {
                System.out.print(st[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Word Puzzle");
        System.out.println("============");
        System.out.println("Enter your name (max 10 letters recommended):");
        String name = sc.next();
        String s = randomWords(nameLength(name));

        
        while (true) {
            displayMatrix(s);
            System.out.println("Enter your guess (type the full word):");
            String res = sc.next();

            if (res.equalsIgnoreCase(s)) {
                System.out.println("You won the game!....");
                break;
            } else {
                System.err.println("You guessed the wrong word. Try again.");
            }
        }

        sc.close();
    }
}
