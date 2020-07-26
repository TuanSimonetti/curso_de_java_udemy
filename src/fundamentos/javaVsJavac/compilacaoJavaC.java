package fundamentos.javaVsJavac;

import java.util.Scanner;

public class compilacaoJavaC {

    //  public static void main(String[] x) {
    public static void main(String[] args) {
        System.out.println("Ola terminal do computador!");

        Scanner entrada = new Scanner(System.in);

        String valor = entrada.nextLine();
        System.out.println("Valor e " + valor);
//      System.out.println(x);
        System.out.println(args[0]);

        entrada.close();
    }
}








