package java101;

import java.util.Scanner;

public class fibonacciSerisiHesaplama {
    public static void main(String[] args ){

        int number, total=0,n1= 0, n2= 1,n3;
        Scanner input= new Scanner(System.in);

        System.out.println("please enter the number");
        number= input.nextInt();

        System.out.print("Fibonacci Series are: "+ n1 + " " + n2 );

        for (int i=2; i<number; i++){
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }
        System.out.println();
    }
}

