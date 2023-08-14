package java101;
import java.util.Scanner;
public class taksimetreHesaplama {
    public static void main(String args[]){
        double mesafe,ucret;
        System.out.println("please enter that how many km that you have arrived");

        Scanner girdi = new Scanner(System.in);
         mesafe = girdi.nextDouble();

         if(mesafe < 9){
             ucret= 20;
         }
         else{
             ucret = (mesafe*2.20) + 10 ;
         }
         System.out.println("ucretiniz " + ucret);
    }
}
