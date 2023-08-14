package java101;

import java.util.Scanner;

public class readValueFromConsole {
    public static void main(String[] args ){

        int age;
        Scanner input = new Scanner(System.in);

        System.out.println("please enter your age");
        age = input.nextInt();

        int yourAge = Integer.parseInt(System.console().readLine());
        System.out.println("your age is"+ yourAge);
    }
}
