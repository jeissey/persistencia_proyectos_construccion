package Vista;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.BorderLayout;

import Controlador.ElControladorDeRequerimientos;
import Modelo.vo.Requerimiento_1;

public class VistaRequerimiento_1 extends JFrame{
    
    //Constructor de la clase
    public VistaRequerimiento_1() throws SQLException {
        initUI();
    }

    //Este método contiene los componentes y valores iniciales de la ventana
    private void initUI() throws SQLException {
        
        setLayout(new BorderLayout());
        //Arreglo que contiene los nombres de las columnas.
        String[] nombres= {"ID_Proyecto", "Ciudad","Banco_Vinculado","Constructora"};
        JTable tabla = new JTable(mostrar(), nombres);
        JScrollPane panel= new JScrollPane(tabla);
        add(panel, BorderLayout.CENTER);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 150);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public String[][] mostrar() throws SQLException {
        ArrayList<Requerimiento_1> arrListReq_1 = new ArrayList<Requerimiento_1>();
        ElControladorDeRequerimientos controlador = new ElControladorDeRequerimientos();
        arrListReq_1 = controlador.consultarRequerimiento1();
        String matrizDatos[][] = new String [arrListReq_1.size()][4];

        for(int i = 0; i < arrListReq_1.size(); i++) {
            matrizDatos[i][0] = String.valueOf(arrListReq_1.get(i).getID_Proyecto());
            matrizDatos[i][1] = arrListReq_1.get(i).getCiudad();
            matrizDatos[i][2] = arrListReq_1.get(i).getBanco_Vinculado();
            matrizDatos[i][3] = arrListReq_1.get(i).getConstructora();
        }
        return matrizDatos;
    }
}
