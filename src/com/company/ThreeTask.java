package com.company;

public class ThreeTask {

    public static void main(String[] args) {

        int array_one[] = new int[5];
        int array_two[] = new int[5];
        int array_three[] = new int[5];
        int i;
        double mid1 = 0 , mid2 = 0, mid3 = 0;

        for (i = 0; i < 5; i++) {
            array_one[i] = (int)Math.round(Math.random() * 5);
            mid1 = mid1 + array_one[i];
            System.out.print(array_one[i] + "|");
        }
        System.out.println();
        for (i = 0; i < 5; i++) {
            array_two[i] = (int) Math.round(Math.random() * 5);
            mid2 = mid2 + array_two[i];
            System.out.print(array_two[i] + "|");
        }
        System.out.println();
        for (i = 0; i < 5; i++) {
            array_three[i] = (int) Math.round(Math.random() * 5);
            mid3 = mid3 + array_three[i];
            System.out.print(array_three[i] + "|");
        }
        System.out.println();
        System.out.println(mid1 / 5);
        System.out.println(mid2 / 5);
        System.out.println(mid3 / 5);

        if (mid1 > mid2 && mid1 > mid3) System.out.println("mid1 > mid2 and  mid1 > mid3");
        else if (mid2 > mid1 && mid2 > mid3) System.out.println("mid2 > mid1 and mid2 > mid3");
        else if (mid3 > mid1 && mid3 > mid2) System.out.println("mid3 > mid1 and mid3 > mid2");
        else if (mid1 == mid2 && mid1 > mid3) System.out.println("mid1 = mid2, mid1 and mid2 > mid3");
        else if (mid1 == mid3 && mid1 > mid2) System.out.println("mid1 = mid3, mid1 and mid3 > mid2");
        else if (mid2 == mid3 && mid2 > mid1) System.out.println("mid2 = mid3, mid2 and mid3 > mid1");
        else if (mid1 == mid2 && mid1 == mid3 && mid2 == mid3) System.out.println("mid1 == mid2 == mid3");


    }
}