package hospital;

public class PacienteGrave extends Paciente
{
  
    private TipoGravedad gravedad;

    /** 
     * Constructor
     * @param nombre Nombre del paciente.
     * @param gravedad Gravedad del paciente.
     */
    public PacienteGrave(String nombre, TipoGravedad gravedad)
    {
        super(nombre, gravedad);
        this.gravedad = gravedad;
    }
    
    
    /**
     * Devuelve los datos del paciente (id y nombre).
     * @see java.lang.Object#toString()
     */
    public String toString()
    {
        return super.toString();
    }
    
    /**
     * @see Paciente#getGravedad()
     */
    public TipoGravedad getGravedad() {
    	
		return gravedad;
    	
    }
    
    
}
