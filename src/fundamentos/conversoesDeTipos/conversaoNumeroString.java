package fundamentos.conversoesDeTipos;

public class conversaoNumeroString {

    public static void main(String[] args) {
        Integer num1 = 10000;
        System.out.println(num1.toString().length());

        int num2 = 100000;
        System.out.println(Integer.toString(num2).length());

        //Long.toString(d); Este é um exemplo

        System.out.println(("" + num1).length());
        System.out.println(("" + num2).length());
    }
}
