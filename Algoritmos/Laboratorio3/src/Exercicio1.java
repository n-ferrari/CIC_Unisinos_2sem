public class Exercicio1 {
    public static void main(String[] args) {
        int[][] array = new int[3][10];

        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[0].length; j++){
                array[i][j] = j;
            }
        }
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[0].length; j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
}