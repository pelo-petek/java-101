package java101;
import java.util.Scanner;

import static java.lang.Math.sqrt;

public class hipotenusBolma {
    public static void main(String args[]) {
        int aKenar,bKenar;
        double cKenar;
        Scanner input= new Scanner(System.in);

        System.out.println("please enter the length of side a,b");
        aKenar= input.nextInt();
        bKenar= input.nextInt();

        cKenar= sqrt((aKenar*aKenar) + (bKenar*bKenar));

        System.out.println(cKenar);
    }
}
