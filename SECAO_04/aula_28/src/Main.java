import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Bia");

        double x = 32.6987;
        System.out.println(""); //quebra de linha
        System.out.print(""); //sem quebra de linha
        Locale.setDefault(Locale.US); //import la em cima
        System.out.println("resultado= " + x + ", fim.");

        System.out.printf("%.2f%n", x);  //formatado - %.2f duas casas decimais %n quebra de linha
        int a = 10;
        int b = 20;
        int c = a + b;

        System.out.printf("valor de a= %d, valor de b= %d, soma= %d%n", a, b, c);
        //se for double, usar %f
        //se for string, usar %s
        //se for inteiro, usar %d
        String nome = "bia";
        int idade = 20;
        double peso = 58.70;
        System.out.printf("Nome: %s, Idade: %d, Peso: %.1f%n", nome, idade, peso);

        //boa pratica - se for double, é bom deixar 5.0, para mostrar que é tipo double

        //CASTING
        int num1=5;
        int num2=2;
        double resultado1, resultado2;
        resultado1 = num1 / num2;             // compilador entende que se quer o num inteiro, pois esta dividindo int por int
        resultado2 = (double) num1 / num2;    // aqui ele entende que quer o resultado em double
        System.out.println(resultado1);
        System.out.println(resultado2);

        //CASTING - outro exemplo
        double d;
        int e;
        d = 5.85;
        //e = d; // aqui ele acusa erro
        e = (int) d; // aqui ele faz assumir como int, transformando de double pra int, ignorando depois da casa decimal
        System.out.println(e);
    }
}