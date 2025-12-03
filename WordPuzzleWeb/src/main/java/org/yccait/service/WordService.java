
package org.yccait.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WordService {

    public static String pickWord() {
        List<String> list=List.of(
                "ABANDONED",
                "ADVENTURE",
                "CROCODILE",
                "BUTTERFLY",
                "VOLCANOES",
                "HAPPINESS",
                "DANGEROUS",
                "KNOWLEDGE",
                "CHARACTER",
                "MARKETING",
                "CONFIDENT",
                "MOTIVATOR",
                "CREATIVES",
                "BEAUTIFUL",
                "CHOCOLATE",
                "GARDENING",
                "EMPLOYEE",
                "INTERVIEW",
                "DELICIOUS",
                "SCIENTIST",
                "BLUEBERRY"
        );
        Random random=new Random();
        int index=random.nextInt(list.size());

        return list.get(index);
    }

    public static char[] shuffle(char[] arr) {
        Random random=new Random();
        for (int i=arr.length-1;i>0;i--) {
            int j=random.nextInt(i+1);
            char temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        return arr;
    }
}
