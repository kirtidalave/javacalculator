package com.harmanBatch;

import java.util.Scanner;

public class Calculator {


    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int n1, n2, result;
        System.out.println("Enter num1");
        n1 = input.nextInt();
        System.out.println("Enter num2");
        n2 = input.nextInt();
        result=n1+n2;
        System.out.println(result);
    }
}

