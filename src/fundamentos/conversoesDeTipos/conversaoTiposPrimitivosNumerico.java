package fundamentos.conversoesDeTipos;

public class conversaoTiposPrimitivosNumerico {
    public static void main(String[] args) {

        double a = 1; // Conversão Impícita
        System.out.println(a);

        float b = (float) 1.0; //Conversão explicita (chamado de "CAST")
        System.out.println(b);

        int c = 4;
        byte d = (byte) c; // Gera um resultado incorreto
        System.out.println(d);

        double e = 1.0;
        int f = (int) e;
        System.out.println(f);
    }
}
