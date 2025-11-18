package exercicio3;

public interface Sujeito {
    void inscrever(Observador o);
    void desinscrever(Observador o);
    void notificarObservadores();
}