package java101;

import java.util.Scanner;

public class mukemmelSayiHesaplama {
    public static void main(String[] args){

        int number, total =0;
        Scanner input = new Scanner(System.in);

        System.out.println("please enter the number");
        number = input.nextInt();

        //mükemmel sayı kendine bölenlerin toplamı yine o sayıya eşit olması gerekir

        for (int i=1; i<number; i++){
            if(number % i == 0)
                total += i;
        }
        System.out.println(total);

        //girilen sayı ile bölenlerin toplamını karşılaştırıyoruz

        if(number == total){
            System.out.println("mükemmel sayıdır");
        }else
            System.out.println("mükemmel sayı değildir");
    }
}
