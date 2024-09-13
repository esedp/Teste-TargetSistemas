public class Fibonacci {

    public static boolean fibonacci(int n) {
        int a = 0, b = 1;

        if (n == 0 || n == 1) {
            return true;
        }

        // Gera os próximos números da sequência até encontrar o número informado, se o valor ultrapassar
        // o número sem o encontrar, retorna false;
        int proximo = a + b;
        while (proximo <= n) {
            if (proximo == n) {
                return true;
            }
            a = b;
            b = proximo;
            proximo = a + b;
        }
        return false;
    }

    public static String pertenceFibonacci(int n) {
        if (fibonacci(n)) {
            return "O numero informado faz parte da sequencia";
        }
        else {
            return "O numero informado nao faz parte da sequencia";
        }
    }
}
