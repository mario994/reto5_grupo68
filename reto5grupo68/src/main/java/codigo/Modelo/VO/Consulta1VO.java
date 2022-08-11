package codigo.Modelo.VO;

import codigo.Modelo.DAO.*;
import java.sql.*;
import java.util.ArrayList;

public class Consulta1VO {
    public static ArrayList<String[]> valores(){
        ResultSet rs = null;
        ArrayList<String[]> salida = new ArrayList<String[]>();
        
        try {
            rs = Consulta1DAO.consulta();
            while(rs.next()){
                int id = rs.getInt("ID_Lider");
                String nombre = rs.getString("Nombre");
                String apellido = rs.getString("Primer_Apellido");
                String ciudad = rs.getString("Ciudad_Residencia");
                //System.out.println(String.format("%5d %-15s %-15s %-15s", id, nombre, apellido, ciudad));
                salida.add(new String[] {id+"", nombre, apellido, ciudad});
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return salida;
    }    
}
