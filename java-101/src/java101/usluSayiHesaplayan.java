package java101;

import java.util.Scanner;

public class usluSayiHesaplayan {
    public static void main(String args[]){

        int number,power,formul=1;
        Scanner input = new Scanner(System.in);

        System.out.println("please enter number and power of it");
        number = input.nextInt();
        power = input.nextInt();

        for (int i=1 ; i<= power ; i++){
            formul = formul*number;
        }
        System.out.println(formul);
    }
}
