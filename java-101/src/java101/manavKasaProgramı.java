package java101;

import java.util.Scanner;

public class manavKasaProgramı {
    public static void main(String args[]) {
        double  tutar, armut, kgArmut= 1, elma, kgElma= 1, domates, kgDomates= 1, muz, kgMuz= 1, patlıcan, kgPatlican= 1 ;
        Scanner input = new Scanner(System.in);

        System.out.println("armut için istediğiniz kg tutarını giriniz");
        kgArmut = input.nextDouble();
        armut = kgArmut * 2.14;

        System.out.println("elma için istediğiniz kg tutarını giriniz");
        kgElma = input.nextDouble();
        elma = kgElma * 3.67;

        System.out.println("domates için istediğiniz kg tutarının giriniz");
        kgDomates = input.nextDouble();
        domates = kgDomates * 1.11;

        System.out.println("domates için istediğiniz kg tutarının giriniz");
        kgMuz = input.nextDouble();
        muz = kgMuz * 0.95;

        System.out.println("domates için istediğiniz kg tutarının giriniz");
        kgPatlican = input.nextDouble();
        patlıcan = kgPatlican * 5.00;

        double total = armut + elma+ domates + muz + patlıcan;

        System.out.println("armutun fiyatı: "+ armut);
        System.out.println("elmanın fiyatı: "+ elma);
        System.out.println("domatesin fiyatı: "+ domates);
        System.out.println("muzun fiyatı: "+ muz);
        System.out.println("patlıcanın fiyatı: "+ patlıcan);
        System.out.println("toplam tutar: "+ total);

    }
}