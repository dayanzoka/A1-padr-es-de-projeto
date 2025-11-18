package exercicio3;

public class Main {
    public static void main(String[] args) {
        Sensor sensorpoluicao = new Sensor("poluição", "zona sul");

        Observador painel = new PainelControle();
        Observador alertas = new ModuloAlertas();
        Observador registro = new RegistroHistorico();

        sensorpoluicao.inscrever(painel);
        sensorpoluicao.inscrever(alertas);
        sensorpoluicao.inscrever(registro);

        System.out.println("\nsimulação de coleta de dados :D\n");

        sensorpoluicao.setValor(45.5);
        sensorpoluicao.setValor(92.1);

        System.out.println("\num módulo e desinscrito\n");

        sensorpoluicao.desinscrever(painel);
        sensorpoluicao.setValor(60.0);
    }
}
