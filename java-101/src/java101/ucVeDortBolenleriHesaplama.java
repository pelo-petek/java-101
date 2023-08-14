package java101;

import java.util.Scanner;

public class ucVeDortBolenleriHesaplama {
    public static void main(String args[]){

        int num,avg=0,count=0;
        Scanner input = new Scanner(System.in);

        System.out.println("please enter the number");
        num = input.nextInt();

        for (int i=0; i<num; num--){
            if(num % 3==0 && num%4==0){
                avg+= num;
                count++ ;

            }
        }
        avg/=count;
        System.out.println(avg);
    }
}
