package org.example.Class13;

import java.util.Scanner;

public class MyScanner {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter you Roll no:");
        int rollNo = scan.nextInt();

        scan.nextLine();

        System.out.println("Enter Your Name:");
        String name = scan.nextLine();

        System.out.println("Roll no: " + rollNo);
        System.out.println("Name: " + name);
    }
}