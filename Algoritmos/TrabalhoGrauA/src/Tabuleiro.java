import java.util.Random;

public class Tabuleiro {

    int linhas = 5;
    int colunas = 5;
    int[][] tabuleiro = new int[linhas][colunas];
    int P = 4;
    int D = 5;
    int S = 6;
    Random r = new Random();


    public Tabuleiro() {
        while (P > 0) {
            int linha = r.nextInt(5);
            int coluna = r.nextInt(5);
            if (this.tabuleiro[linha][coluna] == 0) {
                this.tabuleiro[linha][coluna] = 1;
                P--;
            }
        }
        while (D > 0) {
            int linha = r.nextInt(5);
            int coluna = r.nextInt(5);
            if (this.tabuleiro[linha][coluna] == 0) {
                this.tabuleiro[linha][coluna] = 2;
                D--;
            }
        }
        while (S > 0) {
            int linha = r.nextInt(5);
            int coluna = r.nextInt(5);
            if (this.tabuleiro[linha][coluna] == 0) {
                this.tabuleiro[linha][coluna] = 3;
                S--;
            }
        }
    }

    public int[][] getTabuleiro() {
        return tabuleiro;
    }

    public void setTabuleiro(int[][] tabuleiro) {
        this.tabuleiro = tabuleiro;
    }

    public int getP() {
        return P;
    }

    public void setP(int p) {
        P = p;
    }

    public int getD() {
        return D;
    }

    public void setD(int d) {
        D = d;
    }

    public int getS() {
        return S;
    }

    public void setS(int s) {
        S = s;
    }

    public int getLinhas() {
        return linhas;
    }

    public void setLinhas(int linhas) {
        this.linhas = linhas;
    }

    public int getColunas() {
        return colunas;
    }

    public void setColunas(int colunas) {
        this.colunas = colunas;
    }

    public void imprimirTabuleiro(){
        char letra = 'A';
        int num = 1;
        System.out.print("  ");
        while(num <= colunas){
            System.out.print(num + " ");
            num++;
        }
        System.out.println();

        for(int i = 0; i < this.tabuleiro.length; i++){
            System.out.print(letra + " ");
            letra++;
            for(int j = 0; j < this.tabuleiro[i].length; j++){
                if(this.tabuleiro[i][j] == 0){
                    System.out.print("~ ");
                } else if (this.tabuleiro[i][j] == 1) {
                    System.out.print("P ");
                } else if (this.tabuleiro[i][j] == 2) {
                    System.out.print("D ");
                } else if (this.tabuleiro[i][j] == 3) {
                    System.out.print("S ");
                }

            }
            System.out.println();
        }
    }
    public String jogada(String posicao){

        int linha = posicao.charAt(0);

        if(tabuleiro[linha][coluna] == 0){
            return "Água";
        } else if(tabuleiro[linha][coluna] == 1){
            tabuleiro[linha][coluna] = 4;
            return "Porta-aviões";
        }else if(tabuleiro[linha][coluna] == 2){
            tabuleiro[linha][coluna] = 5;
            return "Fragata";
        }else if(tabuleiro[linha][coluna] == 3){
            tabuleiro[linha][coluna] = 6;
            return "Submarino";
        }else if(tabuleiro[linha][coluna] == 4){
            return "Porta-aviões já atingido";
        }else if(tabuleiro[linha][coluna] == 5){
            return "Fragata já atingido";
        }else {
            return "Submarino já atingido";
        }
    }
}
