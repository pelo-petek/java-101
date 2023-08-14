package java101;
import java.util.Scanner;

public class ortalamaHesaplama {
    public static void main(String args[]){
        int math,chemistry,physic,bio,avg;

        Scanner a= new Scanner(System.in);

        System.out.println("please add your math note");
        math = a.nextInt();

        System.out.println("please add your chemistry note");
        chemistry=a.nextInt();

        System.out.println("please enter your physic note");
        physic =a.nextInt();

        System.out.println("please enter your bio note");
        bio= a.nextInt();

        avg= (math + chemistry + physic + bio)/4;

        System.out.println(avg);

    }
}
