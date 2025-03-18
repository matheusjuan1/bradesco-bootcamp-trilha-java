import java.util.Locale;
import java.util.Scanner;

import model.Conta;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Bem-vind ao Banco MJ");
        System.out.println("------------------------");

        System.out.println("Vamos criar sua conta?");
        System.out.println("Digite o número de sua conta:");

        int numeroConta;
        String agenciaConta;
        String nomeCliente;
        double saldoConta;

        // Repetição para o usuário enviar um número de conta válido
        while (true) {
            try {
                numeroConta = scanner.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Por favor, digite um número válido:");
                scanner.nextLine();
            }
        }

        scanner.nextLine();
        
        System.out.println("Digite a agência da sua conta:");

        // Repetição para o usuário enviar a agência válida
        while (true) {
            try {
                agenciaConta = scanner.next();
                break;
            } catch (Exception e) {
                System.out.println("Por favor, digite uma agência válida:");
                scanner.nextLine();
            }
        }

        
        System.out.println("Digite seu nome:");

        // Repetição para o usuário enviar um nome válido
        while (true) {
            try {
                nomeCliente = scanner.next();
                break;
            } catch (Exception e) {
                System.out.println("Por favor, digite um nome válido:");
                scanner.nextLine();
            }
        }

        System.out.println("Digite o saldo da sua conta:");
        scanner.nextLine();

        // Repetição para o usuário enviar um saldo válido
        while (true) {
            try {
                saldoConta = scanner.nextDouble();
                break;
            } catch (Exception e) {
                System.out.println("Por favor, digite um saldo válido:");
                scanner.nextLine();
            }
        }

        scanner.close();

        Conta conta = new Conta(
            numeroConta,
            agenciaConta,
            nomeCliente,
            saldoConta
        );

        System.out.println("-------------------\n");
        System.out.printf("Olá %s,\nobrigado por criar uma conta em nosso banco, seus dados de conta são:\n", nomeCliente);

        System.out.println(conta.toString());
    }
}
