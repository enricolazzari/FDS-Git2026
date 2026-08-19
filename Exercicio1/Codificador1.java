package Exercicio1;
import java.time.LocalDate;

public class Codificador1 implements Codificador {
    public String getNome() {
        return "Codificador1";
    }

    public LocalDate getDataCriacao() {
        return LocalDate.of(2025, 03, 13);
    }

    public int getNivelSeguranca(){
        return 7;
    }

    public String codifica1(String str) {
        StringBuilder encoded = new StringBuilder();

        for (char c : str.toCharArray()) {
            encoded.append((char) (c * 2));
        }

        return encoded.toString();
    }

    public String descodifica1(String str) {
        StringBuilder encoded = new StringBuilder();

        for (char c : str.toCharArray()) {
            encoded.append((char) (c / 2));
        }

        return encoded.toString();
    }

    public String codifica(String str) {
        throw new UnsupportedOperationException("codifica nao suportado por Codificador1");
    }

    public String decodifica(String str) {
        throw new UnsupportedOperationException("decodifica nao suportado por Codificador1");
    }

    public String codifica2(String str) {
        throw new UnsupportedOperationException("codifica2 nao suportado por Codificador1");
    }

    public String descodifica2(String str) {
        throw new UnsupportedOperationException("descodifica2 nao suportado por Codificador1");
    }

}