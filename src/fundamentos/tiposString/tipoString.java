package fundamentos.tiposString;

public class tipoString {
    public static void main(String[] args) {
        System.out.println("Olá pessoal".charAt(2));

        String s = "Boa tarde";
        System.out.println(s.concat("!!!"));
        System.out.println(s + "!!!");
        System.out.println(s.startsWith("Boa"));
        System.out.println(s.toLowerCase().startsWith("boa"));
        System.out.println(s.endsWith("dia!"));
        System.out.println(s.toUpperCase().endsWith("TARDE"));
        System.out.println(s.length());
        System.out.println(s.equals("boa tarde"));
        System.out.println(s.equalsIgnoreCase("boa tarde"));

        var nome = "Pedro";
        var sobrenome = "Santos";
        var idade = 33;
        var salario = 12345.987;

        //System.out.println("Nome: " + nome + "\nSobrenome: " + sobrenome + " Idade: " + idade + "\nSalario: " + salario);

        System.out.printf("Nome: %s %s;\nIdade: %d;\nSalario: R$%.2f.", nome, sobrenome, idade, salario);


        String frase = String.format("\n\nO senhor %s %s tem %d anos e ganha R$ %.2f.", nome, sobrenome, idade, salario);
        System.out.println(frase);


        System.out.println("Frase qualquer".contains("qual"));
        System.out.println("Frase qualquer".indexOf("qual"));
        System.out.println("Frase qualquer".substring(6, 8));
    }
}
