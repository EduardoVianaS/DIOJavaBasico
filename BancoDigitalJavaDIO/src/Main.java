import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Conta cc = new ContaCorrente(0,0,0);
        Conta poupanca = new ContaPoupanca(0,1,0);
        int opcao = 1;
        Banco banco = new Banco();
        Scanner sc = new Scanner(System.in);


        // banco.imprimeContas();
        while (opcao != 0) {
            System.out.println(" ===== MENU ====== ");
            System.out.println("1. Inserir Conta corrente ");
            System.out.println("2. Inserir Conta poupanca ");
            System.out.println("3. Depositar ");
            System.out.println("4. Sacar ");
            System.out.println("5. Ver saldo das contas");
            System.out.println("6. Transferir para poupanca");
            System.out.println("7. Sair ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    banco.adicionaContaCorrente(new ContaCorrente(cc.getAgencia(), cc.getNumeroConta(), cc.getSaldo()));
                    break;

                case 2:
                    banco.adicionaContaPoupanca(new ContaPoupanca(cc.getAgencia(), cc.getNumeroConta(), cc.getSaldo()));
                    break;

                    case 3:
                        int valorDeposito;
                        System.out.println("Digite um valor para depositar: ");
                        valorDeposito = sc.nextInt();
                        cc.depositar(valorDeposito);
                        System.out.println("Depositado com sucesso!" + "novo saldo: " + cc.getSaldo());
                        break;

                        case 4:
                            int valorSaque;
                            System.out.println("Digite um valor para sacar: ");
                            valorSaque = sc.nextInt();
                            cc.sacar(valorSaque);
                            System.out.println("Depositado com sucesso!" + "novo saldo: " + cc.getSaldo());
                            break;

                            case 5:
                                System.out.println("Conta corrente: " + cc.getSaldo());
                                System.out.println("Conta poupança: " + poupanca.getSaldo());
                                break;

                case 6:
                    int valorTransferenciaPp;
                    System.out.println("Digite um valor para depositar: ");
                    valorTransferenciaPp = sc.nextInt();
                    cc.transferir(valorTransferenciaPp, poupanca);
                    System.out.println("Depositado com sucesso!" + "novo saldo: " + cc.getSaldo());
                    break;


                case 7:
                    opcao = 0;
                    break;


            }
        }

    }



}

