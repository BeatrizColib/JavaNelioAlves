import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");
        list.add(2, "Marco");
        System.out.println(list.size());

        for (String x : list) {
            System.out.println(x);
        }

        System.out.println("---------------------");
        list.removeIf(x -> x.charAt(0) == 'M');
        //remoção por predicado - (todo string X -> desde que no charAt(0) == for igual a "m")


        for (String x : list) {
            System.out.println(x);
        }
        System.out.println("---------------------");

        System.out.println("Index of Bob: " + ((ArrayList<?>) list).indexOf("Bob"));
        //posição de um elemento
        System.out.println("Index of Marco: " + ((ArrayList<?>) list).indexOf("Marco"));
        System.out.println("---------------------");

        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
        /* lista so com elementos que iniciem com A
        - declara uma nova lista de nome "result" -
        - transforma em tipo stream - versao do java 8 em diante que aceita expressoes com lambda
        - filter - filtra atraves de um predicado - o filter retorna uma expressao tipo stream - mas stream nao é compativel com tipo list
        - collect - para transformar esse stream em tipo list novamente.
        */
        for (String x : result) {
            System.out.println(x);
        }
        System.out.println("---------------------");

        String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
        /* encontrar primeiro elemento começado com J
        -declara um nova variavel - list eh do tipo string - String name
        - comando para encontrar o primeiro elemento que comece com a letra J
        - stream - idem
        - filter - idem
        - findfirst - retorna um tipo optionalString
        - orElse(null) - ou seja pega o primeiro elemento que atenda o predicado - caso nao exista - retorna null
        */
        System.out.println(name);
    }
}
/*

Lista é uma estrutura de dados:
• Homogênea (dados do mesmo tipo)
• Ordenada (elementos acessados por meio de posições)
• Inicia vazia, e seus elementos são alocados sob demanda
• Cada elemento ocupa um "nó" (ou nodo) da lista
•
Tipo (interface): List

List nao aceita tipo primitivo(int,double..) - tem que ser String,Interger, Double

• Classes que implementam: ArrayList, LinkedList, etc.

Vantagens:
• Tamanho variável
• Facilidade para se realizar inserções e deleções
Desvantagens:
• Acesso sequencial aos elementos *


*/