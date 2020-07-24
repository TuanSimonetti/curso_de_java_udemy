package fundamentos.introducao;

public class SegundoPrograma {
    public static void main(String[] args) {
        int raio = 3;
        double raioFloat = 3.4;
        //double pi = 3.14;
        final double pi = Math.PI;

        //double area = pi * raioFloat * raioFloat;

        double area = pi * raio * raio;

        //System.out.println(pi * raioFloat * raioFloat);
        System.out.println(area);
        System.out.println("Área = " + area + "m²");
    }
}
