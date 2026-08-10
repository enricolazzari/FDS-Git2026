
public class arquivoJava {
    public static void main(String[] args) throws Exception {
        System.out.println("\nHi!");
        String version = System.getProperty("java.version");
        String osVersion = System.getProperty("os.version");
        System.out.println("Running Java Version "+version+"\n");
        System.out.println("Operational System in use: " + osVersion + "" );
    }
}
