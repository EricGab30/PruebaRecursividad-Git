
public class DecimalOctal {
    public String convertir(int numero) {
        StringBuilder cadena = new StringBuilder();
        cadena.append(metodoRecursivo(numero));
        return cadena.reverse().toString();
    }
    
    private String metodoRecursivo(int numero) {
        if(numero < 8) return numero + "";
        return numero%8 + metodoRecursivo(numero/8);
    }

}
