import java.util.Arrays;
public class ValorMayor {

    public int obtenerValorMayor(int[] vector) {
        return metodoRecursivo(vector, 0);
    }

    private int metodoRecursivo(int[] vector, int mayor) {
        if (vector.length == 1){
            if(vector[0] < mayor) return mayor;
            return vector[0];
        }
        if (vector[0] > mayor)
            return metodoRecursivo(Arrays.copyOfRange(vector, 1, vector.length), vector[0]);
        return metodoRecursivo(Arrays.copyOfRange(vector, 1, vector.length), mayor);
    }
    
    //    private int metodoRecursivo(int[] vector, int posicion, int mayor) {
//        if (posicion == vector.length)
//            return mayor;
//        if (vector[posicion] > mayor)
//            return metodoRecursivo(vector, (1+posicion), vector[posicion]);
//        return metodoRecursivo(vector, ++posicion, mayor);
//    }
    
}
