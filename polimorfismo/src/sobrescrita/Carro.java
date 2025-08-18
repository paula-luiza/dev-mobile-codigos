package sobrescrita;

public class Carro extends Veiculo{

    @Override
    public String acelerar(){
        return "Carro Acelerando...";
    }

    @Override
    public String frear(){
        return "Carro Freando!";
    }
}
