/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpSession;
import Modelo.Usuario;
import util.MySQLConexion;

public class UsuarioController {
  public boolean userVerify(String username, String contraseña) {
        boolean var = false;
        String contrasenaUser = "";
        Connection conn = null;

        try {
            conn = MySQLConexion.getConexion();
            String sql = "select Contraseña from Usuario where Username = ?;";
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, username);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                contrasenaUser = rs.getString(1);
            }
            
            if (contrasenaUser.equals(contraseña)) {
                var = true;
            }
            else {
                var = false;
            }
            //llenar el arraylist con la clase entidad
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {

                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e2) {
            }
        }
        return var;
    }
    
}
