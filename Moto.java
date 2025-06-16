public class Moto extends Veiculo {

    private String tipoDeGuidao;

    public Moto(String marca, String modelo, Integer ano, String tipoDeGuidao) {
        super(marca, modelo, ano);
        this.tipoDeGuidao = tipoDeGuidao;
    }

    public String getTipoDeGuidao() {
        return tipoDeGuidao;
    }

    public void setTipoDeGuidao(String tipoDeGuidao) {
        this.tipoDeGuidao = tipoDeGuidao;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.printf("; Tipo de guidão = " + tipoDeGuidao + "\n");
    }
    
}