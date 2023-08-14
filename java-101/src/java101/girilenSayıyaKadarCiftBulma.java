package java101;

import java.util.Scanner;

public class girilenSayıyaKadarCiftBulma {
    public static void main(String args[]){

        int num;
        Scanner input= new Scanner(System.in);

        System.out.println("please enter the number");
        num= input.nextInt();

        for(int i=0; i<num ; num--){
            if(num%2==0){
                System.out.println(num);
            }

        }
    }
}
