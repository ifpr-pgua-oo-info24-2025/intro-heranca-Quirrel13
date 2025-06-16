public class Carro extends Veiculo {

    private Integer numeroDePortas;

    public Carro(String marca, String modelo, Integer ano, Integer numeroDePortas) {
        super(marca, modelo, ano);
        this.numeroDePortas = numeroDePortas;
    }

    public Integer getNumeroDePortas() {
        return numeroDePortas;
    }

    public void setNumeroDePortas(Integer numeroDePortas) {
        this.numeroDePortas = numeroDePortas;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.printf("; Número de portas = " + numeroDePortas + "\n");
    }
    
}