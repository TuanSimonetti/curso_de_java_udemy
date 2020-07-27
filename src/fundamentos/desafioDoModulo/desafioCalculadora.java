package fundamentos.desafioDoModulo;

import java.util.Scanner;

public class desafioCalculadora {

    public static void main(String[] args) {
        // Ler num1
        // Ler num2
        // + - * / %

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digit o primiero número da operação: ");
        Double num1 = entrada.nextDouble();

        System.out.print("Digit o segundo número da operação: ");
        Double num2 = entrada.nextDouble();

        System.out.print("Digite o símbolo da operação: ");
        String operacao = entrada.next();

        // Lógica
        double resultado = "+".equals(operacao) ? num1 + num2 : 0;
        resultado = "-".equals(operacao) ? num1 - num2 : resultado;
        resultado = "/".equals(operacao) ? num1 / num2 : resultado;
        resultado = "*".equals(operacao) ? num1 * num2 : resultado;
        resultado = "%".equals(operacao) ? num1 % num2 : resultado;

        System.out.printf("Resultado: %.2f %s %.2f = %.2f", num1, operacao, num2, resultado);


        entrada.close();
    }
}