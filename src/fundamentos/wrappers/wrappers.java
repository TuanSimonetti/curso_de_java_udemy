package fundamentos.wrappers;

import java.util.Scanner;

public class wrappers {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        //byte
        Byte b = 100;      // Tipo primitivo: byte
        Short s = 1000;    // Tipo primitivo: short
        Integer i = 10000; // Tipo primitivo: int
        Integer iDois = Integer.parseInt("1000"); //Outra forma de escrever
        Integer iTres = Integer.parseInt(entrada.next());
        Long l = 100000L;  // Tipo primitivo: long
        Character c = 'M'; // Tipo primitivo: char

        System.out.println(b.byteValue());
        System.out.println(s.toString());
        System.out.println(iTres * 3);
        System.out.println(l / 3);
        System.out.println(l / 3.0);
        System.out.println(c.toString());

        Boolean bo = Boolean.parseBoolean("true");
        System.out.println(bo.toString().toUpperCase()); // Converte um boolean para string

        Float f = 123.10F; // Tipo primitivo: float
        System.out.println(f);

        Double d = 1234.5678; // Tipo primitivo: double
        System.out.println(d);
    }
}
