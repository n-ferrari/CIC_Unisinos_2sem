import javax.swing.*;

public class Exercicio4e5 {
    public static void main(String[] args) {
        double[] valores = new double[10];
        double[][] array = new double[2][5];

        for (int i = 0; i < valores.length; i++) {
            String valor = JOptionPane.showInputDialog("Escreva um valor");
            valores[i] = Double.parseDouble(valor);
        }


        for (int i = 0; i < array[0].length; i++) {
            array[0][i] = valores[i];
        }
        for (int i = 0; i < array[0].length; i++) {
            array[1][i] = valores[i + 5];
        }

        System.out.println(matriztoString(array));
    }

    public static String matriztoString(double[][] matriz){
        String matrizString = "";

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                String numero = Double.toString(matriz[i][j]);
                matrizString = matrizString.concat(numero + " ");
                //System.out.println(matriz[i][j]);
            }
            matrizString = matrizString.concat("\n");
        }
        return matrizString;
    }
}
