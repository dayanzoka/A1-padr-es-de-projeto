package exercicio4;

public interface Verificacao {
    void setProximaVerificacao(Verificacao proxima);
    void verificar(Transacao transacao);
}
