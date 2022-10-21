
public class DecimalBinario {
    public String convertir(int numero) {
        StringBuilder cadena = new StringBuilder();
        cadena.append(metodoRecursivo(numero));
        return cadena.reverse().toString();
    }
    
    private String metodoRecursivo(int numero) {
        if(numero == 1) return "1";
        return division(numero) + metodoRecursivo(numero/2);
    }
    
    private String division(int numero) {
        if(numero%2 == 0) return "0";
        return "1";
    }
}
