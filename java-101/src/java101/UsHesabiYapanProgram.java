package java101;

import java.util.Scanner;

public class UsHesabiYapanProgram {

    static void basePower(int x, int y){
        int total = 1;
        for (int i=0; i<y; i++){
            total *= x;
        }
        System.out.println(total);
    }
    public static void main(String args[]){

        int base, power;
        Scanner input = new Scanner(System.in);

        System.out.println("please enter the base number");
        base = input.nextInt();

        System.out.println("please enter the power number");
        power = input.nextInt();

        basePower(base,power);

    }
}
