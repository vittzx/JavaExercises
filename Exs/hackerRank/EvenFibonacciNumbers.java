package Exs.hackerRank;

// Even Fibonacci Numbers
// https://www.hackerrank.com/contests/projecteuler/challenges/euler002/problem?isFullScreen=true

import java.util.Scanner;

public class EvenFibonacciNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Numero de vezes:");
        int n = input.nextInt();
        for(int i = 0; i < n; i++){
            System.out.println("Soma dos numeros impares.");
            long n_o = input.nextLong();
            int num1 = 1; int num2 = 1; 
            int k =0;
            while (num1 < n_o && k < n_o){
                if(num1 % 2 == 0 && k + num1 <= n_o){
                    k += num1;
                }
                int aux = num1;
                num1 += num2;
                num2 = aux;
            } 
            System.out.println(k);
        }
        input.close();
    }

    
}
