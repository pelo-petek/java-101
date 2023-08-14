package java101;

import java.sql.Struct;
import java.util.Scanner;

public class maasHesaplayici {

    static void Employee(String name, int salary, int workHours, int hireYear){
        Scanner input= new Scanner(System.in);
        String s= new String();
        s= "pelda";
        int p= s.length();

        System.out.println(p);

        System.out.println("please enter your name");
        name = input.nextLine();

        System.out.println("please enter your salary");
        salary = input.nextInt();

        System.out.println("please enter your work hours");
        workHours = input.nextInt();

        System.out.println("please enter your hire year");
        hireYear = input.nextInt();
    }

    static void tax(int salary, int vergi){
        vergi = 0;
        if (salary>1000){
            vergi += (salary*0.30);
        }
        else
            vergi =0;
    }

    static void bonus(int workHours, int total ){
        total =0;
        if(workHours>40){
            workHours %= 10;
            total += (workHours * 30);
        }
    }

    static void raiseSalary(int hireYear, int total, int salary){
        total = 0;
        if(hireYear>2011){
            total += (salary*0.05);
        }
        else if(hireYear<2011 && hireYear>2001){
            total += (salary*0.10);
        }
        else if(hireYear>2001){
            total += (salary*1.5);
        }

    }


    public static void main(String[] args){


    }
}
