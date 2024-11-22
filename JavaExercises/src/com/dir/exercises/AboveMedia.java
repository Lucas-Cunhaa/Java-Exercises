package com.dir.exercises;

import java.util.Scanner;

public class AboveMedia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] strNums = sc.nextLine().split(" ");

        int total = 0;
        for (String num : strNums) {
            total += Integer.parseInt(num);
        }

        float media = (float) total / strNums.length;
        String result = "";
        boolean first = true;

        for (int i = 0; i < strNums.length; i++) {
            if (Integer.parseInt(strNums[i]) > media) {
                if (first) {
                    result += strNums[i];
                    first = false;
                } else {
                    result += " " + strNums[i];
                }
            }
        }

        System.out.println(result);
        
        sc.close();
    }
}
