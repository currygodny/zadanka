package com.company;

import java.util.Scanner;



public class Main {

    public static int add(int a, int b){
        return a + b;
    }

    public static int substract(int a, int b){
        return a - b;
    }

    public static int multipy(int a, int b){
        return a * b;
    }

    public static int divide(int a, int b){
        return a / b;
    }

    public static int modulo(int a, int b){
        return a % b;
    }

    public static int count(char sign, int a, int b){
        int out = 0;
        if (sign == '+')
            out = add(a,b);
        if (sign == '-')
            out = substract(a,b);
        if (sign == '*')
            out = multipy(a,b);
        if (sign == '/')
            out = divide(a,b);
        if (sign == '%')
            out = modulo(a,b);
        return out;
    }


    public static void main(String[] args) {
        Scanner getFromKeyboard = new Scanner(System.in);
        char sign;
        int a;
        int b;

        while (getFromKeyboard.hasNext()){
            sign = getFromKeyboard.next().charAt(0);
            a = getFromKeyboard.nextInt();
            b = getFromKeyboard.nextInt();

            System.out.println(count(sign,a,b));
        }
    }
}
