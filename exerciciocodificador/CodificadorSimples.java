package exerciciocodificador;
import java.time.LocalDate;

public class CodificadorSimples implements Codificador {
    public String getNome() {
        return "Codificador Simples";
    }

    public LocalDate getDataCriacao() {
        return LocalDate.of(2025, 03, 13);
    }

    public int getNivelSeguranca(){
        return 1;
    }

    public String codifica(String str) {
        StringBuilder encoded = new StringBuilder();

        for (char c : str.toCharArray()) {
            encoded.append((char) (c + 1));
        }

        return encoded.toString();
    }

    public String decodifica(String str) {
        StringBuilder encoded = new StringBuilder();

        for (char c : str.toCharArray()) {
            encoded.append((char) (c - 1));
        }

        return encoded.toString();
    }

    public String codifica1(String str) {
        throw new UnsupportedOperationException("codifica1 nao suportado por CodificadorSimples");
    }

    public String descodifica1(String str) {
        throw new UnsupportedOperationException("descodifica1 nao suportado por CodificadorSimples");
    }

    public String codifica2(String str) {
        throw new UnsupportedOperationException("codifica2 nao suportado por CodificadorSimples");
    }

    public String descodifica2(String str) {
        throw new UnsupportedOperationException("descodifica2 nao suportado por CodificadorSimples");
    }

}