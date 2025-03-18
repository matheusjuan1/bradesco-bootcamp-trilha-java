import java.util.Locale;
import java.util.Scanner;

import error.ParametrosInvalidosException;

public class Contador {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        int primeiroNumero;
        int segundoNumero;

        System.out.println("Digite o primeiro número:");

        while (true) {
            try {
                primeiroNumero = scanner.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Por favor, digite um número válido:");
                scanner.nextLine();
            }
        }

        System.out.println("Digite o segundo número:");

        while (true) {
            try {
                segundoNumero = scanner.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Por favor, digite um número válido:");
                scanner.nextLine();
            }
        } 

        scanner.close();
        
        try {
            contar(primeiroNumero, segundoNumero);
        } catch (ParametrosInvalidosException e) {
            System.out.println("O primeiro número deve ser menor que o segundo!");
        }
    }

    public static void contar(int primeiro, int segundo) throws ParametrosInvalidosException {
        if (primeiro > segundo) {
            throw new ParametrosInvalidosException();
        }

        System.out.println("----------------------------");
        System.out.println("Iniciando o contador...");

        int contagem = segundo - primeiro;


        for(int index = 1; index <= contagem; index++) {

            System.out.printf("Imprimindo %d\n", index);
        }
    }
}
