public class LetraA {

    public static String maiusculaOuMinuscula(String palavra) {

        int  contagem = 0;

        for (int i = 0; i < palavra.length(); i++) {
            char c = palavra.charAt(i);

            if(c == 'a' || c == 'A') {
                contagem++;
            }
        }

        if(contagem > 0) {
            return "a letra 'A' apareceu " + contagem + "x";
        }
        else {
            return "a letra 'A' nao apareceu";
        }
    }
}
