package java101;
import java.util.Scanner;


public class daireninAlanıVeCevresiHesaplama {
    public static void main(String args[]){

        double radius,area,parameter;
        double pi = 3.14;
        Scanner input = new Scanner(System.in);
        System.out.println("please enter the radius to find the area and parameter");
        radius = input.nextDouble();

        area=  pi* radius* radius;
         System.out.println("the area of the circle is");
         System.out.println(area);

         parameter = 2*pi*radius;
         System.out.println("the parameter of the circle is ");
         System.out.println(parameter);

    }
}
