package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số cần kiểm tra");
        int number = sc.nextInt();

        if (number < 2) {
            System.out.println(number + " Không phải là số nguyên tố");
        }
        else {
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(number)) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check) {
                System.out.println(number + " Là số guyên tố");
            }
            else {
                System.out.println(number + " Không phai là số nguyên tố");
            }
        }
    }
}
