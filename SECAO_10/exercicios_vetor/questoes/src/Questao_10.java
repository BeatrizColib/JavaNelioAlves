import java.util.Scanner;

public class Questao_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many students will you enter: ");
        int quantity = sc.nextInt();
        String[] names = new String[quantity];
        double[] grade01 = new double[quantity];
        double[] grade02 = new double[quantity];
        double[] average = new double[quantity];

        for(int i = 0; i < quantity; i++){
            System.out.print("Enter the name of the student: ");
            String name = sc.next();
            names[i] = name;
            System.out.print("Enter the first semester grade of the student (0 - 10): ");
            double grade_01 = sc.nextDouble();
            grade01[i] = grade_01;
            System.out.print("Enter the second semester grade of the student (0 - 10): ");
            double grade_02 = sc.nextDouble();
            grade02[i] = grade_02;

            average[i] = (grade_01 + grade_02) / 2;
        }

        System.out.println();
        for (int i = 0; i < average.length; i++){
            if (average[i] >= 6){
                System.out.println("Name: " + names[i] + " | Average: " + average[i] + " | Status: Approved." );
            } else {
                System.out.println("Name: " + names[i] + " | Average: " + average[i] + " | Status: Reproved." );
            }
        }

        sc.close();
    }
}
/*
Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram
no 1º e 2º semestres. Cada uma dessas informações deve ser armazenada em um vetor. Depois, imprimir
os nomes dos alunos aprovados, considerando aprovados aqueles cuja média das notas seja maior ou
igual a 6.0 (seis).
 */