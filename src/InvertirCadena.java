
public class InvertirCadena {
    
    public String invertir(String cadena) {
        if(cadena.length() == 1)
            return cadena.charAt(0) + "";
        return cadena.charAt(cadena.length()-1) + invertir(cadena.substring(0, cadena.length()-1));
    }
    
}
