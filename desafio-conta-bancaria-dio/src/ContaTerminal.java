/*
    1. Crie o projeto 'ContaBanco que receberá dados via terminal
    contendo as características de conta em banco conforme os seguintes atributos:

    ATRIBUTO        TIPO        EXEMPLO
    Numero          Inteiro     1021
    Agencia         Texto       0678
    Nome Cliente    Texto       MARIO ANDRADE
    Saldo           Decimal     237.48

    2. Dentro do projeto, crie a classe ContaTerminal.java para realizar toda a
    codificação do programa.

    3. Permita que os dados sejam inseridos via termina, sendo que o usuário receberá
    a mensagem de qual informação será solicitada.

    Programa: "Por favor, digite o número da agência."
    Usuário: 1021 (depois ENTER para o próximo campo)

    4. Depois de todas as informações terem sido inseridas, o sistema deverá exibir a
    seguinte mensagem:

    "Olá, [Nome Cliente], obrigado por criar uma conta em nosso banco, sua agência é [Agencia],
    conta [Numero] e seu saldo [Saldo] já está disponível para saque."
*/

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        System.out.println("Criação de conta no Banco Java");
        Scanner scanner = new Scanner(System.in);

        int numeroConta;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("---------- CONTA BANCÁRIA ----------");
        System.out.println("Por favor, digite o número da Conta: (ex.: 1234)");
        numeroConta = scanner.nextInt();
        System.out.println("Informe o número da Agência: (ex.: 067-8)");
        agencia = scanner.next();
        System.out.println("Informe o seu primeiro nome: ");
        nomeCliente = scanner.next();
        System.out.println("Informe o seu saldo atual: ");
        saldo = scanner.nextDouble();

        System.out.printf("Olá %s, obrigada(o) por criar uma conta em nosso banco" +
                ", sua agência é %s, conta %d e seu saldo de %.2f já está disponível " +
                "para saque.", nomeCliente, agencia, numeroConta, saldo);
        scanner.close();
    }
}
