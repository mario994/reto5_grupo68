package codigo.Modelo.DAO;

import java.sql.*;
import codigo.Utilidades.*;
public class Consulta2DAO {
	public static ResultSet consulta() {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        String csql = "SELECT ID_Proyecto, Constructora, Numero_Habitaciones, Ciudad \r\n"
        		+ "FROM Proyecto\r\n"
        		+ "WHERE Clasificacion == 'Casa Campestre'\r\n"
        		+ "AND Ciudad IN('Santa Marta', 'Cartagena', 'Barranquilla');";
        try {
            conn = JDBCUtilities.conexion();
            stmt = conn.createStatement();
            rs = stmt.executeQuery(csql);
        } catch (Exception e) {
            System.out.println(e);
        }
        return rs;
    }

}
