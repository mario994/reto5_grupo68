package codigo.Modelo.DAO;

import java.sql.*;
import codigo.Utilidades.*;

public class Consulta1DAO {
    public static ResultSet consulta() {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        String csql = "SELECT ID_Lider, Nombre, Primer_Apellido, Ciudad_Residencia \r\n"
        		+ "FROM Lider \r\n"
        		+ "ORDER BY Ciudad_Residencia;";
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
