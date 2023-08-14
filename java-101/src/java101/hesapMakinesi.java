package java101;

import java.util.Scanner;

public class hesapMakinesi {
    public static void main(String args[]) {
        int firstNum, secNum, operator;
        Scanner input = new Scanner(System.in);

        System.out.println("please enter the first number ");
        firstNum = input.nextInt();

        System.out.println("please enter the second number");
        secNum = input.nextInt();

        System.out.println("please enter the operator that you want 1-add, 2-multiply, 3-minus, 4-divide");
        operator = input.nextInt();

        switch (operator) {
            case 1:
               System.out.println(firstNum + secNum);
               break;
            case 2:
                System.out.println(firstNum*secNum);
                break;
            case 3:
                System.out.println(firstNum-secNum);
                break;
            case 4:
                System.out.println(firstNum/secNum);
                break;
            default:
                System.out.println("not anyone");
        }
    }
}
