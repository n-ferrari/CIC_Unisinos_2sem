import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        float[][] notasAlunos = new float[3][2];

        for(int i = 0; i < notasAlunos.length; i++){
            for(int j = 0; j < notasAlunos[i].length;j++){
                String notaStr = JOptionPane.showInputDialog("Informe a nota do aluno " + i + " nota " + j) ;
                notasAlunos[i][j] = Float.parseFloat(notaStr);
            }
        }

        String indiceAlunoStr = JOptionPane.showInputDialog("Indice do aluno: ");
        int indiceAluno = Integer.parseInt(indiceAlunoStr);

        String indiceNotaStr = JOptionPane.showInputDialog("Indice da nota: ");
        int indiceNota = Integer.parseInt(indiceNotaStr);

        JOptionPane.showMessageDialog(null, "A nota é: " + notasAlunos[indiceAluno][indiceNota]);

        System.out.print("Fim do programa");

        }
}