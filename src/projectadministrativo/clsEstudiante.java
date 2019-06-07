
package projectadministrativo;


public class clsEstudiante {
    
/*Atributos*/
private long atrCodigo;
private String atrNombre;
private String atrPrograma;
private long atrDocumento;
private String atrTipoDocumento;
private byte atrSemestre;
private double atrPromedio;
private long atrTelefono;
private String atrDireccion;


public long getCodigo(){
    return this.atrCodigo;
}
public String getNombre(){
    return this.atrNombre;
}
public String getPrograma(){
    return this.atrNombre;
}
public long getDocumento(){
    return this.atrDocumento;
}
public String getTipoDocumento(){
    return this.atrTipoDocumento;
}
public byte getSemestre(){
    return this.atrSemestre;
}
public double getPromedio(){
    return this.atrPromedio;
}
public long getTelefono(){
    return this.atrTelefono;
}
public String getDireccion(){
    return this.atrDireccion;
}


public clsEstudiante(){
    
}
public clsEstudiante(long parCodigo, String parNombre, String parPrograma, long parDocumento, String parTipoDocumento, byte parSemestre, double parPromedio, long parTelefono, String parDireccion){
    this.atrCodigo = parCodigo;
    this.atrNombre = parNombre;
    this.atrPrograma = parPrograma;
    this.atrDocumento = parDocumento;
    this.atrTipoDocumento = parTipoDocumento;
    this.atrSemestre = parSemestre;
    this.atrPromedio = parPromedio;
    this.atrTelefono = parTelefono;
    this.atrDireccion = parDireccion;         
}
    
}
