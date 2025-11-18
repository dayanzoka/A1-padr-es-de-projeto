package exercicio1;

public class RelatorioDiario implements Relatorio {
    @Override
    public void prepararDados() {
        System.out.println("preparando dados, entregas e estoque para o relatório diário :D");
    }

    @Override
    public void formatar() {
        System.out.println("formatando em painel de KPIs. foco: velocidade e volume.");
    }

    @Override
    public void emitir() {
        System.out.println("relatório diário emitido com sucesso.");
    }
}

