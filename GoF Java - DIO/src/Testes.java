import Facade.Facade;
import Strategy.Comportamento;
import Strategy.RoboExample;

public class Testes {

    public static void main(String[] args) {

      /*  Comportamento comportamento = new Comportamento();

        RoboExample robo = new RoboExample();

        robo.setComportamento(comportamento);

        robo.mover(); */

        Facade facade = new Facade();
        facade.migrarCliente("Eduardo", "06405010");
    }

}
