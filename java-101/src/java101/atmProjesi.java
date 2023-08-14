package java101;

import java.util.Scanner;

public class atmProjesi {
    public static void main(String args[]){

        int mevcutBakiye=5000, right= 3, n, tutar, para;
        String kullaniciAdi, parola;
        Scanner input = new Scanner(System.in);

        System.out.println("lütfen bilgilerinizi giriniz, kullanıcı adı, parola");
        kullaniciAdi = input.nextLine();
        parola = input.nextLine();


        if(kullaniciAdi.equals("pelda") && parola.equals("pelda123")){
            System.out.println("giriş yapıldı");
            do {
                System.out.println("1-mevcut bakiye, 2-para yatırma, 3-para çekme");
                System.out.println("lütfen yapmak istediğiniz işlemi seçiniz");
                n = input.nextInt();

                switch (n){
                    case 1:
                        System.out.println("mevcut bakiyeniz: ");
                        System.out.println(mevcutBakiye);
                        break;
                    case 2:
                        System.out.println("yatırmak istediğiniz tutarı giriniz");
                        tutar = input.nextInt();
                        mevcutBakiye += tutar;
                        System.out.println("güncel bakiyeniz "+ mevcutBakiye);
                        break;
                    case 3:
                        System.out.println("çekmek istediğiniz tutarı giriniz");
                        para = input.nextInt();
                        mevcutBakiye -= para;
                        System.out.println("güncel bakiyeniz "+ mevcutBakiye );
                    case 4:
                        System.out.println("logging out");
                }
            }while (n != 4);

        }
        else{
            right--;
            System.out.println("hatalı kullanıcı adı veya şifre tekrar deneyiniz");
            if (right == 0)
                System.out.println("hesabınız bloke edilmiştir");
            else
                System.out.println("kalan hakkınız "+ right);
        }

    }
}
