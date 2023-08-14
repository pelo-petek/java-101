package java101;

import java.util.Scanner;

public class palindromSayiHesaplama {

    public static void main(String[] args){

       /*
        int count = 0, number, sonBasamak;
        int p=3;
        int[] Array1 = new int[p];
        int[] Array2 = new int[p];
        Scanner input = new Scanner(System.in);

        System.out.println("please enter the number of array");

        int n= Array1.length;
        for(int m=0 ; m<n; m++){
            Array1[m] = input.nextInt();
        }

        //girilen sayının basamak sayısını hesaplama 456
        for(int i=0; i<n; i++)
        {
            Array2[i] = Array1[n];
        }

        System.out.println(" ");

        // reverse olan array ekrana bastırıyoruz
        for (int k=1; k<=count; k++){
            System.out.print(Array2[k]);
        }

        for(int k=0; k<n ; k++){
            if(Array1[k]==Array2[k])
                System.out.println("palindrom sayısıdır");
            else
                System.out.println("palindrom sayısı değildir");
        }
*/
        int count = 0, number, sonBasamak = 0, deger=0;
        Scanner input = new Scanner(System.in);

        System.out.println("please enter the number");
        number = input.nextInt();
        int tempNumber = number;
        int tempNumber2 = number;

        //girilen sayının basamak sayısını hesaplama 456
        for(int i=number; number % 10!=0 ; number=number/10){
            count++;
        }

        //girilen sayının kalanına göre tersten hesaplama
        for (int j=1; j<=count; j++){
            sonBasamak = tempNumber %10;
            deger= deger * 10 + sonBasamak;
            System.out.print(sonBasamak);
            tempNumber /= 10;
        }

        //int reverse = Integer.parseInt(System.console().readLine());

        System.out.println(" ");

        if(deger == tempNumber2)
            System.out.println("palindrom sayısıdır");
        else
            System.out.println("palindrom sayısı değildir");

    }
}

