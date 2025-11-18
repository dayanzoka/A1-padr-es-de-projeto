package exercicio1;

public class Main {
    public static void main(String[] args) {
        System.out.println("relatórios logísticos :D");

        // 1. Geração do Relatório Diário
        GeradorRelatorio geradorDiario = new GeradorRelatorioDiario();
        System.out.println("\nsolicitando relatório diário:");
        geradorDiario.gerarRelatorioCompleto();

        // 2. Geração do Relatório Emergencial
        GeradorRelatorio geradorEmergencial = new GeradorRelatorioEmergencial();
        System.out.println("solicitando relatório emergencial:");
        geradorEmergencial.gerarRelatorioCompleto();
    }
}