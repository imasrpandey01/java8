package org.example.STREAMS;

import java.util.Scanner;

@FunctionalInterface
interface Calci{
    int square(int x);
}

public abstract class CalculationsByFuncInterface implements Calci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        Calci c = (i) -> i*i;
        int result=c.square(number);
        System.out.println(result);
        }


    }



