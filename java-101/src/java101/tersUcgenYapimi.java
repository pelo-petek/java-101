package java101;

import java.util.Scanner;

public class tersUcgenYapimi {
    public static void main(String[] aargs){

        int number;
        Scanner input = new Scanner(System.in);

        System.out.println("please enter the number");
        number = input.nextInt();

        for (int i=number ; i<=number && i>=0; i--){
            for (int j=0; j<(number-i) ; j++){
                System.out.print(" ");
            }
            for (int k=0; k<(2*i + 1); k++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
