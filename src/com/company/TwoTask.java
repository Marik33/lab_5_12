package com.company;

public class TwoTask {

    public static void main(String[] args) {

        int array[] = new int[10];
        int i;
        for (i = 0; i < 10; i++) {
            array[i] = (int) Math.round(Math.random() * 19);
            System.out.print(array[i] + "|");
        }
        System.out.println();
        for (i = 0; i < 10; i++) {
            array[i] = (int) Math.round(Math.random() * 19);
            if (array[i] % 2 != 0)
                array[i] = 0;
            System.out.print(array[i] + "|");
        }
    }
}