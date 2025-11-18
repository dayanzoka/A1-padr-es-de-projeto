package exercicio2;

public class Main{
    public static void main(String[] args) {
        System.out.println("plataforma de análise de investimentos iniciada :D");

        PlataformaAnalise plataforma = new PlataformaAnalise("dayane");
        plataforma.setEstrategia(new ModeloModerado());
        plataforma.analisarCliente(50000.00, 20);

        System.out.println("\nimulação de mudança de perfil em tempo de execução\n");

        PlataformaAnalise consultormaria = new PlataformaAnalise("camille");
        consultormaria.setEstrategia(new ModeloAgressivo());
        consultormaria.analisarCliente(150000.00, 20);

        System.out.println("\nmudança dinâmica na plataforma de dayane\n");

        plataforma.setEstrategia(new ModeloConservador());
        plataforma.analisarCliente(50000.00, 20);
    }
}
