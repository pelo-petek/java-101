package java101;

import java.util.Scanner;

public class girilenSayilardaMinVeMaxBulma {
    public static void main(String args[]){

        int N;
        Scanner input = new Scanner(System.in);

        System.out.println("please enter how many number do you want to enter");
        N = input.nextInt();

        for (int i=1; i<=N ; i++){
            System.out.println("sayıyı giriniz");
        }
    }
}
