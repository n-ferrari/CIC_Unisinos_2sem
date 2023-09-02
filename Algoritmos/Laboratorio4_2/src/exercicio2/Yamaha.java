package exercicio2;

public class Yamaha extends Veiculo {
    public Yamaha() {
        super(0, 2);
    }

    @Override
    public void setPassageiros(int passageiros) throws NumeroPassageirosException {
        if(passageiros < 0 || passageiros > 2) {
            throw new NumeroPassageirosException("O numero de passageiros deve ser entre 0 e 2");
        }else{
            super.setPassageiros(passageiros);
        }
    }

}
