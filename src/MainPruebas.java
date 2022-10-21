
public class MainPruebas {

    public static void main(String[] args) {
//        System.out.println(new TablaMultiplicar().obtenerTabla(3, 10));
//        System.out.println(new Potencia().obtenerPotencia(2, 8));
//        System.out.println(new Multiplicacion().obtenerResultado(4, 1024));
//        if(new Palindromo().esPalindromo("Dammit I’m mad.\n" +
//"Evil is a deed as I live.\n" +
//"God, am I reviled? I rise, my bed on a sun, I melt.\n" +
//"To be not one man emanating is sad. I piss.\n" +
//"Alas, it is so late. Who stops to help?\n" +
//"Man, it is hot. I’m in it. I tell.\n" +
//"I am not a devil. I level “Mad Dog”.\n" +
//"Ah, say burning is, as a deified gulp,\n" +
//"In my halo of a mired rum tin.\n" +
//"I erase many men. Oh, to be man, a sin.\n" +
//"Is evil in a clam? In a trap?\n" +
//"No. It is open. On it I was stuck.\n" +
//"Rats peed on hope. Elsewhere dips a web.\n" +
//"Be still if I fill its ebb.\n" +
//"Ew, a spider… eh?\n" +
//"We sleep. Oh no!\n" +
//"Deep, stark cuts saw it in one position.\n" +
//"Part animal, can I live? Sin is a name.\n" +
//"Both, one… my names are in it.\n" +
//"Murder? I’m a fool.\n" +
//"A hymn I plug, deified as a sign in ruby ash,\n" +
//"A Goddam level I lived at.\n" +
//"On mail let it in. I’m it.\n" +
//"Oh, sit in ample hot spots. Oh wet!\n" +
//"A loss it is alas (sip). I’d assign it a name.\n" +
//"Name not one bottle minus an ode by me:\n" +
//"“Sir, I deliver. I’m a dog”\n" +
//"Evil is a deed as I live.\n" +
//"Dammit I’m mad.")) System.out.println("SI ES UN PALINDROMO");
//        else
//            System.out.println("NO ES UN PALINDROMO");
//        int[] vector = {5, 4, 8, 7, 6, 9, 1};
//        System.out.println(new ValorMayor().obtenerValorMayor(vector));
//        System.out.println(new Fibonacci().obtenerPosicion(10));
//        System.out.println(new DecimalBinario().convertir(10));
//        System.out.println(new DecimalOctal().convertir(7259));
//        System.out.println(new DecimalHexadecimal().convertir(32520));
//        int[][] matriz = new int[5][100];
//        RecorridoMatricial rm = new RecorridoMatricial();
//        matriz = rm.generarValoresAleatorios(matriz);
//        System.out.println(rm.stringMatriz(matriz));
//        System.out.println(rm.obtenerMatrizFormaRenglon(matriz));
//        System.out.println(rm.obtenerMatrizFormaColumna(matriz));
//        System.out.println(new InvertirCadena().invertir("Hola"));
//        System.out.println(new Prueba().fibonacci(8));
//        int[] vectorPrueba = {1,2,3,4,5,6,7,8,9,10};
//        for (int i = 0; i < vectorPrueba.length; i++) {
//            System.out.print(vectorPrueba[i] + ",");
//        }
//        System.out.println("\n----------------------------------");
//        int[] vectorCopia = new Prueba().invertirArreglo(vectorPrueba);
//        for (int i = 0; i < vectorPrueba.length; i++) {
//            System.out.print(vectorCopia[i] + ",");
//        }
//        System.out.println("");
//        System.out.println(new Prueba().divisionEntera(1554566, 7));
        PilaChar p1 = new PilaChar(5);
        p1.insertarDato('a');
        p1.eliminarDato();
        p1.insertarDato('A');
        p1.insertarDato('B');
        p1.insertarDato('C');
        p1.insertarDato('D');
        p1.insertarDato('E');
        p1.eliminarDato();
        p1.insertarDato('F');
        System.out.println(p1.toString());
    }

}
