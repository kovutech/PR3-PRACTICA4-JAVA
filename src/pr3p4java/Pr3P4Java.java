package pr3p4java;

public class Pr3P4Java {

    public static void main(String[] args) {
        int tamaño = 25000;
        DatosEstadisticos de = new DatosEstadisticos();
        int[] vec = GeneraCaso.generaVector(tamaño, false);
        Ordenar1Vector a = new Ordenar1Vector();
        a.ordena(vec, de);
        CompruebaCaso.compruebaVector(vec, vec.length);
        System.out.println("Vector de " + tamaño + " elementos - Tarda " + de.dameTiempo() + " segundos.");
    }
}