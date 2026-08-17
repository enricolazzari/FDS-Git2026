/**
 * Factory responsavel por centralizar a criacao das implementacoes
 * de Codificador, sem que o cliente precise conhecer as classes concretas.
 */
public class CodificadorFactory {

    public enum Tipo {
        SIMPLES,
        DOBRO_CARACTERE,
        INVERSAO_DESLOCAMENTO
    }

    public static Codificador criar(Tipo tipo) {
        switch (tipo) {
            case SIMPLES:
                return new CodificadorSimples();
            case DOBRO_CARACTERE:
                return new Codificador1();
            case INVERSAO_DESLOCAMENTO:
                return new Codificador2();
            default:
                throw new IllegalArgumentException("Tipo de codificador desconhecido: " + tipo);
        }
    }

    private static Codificador[] todasImplementacoes() {
        return new Codificador[] {
            new CodificadorSimples(),
            new Codificador1(),
            new Codificador2()
        };
    }

    public static Codificador criar(int nivelSegurancaDesejado) {
        Codificador[] candidatos = todasImplementacoes();

        Codificador maisProximo = candidatos[0];
        int menorDiferenca = Math.abs(maisProximo.getNivelSeguranca() - nivelSegurancaDesejado);

        for (int i = 1; i < candidatos.length; i++) {
            Codificador atual = candidatos[i];
            int diferenca = Math.abs(atual.getNivelSeguranca() - nivelSegurancaDesejado);

            if (diferenca < menorDiferenca) {
                menorDiferenca = diferenca;
                maisProximo = atual;
            }
        }

        return maisProximo;
    }
}