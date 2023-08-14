package java101;

import java.util.Scanner;

public class cinZodyagıHesaplama {
    public static void main(String args[]){

        int year,cinZodyagı;
        Scanner input = new Scanner(System.in);

        System.out.println("please enter your birth year");
        year = input.nextInt();

        cinZodyagı = year % 12 ;

        switch (cinZodyagı){
            case 0:
                System.out.println("çin zodyağı burcunuz: ");
                System.out.println("maymun");
                break;
            case 1:
                System.out.println("çin zodyağı burcunuz: ");
                System.out.println("horoz");
                break;
            case 2:
                System.out.println("çin zodyağı burcunuz: ");
                System.out.println("kopek");
                break;
            case 3:
                System.out.println("çin zodyağı burcunuz: ");
                System.out.println("domuz");
                break;
            case 4:
                System.out.println("çin zodyağı burcunuz: ");
                System.out.println("fare");
                break;
            case 5:
                System.out.println("çin zodyağı burcunuz: ");
                System.out.println("öküz");
                break;
            case 6:
                System.out.println("çin zodyağı burcunuz: ");
                System.out.println("kaplan");
                break;
            case 7:
                System.out.println("çin zodyağı burcunuz: ");
                System.out.println("tavşan");
                break;
            case 8:
                System.out.println("çin zodyağı burcunuz: ");
                System.out.println("ejderha");
                break;
            case 9:
                System.out.println("çin zodyağı burcunuz: ");
                System.out.println("yılan");
                break;
            case 10:
                System.out.println("çin zodyağı burcunuz: ");
                System.out.println("at");
                break;
            case 11:
                System.out.println("çin zodyağı burcunuz: ");
                System.out.println("koyun");
                break;
        }
    }
}
