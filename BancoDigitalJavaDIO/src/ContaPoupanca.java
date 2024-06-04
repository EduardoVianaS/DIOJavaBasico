import java.util.Random;
public class ContaPoupanca extends Conta {


   private int agencia = gerador.nextInt(1000);
   private int numeroConta = gerador.nextInt(1000);
   private  double saldo;

   public ContaPoupanca(int agencia, int numeroConta, double saldo) {
      super(agencia, numeroConta, saldo);
   }

   @Override
   public String toString() {
      return "ContaPoupanca{" +
              "agencia=" + agencia +
              ", numeroConta=" + numeroConta +
              ", saldo=" + saldo +
              '}';
   }
}

