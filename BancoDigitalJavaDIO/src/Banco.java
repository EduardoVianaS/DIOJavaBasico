import java.util.ArrayList;
import java.util.List;

public class Banco {

    List<ContaCorrente> ccList = new ArrayList<>();
    List<ContaPoupanca> copList = new ArrayList<>();


    public void adicionaContaCorrente(ContaCorrente cc){
        ccList.add(cc);
    }
    public void adicionaContaPoupanca(ContaPoupanca cp){
        copList.add(cp);
    }

    public void imprimeContas(){
        System.out.println("Conta corrente: " + ccList);
        System.out.println("Conta poupanca: " + copList);

    }

    @Override
    public String toString() {
        return "Banco{" +
                "ccList=" + ccList +
                ", copList=" + copList +
                '}';
    }
}

