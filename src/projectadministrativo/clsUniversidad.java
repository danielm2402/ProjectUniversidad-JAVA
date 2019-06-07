
package projectadministrativo;

import java.util.ArrayList;

/**
 *
 * @author Daniel
 */
public final class clsUniversidad {
    
private static final ArrayList<clsAdministrativo> atrColeccionAdministrativos = new ArrayList<>();
private static final ArrayList<clsProfesor> atrColeccionProfesores = new ArrayList<>();
private static final ArrayList<clsEstudiante> atrColeccionEstudiantes = new ArrayList<>();


public static String RegistrarEstudiante(long parCodigo, String parNombre, String parPrograma, long parDocumento, String parTipoDocumento, byte parSemestre, double parPromedio, long parTelefono, String parDireccion){
 
     clsEstudiante varObjEstudiante = new clsEstudiante(parCodigo, parNombre, parPrograma,parDocumento,parTipoDocumento,parSemestre, parPromedio, parTelefono, parDireccion); 
   atrColeccionEstudiantes.add(varObjEstudiante);
   return "Registrado Correctamente";
}
public static String RegistrarProfesor(long parCodigo, String parNombre, long parCedula, double parSalario, String parTipoProfesor, long parTelefono, String parExperiencia, String parDireccion){
    clsProfesor varObjProfesor = new clsProfesor(parCodigo, parNombre,parCedula,  parSalario, parTipoProfesor, parTelefono, parExperiencia,parDireccion);
    atrColeccionProfesores.add(varObjProfesor);
     return "Registrado Correctamente";
}
public static String RegistrarAdministrativo(long parCedula, String parNombre, String parCargo, long parTelefono, double parSalario, String parDireccion, int parAntiguedad){
    clsAdministrativo varObjAdministrativo = new clsAdministrativo( parCedula, parNombre,  parCargo, parTelefono, parSalario,parDireccion, parAntiguedad);
    atrColeccionAdministrativos.add(varObjAdministrativo);
     return "Registrado Correctamente";
}


public static String EliminarEstudiante(long parCodigo){
    
    for(int i = 0; i< atrColeccionEstudiantes.size(); i++){
        if(atrColeccionEstudiantes.get(i).getCodigo() == parCodigo){
            atrColeccionEstudiantes.remove(i);
            return "Eliminado Correctamente";
        }
    }
    return "No se encontró el Estudiante";
}
private static void EliminarEstudiante(String parNombre){
    
    for(int i = 0; i< atrColeccionEstudiantes.size(); i++){
        if(atrColeccionEstudiantes.get(i).getNombre().equals(parNombre)){
            atrColeccionEstudiantes.remove(i);
        }
    }
    
}

public static String EliminarProfesor(long parCedula){
    for(int i = 0; i< atrColeccionProfesores.size(); i++){
        if(atrColeccionProfesores.get(i).getCedula() == parCedula){
            atrColeccionProfesores.remove(i);
            return "Eliminado";
        }
    }
    return "No se encontró el profesor";
    
}
private static void EliminarProfesor(String parNombre){
    for(int i = 0; i<= atrColeccionProfesores.size(); i++){
        if(atrColeccionProfesores.get(i).getNombre().equals(parNombre)){
            atrColeccionProfesores.remove(i);
        }
    }
    
}
public static String EliminarAdministrativo(long parCedula){
    for(int i = 0; i< atrColeccionAdministrativos.size(); i++){
        if(atrColeccionAdministrativos.get(i).getCedula() == parCedula){
            atrColeccionAdministrativos.remove(i);
            return "Eliminado";
        }
    }
    return "No se encontró el Administrativo";
    
}
private static void EliminarAdministrativo(String parNombre){
    for(int i = 0; i<= atrColeccionAdministrativos.size(); i++){
        if(atrColeccionAdministrativos.get(i).getNombre().equals(parNombre)){
            atrColeccionAdministrativos.remove(i);
        }
    }
}


private static clsEstudiante BuscarEstudiante(long parCodigo){
    for(int i = 0; i< atrColeccionEstudiantes.size(); i++){
         if(atrColeccionEstudiantes.get(i).getCodigo() == parCodigo){
            return atrColeccionEstudiantes.get(i);
        }
       
    }
    return null;  
}

private static clsProfesor BuscarProfesor(long parCedula){
    for(int i = 0; i<= atrColeccionProfesores.size(); i++){
        if(atrColeccionProfesores.get(i).getCedula() == parCedula){
            return atrColeccionProfesores.get(i);
        }
    }
    return null; 
}

private static clsAdministrativo BuscarAdministrativo(long parCedula){
    for(int i = 0; i< atrColeccionAdministrativos.size(); i++){
        if(atrColeccionAdministrativos.get(i).getCedula() == parCedula){
            return atrColeccionAdministrativos.get(i);
        }
    }
    return null;
}

public static double CalcularPromedioEstudiantes(){
    
    double varPromedio =0;
   for(int i = 0; i< atrColeccionEstudiantes.size(); i++){
        
       varPromedio = atrColeccionEstudiantes.get(i).getPromedio()+ varPromedio;
    }
   return varPromedio/atrColeccionEstudiantes.size();
}

public static ArrayList<String> ListaEstudiantesPromedioSuperior(){
    ArrayList<String> Lista = new ArrayList<>();
   double varPromedio = clsUniversidad.CalcularPromedioEstudiantes();
    for(int i = 0; i< atrColeccionEstudiantes.size(); i++){
        if(atrColeccionEstudiantes.get(i).getPromedio()>varPromedio){
            Lista.add(atrColeccionEstudiantes.get(i).getNombre());
        } 
    }
    
    return Lista; 
}

public static ArrayList<String> ListaEstudiantesPromedioInferior(){
    ArrayList<String> Lista = new ArrayList<>();
   double varPromedio = clsUniversidad.CalcularPromedioEstudiantes();
    for(int i = 0; i< atrColeccionEstudiantes.size(); i++){
        if(atrColeccionEstudiantes.get(i).getPromedio()<varPromedio){
            Lista.add(atrColeccionEstudiantes.get(i).getNombre());
        } 
    }
    
    return Lista; 
}


public static int NumeroEstudiantesBajoRendimiento(){
    int varContador = 0;
     for(int i = 0; i<atrColeccionEstudiantes.size(); i++){
        if(atrColeccionEstudiantes.get(i).getPromedio()<2.0){
            varContador++;
        } 
    }
     return varContador;
}
public static int NumeroEstudiantesRegularRendimiento(){
    int varContador = 0;
     for(int i = 0; i< atrColeccionEstudiantes.size(); i++){
        if(atrColeccionEstudiantes.get(i).getPromedio()>=2.0 &&atrColeccionEstudiantes.get(i).getPromedio()<3.0){
            varContador++;
        } 
    }
     return varContador;
}
public static int NumeroEstudiantesAceptableRendimiento(){
    int varContador = 0;
     for(int i = 0; i< atrColeccionEstudiantes.size(); i++){
        if(atrColeccionEstudiantes.get(i).getPromedio()>=3.0 &&atrColeccionEstudiantes.get(i).getPromedio()<4.0){
            varContador++;
        } 
    }
     return varContador;
}

public static int NumeroEstudiantesExcelenteRendimiento(){
    int varContador = 0;
     for(int i = 0; i< atrColeccionEstudiantes.size(); i++){
        if(atrColeccionEstudiantes.get(i).getPromedio()>=4.0 &&atrColeccionEstudiantes.get(i).getPromedio()<=5.0){
            varContador++;
        } 
    }
     return varContador;
}


public static int NumeroEstudiantesRegistrados(){
    return atrColeccionEstudiantes.size();
}

public static double PromedioPagoSalarios()
{
    
    double varCantidadProfesores=0;
    double varCantidadAdministrativos=0;
    for (clsProfesor atrColeccionProfesore : atrColeccionProfesores) {
        varCantidadProfesores = atrColeccionProfesore.getSalario() + varCantidadProfesores;
    }
    for (clsAdministrativo atrColeccionAdministrativo : atrColeccionAdministrativos) {
        varCantidadAdministrativos = atrColeccionAdministrativo.getSalario() + varCantidadAdministrativos;
    }
   
   double varPromedio = ((varCantidadProfesores+varCantidadAdministrativos))/((atrColeccionAdministrativos.size())+(atrColeccionProfesores.size()));
   return varPromedio;
}

public static ArrayList<String> ListarProfesores()
{
     ArrayList<String> Lista = new ArrayList<>();
    for(int i = 0; i< atrColeccionProfesores.size(); i++){
     Lista.add(atrColeccionProfesores.get(i).getNombre());
    }
    return Lista;
}
public static ArrayList<String> ListarAdministrativos()
{
     ArrayList<String> Lista = new ArrayList<>();
    for(int i = 0; i< atrColeccionAdministrativos.size(); i++){
     Lista.add(atrColeccionAdministrativos.get(i).getNombre());
    }
    return Lista;
}

public static ArrayList<String>OrdenarProfesores()
{
    ArrayList<String> Lista = new ArrayList<>();
    
        for(int i = 0; i < atrColeccionProfesores.size() - 1; i++)
        {
            for(int j = 0; j < atrColeccionProfesores.size() - 1; j++)
            {
                if (atrColeccionProfesores.get(j).getSalario() < atrColeccionProfesores.get(j + 1).getSalario())
                {
                    
                    clsProfesor tmp = atrColeccionProfesores.get(j+1);
                    atrColeccionProfesores.set(j+1, atrColeccionProfesores.get(j));
                    atrColeccionProfesores.set(j,tmp);
                }
            }
        }
        for(int i = 0;i < atrColeccionProfesores.size(); i++)
        {
           Lista.add(atrColeccionProfesores.get(i).getNombre());
        }
    return Lista;
}
public static ArrayList<String>OrdenarAdministrativos()
{
    ArrayList<String> Lista = new ArrayList<>();
    
        for(int i = 0; i < atrColeccionAdministrativos.size() - 1; i++)
        {
            for(int j = 0; j < atrColeccionAdministrativos.size() - 1; j++)
            {
                if (atrColeccionAdministrativos.get(j).getSalario() < atrColeccionAdministrativos.get(j + 1).getSalario())
                {
                    
                    clsAdministrativo tmp = atrColeccionAdministrativos.get(j+1);
                    atrColeccionAdministrativos.set(j+1, atrColeccionAdministrativos.get(j));
                    atrColeccionAdministrativos.set(j,tmp);
                }
            }
        }
        for(int i = 0;i < atrColeccionAdministrativos.size(); i++)
        {
           Lista.add(atrColeccionAdministrativos.get(i).getNombre());
        }
    return Lista;
}
}