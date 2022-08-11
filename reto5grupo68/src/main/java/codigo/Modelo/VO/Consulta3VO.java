package codigo.Modelo.VO;

import codigo.Modelo.DAO.*;
import java.sql.*;
import java.util.ArrayList;

public class Consulta3VO {
	public static ArrayList<String[]> valores(){
        ResultSet rs = null;
        ArrayList<String[]> salida = new ArrayList<String[]>();
        
        try {
            rs = Consulta3DAO.consulta();
            //ID_Compra, Constructora, Banco_Vinculado
            while(rs.next()){
                int id = rs.getInt("ID_Compra");
                String constructora = rs.getString("Constructora");
                String banco = rs.getString("Banco_Vinculado");
                //System.out.println(String.format("%5d %-15s %-15s %-15s", id, nombre, apellido, ciudad));
                salida.add(new String[] {id+"", constructora, banco});
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return salida;
    }    
}
