package pr3p4java;

public class Ordenar1Vector implements OrdenarVector {

    public String nombreMetodo() {
        return "Selección lineal";
    }

    public void ordena(int[] vec, DatosEstadisticos de) {
        int[] vecs = new int[vec.length];
        int n = vec.length;
        for (int i = 0; i < n; i++) {
            int menor = vec[0];
            int pos = 0;
            for (int j = 1; j < n; j++) {
                if (menor > vec[j]) {
                    menor = vec[j];
                    pos = j;
                }
            }
            vecs[i] = menor;
            vec[pos] = Integer.MAX_VALUE;
        }
    }
}