package projectadministrativo;


public class clsProfesor {
    
    private long atrCodigo;
    private String atrNombre;
    private long atrCedula;
    private double atrSalario;
    private String atrTipo;
    private long atrTelefono;
    private String atrExperiencia;
    private String atrDireccion;
    
    
    
    public long getCodigo(){
        return this.atrCodigo;
    }
    public String getNombre(){
        return this.atrNombre;
    }
    public long getCedula(){
        return this.atrCedula;
    }
    public double getSalario(){
        return this.atrSalario;
    }
    public String getTipo(){
        return this.atrTipo;
    }
    public long getTelefono(){
        return this.atrTelefono;
    }
    public String getExperiencia(){
        return this.atrExperiencia;
    }
    public String getDireccion(){
        return this.atrDireccion;
    }
    
    
    public clsProfesor(){
        
    }
    public clsProfesor(long parCodigo, String parNombre, long parCedula, double parSalario, String parTipoProfesor, long parTelefono, String parExperiencia, String parDireccion){
        this.atrCodigo = parCodigo;
        this.atrNombre = parNombre;
        this.atrCedula = parCedula;
        this.atrSalario = parSalario;
        this.atrTipo = parTipoProfesor;
        this.atrTelefono = parTelefono;
        this.atrExperiencia = parExperiencia;
        this.atrDireccion = parDireccion;
    }
}
