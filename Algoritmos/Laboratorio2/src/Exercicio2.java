public class Exercicio2 {
    public static void main(String[] args) {
        String[] nomes = new String[7];
        Teclado teclado = new Teclado();


        for(int i = 0; i < nomes.length; i++){
            int caracteres = 16;
            while(caracteres > 15){
                nomes[i] = teclado.leString("Digite um nome com até 15 caracteres");
                caracteres = nomes[i].length();
                if(caracteres > 15){
                    System.out.println();
                    System.out.println("> 15 caracteres, digite novamente");
                }
            }
        }
        System.out.println();
        for(int i = nomes.length - 1; i >= 0; i--){
            System.out.println(nomes[i]);
        }
    }
}
