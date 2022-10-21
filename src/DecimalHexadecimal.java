
public class DecimalHexadecimal {

    public String convertir(int numero) {
        StringBuilder cadena = new StringBuilder();
        cadena.append(metodoRecursivo(numero));
        return cadena.reverse().toString();
    }

    private String metodoRecursivo(int numero) {
        if (numero == 0) {
            System.out.println("El numero es 0");
            return "";
        }
        System.out.println("metodoRecursivo" + numero);
        return division(numero) + metodoRecursivo(numero / 16);
    }

    private String division(int numero) {
        int resultado = (numero % 16);
        System.out.println(resultado);
        if (resultado < 10) {
            return "" + resultado;
        }
        System.out.println("metodo division" + resultado);
        switch (resultado) {
            case 10:
                return "A";
            case 11:
                return "B";
            case 12:
                return "C";
            case 13:
                return "D";
            case 14:
                return "E";
            case 15:
                return "F";
            default:
                return "";
        }
    }
}
