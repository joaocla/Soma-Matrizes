package matrizes;

public class Main {
    public static void main(String[] args) {
        GeradorMatriz gerador = new GeradorMatriz();

        Matriz matriz1 = gerador.gerarMatrizAleatoria();
        Matriz matriz2 = gerador.gerarMatrizAleatoria();

        Matriz somaMatriz = Matriz.somar(matriz1, matriz2);

        System.out.println("Matriz 1:");
        matriz1.exibir();
        System.out.println("Matriz 2:");
        matriz2.exibir();
        System.out.println("Soma das matrizes:");
        somaMatriz.exibir();
    }
}
