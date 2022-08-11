package codigo.Modelo.VO;

import codigo.Modelo.DAO.*;
import java.sql.*;
import java.util.ArrayList;

public class Consulta2VO {
	public static ArrayList<String[]> valores(){
        ResultSet rs = null;
        ArrayList<String[]> salida = new ArrayList<String[]>();
        
        try {
            rs = Consulta2DAO.consulta();
            //ID_Proyecto, Constructora, Numero_Habitaciones, Ciudad 
            while(rs.next()){
                int proyecto = rs.getInt("ID_Proyecto");
                String constructora = rs.getString("Constructora");
                String habitaciones = rs.getString("Numero_Habitaciones");
                String ciudad = rs.getString("Ciudad");
                //System.out.println(String.format("%5d %-15s %-15s %-15s", id, nombre, apellido, ciudad));
                salida.add(new String[] {proyecto+"", constructora, habitaciones, ciudad});
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return salida;
    }    
}
