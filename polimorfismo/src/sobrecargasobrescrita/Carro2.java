package sobrecargasobrescrita;

public class Carro2 extends Veiculo2{

    // exemplo de sobreescrita
    @Override
    public String acelerar(){
        return "Carro Acelerando...";
    }

    // exemplo de sobrecarga
    public String acelerar(double velocidade){
        return "Carro acelerando a " + velocidade + " km/h";
    }

    @Override
    public String frear(){
        return "Carro Freando!";
    }
}
