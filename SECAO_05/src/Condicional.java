import java.util.Locale;
import java.util.Scanner;

public class Condicional {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos minutos foram utilizados?");
        int minutos = sc.nextInt();

        double valor = 50.0;
        if (minutos > 100) {
            valor += (minutos - 100) * 2.0;
            //equivalente a valor = valor + (min..
        }

        System.out.println(minutos + " minutos, valor final R$" + valor);
        sc.close();
    }
}
