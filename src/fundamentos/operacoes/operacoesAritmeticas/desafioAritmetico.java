package fundamentos.operacoes.operacoesAritmeticas;

public class desafioAritmetico {
    public static void main(String[] args) {
//        INTRODUCAO
//        int a = 2 + 3 * 4;
//        int b = Math.pow(a, 3);
//        double c = Math.pow(a, 3);
//
//        System.out.println(b);
//        System.out.println(c);
        var equacaoUm = (Math.pow(((3+2)*6), 2) / (3*2));
        var equacaoDois = Math.pow(((1-5)*(2-7)) / 2, 2);
        var equacaoSuperiorPotencializada = Math.pow((equacaoUm - equacaoDois), 3);
        var equacaoGeral = equacaoSuperiorPotencializada / Math.pow(10, 3);

        System.out.println("Resultado Equação 1: " + equacaoUm);
        System.out.println("Resultado Equação 2: " + equacaoDois);
        System.out.println("Resultado da Equação e Potencialização Superior: " + equacaoSuperiorPotencializada);
        System.out.println("O resultado é: " + equacaoGeral);
    }
}
