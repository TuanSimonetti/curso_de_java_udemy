package fundamentos.operacoes.operadoresDeAtribuicao;

public class operadoresAtribuicao {
    public static void main(String[] args) {

        int a = 3;
        int b = a;
        int c = a + b;

        c = c + b;
        c += b; //c = c + b;
        c -= a; // c = c - a;
        c *= b; // c = c * b;
        c /= a; // c = c / a;
        c %= 2; // c = c % 2; ou vai dar 0(par) ou vai dar 1 (impar)

        c++; // c = c + 1;

        System.out.println(c);

        c %= 2; // c = c % 2; 0 ou 1
        System.out.println(c);

    }
}
