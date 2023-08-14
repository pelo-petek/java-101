package java101;

import java.util.Scanner;

public class sınıfıGecmeDurumu {
    public static void main(String args[]){

        Scanner input = new Scanner(System.in);
        int math, chemistry,biology,statistics,music;
        System.out.println("please enter your math note");
        math = input.nextInt();

        System.out.println("please enter your chemistry note");
        chemistry= input.nextInt();

        System.out.println("please enter your biology note");
        biology = input.nextInt();

        System.out.println("please enter your statistics note");
        statistics = input.nextInt();

        System.out.println("please enter your music note");
        music = input.nextInt();

        if (math>=0 && math<=100 && chemistry>=0 && chemistry<=100 && biology>=0 && biology<=100 && statistics>=0 && statistics<=100 && music>=0 && music<=100){
            double avg = (math + chemistry + biology + statistics + music)/5;
            if(avg>55){
                System.out.println("you pass the average is:");
                System.out.println(avg);
            } else{
                System.out.println("you fail the average is:");
                System.out.println(avg);
            }
        }


}}
