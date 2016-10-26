package pr3p4java;

public class Pr3P4Java {

    public static void main(String[] args) {
        int[] vec = GeneraCaso.generaVector(10, true);
        for (int i = 0; i < vec.length; i++) {
            if (i == 0) {
                System.out.print("[" + vec[i] + ", ");
            } else if (i == vec.length - 1) {
                System.out.print(vec[i] + "]");
            } else {
                System.out.print(vec[i] + ", ");
            }
        }
        DatosEstadisticos de = new DatosEstadisticos();
        Ordenar1Vector a = new Ordenar1Vector();
        a.ordena(vec, de);
    }
}
