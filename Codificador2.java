import java.time.LocalDate;

public class Codificador2 implements Codificador {
    public String getNome() {
        return "Codificador2";
    }

    public LocalDate getDataCriacao() {
        return LocalDate.of(2025, 03, 13);
    }

    public int getNivelSeguranca(){
        return 15;
    }

    public String codifica2(String str) {
        String invertida = new StringBuilder(str).reverse().toString();
 
        // 2) desloca cada caractere
        StringBuilder codificado = new StringBuilder();
        for (char c : invertida.toCharArray()) {
            codificado.append((char) (c + DESLOCAMENTO));
        }
 
        return codificado.toString();
    }

    public String decodifica2(String str) {
        // desfaz o deslocamento primeiro
        StringBuilder semDeslocamento = new StringBuilder();
        for (char c : str.toCharArray()) {
            semDeslocamento.append((char) (c - DESLOCAMENTO));
        }
 
        // depois desfaz a inversão
        return semDeslocamento.reverse().toString();
    }
    
}
