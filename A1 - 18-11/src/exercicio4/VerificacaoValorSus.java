package exercicio4;

public class VerificacaoValorSus implements Verificacao {
    private Verificacao proximaVerificacao;

    @Override
    public void setProximaVerificacao(Verificacao proxima) {
        this.proximaVerificacao = proxima;
    }

    @Override
    public void verificar(Transacao transacao) {
        System.out.println("verificação: valor suspeito :0");
        if (transacao.getValor() > 5000.00) {
            System.out.println("fraude detectada: valor RS" + transacao.getValor() + " acima do limite de r$5000,00.");
            transacao.reprovar();
        }

        if (transacao.isAprovada() && proximaVerificacao != null) {
            proximaVerificacao.verificar(transacao);
        }
    }
}