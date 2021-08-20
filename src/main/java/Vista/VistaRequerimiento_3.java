package Vista;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.BorderLayout;

import Controlador.ElControladorDeRequerimientos;
import Modelo.vo.Requerimiento_3;

public class VistaRequerimiento_3 extends JFrame {
    public VistaRequerimiento_3() throws SQLException {
        initUI();
    }

    private void initUI() throws SQLException {
        
        setLayout(new BorderLayout());
        String[] nombres= {"Proveedor", "Pagado", "Constructora"};
        JTable tabla = new JTable(mostrar(), nombres);
        JScrollPane panel= new JScrollPane(tabla);
        add(panel, BorderLayout.CENTER);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 150);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public String[][] mostrar() throws SQLException {
        ArrayList<Requerimiento_3> arrListReq_3 = new ArrayList<Requerimiento_3>();
        ElControladorDeRequerimientos controlador = new ElControladorDeRequerimientos();
        arrListReq_3 = controlador.consultarRequerimiento3();
        String matrizDatos[][] = new String [arrListReq_3.size()][4];

        for(int i = 0; i < arrListReq_3.size(); i++) {
            matrizDatos[i][0] = arrListReq_3.get(i).getProveedor();
            matrizDatos[i][1] = arrListReq_3.get(i).getPagado();
            matrizDatos[i][2] = arrListReq_3.get(i).getConstructora();
        }
        return matrizDatos;
    }
}
