package exercicio1;

public class RelatorioEmergencial implements Relatorio {
    @Override
    public void prepararDados() {
        System.out.println("procurando informações de eventos críticos e alertas de segurança para o relatorio emergencial.");
    }

    @Override
    public void formatar() {
        System.out.println("formatando em formato de alerta imediato (emergencial). foco: risco e ação.");
    }

    @Override
    public void emitir() {
        System.out.println("relatório emergencial emitido com sucesso. enviando notificação aos gestores.");
    }
}