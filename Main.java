public class Main {

    public static void main (String [] args){

        Moto moto = new Moto("Suzuki", "Hayabusa", 2001, "Esportivo");
        Carro carro = new Carro("Hyundai", "Creta", 2001, 4);

        moto.exibirDetalhes();
        carro.exibirDetalhes();

    }
    
}
