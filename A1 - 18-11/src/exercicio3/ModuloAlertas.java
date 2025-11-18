package exercicio3;

public class ModuloAlertas implements Observador {
    @Override
    public void atualizar(String tipo, double valor, String regiao) {
        if (tipo.equalsIgnoreCase("poluiçã") && valor > 80.0) {
            System.out.println("módulo de alertas: alerta emitido! poluicao em " + regiao.toLowerCase() + " atingiu nivel crítico D: " + valor);
        } else {
            System.out.println("modulo de alertas: status ok para " + tipo.toLowerCase() + " em " + regiao.toLowerCase());
        }
    }
}