package com.company;

public class FirstTask {

    public static void main(String[] args) {

        int odd_numbers[] = new int[50];
        int i, j;

        for (i = 1, j = 0; i <= 99; i = i + 2, j++) {
            odd_numbers[j] = i;
        }
        System.out.println();
        for (i = 0; i < odd_numbers.length; i++)
            System.out.print(odd_numbers[i] + "|");
    }
}
