package Vista;

import java.util.ArrayList;

import Controlador.ElControladorDeRequerimientos;

import Modelo.vo.Requerimiento_1;
import Modelo.vo.Requerimiento_2;
import Modelo.vo.Requerimiento_3;

public class VistaRequerimientos {

    public static final ElControladorDeRequerimientos CONTROLADOR = new ElControladorDeRequerimientos();

    public static void requerimiento1(){
        
        try {
            ArrayList<Requerimiento_1> lista1 = CONTROLADOR.consultarRequerimiento1();
            //cada vo cargado, mostrarlo en la vista
            for (Requerimiento_1 req_1 : lista1) {
                System.out.printf("%d %s %s %s %n",
                    req_1.getID_Proyecto(),
                    req_1.getCiudad(),
                    req_1.getBanco_Vinculado(),
                    req_1.getConstructora()
                );
            }
        } catch (Exception e) {
            System.err.println("Ha ocurrido un error! "+e.getMessage());
        }
    }

    public static void requerimiento2(){
        
        try {
            ArrayList<Requerimiento_2> lista2 = CONTROLADOR.consultarRequerimiento2();
            //cada vo cargado, mostrarlo en la vista
            for (Requerimiento_2 req_2 : lista2) {
                System.out.printf("%s %s %s %s %d %n",
                    req_2.getNombre(),
                    req_2.getPrimer_Apellido(),
                    req_2.getCiudad_Residencia(),
                    req_2.getCargo(),
                    req_2.getSalario()
                );
            }
        } catch (Exception e) {
            System.err.println("Ha ocurrido un error! "+e.getMessage());
        }
    }

    public static void requerimiento3(){
        try {
           ArrayList<Requerimiento_3> lista3 = CONTROLADOR.consultarRequerimiento3();

           for (Requerimiento_3 req_3 : lista3) {
               System.out.printf("%s %s %s %n",
                    req_3.getProveedor(),
                    req_3.getPagado(),
                    req_3.getConstructora()
               );
           }
        } catch (Exception e) {
            System.err.println("Ha ocurrido un error!"+e.getMessage());
        }
    }
}
