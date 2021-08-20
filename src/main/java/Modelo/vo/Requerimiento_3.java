package Modelo.vo;

/* 5ta. Consulta 
SELECT 	c.Proveedor, c.Pagado, p.Constructora 
FROM 	Compra c INNER JOIN Proyecto p ON p.ID_Proyecto = c.ID_Proyecto 
WHERE 	c.Pagado = 'No' AND c.Proveedor = 'JUMBO'; */

public class Requerimiento_3 {
    private String Proveedor;
    private String Pagado;
    private String Constructora;

    public Requerimiento_3(){

    }

    public String getProveedor(){
        return Proveedor;
    }

    public void setProveedor(String Proveedor){
        this.Proveedor = Proveedor;
    }

    public String getPagado(){
        return Pagado;
    }

    public void setPagado(String Pagado){
        this.Pagado = Pagado;
    }

    public String getConstructora(){
        return Constructora;
    }

    public void setConstructora(String Constructora){
        this.Constructora = Constructora;
    }
}
