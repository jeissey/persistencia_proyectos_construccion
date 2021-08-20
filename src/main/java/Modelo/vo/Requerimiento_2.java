package Modelo.vo;

/* 3ra. Consulta 
SELECT 	Nombre, Primer_Apellido, Ciudad_Residencia, Cargo, Salario 
FROM 	Lider l 
WHERE 	(Cargo = 'Asesor' OR Cargo = 'Coordinador') AND Salario < 310000; */

public class Requerimiento_2 {
    private String Nombre;
    private String Primer_Apellido;
    private String Ciudad_Residencia;
    private String Cargo;
    private Integer Salario;

    public Requerimiento_2(){

    }

    public String getNombre(){
        return Nombre;
    }

    public void setNombre(String Nombre){
        this.Nombre = Nombre;
    }

    public String getPrimer_Apellido(){
        return Primer_Apellido;
    }

    public void setPrimer_Apellido(String Primer_Apellido){
        this.Primer_Apellido = Primer_Apellido;
    }

    public String getCiudad_Residencia(){
        return Ciudad_Residencia;
    }

    public void setCiudad_Residencia(String Ciudad_Residencia){
        this.Ciudad_Residencia = Ciudad_Residencia;
    }

    public String getCargo(){
        return Cargo;
    }

    public void setCargo(String Cargo){
        this.Cargo = Cargo;
    }

    public Integer getSalario(){
        return Salario;
    }

    public void setSalario(Integer Salario){
        this.Salario = Salario;
    }
}
