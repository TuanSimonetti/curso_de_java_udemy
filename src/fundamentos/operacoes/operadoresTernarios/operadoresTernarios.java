package fundamentos.operacoes.operadoresTernarios;

public class operadoresTernarios {
    public static void main(String[] args) {

        double media = 5.6;
        String resultadoParcial = media >= 5.0 ? "em recuperacao." : "reprovado.";
        String resultadoFinal = media >= 7.0 ? "aprovado." : resultadoParcial; // "?" e ":" são operadores ternários

        System.out.println("O aluno está " + resultadoFinal);


        double nota = 9.9;
        boolean bomComportamento = false;
        boolean passouPorMedia = nota >= 7;
        boolean temDesconto = bomComportamento && passouPorMedia;
        String resultado = temDesconto ? "sim." : "não.";

        System.out.printf("Tem desconto? %s", resultado);

    }
}
