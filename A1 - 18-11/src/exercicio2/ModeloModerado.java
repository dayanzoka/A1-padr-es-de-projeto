package exercicio2;

public class ModeloModerado implements CalculoRisco {
    @Override
    public int calcularRisco(double patrimonio, int idade) {
        int riscounificado = (int) (5 + (idade * 0.02));
        return Math.min(7, Math.max(3, riscounificado));
    }
}