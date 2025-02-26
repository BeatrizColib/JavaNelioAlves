import java.util.Scanner;

public class Funcoes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite três números: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        int maior = max(num1, num2, num3);
        mostrarResultado(maior);
        sc.close();
    }
    //funções
    //public - fica disponivel para outras classes. static - pode ser chamada indenpendente da criação de objeto
    //int - tipo que essa função retorna
    //max - nome da função
    //() - parametros, nao precisa ser o mesmo nome la em cima
    public static int max(int a, int b, int c) {
        int auxiliar;
        if (a > b && a > c) {
            auxiliar = a;
        } else if (b> c) {
            auxiliar = b;
        } else {
            auxiliar = c;
        }
        return auxiliar;
    }
    //void - "vazio" - quando a função deve retornar algo que nao sera reaproveitado no programa
    //irá apenas imprimir algo, neste caso. Void - faz uma açao sem reaproveitar no prog
    public static void mostrarResultado(int valor){
        System.out.println("Maior é: " + valor);
    }
}
