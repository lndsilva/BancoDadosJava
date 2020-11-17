
package psv;

import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UsuarioDAO {
    
    private Connection con;

    public UsuarioDAO(Connection con) {
        this.con = con;
    }

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }
    
    
    public boolean validarUsuario(UsuarioBean usuario){
        
        boolean autenticado = false;
        
        String sql = "SELECT usuario, senha FROM tbUsuario WHERE usuario=? and senha=?";
        
        try {
            
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setString(1, usuario.getUsuario());
            ps.setString(2, usuario.getSenha());
            
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                
                return true;
            }else{
                return false;
            }
            
            
        } catch (SQLException ex) {
            return false;
        }
    }
    
}
