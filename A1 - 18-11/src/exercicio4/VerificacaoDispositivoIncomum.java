package exercicio4;

public class VerificacaoDispositivoIncomum implements Verificacao {
    private Verificacao proximaVerificacao;

    @Override
    public void setProximaVerificacao(Verificacao proxima) {
        this.proximaVerificacao = proxima;
    }

    @Override
    public void verificar(Transacao transacao) {
        System.out.println("verificaçãp: detecção de dispositivo incomum");
        if (transacao.getDispositivo().equals("desconhecido")) {
            System.out.println("fraude detectada: dispositivo incomum detectado :0");
            transacao.reprovar();
        }

        if (transacao.isAprovada() && proximaVerificacao != null) {
            proximaVerificacao.verificar(transacao);
        }
    }
}
