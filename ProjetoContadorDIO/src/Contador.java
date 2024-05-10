import java.util.Scanner;

public class Contador {
    public Contador() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o primeiro paramêtro: ");
        int primeiroParametro = sc.nextInt();
        System.out.print("Insira o segundo paramêtro: ");
        int segundoParametro = sc.nextInt();

        try {
            contar(primeiroParametro, segundoParametro);
        } catch (ParametrosInvalidosException var5) {
            ParametrosInvalidosException e = var5;
            System.out.println(e.getMessage());
        }

        sc.close();
    }

    static void contar(int primeiroParametro, int segundoParametro) throws ParametrosInvalidosException {
        if (primeiroParametro >= segundoParametro) {
            throw new ParametrosInvalidosException("O primeiro parametro deve ser menor que o segundo");
        } else {
            int var10000 = segundoParametro - primeiroParametro;

            for(int i = primeiroParametro; i <= segundoParametro; ++i) {
                System.out.println(i);
            }

        }
    }

    private static void reiniciarContador() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o primeiro paramêtro: ");
        int primeiroParametro = sc.nextInt();
        System.out.print("Insira o segundo paramêtro: ");
        int segundoParametro = sc.nextInt();
    }
}