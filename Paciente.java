package hospital;
/**
 * La clase Paciente representa un paciente normal que ingresa en el hospital.
 * @author Jaime Zalo�a
 * @since 20/02/2019
 */
public class Paciente implements Comparable<Paciente>{
    private static int numpaciente =0; //Contador de pacientes que ingresan en el hospital.
    private int id; // Identificador �nico de cada paciente.
    private String nombre; //Nombre del paciente.
    private TipoGravedad gravedad;
   
    
    /**
     * Constructor
     * @param nombre : Nombre del paciente
     */
    public Paciente(String nombre, TipoGravedad gravedad){
    	this.gravedad = gravedad;
        this.nombre = nombre;
        numpaciente++;
        this.id = numpaciente;
        
        
        
    }
    
    /**
     * Devuelve los datos del paciente (id y nombre).
     * @see java.lang.Object#toString()
     */
    public String toString(){
        return id +" : " + nombre + " " + gravedad;
    }    
    
    /**
     * @return nombre del paciente.
     */
    public String getPaciente() {
    	
    	return nombre;
    }
    
    /**
     * @return id del paciente
     */
    public int getId() {
    	
    	return id;
    }
    
    /**
     * @return gravedad del paciente.
     */
    public TipoGravedad getGravedad() {
    	return gravedad;
    }

	@Override
	public int compareTo(Paciente o) {
		if((o != null)&&(this != null)) {
		if (o.getPaciente().compareTo(this.getPaciente())<1) {
            return -1;
        }
		 if (o.getPaciente().compareTo(this.getPaciente())<1) {
             return -1;
         }
         if (o.getPaciente().compareTo(this.getPaciente())>1) {
             return 1;
         }
		}
         return 0;
		
	}

}
