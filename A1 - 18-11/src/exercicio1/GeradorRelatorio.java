package exercicio1;

public abstract class GeradorRelatorio {
    protected abstract Relatorio criarRelatorio();

    public void gerarRelatorioCompleto() {
        Relatorio relatorio = criarRelatorio();

        System.out.println("\niniciando geração ;D");
        relatorio.prepararDados();
        relatorio.formatar();
        relatorio.emitir();
        System.out.println("geração concluída\n");
    }
}