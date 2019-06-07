
package projectadministrativo;


public class clsAdministrativo {
    
    private long atrCedula;
    private String atrNombre;
    private String atrCargo;
    private long atrTelefono;
    private double atrSalario;
    private String atrDireccion;
    private int atrAntiguedad;
    
    
    // GET'S
    public long getCedula(){
        return this.atrCedula;
    }
    public String getNombre(){
        return this.atrNombre;
    }
    public String getCargo(){
        return this.atrCargo;
    }
    public long getTelefono(){
        return this.atrTelefono;
    }
    public double getSalario(){
        return this.atrSalario;
    }
    public String getDireccion(){
        return this.atrDireccion;
    }
    public int getAntiguedad(){
        return this.atrAntiguedad;
    }
    
  
    //Constructor por defecto
    public clsAdministrativo()
    {
        
    }
    //Constructor parametrizado
    public clsAdministrativo(long parCedula, String parNombre, String parCargo, long parTelefono, double parSalario, String parDireccion, int parAntiguedad)
    {
        this.atrCedula = parCedula;
        this.atrNombre = parNombre;
        this.atrCargo = parCargo;
        this.atrTelefono=parTelefono;
        this.atrSalario = parSalario;
        this.atrDireccion = parDireccion;
        this.atrAntiguedad = parAntiguedad;
    }
    
}
