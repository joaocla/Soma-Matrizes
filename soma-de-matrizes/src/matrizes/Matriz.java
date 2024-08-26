package matrizes;
import java.util.Random;

public class Matriz {
    private int[][] dados;

    // construtor que inicializa a matriz com dimensões especificadas
    public Matriz(int linhas, int colunas) {
        dados = new int[linhas][colunas];
    }

    // construtor que recebe uma matriz existente
    public Matriz(int[][] dados) {
        this.dados = dados;
    }

    // preenche a matriz com valores aleatórios
    public void preencher(Random random) {
        for (int i = 0; i < dados.length; i++) {
            for (int j = 0; j < dados[i].length; j++) {
                dados[i][j] = random.nextInt(10);
            }
        }
    }

    // retorna o número de linhas da matriz
    public int getLinhas() {
        return dados.length;
    }

    // retorna o número de colunas da matriz
    public int getColunas() {
        return dados[0].length;
    }

    // retorna o valor de um elemento específico da matriz
    public int getElemento(int linha, int coluna) {
        if (linha < dados.length && coluna < dados[linha].length) {
            return dados[linha][coluna];
        }
        return 0;
    }

    // exibe a matriz
    public void exibir() {
        for (int[] linha : dados) {
            for (int elemento : linha) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }
    }

    // soma duas matrizes com dimensões diferentes
    public static Matriz somar(Matriz matriz1, Matriz matriz2) {
        int linhasMax = Math.max(matriz1.getLinhas(), matriz2.getLinhas());
        int colunasMax = Math.max(matriz1.getColunas(), matriz2.getColunas());

        int[][] soma = new int[linhasMax][colunasMax];

        for (int i = 0; i < linhasMax; i++) {
            for (int j = 0; j < colunasMax; j++) {
                soma[i][j] = matriz1.getElemento(i, j) + matriz2.getElemento(i, j);
            }
        }

        return new Matriz(soma);
    }
}
