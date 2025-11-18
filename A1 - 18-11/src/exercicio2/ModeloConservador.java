package exercicio2;

public class ModeloConservador implements CalculoRisco {
    @Override
    public int calcularRisco(double patrimonio, int idade) {
        int riscounificado = (int) (2 + (idade * 0.01));
        return Math.min(4, Math.max(1, riscounificado));
    }
}