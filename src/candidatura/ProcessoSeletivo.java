package candidatura;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;



public class ProcessoSeletivo {
    public static void main(String[] args) {
       // selecaoCandidatos();
       // imprimirSelecionados();
        String[] candidatos = {"FELIPE", "MARCIA", "JULIA", "AUGUSTO", "MONICA", "FABRICIO", "DANIELA", "JORGE", "EDUARDO"};
        for (String candidato:candidatos) {
        entrandoEmContato(candidato);
        }

    }
    static  void entrandoEmContato(String canditado){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do{
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando){
                tentativasRealizadas ++;
            }
            else{
                System.out.println("CONTATO REALIZADO");
            }


        }while(continuarTentando && tentativasRealizadas < 3);
        if(atendeu){
            System.out.println("CONSEGUIMOS CONTATO COM " + canditado + "NA" + tentativasRealizadas + " tentativa");
        }else{
            System.out.println("NÃO CONSEGUIMOS CONTATO COM: " + canditado);
        }



    }
    static boolean atender(){
        return new Random().nextInt(3)==1;
    }

    static void imprimirSelecionados(){
        String[] candidatos = {"FELIPE", "MARCIA", "JULIA", "AUGUSTO", "MONICA", "FABRICIO", "DANIELA", "JORGE", "EDUARDO"};
        System.out.println("Lista de candidatos aprovados: ");
        for(int indice  = 0; indice < candidatos.length; indice++){
            System.out.println("O candidato número "+ (indice+1) + " é o " + candidatos[indice]);
        }

    }

    static void selecaoCandidatos() {
        String[] candidatos = {"FELIPE", "MARCIA", "JULIA", "AUGUSTO", "MONICA", "FABRICIO", "DANIELA", "JORGE", "EDUARDO"};
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();
            System.out.println("O candidato " + candidato + " solicitou este valor de salário: " + salarioPretendido);
            if (salarioPretendido <= salarioBase) {
                candidatosSelecionados++;
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");

            }
            candidatoAtual++;
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        } else {
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }
}
