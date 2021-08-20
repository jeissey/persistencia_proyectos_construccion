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

import Modelo.vo.Requerimiento_2;

public class Requerimiento_2Dao {
    
    //Método que retornará un arrayList de objetos Requerimiento_2
    public ArrayList<Requerimiento_2> requerimiento2()  throws SQLException {
        ArrayList<Requerimiento_2> aListReq_2 = new ArrayList<Requerimiento_2>();

        Connection conexion = JDBCUtilities.getConnection();

        try {
            String consulta =   "SELECT 	Nombre, Primer_Apellido, Ciudad_Residencia, Cargo, Salario " + 
                                "FROM 	Lider " + 
                                "WHERE 	(Cargo = 'Asesor' OR Cargo = 'Coordinador') AND Salario < 310000;";
            PreparedStatement statement = conexion.prepareStatement(consulta);
            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                Requerimiento_2 objReq_2 = new Requerimiento_2();
                objReq_2.setNombre(rs.getString("Nombre"));
                objReq_2.setPrimer_Apellido(rs.getString("Primer_Apellido"));
                objReq_2.setCiudad_Residencia(rs.getString("Ciudad_Residencia"));
                objReq_2.setCargo(rs.getString("Cargo"));
                objReq_2.setSalario(rs.getInt("Salario"));

                aListReq_2.add(objReq_2);
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
        return aListReq_2;
    }

}
