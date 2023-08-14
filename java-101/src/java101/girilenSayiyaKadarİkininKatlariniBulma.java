package java101;

import java.util.Scanner;

public class girilenSayiyaKadarİkininKatlariniBulma {
    public static void main(String args[]){

        int num,count=0;
        Scanner input = new Scanner(System.in);

        System.out.println("please enter the number");
        num = input.nextInt();

        for (int i=1; i<num ; i=i*2){
            if(i%2==0   ){
                System.out.println(i);
            }
        }
    }
}
