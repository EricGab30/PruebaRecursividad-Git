
public class PilaChar {
    private int TOS;
    private char[] pila;

    public int getTamano() {
        return pila.length;
    }
        
    public PilaChar(int tamano) {
        this.pila = new char[tamano];
        this.TOS = -1;
    }
    
    public boolean insertarDato(char dato) {
        if(this.TOS == (pila.length-1))
            return false;
        ++TOS;
        this.pila[TOS] = dato;
        return true;
    }
    
    public boolean eliminarDato() {
        if(this.TOS == -1)
            return false;
        --TOS;
        return true;
    }
    
    public String toString() {
        String cadena = "";
        for (int indice = pila.length-1; indice > -1; indice--) {
            cadena += "[" + pila[indice] + "]\n";
        }
        return cadena;
    }
    
}
