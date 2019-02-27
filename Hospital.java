package hospital;

import java.util.Arrays;

//import java.util.Arrays;
/**
 * La clase Hospital se encarga de las gestiones varias de un hospital(ingresos, altas,...)
 * @author Jaime Zaloña
 *
 */
public class Hospital
{
    private Paciente tpacientes[];
    private int contadorPacientes;
    

    /**
     * @param numpacientes Tama�o del array tpacientes
     */
    public Hospital(int numpacientes)
    {
        tpacientes = new Paciente[numpacientes];
    	
    	
    }

     
    /**
     * Ingreso de un paciente al hospital
     * @param p Nombre del paciente que ingresa
     * @return true o false
     */
    public boolean ingreso(Paciente p){
    	for(int i=1; i<tpacientes.length; i++) {
    		if(tpacientes[i]==null) {
    			tpacientes[i] = p;
    			contadorPacientes++;
    			break;
    		}
    	}
    
        return true;
    }
    
    /**
     * Ingreso de un paciente grave al hospital.
     * @param p Nombre del paciente que ingresa.
     * @param gravedad Tipo de gravedad del enum TipoGravedad.
     * @return true o false.
     */
    public boolean ingreso(PacienteGrave p, TipoGravedad gravedad )
    {
    	for(int i=1; i<tpacientes.length; i++) {
    		if(tpacientes[i]==null) {
    			tpacientes[i] = p;
    			contadorPacientes++;
    			break;
    		}
    	}
    	
        return true;
    }
    
    
    /**
     * Alta del paciente - se borra de la tabla
     * @param id_paciente
     * @return
     */
    public boolean alta ( int id_paciente){
    	for(int i=1; i<=contadorPacientes; i++) {
    		if(tpacientes[i].getId() == id_paciente) {
    			tpacientes[i] = null;
    			contadorPacientes--;
    		}
    	}
    	return true;   
    }    
    
    // 
    /**
     * Devuelve el paciente con el identificador indicado o null si no existe.
     * @param id Identificador del paciente.
     * @return id y nombre del paciente.
     */
    public Paciente buscar(int id){

		return tpacientes[id];	
    }
    

    /**
     * Imprime por consola la lista ORDENADO por NOMBRE de pacientes.
     */
    public void listapacientes (){

    	Arrays.sort(tpacientes);
    	for(int i=1; i<tpacientes.length; i++) {
    		System.out.println(tpacientes[i]);
    	}
    	
    } 
    
    // 
    /**
     * Devuelve el mas grave o el caso de paciente con la misma gravedad el que su identificador sea mas bajo.
     * @return id y nombre del paciente mas grave.
     */
    public Paciente pacienteMasUrgente(){
    	Paciente masgrave = tpacientes[1];

    	for(int i=2; i<contadorPacientes; i++) {
    		
    		if(tpacientes[i] != null) {  
    			
    			if(tpacientes[i].getGravedad().ordinal() < masgrave.getGravedad().ordinal()) {
    				
    				masgrave = tpacientes[i];
    				
    			}else if(tpacientes[i].getGravedad().ordinal() == masgrave.getGravedad().ordinal()) {
    				for(int j=1; j<contadorPacientes; j++) {
    					
    					if(tpacientes[j].getId() < masgrave.getId()) {
    						
    						masgrave = tpacientes[j];
    					}else
    						
    						masgrave = tpacientes[j+1];		
    				}
    			}
    		}
    	}		 
    			return masgrave;     
    }
    

}

