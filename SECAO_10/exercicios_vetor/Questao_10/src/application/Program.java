package application;

import entities.Student;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("How many students will you enter: ");
        int quantity = sc.nextInt();
        sc.nextLine();
        Student[] students = new Student[quantity];

        for (int i = 0; i < quantity; i++) {
            System.out.print("Enter the name of the student: ");
            String name = sc.nextLine();
            System.out.print("Enter the first semester grade of the student (0 - 10): ");
            double grade_01 = sc.nextDouble();
            System.out.print("Enter the second semester grade of the student (0 - 10): ");
            double grade_02 = sc.nextDouble();
            sc.nextLine();

            Student st = new Student(name, grade_01, grade_02, 0.0); //temporario para poder chamar o metodo
            double average = st.averageCalculator();
            students[i] = new Student(name, grade_01, grade_02, average); //agora com a media, jogo no vetor
        }

        System.out.println("Approved students: ");
        for (Student student : students){
            if (student.getAverage() >= 6)
                System.out.println("Name: " + student.getName() + " | Status: Approved | Average: " + student.getAverage());
        }

        sc.close();
    }
}
/*
Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles
tiraram no 1º e 2º semestres. Cada uma dessas informações deve ser armazenada em um vetor.
Depois, imprimir os nomes dos alunos aprovados, considerando aprovados aqueles cuja média
das notas seja maior ou igual a 6.0 (seis).
 */