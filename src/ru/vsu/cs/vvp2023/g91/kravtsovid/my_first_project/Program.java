package ru.vsu.cs.vvp2023.g91.kravtsovid.my_first_project;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        System.out.print("Введите баллы по аттестациям: ");
        int firstAttestation, secondAttestation, thirdAttestation;
        Scanner scan = new Scanner(System.in);
        firstAttestation = scan.nextInt();
        secondAttestation = scan.nextInt();
        thirdAttestation = scan.nextInt();
        double res = (firstAttestation + secondAttestation + thirdAttestation) / 3.0;
        System.out.println(res);

    }
}
