package exercicio2;

public class Veiculo {
    private double velocidade;
    private int passageiros;

    public Veiculo(double velocidade, int passageiros) {
        this.velocidade = velocidade;
        this.passageiros = passageiros;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) throws VelocidadeMaximaException {
        this.velocidade = velocidade;
    }

    public int getPassageiros() {
        return passageiros;
    }

    public void setPassageiros(int passageiros) throws NumeroPassageirosException {
        this.passageiros = passageiros;
    }

    public void acelerar() throws VelocidadeMaximaException {
        if(this.velocidade > 80){
            throw new VelocidadeMaximaException("Velocidade maxima ultrapassada");
        }else{
            this.velocidade = this.velocidade + 10;
        }
    }

    public void freiar(){
        this.velocidade = this.velocidade - 10;
    }
}