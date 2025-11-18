package exercicio4;

public class VerificacaoHistoricoUsuario implements Verificacao {
    private Verificacao proximaVerificacao;

    @Override
    public void setProximaVerificacao(Verificacao proxima) {
        this.proximaVerificacao = proxima;
    }

    @Override
    public void verificar(Transacao transacao) {
        System.out.println("verificação: histórico do usuário");
        if (transacao.getHistorico().equals("bloqueado")) {
            System.out.println("fraude detectada: histórico de usuário bloqueado.");
            transacao.reprovar();
        }

        if (transacao.isAprovada() && proximaVerificacao != null) {
            proximaVerificacao.verificar(transacao);
        }
    }
}