package exercicio4;

public class Transacao {
    private double valor;
    private String geolocalizacao;
    private String historico;
    private String dispositivo;
    private boolean aprovada;

    public Transacao(double valor, String geo, String hist, String disp) {
        this.valor = valor;
        this.geolocalizacao = geo;
        this.historico = hist;
        this.dispositivo = disp;
        this.aprovada = true;
    }

    public double getValor() { return valor; }
    public String getGeolocalizacao() { return geolocalizacao; }
    public String getHistorico() { return historico; }
    public String getDispositivo() { return dispositivo; }
    public boolean isAprovada() { return aprovada; }

    public void reprovar() {
        this.aprovada = false;
    }
}