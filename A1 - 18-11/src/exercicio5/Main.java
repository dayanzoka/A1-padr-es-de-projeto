package exercicio5;

public class Main {
    public static void main(String[] args) {
        System.out.println("sistema antifraude iniciado :D");

        GerenciadorLog logprincipal = GerenciadorLog.getInstancia();
        logprincipal.registrarLog("evento", "aplicação iniciada com sucesso.");

        System.out.println("\nsimulando acesso multi-thread ;)\n");

        Thread thread1 = new Thread(() -> {
            GerenciadorLog logthread1 = GerenciadorLog.getInstancia();
            logthread1.registrarLog("erro", "falha na conexao com api externa (thread 1).");
        });

        Thread thread2 = new Thread(() -> {
            GerenciadorLog logthread2 = GerenciadorLog.getInstancia();
            logthread2.registrarLog("auditoria", "transação 1001 processada (thread 2).");
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\nverificacao final :3");
        boolean saoamesmainstancia = (logprincipal == GerenciadorLog.getInstancia());
        System.out.println("o objeto logprincipal é o mesmo retornado em sequência? " + (saoamesmainstancia ? "sim" : "nao"));
    }
}