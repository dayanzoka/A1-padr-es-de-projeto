package exercicio3;

public class PainelControle implements Observador {
    @Override
    public void atualizar(String tipo, double valor, String regiao) {
        System.out.println(" painel de controle atualizado: " + tipo.toLowerCase() + " em " + regiao.toLowerCase() + " = " + valor);
    }
}