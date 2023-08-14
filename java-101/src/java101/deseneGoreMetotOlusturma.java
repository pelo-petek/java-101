package java101;

import java.util.Scanner;

public class deseneGoreMetotOlusturma {

    static void function(int a){
        int number=1,total=0;
        for (int i=1; i<=a ; i++){
            if (a>0){
                total =- 5;
                System.out.println(total);
            }
            else {
                total = +5;
                System.out.println(total);
                break;
            }
        }
    }

    public static void main(String args[]){

        int N;
        Scanner input = new Scanner(System.in);

        System.out.println("please enter the N number");
        N = input.nextInt();

        function(N);

    }
}
