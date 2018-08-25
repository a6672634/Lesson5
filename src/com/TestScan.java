package com;

import java.util.Scanner;

public class TestScan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        int b;

        System.out.println();

        System.out.println("Введите целое число");
        a = scanner.nextInt();
        b = scanner.nextInt();
        System.out.println();
        if (a == b) {
            {
                System.out.println("равно");
            }
        } else {
            if (a>b)
                System.out.println("Больше");
        }
        System.out.println("не равны");

            /*
        int a = 3, b = 4;
        if ((a == b)&(a==b+35)){
            System.out.println("Выполнилась" + "секция if");
    }       else {
            System.out.println("Выполнила" + "секция else");
        }
        */
        /* Scanner scanner = new Scanner (System.in);
        int i = 99;
        System.out.println(i);
        System.out.println("Введите целое число");
        i = scanner.nextInt();
        System.out.println(i);*/
       /*
       int i = 1;
       int j = 3;
       float f = 3f;
       char ch ='3';
       boolean b = true;
        System.out.println(!((f==j)|!(ch==f)));*/

        /*Scanner scanner = new Scanner (System.in);
       int i = 1;
       int c =3;
        i = scanner.nextInt();
        c = scanner.nextInt();
        System.out.println(i);
        System.out.println(c==i);*/


    }
}

