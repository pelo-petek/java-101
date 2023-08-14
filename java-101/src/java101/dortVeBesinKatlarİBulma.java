package java101;

import java.util.Scanner;

public class dortVeBesinKatlarİBulma {
    public static void main(String args[]){

        int num;
        Scanner input = new Scanner(System.in);

        System.out.println("please enter the number");
        num = input.nextInt();

        for (int i=1, j=1 ; j<num  ; i=i*4, j=j*5){
            System.out.println(i);
            System.out.println(j);
        }
    }
}
