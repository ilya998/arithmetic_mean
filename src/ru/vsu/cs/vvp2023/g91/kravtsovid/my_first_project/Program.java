package ru.vsu.cs.vvp2023.g91.kravtsovid.my_first_project;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        System.out.print("Введите баллы по аттестациям: ");
        int a1, a2, a3;
        Scanner scan = new Scanner(System.in);
        a1 = scan.nextInt();
        a2 = scan.nextInt();
        a3 = scan.nextInt();
        double res = (a1 + a2 + a3) / 3.0;
        System.out.println(res);

    }
}
