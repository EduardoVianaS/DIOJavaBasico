import java.util.Scanner;
public class SmartTV {

    static boolean ligada = true;
    int canal = 1;
    int volume = 25;
    int option = 0;

    public void exibirMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== MENU ===");
        System.out.println("1. Aumentar Volume");
        System.out.println("2. Abaixar Volume");
        System.out.println("3. Mudar de canal");
        System.out.println("4. Voltar de canal");
        System.out.println("8. Desligar");
        System.out.print("Escolha uma opção: ");
        option = scanner.nextInt();

    }

    public void mudarCanal(){
        canal++;

    }
    public void voltarCanal(){
        canal--;
    }

    public int getOption() {
        return option;
    }

    public void aumentarVolume(){
        volume++;
    }
    public void diminuirVolume(){
        volume--;
    }

    public void ligar(){
        SmartTV.ligada = true;
    }
    public void desligar(){
        SmartTV.ligada = false;
    }
}
