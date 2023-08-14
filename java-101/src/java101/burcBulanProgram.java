package java101;

import java.util.Scanner;

public class burcBulanProgram {
    public static void main(String args[]){
        int day, month;
        Scanner input = new Scanner(System.in);

        System.out.println("please enter the day and month of your birthday");
        month = input.nextInt();
        day = input.nextInt();

        switch (month){
            case 1:
                if(day>1 && day<21)
                    System.out.println("oğlak Burcu");
                else if(day >22 && day<=31)
                    System.out.println("kova burcu");
                break;
            case 2:
                if(day >=1 && day<19)
                    System.out.println("kova burcu");
                else if(day>19 && day<=28)
                    System.out.println("balık burcu");
                break;
            case 3:
                if(day >=1 && day<20)
                    System.out.println("balık burcu");
                else if(day>20 && day<=31)
                    System.out.println("koç burcu");
                break;
            case 4:
                if(day >=1 && day<20)
                    System.out.println("koç burcu");
                else if(day>21 && day<=30)
                    System.out.println("boğa burcu");
                break;
            case 5:
                if(day >=1 && day<21)
                    System.out.println("boğa burcu");
                else if(day>21 && day<=31)
                    System.out.println("ikizler burcu");
                break;
            case 6:
                if(day >=1 && day<22)
                    System.out.println("ikizler burcu");
                else if(day>23 && day<=30)
                    System.out.println("yengeç burcu");
                break;
            case 7:
                if(day >=1 && day<22)
                    System.out.println("yengeç burcu");
                else if(day>23 && day<=31)
                    System.out.println("Aslan burcu");
                break;
            case 8:
                if(day >=1 && day<22)
                    System.out.println("aslan burcu");
                else if(day>22 && day<=31)
                    System.out.println("başak burcu");
                break;
            case 9:
                if(day >=1 && day<22)
                    System.out.println("başak burcu");
                else if(day>22 && day<=30)
                    System.out.println("terazi burcu");
                break;
            case 10:
                if(day >=1 && day<22)
                    System.out.println("terazi burcu");
                else if(day>22 && day<=31)
                    System.out.println("akrep burcu");
                break;
            case 11:
                if(day >=1 && day<22)
                    System.out.println("akrep burcu");
                else if(day>22 && day<=30)
                    System.out.println("yay burcu");
                break;
            case 12:
                if(day >=1 && day<22)
                    System.out.println("yay burcu");
                else if(day>22 && day<=31)
                    System.out.println("oğlak burcu");
                break;
        }

    }
}
