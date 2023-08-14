package java101;
import java.util.Scanner;

import static java.lang.Math.sqrt;

public class ucgenAlanBulma {
    public static void main(String args[]){

        Scanner girdi= new Scanner(System.in);

        double aKenar,bKenar,cKenar,area=1 ;
        double u;

        System.out.println("please enter the value of side a");
        aKenar = girdi.nextDouble();

        System.out.println("please enter the value of b");
        bKenar = girdi.nextDouble();

        System.out.println("please enter the value of side c");
        cKenar = girdi.nextDouble();

        u = (aKenar + bKenar + cKenar) / 2;

        area = sqrt(u*(u-aKenar)*(u-bKenar)*(u-cKenar));

        System.out.println("the area of the triangle equals to");
        System.out.println(area);

    }
}
