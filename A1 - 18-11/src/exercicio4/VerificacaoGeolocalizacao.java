package exercicio4;

public class VerificacaoGeolocalizacao implements Verificacao {
    private Verificacao proximaVerificacao;

    @Override
    public void setProximaVerificacao(Verificacao proxima) {
        this.proximaVerificacao = proxima;
    }

    @Override
    public void verificar(Transacao transacao) {
        System.out.println("verificação: geolocalização");
        if (transacao.getGeolocalizacao().equals("área de alto risco")) {
            System.out.println("fraude detectada: geolocalização em área de alto risco.");
            transacao.reprovar();
        }

        if (transacao.isAprovada() && proximaVerificacao != null) {
            proximaVerificacao.verificar(transacao);
        }
    }
}
