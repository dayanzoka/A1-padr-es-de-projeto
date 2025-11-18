package exercicio1;

public class GeradorRelatorioDiario extends GeradorRelatorio {
    @Override
    protected Relatorio criarRelatorio() {
        return new RelatorioDiario();
    }
}