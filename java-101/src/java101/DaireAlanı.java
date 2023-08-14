package java101;

import java.util.Scanner;

public class DaireAlanı {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        double radius,angle,area;
        double pi= 3.14;
        System.out.println("please enter the radius and angle of the circle");
        radius = input.nextDouble();
        angle = input.nextDouble();

        area = (pi * radius * radius * angle)/360;

        System.out.println("the area of the circle is");
        System.out.println(area);

    }
}
