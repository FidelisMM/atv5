package operacoes;

public class Operadores {

    // Operadores Aritméticos
    public float adicao(float n1, float n2) {
        return n1 + n2;
    }

    public float subtracao(float n1, float n2) {
        return n1 - n2;
    }

    public float multiplicacao(float n1, float n2) {
        return n1 * n2;
    }

    public float divisao(float n1, float n2) {
        return n1 / n2;
    }

    public float mod(float n1, float n2) {
        return n1 % n2;
    }

    // Operadores de Atribuição
    public float adicaoIgual(float n1, float n2) {
        return n1 += n2;
    }

    public float subtracaoIgual(float n1, float n2) {
        return n1 -= n2;
    }

    public float multiplicacaoIgual(float n1, float n2) {
        return n1 *= n2;
    }

    public float divisaoIgual(float n1, float n2) {
        return n1 /= n2;
    }

    public float modIgual(float n1, float n2) {
        return n1 %= n2;
    }

    // Operadores de Comparação
    public boolean igual(float n1, float n2) {
        return n1 == n2;
    }

    public boolean diferente(float n1, float n2) {
        return n1 != n2;
    }

    public boolean menor(float n1, float n2) {
        return n1 < n2;
    }

    public boolean maior(float n1, float n2) {
        return n1 > n2;
    }

    public boolean menorIgual(float n1, float n2) {
        return n1 <= n2;
    }

    public boolean maiorIgual(float n1, float n2) {
        return n1 >= n2;
    }

    // Operadores Lógicos
    public boolean e(float n1, float n2) {
        return n1 == n2 && n1 != n2;
    }

    public boolean eb(float n1, float n2) {
        return n1 == n2 & n1 != n2;
    }

    public boolean ou(float n1, float n2) {
        return n1 == n2 || n1 != n2;
    }

    public boolean oub(float n1, float n2) {
        return n1 == n2 | n1 != n2;
    }

    public boolean oue(float n1, float n2) {
        return (n1 == n2) ^ (n1 != n2);
    }

    public boolean nao(float n1, float n2) {
        return !(n1 == n2);
    }
}
