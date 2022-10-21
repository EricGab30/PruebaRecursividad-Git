
public class Fibonacci {

    public long obtenerPosicion(int posicion) {
        return metodoRecursivo(posicion,0,1);
    }
    
    private long metodoRecursivo(int posicion, int anterior1, int anterior2) {
        if (posicion == 1) return 1;
        return anterior1 + anterior2 + metodoRecursivo(posicion-1, anterior1+anterior2, anterior1);
    }
    
//    private long metodoRecursivo(int posicion, int anterior1, int anterior2) {
//        if (posicion == 1) return anterior1 + anterior2;
//        return metodoRecursivo(posicion-1, anterior1+anterior2, anterior1);
//    }
    
//        private long metodoRecursivo(int posicion, int numeroAnterior, int sumaAnterior) {
//        if (posicion == 1) {
//            return numeroAnterior + sumaAnterior;
//        }
//        return metodoRecursivo(posicion-1, numeroAnterior+sumaAnterior, numeroAnterior+sumaAnterior);
//    }
}
