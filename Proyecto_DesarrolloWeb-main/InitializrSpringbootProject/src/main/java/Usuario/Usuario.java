/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Usuario;

/**
 *
 * @author angie
 */
public class Usuario {
    private int id;
    private String username;
    private String nombre;
    private String correo;

    public Usuario(int id, String username, String nombre, String correo) {
        this.id = id;
        this.username = username;
        this.nombre = nombre;
        this.correo = correo;
    }

    // Getters opcionales
    public int getId() { return id; }
    public String getUsername() { return username; }
    public String getNombre() { return nombre; }
    public String getCorreo() { return correo; }
}
