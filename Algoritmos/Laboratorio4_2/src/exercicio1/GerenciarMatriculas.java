package exercicio1;

import java.util.Scanner;

public class GerenciarMatriculas {

    private static final int tamanho = 5;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Aluno[] inscritos = new Aluno[tamanho];

        int contador = 0;

        while (true){
            try{
                if(contador == 5){
                    break;
                }
                System.out.println("\nMatrícula número " + (contador + 1));
                System.out.print("Nome: ");
                String nome = scanner.nextLine();
                tamanhoCampo30(nome);
                System.out.print("CPF: ");
                String cpf = scanner.nextLine();
                tamanhoCampo11(cpf);
                System.out.print("Endereco: ");
                String endereco = scanner.nextLine();
                System.out.print("Telefone: ");
                tamanhoCampo60(endereco);
                String telefone = scanner.nextLine();
                tamanhoCampo11(telefone);
                System.out.print("E-mail: ");
                String email = scanner.nextLine();
                tamanhoCampo30(email);

                inscritos[contador] = new Aluno(nome, cpf, endereco, telefone, email);

                contador++;

                System.out.println("Deseja continuar: (S/N)");
                String resposta = scanner.nextLine().toLowerCase();
                if(!resposta.equals("s")){
                    break;
                }

            }catch (Exception e){
                System.err.println("Erro: " + e.getMessage());
                System.out.println("Deseja continuar: (S/N)");
                String resposta = scanner.nextLine().toLowerCase();
                if(!resposta.equals("s")){
                    break;
                }
            }
        }
    }

    private static void tamanhoCampo11(String cpf) throws Exception{
        if(cpf.length() != 11){
            throw new ExcedidoTamanhoDoCampoException("Quantidade de caracteres deve ser 11");
        }
    }
    private static void tamanhoCampo30(String nome) throws Exception{
        if(nome.length() > 30){
            throw new ExcedidoTamanhoDoCampoException("Quantidade de caracteres > 30");
        }
    }
    private static void tamanhoCampo60(String nome) throws Exception{
        if(nome.length() > 60){
            throw new ExcedidoTamanhoDoCampoException("Quantidade de caracteres > 60");
        }
    }
}
