public class Exercicio1 {
    public static void main(String[] args) {
        //int vetor[] = new int[8];
        int vetor[] = {0, 1, -2, 3, 20, 5, 6, 7};
        int soma = 0;
        int positivos = 0;
        for(int i = 0; i < 8; i++){
            System.out.print(vetor[i]+" ");
            soma =+ vetor[i];
            if(vetor[i] > 0){
                positivos++;
            }
        }

        System.out.println("\nA soma e " + soma);
        System.out.println(positivos +" numeros sao positivos");
    }
}