public class FormatacaoTexto {
    public static void main(String[] args) {

       /*
       Camel Case: lastName
          pacotes
          atributos
          métodos
          variáveis e parâmetros
        Pascal Case: ProductService
          classes
        */

        String original = "Ana beatriz CORDEIRO De OLIVeira BELmiro   ";

        System.out.println("Original: -" + original + "-");
        String a01 = original.toLowerCase();
        System.out.println("toLowerCase: -" + a01 + "-");

        String a02 = original.toUpperCase();
        System.out.println("toUpperCase: -" + a02 + "-");

        String a03 = original.trim();
        System.out.println("trim: -" + a03 + "-");

        String a04 = original.substring(3);
        //gera a partir do caractere 3, nao imprime do 0 ao 2.
        System.out.println("substring: -" + a04 + "-");

        String a05 = original.substring(4, 11);
        //imprime apenas o intervalo
        System.out.println("substring: -" + a05 + "-");

        String a06 = original.replace("Ana", "Maria");
        System.out.println("replace: -" + a06 + "-");

        int a07 = original.indexOf("a");
        System.out.println("indexOf: -" + a07 + "-");

        int a08 = original.lastIndexOf("a");
        System.out.println("lastIndexOf: -" + a08 + "-");
    }
}