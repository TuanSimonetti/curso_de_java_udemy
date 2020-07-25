package fundamentos.tiposPrimitivos;

public class tiposPrimitivos {
    public static void main(String[] args) {
        // Informações do funcionamento

        // Tipos numéricos inteiros
        byte anosDeEmpresa = 23;
        short numeroDeVoos = 542;
        int id = 56789;
        long pontosAcumulados = 3_135_845_223L; //A letra L refere-se ao long e o "_" (underline), indica a separação das casas númericas (centena, milhar, milhares, bilhares, etc.).

        // Tipos numéricos reais
        float salario = 11_445.44F; //para considerar um tipo float, é necessário que seja usada a letra F ao final do valor.
        double vendasAcumuladas = 2_991_797_103.01;

        // Tipo booleano
        boolean estaDeFerias = false; //Ou pode ser usado "true", mas não se usa "0" ou "1".

        // Tipo caractere
        char status = '\u0010'; // ativo
        char genero = 'M';

        // Prints
        System.out.println("Anos de empresa:" + (anosDeEmpresa/365));
        System.out.println("Número de viagens: " + (numeroDeVoos/2));
        System.out.println("Pontos acumulados na empresa: " + (pontosAcumulados/vendasAcumuladas));
        System.out.println("O funcionário de ID " + id + " recebe: " + "R$ " + salario);
        System.out.println("Encontra-se de Férias: " + estaDeFerias);
    }
}
