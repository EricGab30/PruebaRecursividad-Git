
public class Potencia {

    public long obtenerPotencia(int numeroAElevar, int potencia) {
        if (potencia == 1)
            return numeroAElevar;
        return numeroAElevar * obtenerPotencia(numeroAElevar, --potencia);
    }
}
