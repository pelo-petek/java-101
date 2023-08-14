package java101;

import java.util.Scanner;

public class kdvTutaruHesaplama {
    public static void main(String args[]){
        double kdvsiz_fiyat,kdvli_fiyat;
        double kdv_tutarı;
        Scanner a= new Scanner(System.in);

        System.out.println("please enter the payment without kdv");
        kdvsiz_fiyat = a.nextDouble();

        if(kdvsiz_fiyat < 1000){
            kdv_tutarı = 0.18;
        }
        else{
            kdv_tutarı = 0.08;
        }

        kdvli_fiyat = kdvsiz_fiyat + (kdvsiz_fiyat * kdv_tutarı);

        System.out.println( kdvli_fiyat);
    }
}
