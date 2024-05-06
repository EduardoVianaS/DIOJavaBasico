import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Numero;
        String Agencia;
        String nomeCliente;
        double saldo;

        System.out.println("-----CADASTRO DE CONTA-----");
        System.out.println("Insira o numero da conta: ");
        Numero = sc.nextInt();
        sc.nextLine();
        System.out.println("Insira a agencia: ");
        Agencia = sc.nextLine();
        System.out.println("Insira o nome do cliente: ");
        nomeCliente = sc.nextLine();
        System.out.println("Insira o saldo: ");
        saldo = sc.nextDouble();

        System.out.println("Ola! " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + Agencia + ", número da conta " + Numero + ", e seu saldo de " + saldo + " já esta disponivel para saque!");


        }
    }
