 
public class Multiplicacion {
    public long obtenerResultado(int numero1, int numero2) {
        if(numero2 == 1)
            return numero1;
        return numero1 + obtenerResultado(numero1, --numero2);
    }
}
