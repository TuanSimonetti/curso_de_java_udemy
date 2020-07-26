package fundamentos.operacoes.operadoresUnarios;

public class operadoresUnarios {
    public static void maind(String[] args) {

        int a = 1;
        int b = 2;

        a++; // a = a + 1;
        a--; // a = a - 1;

        ++a; // a = a + 1;
        --b; // b = b - a;

        System.out.println(a);
        System.out.println(b);

        System.out.println("Mini desafio...");
        System.out.println(++a == b--); // só vai decrementar o valor de "b", após realizar a comparação (==)
        System.out.println(a == b);
        System.out.println(a);
        System.out.println(b);
    }
}
