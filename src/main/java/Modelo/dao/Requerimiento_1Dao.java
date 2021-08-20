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

import Modelo.vo.Requerimiento_1;

public class Requerimiento_1Dao {   

    public ArrayList<Requerimiento_1> requerimiento1()  throws SQLException {
        ArrayList<Requerimiento_1> aListReq_1 = new ArrayList<Requerimiento_1>();

        Connection conexion = JDBCUtilities.getConnection();

        try {
            String consulta =   "SELECT 	ID_Proyecto, Ciudad, Banco_Vinculado, Constructora " + 
                                "FROM 	Proyecto " + 
                                "WHERE 	Ciudad = 'Bogota';";
            PreparedStatement statement = conexion.prepareStatement(consulta);
            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                Requerimiento_1 objReq_1 = new Requerimiento_1();
                objReq_1.setID_Proyecto(rs.getInt("ID_Proyecto"));
                objReq_1.setCiudad(rs.getString("Ciudad"));
                objReq_1.setBanco_Vinculado(rs.getString("Banco_Vinculado"));
                objReq_1.setConstructora(rs.getString("Constructora"));

                aListReq_1.add(objReq_1);
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
        return aListReq_1;
    }
}