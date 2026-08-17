import java.time.LocalDate;

public class Codificador2 implements Codificador {
    private static final int DESLOCAMENTO = 3; 
    public String getNome() {
        return "Codificador2";
    }

    public LocalDate getDataCriacao() {
        return LocalDate.of(2025, 03, 13);
    }

    public int getNivelSeguranca(){
        return 10;
    }

    public String codifica2(String str) {
        String invertida = new StringBuilder(str).reverse().toString();
 
    
        StringBuilder codificado = new StringBuilder();
        for (char c : invertida.toCharArray()) {
            codificado.append((char) (c + DESLOCAMENTO));
        }
 
        return codificado.toString();
    }

    public String descodifica2(String str) {
        StringBuilder semDeslocamento = new StringBuilder();
        for (char c : str.toCharArray()) {
            semDeslocamento.append((char) (c - DESLOCAMENTO));
        }

        return semDeslocamento.reverse().toString();
    }

    public String codifica(String str) {
        throw new UnsupportedOperationException("codifica nao suportado por Codificador2");
    }

    public String decodifica(String str) {
        throw new UnsupportedOperationException("decodifica nao suportado por Codificador2");
    }

    public String codifica1(String str) {
        throw new UnsupportedOperationException("codifica1 nao suportado por Codificador2");
    }

    public String descodifica1(String str) {
        throw new UnsupportedOperationException("descodifica1 nao suportado por Codificador2");
    }

}
