package fundamentos.inferencia;

public class inferencia {
    public static void main(String [] args) {

        double a = 4.5;
        System.out.println(a);

        var b = 4.5;
        System.out.println(b);

        var c = "Texto";
        System.out.println(c);

        c = "Outro Texto";
        System.out.println(c);

        /*
        c = 4.5;

        Definir C dessa forma, não será possível. Porque o Java amarra a variável ao primeito tipo definido.
         */
    }
}
