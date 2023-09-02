//Nathalia Ferrari
package br.unisinos;

public class ContaTeste {
    public static void main(String[] args){
        Conta conta = new Conta("2978");

        conta.depositar(10);
        conta.sacar(20);
        System.out.println(conta.toString());
        conta.depositar(15);
        conta.sacar(20);
        System.out.println(conta.toString());
    }
}
