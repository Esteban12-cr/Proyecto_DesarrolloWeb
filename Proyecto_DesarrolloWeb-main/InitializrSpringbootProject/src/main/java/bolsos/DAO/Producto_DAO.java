/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import bolsos.DAO.ConexionBD;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author angie
 */
public class Producto_DAO {
public List<String> listarProductos() {
        List<String> productos = new ArrayList<>();
        String sql = "SELECT nombre, precio FROM producto WHERE activo = true";

        try (Connection conn = ConexionBD.conectar();
             Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery(sql)) {
            while (rs.next()) {
                productos.add(rs.getString("nombre") + " - ₡" + rs.getDouble("precio"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return productos;
    }
}
