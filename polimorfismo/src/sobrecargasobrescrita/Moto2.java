package sobrecargasobrescrita;

public class Moto2 extends Veiculo2{

    @Override
    public String acelerar(){
        return "Moto Acelerando...";
    }

    public String acelerar(double velocidade){
        return "Moto acelerando a " + velocidade + " km/h";
    }

    @Override
    public String frear(){
        return "Moto Freando!";
    }
}
