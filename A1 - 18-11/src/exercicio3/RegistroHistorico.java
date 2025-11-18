package exercicio3;

public class RegistroHistorico implements Observador {
    @Override
    public void atualizar(String tipo, double valor, String regiao) {
        System.out.println("registro histórico: dado salvo - tipo: " + tipo.toLowerCase() + ", valor: " + valor + ", região: " + regiao.toLowerCase());
    }
}