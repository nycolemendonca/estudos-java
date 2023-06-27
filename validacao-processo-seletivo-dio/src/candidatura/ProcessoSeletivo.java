package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        System.out.println("---------- Processo Seletivo ----------");
        String [] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto"};

        for (String candidato: candidatos) entrandoEmContato(candidato);
    }

    static void imprimirSelecionados() {
        String [] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto"};

        System.out.println();
        for (String candidato: candidatos) {
            System.out.println("Candidato(a) selecionado(a): " + candidato);
        }
    }

    static void entrandoEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do {
            atendeu = atender();
            continuarTentando = !atendeu;

            if (continuarTentando) tentativasRealizadas++;
            else System.out.println("Contato realizado com sucesso.");

        } while (continuarTentando && tentativasRealizadas < 3);

        if (atendeu) System.out.println("Conseguimos contato com " + candidato +
                                        " na " + tentativasRealizadas + " tentativa.");
        else System.out.println("Não conseguimos contato com " + candidato + ", número máximo de tentativas ("
        + tentativasRealizadas + ") realizadas.");
    }

    static boolean atender() {
        return new Random().nextInt(3) == 1;
    }

    static void selecaoCandidato() {
        String [] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto",
                                "Monica", "Fabricio", "Mirela", "Daniela", "Jorge"};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;

        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("Salário solicitado pelo(a) candidato(a) " + candidato + ": R$ " + salarioPretendido);

            if (salarioBase >= salarioPretendido) {
                System.out.println("Candidato(a) " + candidato + " selecionado(a) para a vaga.");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;

        if (salarioBase > salarioPretendido) System.out.println("Ligar para o candidato.");
        else if (salarioBase == salarioPretendido) System.out.println("Ligar para o candidato com contra proposta.");
        else System.out.println("Aguardando resultado dos demais candidatos.");
    }
}
