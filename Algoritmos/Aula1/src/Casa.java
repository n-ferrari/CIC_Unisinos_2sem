public class Casa extends Edificacao{
    private boolean comGaragem;
    private boolean comPiscina;

    public Casa(){}

    public Casa(int quantidadeAndares, String material, double area, boolean comGaragem, boolean comPiscina, boolean ativo) {
        super(quantidadeAndares, material, area, ativo);
        this.comGaragem = comGaragem;
        this.comPiscina = comPiscina;
    }

    public boolean isComGaragem() {
        return comGaragem;
    }

    public void setComGaragem(boolean comGaragem) {
        this.comGaragem = comGaragem;
    }

    public boolean isComPiscina() {
        return comPiscina;
    }

    public void setComPiscina(boolean comPiscina) {
        this.comPiscina = comPiscina;
    }
}
