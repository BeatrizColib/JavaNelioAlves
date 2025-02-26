//EXPRESSÕES MATEMÁTICAS

public class ExpressoesMatematicas {
    public static void main(String[] args) {
        double x = 5.0;
        double y = 6.0;
        double z = -4.0;
        double a, b, c;

        a = Math.sqrt(x);  //raiz quadrada
        b = Math.sqrt(y);
        c = Math.sqrt(49);
        System.out.println("Raiz quadrada de " + x + " = " + a);
        System.out.println("Raiz quadrada de " + y + " = " + b);
        System.out.println("Raiz quadrada de 49 = " + c);
        System.out.println();

        a = Math.pow(x, y);  //potencia
        b = Math.pow(x, 2);
        c = Math.pow(10, 2);
        System.out.println(x + " elevado a " + y + " = " + a);
        System.out.println(x + " elevado a 2 = " + b);
        System.out.println("10 elevado a 2 = " + c);
        System.out.println();

        a = Math.abs(y);  //valor absoluto
        b = Math.abs(z);
        System.out.println("valor absoluto de y = " + a);
        System.out.println("valor absoluto de z = " + b);







    }
}