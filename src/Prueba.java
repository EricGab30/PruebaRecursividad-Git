
public class Prueba {
    public String fibonacci(int posicion) {
        return metodoRecursivoFibonacci(posicion, 0, 1);
    }
    
    private String metodoRecursivoFibonacci(int posicion, int anterior1, int anterior2) {
        if(posicion==-1) return"";
        return (anterior1+anterior2) + "," + metodoRecursivoFibonacci(--posicion, anterior1+anterior2, anterior1);
    }
    
    public int[] invertirArreglo(int[] arreglo) {
        int[] copia = new int[arreglo.length];
        return metodoRecursivoVector(arreglo, copia, 0);
    }
    
    private int[] metodoRecursivoVector(int[] arreglo, int[] copia, int indice) {
        if(indice == arreglo.length) return copia;
        copia[indice] = arreglo[(arreglo.length-1-indice)];
        return metodoRecursivoVector(arreglo, copia, ++indice);
    }
    
    private long metodoRecursivoDivisionE(int numero, int divisor, long veces) {
        System.out.println("No truena");
        if(numero < divisor) return veces;
        return metodoRecursivoDivisionE((numero-divisor),divisor,++veces);
    }
    
    public long divisionEntera(int numero, int divisor) {
        return metodoRecursivoDivisionE(numero, divisor, 0);
    }
    
}
