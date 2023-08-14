package java101;

import java.util.Scanner;

public class kombinasyonHesaplama {
    public static void main(String args[]){

        int n,r,kombinasyon=0,facN=1,facR=1,facN_R=1;
        Scanner input = new Scanner(System.in);

        System.out.println("please enter thr n and r value");
        n= input.nextInt();
        r= input.nextInt();

        for (int i=1; i<=n; i++){
            facN = facN * i;
        }

        for (int j=1; j<=r; j++){
            facR = facR * j;
        }

        for (int k=1; k<=n-r; k++){
            facN_R = facN_R * k;
        }

        kombinasyon = (facN) / (facR * facN_R);
        System.out.println(kombinasyon);
    }
}
