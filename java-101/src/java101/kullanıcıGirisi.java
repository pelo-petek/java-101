package java101;

import java.util.Scanner;

public class kullanıcıGirisi {
    public static void main(String args[]){
        int answer;
        String username,password,newPassword;
        Scanner input = new Scanner(System.in);
        Scanner input1 = new Scanner(System.in);

        System.out.println("please enter your username");
        username = input.nextLine();

        System.out.println("please enter your password");
        password = input.nextLine();

        if(username.equals("pelda") && password.equals("pelo123")){
            System.out.println("giriş başarılı");
        }else{
            System.out.println("do you want to change your password 1-yes, 2-no");
            answer = input.nextInt();

            //switch (answer){
            //    case 1:
                    if(answer==1) {
                        System.out.println("please enter your new password but it should be different from your first password");
                        newPassword = input1.nextLine();
                        if (newPassword.equals("pelo123")) {
                            System.out.println("your password is the same as your first password");
                        } else {
                            System.out.println("login in succesfully");
                        }
                    }
                    //break;
               // case 2:
                 //   System.out.println("login out");
                   // break;
            }

        }

            }




