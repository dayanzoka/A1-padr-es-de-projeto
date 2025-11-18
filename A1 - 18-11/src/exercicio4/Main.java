package exercicio4;

public class Main{
    public static void main(String[] args) {
        Verificacao valor = new VerificacaoValorSus();
        Verificacao geo = new VerificacaoGeolocalizacao();
        Verificacao historico = new VerificacaoHistoricoUsuario();
        Verificacao dispositivo = new VerificacaoDispositivoIncomum();

        valor.setProximaVerificacao(geo);
        geo.setProximaVerificacao(historico);
        historico.setProximaVerificacao(dispositivo);

        System.out.println("transação 1: aprovada (passa por toda a cadeia)");
        Transacao t1 = new Transacao(150.00, "área normal", "limpo", "celular");
        valor.verificar(t1);

        if (t1.isAprovada()) {
            System.out.println("\nresultado: transação 1 aprovada.");
        } else {
            System.out.println("\nresultado: transação 1 reprovada.");
        }

        System.out.println("\n\ntransação 2: reprovada em geo (cadeia interrompida)");
        Transacao t2 = new Transacao(400.00, "área de alto risco", "limpo", "laptop");
        valor.verificar(t2);

        if (t2.isAprovada()) {
            System.out.println("\nresultado: transação 2 aprovada.");
        } else {
            System.out.println("\nresultado: transação 2 reprovada.");
        }

        System.out.println("\n\ntransação 3: reprovada em valor (cadeia interrompida no inicio)");
        Transacao t3 = new Transacao(6500.00, "área normal", "limpo", "desktop");
        valor.verificar(t3);

        if (t3.isAprovada()) {
            System.out.println("\nresultado: transação 3 aprovada.");
        } else {
            System.out.println("\nresultado: transação 3 reprovada.");
        }
    }
}
