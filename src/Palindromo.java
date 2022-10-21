
public class Palindromo {

    public boolean esPalindromo(String cadena) {
        cadena = formatearString(cadena);
        return revisarRecursivo(cadena);
    }

    private boolean revisarRecursivo(String cadena) {
        if(cadena.length() == 1 || cadena.length() == 0)
            return true;
        if(cadena.charAt(0) != cadena.charAt(cadena.length()-1))
            return false;
        if(cadena.charAt(0) == cadena.charAt(cadena.length()-1))
            return revisarRecursivo(cadena.substring(1, cadena.length()-1));
        return true;
    }
    //Comentario de prueba aquiiiiiii
    private String formatearString(String s) {
        /*Salvamos las ñ*/
        s = s.replace('ñ', '\001');
        s = s.replace('Ñ', '\002');
        s = java.text.Normalizer.normalize(s, java.text.Normalizer.Form.NFD);
        s = s.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
        /*Volvemos las ñ a la cadena*/
        s = s.replace('\001', 'ñ');
        s = s.replace('\002', 'Ñ');
        s = s.replaceAll(" ", "");
        s = s.replace('"', ',');
        s = s.replace(",", "");
        s = s.replace("“", "");
        s = s.replace(".", "");
        s = s.replace("?", "");
        s = s.replace("¿", "");
        s = s.replace("\n", "");
        s = s.replace("'", "");
        s = s.replace("’", "");
        s = s.replace(")", "");
        s = s.replace("(", "");
        s = s.replace("…", "");
        s = s.replace("”", "");
        s = s.replace("!", "");
        s = s.replace(":", "");
        s = s.toLowerCase();
        return s;
    }   

    
}
