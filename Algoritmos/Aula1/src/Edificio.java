public class Edificio extends Edificacao{
    private int quantidadeElevadores;
    private int quantidadeVagasBox;

    public Edificio(){}

    public Edificio(int quantidadeAndares, String material, double area, int quantidadeElevadores, int quantidadeVagasBox, boolean ativo) {
        super(quantidadeAndares, material, area, ativo);
        this.quantidadeElevadores = quantidadeElevadores;
        this.quantidadeVagasBox = quantidadeVagasBox;
    }

    public int getQuantidadeElevadores() {
        return quantidadeElevadores;
    }

    public void setQuantidadeElevadores(int quantidadeElevadores) {
        this.quantidadeElevadores = quantidadeElevadores;
    }

    public int getQuantidadeVagasBox() {
        return quantidadeVagasBox;
    }

    public void setQuantidadeVagasBox(int quantidadeVagasBox) {
        this.quantidadeVagasBox = quantidadeVagasBox;
    }
}
