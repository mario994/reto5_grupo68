package codigo.Modelo.DAO;

import java.sql.*;
import codigo.Utilidades.*;
public class Consulta3DAO {
	public static ResultSet consulta() {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        String csql = "SELECT ID_Compra, Constructora, Banco_Vinculado\r\n"
        		+ "FROM Compra JOIN Proyecto USING(ID_Proyecto)\r\n"
        		+ "WHERE  Compra.Proveedor == 'Homecenter' \r\n"
        		+ "AND Proyecto.Ciudad == 'Salento';";
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
