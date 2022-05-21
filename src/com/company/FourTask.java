package com.company;

public class FourTask {

    public static void main(String[] args) {

        int array_one[] = new int[10];
        int array_two[] = new int[10];
        int array_three[] = new int[10];
        int i;

        for (i = 0; i < array_one.length; i++) {
            array_one[i] = (int) Math.round(Math.random() * 10);
            System.out.print(array_one[i] + "|");
        }
        System.out.println();
        for (i = 0; i < array_two.length; i++) {
            array_two[i] = (int) Math.round(Math.random() * 10);
            System.out.print(array_two[i] + "|");
        }
        System.out.println();
        for (i = 0; i < array_three.length; i++) {
            array_three[i] = array_one[i] + array_two[i];
            System.out.print(array_three[i] + "|");
        }
    }
}
