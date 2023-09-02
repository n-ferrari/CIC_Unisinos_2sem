package exercicio2;

public class LandRover extends Veiculo{

    public LandRover() {
        super(0, 6);
    }

    @Override
    public void setPassageiros(int passageiros) throws NumeroPassageirosException {
        if(passageiros < 0 || passageiros > 6) {
            throw new NumeroPassageirosException("O numero de passageiros deve ser entre 0 e 6");
        }else{
            super.setPassageiros(passageiros);
        }
    }

}
