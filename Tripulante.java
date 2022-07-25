public class Tripulante extends UsuarioMoodle {
    //Atributos
    private int n;
    private double [] calificaciones;
    private boolean [] entregas;
    
    //Constructor
    public Tripulante(String nombreCompleto, String documentoIdentidad, String password, String correo, String descripcion, int n) {
        super(nombreCompleto, documentoIdentidad, password, correo, descripcion);
        this.n = n;   
        this.calificaciones = new double[n];
        this.entregas = new boolean[n];
    }
    
    //Método
    public void resolverReto(int retoAEntregar){
        this.entregas[retoAEntregar]=true; 
    }
    
    //Getter del atributo calificaciones
    public double[] getCalificaciones() {
        return this.calificaciones;
    }
    
    //Setter del atributo calificaciones
    public void setCalificaciones(double[] calificaciones) {
        this.calificaciones = calificaciones;
    }
    
    //Getter del atributo entregas
    public boolean[] getEntregas() {
        return this.entregas;
    }
    
    //Setter del atributo entrgas
    public void setEntregas(boolean[] entregas) {
        this.entregas = entregas;
    }
}
