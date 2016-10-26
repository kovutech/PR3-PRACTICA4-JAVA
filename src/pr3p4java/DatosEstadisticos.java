package pr3p4java;

public class DatosEstadisticos{
    
    public DatosEstadisticos(){
        double tiempo = 0;
        
        public añadeTiempo(double time){
            tiempo += time;   
        }
        
        public estableceTiempo(double time){
            tiempo = time;
        }
        
        public double dameTiempo(){
            return tiempo;
        }
    }
}