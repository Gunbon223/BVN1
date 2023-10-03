package bvn3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String  userName= "techmaster";
        String password = "hoclacoviec";
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap user name: ");
        String userNameInput = scan.nextLine();
        System.out.print("Nhap password: ");
        String passwordInput = scan.nextLine();
        if((userName.equals(userNameInput)) ==true && (password.equals(passwordInput)) ==true) {
            System.out.print("Đăng nhập thành công");
        }
        else {
            System.out.println("Đăng nhập không thành công");
        }
    }
}
