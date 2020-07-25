package fundamentos.operacoes.operacoesLogicas;

public class operacoesLogicas {
    public static void main(String[] args) {

        boolean condicao1 = true;
        boolean condicao2 = 3 > 7; // False

        System.out.println(condicao1 && condicao2); // E
        System.out.println(condicao1 || condicao2); // OU
        System.out.println(condicao1 ^ condicao2); // OU exclusivo
        System.out.println(!condicao1); // Negação
        System.out.println(!!condicao2); // Dupla negação

        //Tabela verdade "E" (AND)
        System.out.println("\n\nTabela Verdade E (AND)");
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);

        // Tabela verdade "OU" (OR)
        System.out.println("\n\nTabela Verdade OU (OR)");
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);

        // Tabela verdade "OU Exclusivo"
        System.out.println("\n\nTabela Verdade OU (OR) exclusivo");
        System.out.println(true ^ true);
        System.out.println(true ^ false);
        System.out.println(false ^ true);
        System.out.println(false ^ false);

        // Tabela verdade "Negação"
        System.out.println("\n\nTabela Verdade NEGAÇÂO");
        System.out.println(!true);
        System.out.println(!false);
    }
}
