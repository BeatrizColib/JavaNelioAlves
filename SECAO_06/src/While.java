import java.util.Scanner;

public class While {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = 4;
        int y = 0;
        int i = 0;
        while (i < x) {
            i += 1;
            y += i;
            System.out.println(i + " - " + y);
        }

        String continuar;
        do {
            System.out.println("primeiro executa");
            System.out.println("deseja continuar? sim ou nao? ");
            continuar = sc.nextLine();
        } while (continuar.equals("sim"));
    }
}