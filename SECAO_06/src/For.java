import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos numeros deseja somar?");
        int n = sc.nextInt();
        int soma = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Digite o " + (i+1) + " número: ");
            int a = sc.nextInt();
            soma += a;
        }
        System.out.println(soma);
        sc.close();
    }
}
