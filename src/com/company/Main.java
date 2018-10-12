package com.company;

import java.util.Scanner;

public class Main {
    public static Scanner input = new Scanner(System.in);
    public static int SumN(int num)
    {
        int sum = 0;
        for(int i = 1; i <= num; i++)
        {
            sum += i;
        }
        return sum;
    }
    public static void main(String[] args) {
        int n;
        System.out.print("Type in an integer: ");
        n = input.nextInt();
        System.out.println("The sum from 1 to "+n+" is "+SumN(n));
    }
}
