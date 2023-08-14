package java101;

import java.util.Scanner;

public class artikYilHesaplama {
    public static void main(String args[]){

        int year,hesaplama;
        Scanner input = new Scanner(System.in);

        System.out.println("please enter the year:");
        year = input.nextInt();

        if(year % 4 == 0 && year % 400 == 0){
            System.out.println(year);
            System.out.println("bir artık yıldır");
        }else if(year%4 == 0 && year % 100 !=0 ) {
            System.out.println(year);
            System.out.println("bir artık yıldır");
        }
        else if(year % 100 == 0 && year % 4 == 0 ){
            System.out.println(year);
            System.out.println("bir artık yıl değildir");
        }else {
            System.out.println(year);
            System.out.println("bir artık yıl değildir");
        }
    }
}
