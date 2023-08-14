package java101;

import java.util.Scanner;

public class vucutKitleEndeksiHesaplama {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        double boy,kilo,vucutKitle;
        System.out.println("please enter boy, kilo");
        boy = input.nextDouble();
        kilo = input.nextDouble();

        vucutKitle =  kilo / (boy *boy);
        System.out.println("vucut kitle endeksiniz :");
        System.out.println(vucutKitle);
    }
}
