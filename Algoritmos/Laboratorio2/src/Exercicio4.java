public class Exercicio4 {
    public static void main(String[] args) {
        int[] V = new int[10];
        Teclado teclado = new Teclado();

        for(int i = 0; i < V.length; i++){
            V[i] = teclado.leInt();
        }

        for(int i = 0; i < V.length; i++){
            System.out.print(V[i]+" ");
        }
        System.out.println();
        for(int i = 1; i < V.length; i = i + 2){
            int aux = V[i];
            V[i] = V[i - 1];
            V[i - 1] = aux;
        }
        for(int i = 0; i < V.length; i++){
            System.out.print(V[i]+" ");
        }

    }
}
