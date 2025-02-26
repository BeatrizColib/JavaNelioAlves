public class CondicaoTernaria {
    public static void main(String[] args) {

        //serve para abreviar uma condicional
        //Opção 1

        double preco = 36.8;
        double desconto;
        if (preco < 20) {
            desconto = preco * 0.05;
        } else {
            desconto = preco * 0.1;
        }
        System.out.println(desconto);

        //Opção 2

        double preco2 = 36.8;
        double desconto2 = (preco2 <20) ? preco2 * 0.05 : preco2 * 0.1;
        System.out.println(desconto2);
    }
}
