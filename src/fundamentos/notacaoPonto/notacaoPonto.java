package fundamentos.notacaoPonto;

public class notacaoPonto {
    public static void main(String[]  args) {

        double a = 2.3;
        String s = "Bom dia X"; //String não é tipo primitivo e não é uma palavra reservada. Isso permite que seja usado ponto, como se fosse orientação ao objeto
        s = s.replace("X", "Senhora");
        s = s.toUpperCase();
        s = s.concat("!!!");

        System.out.println(s);
        System.out.println("Tuan".toUpperCase());

        String y = "Bom dia Y"
                .replace("X", "Gui") // troca um termo da String por outro
                .toUpperCase()
                .concat("!!!");
        System.out.println(y);

        // Tipos primitivos não tem o operador "."
        int b = 3;
        System.out.println(b);
    }
}
