package fundamentos.console;

import java.util.Scanner;

public class console {
    public static void main(String[] args) {

        System.out.print("Bom");
        System.out.print(" dia!");

        System.out.print("Bom");
        System.out.print(" dia!");

        System.out.printf("Megasena: %d %d %d %d %d %d %n", 1, 2, 3, 4, 5, 6); //%n também serve como quebra de linha
        System.out.printf("Salário: %.1f", 1234.5678); // o sistema fará o arredondamento da casa decimal, onde X.56 vira X.6
        System.out.printf("Nome: %s,\n", "João");


        // INPUT
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o seu nome: ");
        String nome = entrada.nextLine();
        System.out.print("Digite o seu sobrenome: ");
        String sobrenome = entrada.nextLine();
        System.out.print("Digite o sua idade: ");
        int idade = entrada.nextInt();

        ///entrada.nextDouble();

        //System.out.println("\n\nNome: " + nome + "" + sobrenome);
        System.out.printf("%s %s tem %d anos.%n", nome, sobrenome, idade);

        entrada.close();
    }
}
