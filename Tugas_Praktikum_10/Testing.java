package NyobaConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Testing {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan username: ");
        String uname = input.nextLine();
        System.out.print("Masukkan password: ");
        String passwd = input.next();
        
        try {
            Connection connection = Connect.konek();
            System.out.println("Koneksi berhasil!");

            // Menggunakan PreparedStatement untuk query SELECT
            String sql = "SELECT * FROM user WHERE uname = ? AND passwd = ?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                preparedStatement.setString(1, uname);
                preparedStatement.setString(2, passwd);

                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    if (resultSet.next()) {
                        System.out.println("Login berhasil");
                    } else {
                        System.out.println("Username atau password salah");
                    }
                }
            }

            connection.close();
            
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(Testing.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}