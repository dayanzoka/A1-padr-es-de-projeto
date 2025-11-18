package exercicio1;

public class GeradorRelatorioEmergencial extends GeradorRelatorio {
    @Override
    protected Relatorio criarRelatorio() {
        return new RelatorioEmergencial();
    }
}