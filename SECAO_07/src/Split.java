public class Split {
    public static void main(String[] args) {
        //Função Split

        String nome = "Ana Beatriz Cordeiro de Oliveira Belmiro";
        String[] vetor = nome.split(" "); //vai guardar em cada vetor um nome, separado pelos espaços

        String primeirNome = vetor[0];
        String segundoNome = vetor[1];
        String terceiroNome = vetor[2];
        String quartoNome = vetor[3];
        String quintoNome = vetor[4];
        String ultimoNome = vetor[vetor.length - 1];

        System.out.println("Primeira Nome: " + primeirNome);
        System.out.println("Segundo Nome: " + segundoNome);
        System.out.println("Terceiro Nome: " + terceiroNome);
        System.out.println("Quarto Nome: " + quartoNome);
        System.out.println("Quinto Nome: " + quintoNome);
        System.out.println("Ultimo Nome: " + ultimoNome);

    }
}
