package application;

import entities.Student;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("___Let's check the status of the student___");
        System.out.print("Enter the name of the student: ");
        String name = sc.nextLine();
        System.out.print("Enter three grades \nFirst grade: ");
        double grade1 = sc.nextDouble();
        System.out.print("Enter the second: ");
        double grade2 = sc.nextDouble();
        System.out.print("Enter the third: ");
        double grade3 = sc.nextDouble();

        Student student01 = new Student();
        student01.name = name;
        student01.grade01 = grade1;
        student01.grade02 = grade2;
        student01.grade03 = grade3;

        student01.calculateFinalGrade();
        System.out.println();
        System.out.println(student01.checkStatus()); //para imprimir o retorno do metodo

        sc.close();
    }
}
