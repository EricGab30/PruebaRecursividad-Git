
public class TablaMultiplicar {

    public String obtenerTabla(int numero, int multiploMaximo) {
        if(multiploMaximo == 1){
            return numero + " x " + multiploMaximo + " = " + numero + "\n";
        }
        return (numero + " x " + (multiploMaximo) + " = " + (numero*(multiploMaximo)) + " \n" + obtenerTabla(numero, --multiploMaximo));
    }

}
