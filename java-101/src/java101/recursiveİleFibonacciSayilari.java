package java101;

import java.util.Scanner;

public class recursiveİleFibonacciSayilari {
    static  int fib(int n){
        if (n==1)
            return 1;
        if (n==2)
            return 2;
        return  fib(n-1) + fib(n-2);
    }

    public static void main(String[] args){

        int number;
        Scanner input= new Scanner(System.in);

        System.out.println("please enter a number for fibonacci series");
        number = input.nextInt();

        fib(number);

        System.out.println(fib(number));

    }
}
