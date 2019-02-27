package hospital;
/**
 * Clase de test para probar las distintas clases del proyecto
 * @author Jaime Zalo�a
 */
public class TestHospital
{
    public static void main (String argv[]){
        Hospital lapaz = new Hospital(10);
        
        lapaz.ingreso(new Paciente("Pepe", TipoGravedad.LEVE));
        
        lapaz.ingreso(new PacienteGrave("Luis",TipoGravedad.MENOS_GRAVE));
        lapaz.ingreso(new Paciente("Ana", TipoGravedad.LEVE));
        //lapaz.alta(2); // Se borra el paciente Ana
        
        lapaz.listapacientes();
        System.out.println();
        Paciente p = lapaz.buscar(3);  // Busco a luis
        System.out.println("BUSCAR: El paciente con id = 3 es "+ p);
        System.out.println();
        lapaz.ingreso(new PacienteGrave("Jaime",TipoGravedad.MUY_GRAVE));
        lapaz.ingreso(new Paciente("Ramon", TipoGravedad.LEVE));
        lapaz.ingreso(new PacienteGrave("Maria",TipoGravedad.MUY_GRAVE));
        lapaz.listapacientes();
        System.out.println();
        // Debe mostrar a Jaime
        System.out.println("Paciente mas urgente:"+ lapaz.pacienteMasUrgente()); 
        
        
    }         
       
}

