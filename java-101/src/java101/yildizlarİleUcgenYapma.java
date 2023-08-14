package java101;

import java.util.Scanner;

public class yildizlarİleUcgenYapma {
    public static void main(String args[]){

        int n;
        Scanner input = new Scanner(System.in);

        System.out.println("please enter n");
        n = input.nextInt();

        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for (int a=1; a<=n; a++){
            for (int b=1 ; b<= (a+1 ); b++){
                System.out.print(" ");
            }
            for (int c=1; c<=(2*n- 1) ; n--){  // 7 5 3 1
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
