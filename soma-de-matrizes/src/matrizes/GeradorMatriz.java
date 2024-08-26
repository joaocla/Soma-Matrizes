package matrizes;
import java.util.Random;

public class GeradorMatriz {
    private Random random;

    public GeradorMatriz() {
        this.random = new Random();
    }

    public Matriz gerarMatrizAleatoria() {
        int linhas = random.nextInt(5) + 2;
        int colunas = random.nextInt(5) + 2;
        Matriz matriz = new Matriz(linhas, colunas);
        matriz.preencher(random);
        return matriz;
    }
}
