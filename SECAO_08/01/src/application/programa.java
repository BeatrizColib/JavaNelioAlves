package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangulo;

public class programa {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangulo triangulo01, triangulo02;
        triangulo01 = new Triangulo();
        triangulo02 = new Triangulo();

        System.out.println("Digite os três lados do triangulo 01: ");
        triangulo01.lado01 = sc.nextDouble();
        triangulo01.lado02 = sc.nextDouble();
        triangulo01.lado03 = sc.nextDouble();
        System.out.println("Digite os três lados do triangulo 02: ");
        triangulo02.lado01 = sc.nextDouble();
        triangulo02.lado02 = sc.nextDouble();
        triangulo02.lado03 = sc.nextDouble();

        double areaTriangulo01 = triangulo01.areaTriangulo();
        double areaTriangulo02 = triangulo02.areaTriangulo();

        if (areaTriangulo01 > areaTriangulo02) {
            System.out.println("Triangulo 01 é maior - área: " + areaTriangulo01);
        } else {
            System.out.println("Triangulo 02 é maior - área: " + areaTriangulo02);
        }
        sc.close();
    }
}
