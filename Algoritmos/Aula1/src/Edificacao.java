//abstract -> a classe nao pode ser instanciada, apenas pode ser classe mãe
public abstract class Edificacao {
    protected int quantidadeAndares;
    protected String material;
    protected double area;
    protected boolean ativo;

    public Edificacao(){}

    public int getQuantidadeAndares() {
        return quantidadeAndares;
    }

    public void setQuantidadeAndares(int quantidadeAndares) {
        this.quantidadeAndares = quantidadeAndares;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public Edificacao(int quantidadeAndares, String material, double area, boolean ativo) {
        this.quantidadeAndares = quantidadeAndares;
        this.material = material;
        this.area = area;
        this.ativo = ativo;
    }

    @Override
    public String toString() {
        return "Edificacao com " + quantidadeAndares + " andares, de "
                + material;
    }
}
