public class Exercicio3 {
    public static void main(String[] args) {
        int[] V = new int[10];
        Teclado teclado = new Teclado();
        int positivos = 0;
        int negativos = 0;

        for(int i = 0; i < V.length; i++){
            V[i] = teclado.leInt();
            if(V[i] > 0){
                positivos++;
            }
            if(V[i] < 0){
                negativos++;
            }
        }
        int[] arrayPositivos = new int[positivos];
        int[] arrayNegativos = new int[negativos];

        int j = 0;
        for(int i = 0; i < arrayPositivos.length; i++){
            while(j < V.length){
                if(V[j] > 0){
                    arrayPositivos[i] = V[j];
                    j++;
                    break;
                }
                j++;
            }
        }

        j = 0;
        for(int i = 0; i < arrayNegativos.length; i++){
            while(j < V.length){
                if(V[j] < 0){
                    arrayNegativos[i] = V[j];
                    j++;
                    break;
                }
                j++;
            }
        }

        for(int i = 0; i < V.length; i++){
            System.out.print(V[i]+" ");
        }
        System.out.println();

        for(int i = 0; i < arrayPositivos.length; i++){
            System.out.print(arrayPositivos[i]+" ");
        }
        System.out.println();

        for(int i = 0; i < arrayNegativos.length; i++){
            System.out.print(arrayNegativos[i]+" ");
        }
    }
}
