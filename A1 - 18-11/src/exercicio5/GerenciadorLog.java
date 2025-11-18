package exercicio5;

public class GerenciadorLog {
    private static volatile GerenciadorLog instancia;
    private String nomeinstancia;

    private GerenciadorLog(String nomeinstancia) {
        this.nomeinstancia = nomeinstancia;
        System.out.println("gerenciador de log unico criado: " + nomeinstancia.toLowerCase());
    }

    public static GerenciadorLog getInstancia() {
        if (instancia == null) {
            synchronized (GerenciadorLog.class) {
                if (instancia == null) {
                    instancia = new GerenciadorLog("log_principal");
                }
            }
        }
        return instancia;
    }

    public void registrarLog(String tipo, String mensagem) {
        System.out.println("instância [" + nomeinstancia.toLowerCase() + "]: " + tipo.toLowerCase() + " -> " + mensagem.toLowerCase());
    }
}
