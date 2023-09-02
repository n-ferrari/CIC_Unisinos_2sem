import java.util.Scanner;

public class Jogador {
    Tabuleiro tabuleiro = new Tabuleiro();

    public void recebeJogada(String posicao){
        System.out.println("Objeto atingido: " + posicao);

    }

    public String realizaJogada(){
        System.out.print("Atirar na posição: ");
        Scanner sc = new Scanner(System.in);
        String posicao = sc.nextLine();
        while(!posicaoValida(posicao)){
            posicao = sc.nextLine();
        }
        return posicao;
    }

    public boolean posicaoValida(String entrada){

        if(entrada.length() != 2){
            System.out.print("Valor incorreto. Jogue novamente.");
            return false;
        }
        entrada = entrada.toUpperCase();
        int linha = entrada.charAt(0);
        if(linha < 65 || linha > (65 + tabuleiro.getLinhas() - 1)){
            System.out.print("Valor incorreto. Jogue novamente.");
            return false;
        }
        int coluna = Character.getNumericValue(entrada.charAt(1));
        if(coluna < 1 || coluna > tabuleiro.getColunas()){
            System.out.print("Valor incorreto. Jogue novamente.");
            return false;
        }
        return true;
    }
}
