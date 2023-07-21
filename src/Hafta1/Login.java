package Hafta1;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        String userName,password;
        Scanner input =new Scanner(System.in);

        System.out.println("Lütfen Kullanıcı adını giriniz:");
        userName = input.nextLine();
        System.out.println("Lütfen şifrenizi giriniz:");
        password = input.nextLine();

        if(userName.equals("patika") && password.equals("Java1234")){
            System.out.println("Giriş yaptınız");
        } else{
            System.out.println("Bilgileriniz hatalı");
        }

    }
}
