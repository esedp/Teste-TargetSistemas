import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Pergunta 1");
        System.out.print("Informe um numero: ");
        int num = sc.nextInt();

        System.out.println(Fibonacci.pertenceFibonacci(num));
        sc.nextLine();

        System.out.println("\nPergunta 2");
        System.out.print("Digite uma palavra: ");
        String palavra = sc.nextLine();

        System.out.println(LetraA.maiusculaOuMinuscula(palavra));

        System.out.println("\nPergunta 3");
        System.out.print("o valor da soma e igual a: " + ValorSoma.soma());
    }
}