package pr3p4java;

public class DatosEstadisticos {

    double tiempo;

    public DatosEstadisticos() {
        tiempo = 0;
    }

    public void añadeTiempo(double time) {
        tiempo += time;
    }

    public void estableceTiempo(double time) {
        tiempo = time;
    }

    public double dameTiempo() {
        return tiempo;
    }
}
