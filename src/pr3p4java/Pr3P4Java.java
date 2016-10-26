package pr3p4java;

public class Pr3P4Java {

    public static void main(String[] args) {
        int[] vec = GeneraCaso.generaVector(10, true);
        int[] vecs = new int[vec.length];
        DatosEstadisticos de = new DatosEstadisticos();
        Ordenar1Vector a = new Ordenar1Vector();
        a.ordena(vec, vecs, de);
        CompruebaCaso.compruebaVector(vecs, vecs.length);
    }
}
