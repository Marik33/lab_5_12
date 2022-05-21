package com.company;

public class FiveTask {

    public static void main(String[] args) {

        int array[] = new int[15];
        int i;
        int n = 0;

        for (i = 0; i < array.length; i++) {
            array[i] = (int) Math.round(Math.random() * 10);
            System.out.print(array[i] + "|");
        }
        System.out.println();
        for (i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) n = n + 1;
        }
        System.out.print("Парних чисел: " + n);

    }
}