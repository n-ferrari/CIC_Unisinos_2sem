package exercicio2;

public class Porsche extends Veiculo {
    public Porsche() {
        super(0, 5);
    }

    @Override
    public void setPassageiros(int passageiros) throws NumeroPassageirosException {
        if(passageiros < 0 || passageiros > 5) {
            throw new NumeroPassageirosException("O numero de passageiros deve ser entre 0 e 5");
        }else{
            super.setPassageiros(passageiros);
        }
    }

}
