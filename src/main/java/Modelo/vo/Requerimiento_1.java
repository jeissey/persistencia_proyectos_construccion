package Modelo.vo;

/* 2da. Consulta 
SELECT 	ID_Proyecto, Ciudad, Banco_Vinculado, Constructora 
FROM 	Proyecto p 
WHERE 	Ciudad = 'Bogota';*/

public class Requerimiento_1 {
    
    //La clase contiene como atributos las columnas de la tabla
    private Integer ID_Proyecto;
    private String Ciudad;
    private String Banco_Vinculado;
    private String Constructora;

    public Requerimiento_1(){

    }

    public Requerimiento_1(Integer ID_Proyecto, String Ciudad){
        this.ID_Proyecto = ID_Proyecto;
        this.Ciudad = Ciudad;
    }

    public Integer getID_Proyecto(){
        return ID_Proyecto;
    }

    public void setID_Proyecto(Integer ID_Proyecto){
        this.ID_Proyecto = ID_Proyecto;
    }

    public String getCiudad(){
        return Ciudad;
    }

    public void setCiudad(String Ciudad){
        this.Ciudad = Ciudad;
    }

    public String getBanco_Vinculado(){
        return Banco_Vinculado;
    }

    public void setBanco_Vinculado(String Banco_Vinculado){
        this.Banco_Vinculado = Banco_Vinculado;
    }

    public String getConstructora(){
        return Constructora;
    }

    public void setConstructora(String Constructora){
        this.Constructora = Constructora;
    }

}
