package pr3p4java;

public class Pr3P4Java {

    public static void main(String[] args) {
        int[] tamaño = {1000, 2000, 4000, 8000, 16000, 32000, 64000, 128000};
        for (int i = 0; i < tamaño.length; i++) {
            DatosEstadisticos de = new DatosEstadisticos();
            int[] vec = GeneraCaso.generaVector(tamaño[i], true);
            Ordenar1Vector a = new Ordenar1Vector();
            a.ordena(vec, de);
            CompruebaCaso.compruebaVector(vec, vec.length);
            System.out.println("Vector de " + tamaño[i] + " elementos - Tarda " + de.dameTiempo() + " segundos.");
        }
    }
}
