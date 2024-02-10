import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um número para verificar se pertence à sequência de Fibonacci: ");
        int numero = scanner.nextInt();
        scanner.close();

        if (verificaFibonacci(numero)) {
            System.out.println(numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(numero + " não pertence à sequência de Fibonacci.");
        }
    }

    static boolean verificaFibonacci(int num) {
        if (num <= 1) {
            return true;
        }

        int a = 0, b = 1, soma = 0;
        while (soma < num) {
            soma = a + b;
            a = b;
            b = soma;
        }

        return soma == num;
    }
}
