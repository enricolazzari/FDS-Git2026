package exerciciocodificador;
import java.util.function.Function;

public class ExemploFactory {

    public static void main(String[] args) {
        String texto = "Este e o string a ser codificado";

        for (CodificadorFactory.Tipo tipo : CodificadorFactory.Tipo.values()) {
            Codificador cod = CodificadorFactory.criar(tipo);

            System.out.println("=========================================");
            System.out.println("Tipo solicitado a fabrica: " + tipo);
            System.out.println("Codificador: " + cod.getNome());
            System.out.println("Data de criacao: " + cod.getDataCriacao());
            System.out.println("Nivel de seguranca: " + cod.getNivelSeguranca());
            System.out.println("Texto original: " + texto);

            testarPar("codifica/decodifica", texto,
                    cod::codifica, cod::decodifica);

            testarPar("codifica1/descodifica1", texto,
                    cod::codifica1, cod::descodifica1);

            testarPar("codifica2/descodifica2", texto,
                    cod::codifica2, cod::descodifica2);
        }

        System.out.println("=========================================");
        System.out.println("Selecao de Codificador por nivel de seguranca desejado:");
        int[] niveisDesejados = {1, 5, 8, 9, 50};
        for (int nivelDesejado : niveisDesejados) {
            Codificador cod = CodificadorFactory.criar(nivelDesejado);
            System.out.println("Desejado: " + nivelDesejado
                    + " -> Escolhido: " + cod.getNome()
                    + " (nivel real " + cod.getNivelSeguranca() + ")");
        }
        System.out.println("=========================================");
    }

    private static void testarPar(String nomePar, String texto, Function<String, String> codificar, Function<String, String> decodificar) {
        try {
            String codificado = codificar.apply(texto);
            String decodificado = decodificar.apply(codificado);
            System.out.println("[" + nomePar + "] codificado: " + codificado);
            System.out.println("[" + nomePar + "] decodificado: " + decodificado);
            System.out.println("[" + nomePar + "] round-trip OK: " + texto.equals(decodificado));
        } catch (UnsupportedOperationException e) {
            System.out.println("[" + nomePar + "] nao suportado por este codificador: " + e.getMessage());
        }
    }
}