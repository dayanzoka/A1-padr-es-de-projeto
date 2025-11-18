package exercicio2;

public class PlataformaAnalise {
    private CalculoRisco estrategia;
    private String nomecliente;

    public PlataformaAnalise(String nomecliente) {
        this.nomecliente = nomecliente;
    }

    public void setEstrategia(CalculoRisco estrategia) {
        this.estrategia = estrategia;
        String modelo = estrategia.getClass().getSimpleName().toLowerCase();
        System.out.println("mudo: modelo de cálculo de risco alterado para " + modelo);
    }

    public void analisarCliente(double patrimonio, int idade) {
        if (estrategia == null) {
            System.out.println("erro: nenhuma estratégia de cálculo de risco definida D: ");
            return;
        }

        int nivelrisco = estrategia.calcularRisco(patrimonio, idade);
        String modelo = estrategia.getClass().getSimpleName().toLowerCase();

        System.out.println("análise de risco para o cliente: " + nomecliente.toLowerCase());
        System.out.println("dados: patrimonio RS:" + String.format("%.2f", patrimonio).toLowerCase() + ", idade " + idade);
        System.out.println("utilizando modelo: " + modelo);
        System.out.println("resultado: o nível de risco é " + nivelrisco + " (escala 1-10)");
    }
}