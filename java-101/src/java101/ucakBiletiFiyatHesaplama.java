package java101;

import java.util.Scanner;

public class ucakBiletiFiyatHesaplama {
    public static void main(String args[]){
        double mesafe, yas, fiyat = 0,indirimliFiyat;
        int yolculukTipi;

        Scanner input = new Scanner(System.in);
        Scanner input1 = new Scanner(System.in);

        System.out.println("lütfen mesafe(km), yaşınızı ve yolculuk tipinizi, 1-tek-gidiş veya 2-gidiş-geliş olarak yazınız ");
        mesafe = input.nextDouble();
        yas = input.nextDouble();
        yolculukTipi = input1.nextInt();

        if(yolculukTipi == 1){
            fiyat = mesafe * 0.10;
            System.out.println("normal fiyat");
            System.out.println(fiyat);
        }
        else if(yolculukTipi == 2) {
            fiyat = (mesafe * 0.10 * 2);
            fiyat = fiyat - (fiyat * 0.20);
            System.out.println("normal fiyat");
            System.out.println(fiyat);
        }
        else {
            System.out.println("hatalı veri girdiniz");
        }

        if(yas<12){
            indirimliFiyat = fiyat - (fiyat * 0.50);
            System.out.println("indirimli fiyatınız");
            System.out.println(indirimliFiyat);
        }else if(yas>=12 && yas<24){
            indirimliFiyat = fiyat - (fiyat * 0.10);
            System.out.println("indirimli fiyatınız");
            System.out.println(indirimliFiyat);
        }
        else if(yas>65){
            indirimliFiyat = fiyat - (fiyat * 0.30);
            System.out.println("indirimli fiyatınız");
            System.out.println(indirimliFiyat);
        }
    }
}
