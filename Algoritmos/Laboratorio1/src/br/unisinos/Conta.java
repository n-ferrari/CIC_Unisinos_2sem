//Nathalia Ferrari
package br.unisinos;

public class Conta {
    private double saldo;
    private String numero;

    public void depositar(double valor){
        this.saldo += valor;
    }

    public void sacar(double valor){
        if(this.saldo >= valor){
            this.saldo -= valor;
        }else{
            System.out.println("Saldo nao disponivel");
        }

    }
    public String toString(){
        return "Saldo: " + saldo + ", numero: " + numero;
    }

    public Conta(String numero){
        this.numero = numero;
        saldo = 0;
    }

}
