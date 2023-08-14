package java101;

import java.util.Scanner;

public class tekSayilarınToplaminiHesaplama {
    public static void main(String args[]){

        int num,count=0;
        Scanner input = new Scanner(System.in);

        System.out.println("please enter a number");
        num = input.nextInt();

        for(int i=0; i<num ; i++){
            if (i%3==0){
                count+=i;
            }
        }
        System.out.println(count);
    }
}
