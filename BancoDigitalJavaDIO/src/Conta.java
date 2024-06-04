import java.util.Scanner;
import java.util.Random;

public class Conta {
    Banco banco = new Banco();
    Random gerador = new Random();
    private int agencia = gerador.nextInt(100);
    private int numeroConta = gerador.nextInt(100);
    private double saldo;


    public Conta(int agencia, int numeroConta, double saldo) {
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }


    public void sacar(double valor){
        this.saldo -= valor;
    }

    public void depositar(double valor){
        this.saldo += valor;
    }
    public void transferir(double valor, Conta destino){
        this.saldo -= valor;
        destino.depositar(valor);
    }

    public int getAgencia(){
        return agencia;

    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;

    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


}


