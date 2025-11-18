package exercicio2;

public class ModeloAgressivo implements CalculoRisco {
    @Override
    public int calcularRisco(double patrimonio, int idade) {
        double fatorpatrimonio = patrimonio > 100000 ? 1.5 : 1.0;
        int riscounificado = (int) (8 + (fatorpatrimonio * 0.5) - (idade * 0.05));
        return Math.min(10, Math.max(1, riscounificado));
    }
}