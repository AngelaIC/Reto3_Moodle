public class Formador extends UsuarioMoodle {
    //Atributos
    private String escalafon;
    
    //Constructor
    public Formador(String escalafon, String nombreCompleto, String documentoIdentidad, String password, String correo, String descripcion) {
        super(nombreCompleto, documentoIdentidad,password,correo,descripcion);
        this.escalafon = escalafon;
    }
    
    //Método calificar
    public void calificar(Tripulante tripulanteACalificar, int k){
        for(int i = 0; i < tripulanteACalificar.getCalificaciones().length; i++){
            if (tripulanteACalificar.getEntregas()[k]){
                tripulanteACalificar.getCalificaciones()[k] = 5;
            }
            if (tripulanteACalificar.getCalificaciones()[i] != 5.0){
                tripulanteACalificar.getCalificaciones()[i] = 0;
            }
        }
    }
    
    //Getter del atributo escalafon
    public String getEscalafon() {
        return escalafon;
    }
    
    //Setter del atributo escalafon
    public void setEscalafon(String escalafon) {
        this.escalafon = escalafon;
    }
}
