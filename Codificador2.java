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

    public String decodifica2(String str) {
        StringBuilder semDeslocamento = new StringBuilder();
        for (char c : str.toCharArray()) {
            semDeslocamento.append((char) (c - DESLOCAMENTO));
        }
 
        return semDeslocamento.reverse().toString();
    }
    
}
