package fundamentos.conversoesDeTipos;

import java.util.Scanner;

public class desafioConversao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);


        // Preenchimento das Variáveis
        System.out.print("Digite o seu nome e sobrenome: ");
        String nomeCompleto = entrada.nextLine();

        System.out.print("Nos informe ultimo salário: ");
        String salarioUm = entrada.nextLine().replace(",", ".");

        System.out.print("Nos informe seu salário de 2 meses atrás: ");
        String salarioDois = entrada.nextLine().replace(",", ".");

        System.out.print("Nos informe seu salário de 3 meses atrás: ");
        String salarioTres = entrada.nextLine().replace(",", ".");



        // Substituição da "," por "."
//        if (salarioUm.contains(",")) {
//            String salarioUmVirgula = salarioUm.replace(",", ".");
//        } else if (salarioDois.contains(",")) {
//            String salarioDoisVirgula = salarioDois.replace(",", ".");
//        } else if (salarioTres.contains(",")) {
//            String salarioTresVirgula = salarioTres.replace(",", ".");
//        }


        // Converte os Salários de String para Double
        Double salario1 = Double.parseDouble(salarioUm);
        Double salario2 = Double.parseDouble(salarioDois);
        Double salario3 = Double.parseDouble(salarioTres);

        Double mediaSalarial = (salario1 + salario2 + salario3)/3;
        System.out.print("A média salarial de " + nomeCompleto + "é: R$ " + mediaSalarial.toString());
    }
}
