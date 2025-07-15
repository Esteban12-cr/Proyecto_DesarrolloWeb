/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import bolsos.DAO.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import Usuario.Usuario;
/**
 *
 * @author angie
 */
public class Usuario_DAO {
public Usuario login(String username, String password){
        String sql = "SELECT * FROM usuario WHERE username = ? AND password = ?";
        try (Connection conn = ConexionBD.conectar();
             PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setString(1, username);
            pst.setString(2, password); // Sin encriptar, para prueba inicial

            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                return new Usuario(
                    rs.getInt("id_usuario"),
                    rs.getString("username"),
                    rs.getString("nombre"),
                    rs.getString("correo")
                );
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
