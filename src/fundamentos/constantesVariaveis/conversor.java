package fundamentos.constantesVariaveis;

import java.util.Scanner;

public class conversor {

    public static void main(String [] args) {
        Scanner inputMedida = new Scanner(System.in);
        System.out.println("Qual a medida deseja converter fahrenheint[F] ou celsius [C]? ");
        String medida = inputMedida.nextLine();

        Scanner inputTemperatura = new Scanner(System.in);
        System.out.println("Qual a temperatura atual? ");
        Float temperatura = inputTemperatura.nextFloat();

        if (medida == "F") {
            Double conversor = (1.8*temperatura)+32;
            System.out.println("A temperatura em Fahrenheint é de: " + conversor);
        } else if (medida == "C") {
            Double coversor = (temperatura-32)/1.8;
            System.out.println("A temperatura em Celsius é de: " + coversor);
        }
    }
}
