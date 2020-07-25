package fundamentos.operacoes.operacoesLogicas;

import java.util.Scanner;

public class desafioOperadoresLogicos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("O tabalho de terça-feira deu certo?[true/false] ");
        Boolean terca = entrada.nextBoolean();

        System.out.print("O tabalho de quinta-feira deu certo?[true/false] ");
        Boolean quinta = entrada.nextBoolean();

        if (terca && quinta == true) {
            System.out.println("Vamos ao shipping comprar a Smart Tv!");
        } else if (terca || quinta == true) {
            System.out.println("Vamos ao cinema!");
        } else {
            System.out.println("Nenhum dos trabalhos deram certo... =(");
        }
    }
}
