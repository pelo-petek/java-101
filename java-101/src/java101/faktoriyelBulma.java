package java101;

import java.util.Scanner;

public class faktoriyelBulma {
    public static void main(String args[]){

        int num, factorial=1;
        Scanner input = new Scanner(System.in);

        System.out.println("please enter the number to find the factorial");
        num = input.nextInt();

        for (int i=1 ;i<=num ; i++ ){
            factorial = factorial * i;
        }
        System.out.println(factorial);
    }
}
