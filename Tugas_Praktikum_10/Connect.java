/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NyobaConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author soery
 */
public class Connect {
    private static Connection con;
    
    public static Connection konek() throws SQLException, ClassNotFoundException{
        try{
            if(con == null){
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost/loginKalkulator","root","");
                System.out.println("Connect Succes to Connect.java");
            }
            return con;
            
        }catch(SQLException e){
            System.out.println("Error, Connection Failed!" + e.getMessage());
            throw e;
        }
    }
}
