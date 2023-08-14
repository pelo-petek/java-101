package java101;

public class birİleYüzArasindaAsalSayiBulma {
    public static void main(String[] args){

        int sayac, kontrol=0;
        System.out.println("1 ile 100 arasındaki asal sayılar");

        for (int number=2 ; number<=100 ; number++){
            sayac= 0;
            for (int i=2 ; i<number ; i++){
                if(number % i == 0){
                    kontrol = 1;
                    break;
                }

            if (kontrol == 0){
                System.out.println(number);
                sayac++;
            }
        }
        }
    }
}
