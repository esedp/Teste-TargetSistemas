public class ValorSoma {

    public static int soma() {
        int indice = 12,
            soma = 0,
            k =  1;

        while (k < indice) {
            k += 1;
            soma += k;
        }
        return soma;
    }
}
