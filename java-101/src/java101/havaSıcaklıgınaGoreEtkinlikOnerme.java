package java101;

import java.util.Scanner;

public class havaSıcaklıgınaGoreEtkinlikOnerme {
    public static void main(String args[]){
        int temperature;
        Scanner input = new Scanner(System.in);

        System.out.println("please enter the temperature");
        temperature = input.nextInt();

        if(temperature<5){
            System.out.println("bu hava da kayak yapmaya gidebilirsiniz ");
        }else if(temperature>5 && temperature<15){
            System.out.println("bu havada sinemaya gidebilirsiniz");
        }else if(temperature>15 && temperature<25){
            System.out.println("bu hava da piknik yapabilirsiniz");
        }else if(temperature>25){
            System.out.println("bu hava da yüzmeye gidebilirsiniz");
        }
    }
}
