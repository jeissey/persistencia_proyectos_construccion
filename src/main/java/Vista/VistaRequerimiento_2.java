package Vista;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.BorderLayout;

import Controlador.ElControladorDeRequerimientos;
import Modelo.vo.Requerimiento_2;

public class VistaRequerimiento_2 extends JFrame {
    
    public VistaRequerimiento_2() throws SQLException {
        initUI();
    }

    private void initUI() throws SQLException {
        
        setLayout(new BorderLayout());
        String[] nombres = {"Nombre", "Primer_Apellido", "Ciudad_Residencia", "Cargo", "Salario"};
        JTable tabla = new JTable(mostrar(), nombres);
        JScrollPane panel = new JScrollPane(tabla);
        add(panel, BorderLayout.CENTER);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        setSize(400, 150);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public String[][] mostrar() throws SQLException {
        ArrayList<Requerimiento_2> arrListReq_2 = new ArrayList<Requerimiento_2>();
        ElControladorDeRequerimientos controlador = new ElControladorDeRequerimientos();
        arrListReq_2 = controlador.consultarRequerimiento2();
        String[][] matrizDatos = new String[arrListReq_2.size()][5];

        for (int i = 0; i < arrListReq_2.size(); i++) {
            matrizDatos[i][0] = arrListReq_2.get(i).getNombre();
            matrizDatos[i][1] = arrListReq_2.get(i).getPrimer_Apellido();
            matrizDatos[i][2] = arrListReq_2.get(i).getCiudad_Residencia();
            matrizDatos[i][3] = arrListReq_2.get(i).getCargo();
            matrizDatos[i][4] = String.valueOf(arrListReq_2.get(i).getSalario());
        }
        return matrizDatos;
    }
}
