package java101;

import java.util.Scanner;

public class harmonikSayilariBulanProgram {
    public static void main(String args[]){

        int number;
        double result = 0.0;
        Scanner input = new Scanner(System.in);

        System.out.println("please enter the number ");
        number = input.nextInt();

        for (double i=1; i<=number ; i++){
            result +=  (1/i);
        }
        System.out.println(result);
    }
}
