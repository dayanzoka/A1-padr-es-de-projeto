package exercicio3;

import java.util.ArrayList;
import java.util.List;

public class Sensor implements Sujeito {
    private List<Observador> observadores;
    private String tipo;
    private double valor;
    private String regiao;

    public Sensor(String tipo, String regiao) {
        this.observadores = new ArrayList<>();
        this.tipo = tipo;
        this.regiao = regiao;
        this.valor = 0.0;
        System.out.println("sensor " + tipo.toLowerCase() + " na região " + regiao.toLowerCase() + " inicializado.");
    }

    @Override
    public void inscrever(Observador o) {
        observadores.add(o);
        System.out.println(o.getClass().getSimpleName().toLowerCase() + " inscrito no sensor " + tipo.toLowerCase() + ".");
    }

    @Override
    public void desinscrever(Observador o) {
        observadores.remove(o);
        System.out.println(o.getClass().getSimpleName().toLowerCase() + " desinscrito do sensor " + tipo.toLowerCase() + ".");
    }

    @Override
    public void notificarObservadores() {
        System.out.println("\nnotificando " + observadores.size() + " observadores sobre a mudanca em " + tipo.toLowerCase() + "...");
        for (Observador observador : observadores) {
            observador.atualizar(tipo, valor, regiao);
        }
    }

    public void setValor(double novovalor) {
        this.valor = novovalor;
        System.out.println("\nnovo dado: " + tipo.toLowerCase() + " em " + regiao.toLowerCase() + " alterado para " + novovalor);
        notificarObservadores();
    }
}