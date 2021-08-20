package Modelo.dao;

//Estructura de datos
import java.util.ArrayList;

//Librerías para SQL y Base de Datos
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//Clase para conexión
import Util.JDBCUtilities;

import Modelo.vo.Requerimiento_3;

public class Requerimiento_3Dao {
    //Obtener los 10 proyectos rankeados según las compras
    public ArrayList<Requerimiento_3> requerimiento3()  throws SQLException {
        ArrayList<Requerimiento_3> aListReq_3 = new ArrayList<Requerimiento_3>();

        Connection conexion = JDBCUtilities.getConnection();

        try {
            String consulta =   "SELECT 	c.Proveedor, c.Pagado, p.Constructora " + 
                                "FROM 	Compra c INNER JOIN Proyecto p ON p.ID_Proyecto = c.ID_Proyecto " + 
                                "WHERE 	c.Pagado = 'No' AND c.Proveedor = 'JUMBO';";
            PreparedStatement statement = conexion.prepareStatement(consulta);
            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                Requerimiento_3 objReq_3 = new Requerimiento_3();
                objReq_3.setProveedor(rs.getString("Proveedor"));
                objReq_3.setPagado(rs.getString("Pagado"));
                objReq_3.setConstructora(rs.getString("Constructora"));

                aListReq_3.add(objReq_3);
            }

            rs.close();
            statement.close();
        } catch (SQLException e) {
            System.err.println("Error consultando: " + e);
        }
        finally {
            if (conexion != null) {
                conexion.close();
            }
        }

        return aListReq_3;
    }
}
