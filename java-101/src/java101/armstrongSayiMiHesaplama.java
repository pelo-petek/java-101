package java101;

import java.util.Scanner;

public class armstrongSayiMiHesaplama {
    public static void main(String args[]){

        int number,count=0, total=0,basamak=0, power=1;

        Scanner input = new Scanner(System.in);

        System.out.println("please enter your number");
        number = input.nextInt();

        int tempNumber = number;
        int tempNumber2 = number;

       //basamak sayısını hesaplama
        for (int i=0; number%10!=0 ;number /= 10 ){
            count++;
        }

        for (int j= 0; tempNumber!=0 ; tempNumber /=10){
            basamak = tempNumber % 10;
            for (int k=1; k<=count ;k++ ){
                power = power * basamak;
            }

            total  += power;
            power=1;

        }

        System.out.println(total);

        if(tempNumber2 == total){
            System.out.println("Armstrong sayısıdır");
        }
        else
            System.out.println("armstrong sayısı değildir");
    }
}
