package sobrescrita;

public class Moto extends Veiculo{

    @Override
    public String acelerar(){
        return "Moto Acelerando...";
    }

    @Override
    public String frear(){
        return "Moto Freando!";
    }
}
