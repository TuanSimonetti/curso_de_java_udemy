package fundamentos.constantesVariaveis;

public class desafioConversao {
    public static void main(String [] args) {
        //Scanner inputTemperatura = new Scanner("Qual a temperatura? ");
        //Float temperatura = inputTemperatura.nextFloat();
        double temperatura = 71;
        final double ajuste = 32;
        final double fator = 5/9.0;
        Double conversor = (temperatura-ajuste)*fator;
        System.out.println("A temperatura em Farenheint é: " + conversor + "ºC");
    }
}
