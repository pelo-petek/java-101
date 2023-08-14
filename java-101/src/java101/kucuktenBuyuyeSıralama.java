package java101;

import java.util.Scanner;

public class kucuktenBuyuyeSıralama {
    public static void main(String args[]){
        int n1, n2, n3;
        Scanner input = new Scanner(System.in);

        System.out.println("please enter the numbers");
        n1 = input.nextInt();
        n2 = input.nextInt();
        n3 = input.nextInt();

        if(n1>n2 && n1>n3){
            System.out.println(n1);
            if(n2>n3){
                System.out.println(n2);
                System.out.println(n3);
            }
            else{
                System.out.println(n3);
                System.out.println(n2);
            }
        }else if(n2>n3 && n2>n1) {
            System.out.println(n2);
            if (n1>n3){
                System.out.println(n1);
                System.out.println(n3);
            }else{
                System.out.println(n3);
                System.out.println(n1);
            }
        }else if(n3>n1 && n3>n2){
            System.out.println(n3);
            if (n1>n2){
                System.out.println(n1);
                System.out.println(n2);
            }else{
                System.out.println(n2);
                System.out.println(n1);
            }
        }
    }
}
