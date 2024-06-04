public class ContaCorrente extends Conta {

    private int agencia = gerador.nextInt(10000);
    private int numeroConta = gerador.nextInt(10000);
    private double saldo;

    public ContaCorrente(int agencia, int numeroConta, double saldo) {
        super(agencia, numeroConta, saldo);
    }

    @Override
    public String toString() {
        return "ContaCorrente{" +
                "agencia=" + agencia +
                ", numeroConta=" + numeroConta +
                ", saldo=" + saldo +
                '}';
    }
}
