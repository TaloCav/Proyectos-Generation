public class Invetir {
    public static void main(String[] args) {
        String palabraOriginal = "Java";
        String palabraInvertida = invertirPalabra(palabraOriginal);

        System.out.println("Palabra original: " + palabraOriginal);
        System.out.println("Palabra invertida: " + palabraInvertida);
    }

    public static String invertirPalabra(String palabraOriginal) {
        char[] caracteres = palabraOriginal.toCharArray();
        int longitud = caracteres.length;

        System.out.println();
        for (int i = 0; i < longitud / 2; i++) {
            char temp = caracteres[i];
            caracteres[i] = caracteres[longitud - 1 - i];
            caracteres[longitud - 1 - i] = temp;

        }

        return new String(caracteres);
    }
}