package operacoes;

/**
 *
 * @author Matheus Fidelis - 11211100176 / Renato Cardoso - 11221401522
 */
public class Operacoes {

    public static void main(String[] args) {
        Operadores resultado = new Operadores();

        System.out.println("Números inseridos: 10 e 5");
        System.out.println("");

        // Operadores Artiméticos
        // Adição
        System.out.println("n1 + n2 = " + resultado.adicao(10, 5));

        // Subtração
        System.out.println("n1 - n2 = " + resultado.subtracao(10, 5));

        // Multiplicação
        System.out.println("n1 * n2 = " + resultado.multiplicacao(10, 5));

        // Divisão
        System.out.println("n1 / n2 = " + resultado.divisao(10, 5));

        // Mod
        System.out.println("n1 % n2 = " + resultado.mod(10, 5));
        System.out.println("");

        // Operadores de Atribuição
        // +=
        System.out.println("n1 = n1 + n2 = " + resultado.adicaoIgual(10, 5));

        // -=
        System.out.println("n1 = n1 - n2 = " + resultado.subtracaoIgual(10, 5));

        // *=
        System.out.println("n1 = n1 * n2 = " + resultado.multiplicacaoIgual(10, 5));

        // /=
        System.out.println("n1 = n1 / n2 = " + resultado.divisaoIgual(10, 5));

        // %=
        System.out.println("n1 = n1 % n2 = " + resultado.modIgual(10, 5));
        System.out.println("");

        // Operadores de Comparação
        // Igual a
        System.out.println("n1 é igual a n2 ? " + resultado.igual(10, 5));

        // Diferente de
        System.out.println("n1 é diferente de n2 ? " + resultado.diferente(10, 5));

        // Menor que
        System.out.println("n1 é menor que n2 ? " + resultado.menor(10, 5));

        // Maior que
        System.out.println("n1 é maior que n2 ? " + resultado.maior(10, 5));

        // Menor ou igual a
        System.out.println("n1 é menor ou igual a n2 ? " + resultado.menorIgual(10, 5));

        // Maior ou igual a
        System.out.println("n1 é maior ou igual a n2 ? " + resultado.maiorIgual(10, 5));
        System.out.println("");
        
        // Operadores Lógicos
        // E
        System.out.println("n1 é igual a n2 e n1 é diferente de n2 ? " + resultado.e(10, 5));
        
        // E boolean
        System.out.println("n1 é igual a n2 e n1 é diferente de n2 ? " + resultado.eb(10, 5));
        
        // OU
        System.out.println("n1 é igual a n2 ou n1 é diferente de n2 ? " + resultado.ou(10, 5));
        
        // OU boolean
        System.out.println("n1 é igual a n2 ou n1 é diferente de n2 ? " + resultado.oub(10, 5));
        
        // OU exclusivo
        System.out.println("n1 é igual a n2 ou n1 é diferente de n2 ? " + resultado.oue(10, 5));
        
        // NAO
        System.out.println("n1 é igual a n2 (inverta a resposta) ? " + resultado.nao(10, 5));
    }

}
