package com;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int ar[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
//        int ar[4][4] =

        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                ar[i][j] = sc.nextInt();
            }
        }

        System.out.println();

        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < i+1; j++) {
//                System.out.print(ar[i][j]+" ");

            if(i+j == j ){
                System.out.print(ar[j][i]);
            }

            }
        }

    }
}
