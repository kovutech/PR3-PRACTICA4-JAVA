package pr3p4java;

public class Ordenar1Vector implements OrdenarVector {

    public String nombreMetodo() {
        return "Selección lineal";
    }

    public void ordena(int[] vec, int[] vecs, DatosEstadisticos de) {
        double tiempo = System.currentTimeMillis();
        int n = vec.length;
        int menor;
        int pos;

        for (int i = 0; i < n; i++) {
            menor = vec[0];
            pos = 0;
            for (int j = 1; j < n; j++) {
                if (menor > vec[j]) {
                    menor = vec[j];
                    pos = j;
                }
            }
            vecs[i] = menor;
            vec[pos] = Integer.MAX_VALUE;
        }
        //Tiempo calculado en segundos.
        de.estableceTiempo((System.currentTimeMillis() - tiempo) / 1000);
    }
}
