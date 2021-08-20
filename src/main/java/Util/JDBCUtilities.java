package Util;

import java.sql.DriverManager; //Recoge (o contiene) la información de la BD para establece la comunicación con esta. 
import java.sql.Connection; //Se genera un objeto de esta clase, para que administre la comunicación con la BD (la mantiene).
import java.sql.SQLException; //Indica las ecepciones

public class JDBCUtilities {
    
    //private static final String DATABASE_LOCATION = "ProyectosConstruccion.db";
    private static final String DATABASE_LOCATION = "C:\\Users\\usy\\Downloads\\Reto4\\ProyectosConstruccion.db";

    public static Connection getConnection() throws SQLException {
        
        String url = "jdbc:sqlite:"+DATABASE_LOCATION;

        return DriverManager.getConnection(url);
    }
}
