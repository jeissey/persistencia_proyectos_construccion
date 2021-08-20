package reto4;

import Vista.VistaRequerimientos;
import Vista.VistaRequerimiento_1;
import Vista.VistaRequerimiento_2;
import Vista.VistaRequerimiento_3;

import java.sql.SQLException;

/**
 * La clase Principal contiene el método main, desde donde inicia la ejeucución del programa.
 */
public class Principal 
{
    public static void main( String[] args ) throws SQLException
    {
        System.out.println("Requerimiento 1");
        VistaRequerimientos.requerimiento1();
        VistaRequerimiento_1 objVReq_1 = new VistaRequerimiento_1();

        System.out.println("\nRequerimiento 2");
        VistaRequerimientos.requerimiento2();
        VistaRequerimiento_2 objVReq_2 = new VistaRequerimiento_2();

        System.out.println("\nRequerimiento 3");
        VistaRequerimientos.requerimiento3();
        VistaRequerimiento_3 objVReq_3 = new VistaRequerimiento_3();
    }
}
