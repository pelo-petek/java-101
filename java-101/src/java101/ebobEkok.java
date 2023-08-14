package java101;

import java.util.Scanner;

public class ebobEkok {
    public static void main(String[] args){

        int number1, number2,ebob,ekok,max,min;
        Scanner input = new Scanner(System.in);

        System.out.println("please enter the numbers");
        number1 = input.nextInt();
        number2 = input.nextInt();

        //20 40

        if (number1>number2){
            max = number1;
            min = number2;
            for (int i=min; i<=number2 ; i--){
                if(number1%i==0 && number2%i==0){
                    ebob = i;
                    System.out.println("Ebob : "+ebob);
                    ekok = (number1 * number2)/ebob;
                    System.out.println("Ekok : "+ekok);
                    break;
                }
            }
        }
        else{
            max = number2;
            min = number1;
            for (int i=min; i<=number1 ;i--){
                if(number2%i==0 && number1%i==0){
                    ebob = i;
                    System.out.println("Ebob : "+ebob);
                    ekok = (number1 * number2)/ebob;
                    System.out.println("Ekok : "+ekok);
                    break;
                }
            }
        }




    }
}
