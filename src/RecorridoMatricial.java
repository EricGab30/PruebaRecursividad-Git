
public class RecorridoMatricial {

    public String obtenerMatrizFormaRenglon(int[][] matriz) {
        String cadena = metodoRecursivoR(matriz, 0, 0);
        cadena = cadena.substring(0, cadena.length() - 1);
        return cadena;
    }
    
    public String obtenerMatrizFormaColumna(int[][] matriz) {
        String cadena = metodoRecursivoC(matriz, 0, 0);
        cadena = cadena.substring(0, cadena.length() - 1);
        return cadena;
    }

    private String metodoRecursivoR(int[][] matriz, int renglon, int columna) {
        if (renglon == matriz.length)
            return "";
        if (columna == matriz[0].length)
            return metodoRecursivoR(matriz, ++renglon, 0);
        return matriz[renglon][columna] + "," + metodoRecursivoR(matriz, renglon, ++columna);
    }

    private String metodoRecursivoC(int[][] matriz, int renglon, int columna) {
        if (columna == matriz[0].length)
            return "";
        if (renglon == matriz.length)
            return metodoRecursivoC(matriz, 0, ++columna);
        return matriz[renglon][columna] + "," + metodoRecursivoC(matriz, ++renglon, columna);
    }

    public int[][] generarValoresAleatorios(int[][] matriz) {
        for (int renglon = 0; renglon < matriz.length; renglon++)
            for (int columna = 0; columna < matriz[0].length; columna++)
                matriz[renglon][columna] = (int) (Math.random() * 10);
        return matriz;
    }

    public String stringMatriz(int[][] matriz) {
        String cadena = "";
        for (int renglon = 0; renglon < matriz.length; renglon++) {
            for (int columna = 0; columna < matriz[0].length; columna++) {
                cadena += matriz[renglon][columna] + "  ";
            }
            cadena += "\n";
        }
        return cadena;
    }

}
