/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.AdministradorDTO;
import INTERFAZ.IAdministradorDTO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Angel Aparicio
 */
public class MySQLAdministradorDAO extends MySQLconexion implements IAdministradorDTO{
    
    public MySQLAdministradorDAO(boolean keepConnection) {
        super(keepConnection);
    }
    
     @Override
    public AdministradorDTO consultarUsuario(String usuario) {
        AdministradorDTO dto = null;
        try {
            String selectStatement = "SELECT usuario,contraseña FROM administrador where usuario='" + usuario + "'";
            PreparedStatement prepStmt = super.getConn().prepareStatement(selectStatement);
            ResultSet rs = prepStmt.executeQuery();
            while (rs.next()) {
                dto = new AdministradorDTO();
                dto.setUsuario(rs.getString(1));
                dto.setContraseña(rs.getString(2));

            }
            rs.close();
        } catch (Exception e) {
            try {
                throw new Exception(e);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        } finally {
            if (!keepConnection) {
                if (super.getConn() != null) {
                    try {
                        super.getConn().close();
                    } catch (SQLException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        }
        return dto;
    }

    @Override
    public boolean cambiarContraseña(String usuario, String contraseñaNueva) {
    boolean exito = false;
        PreparedStatement stmt = null;
        try{
            
        System.out.println("Entramos a la BD");
            stmt = super.getConn().prepareStatement("UPDATE administrador SET contraseña=? where usuario='" + usuario+ "'");
            stmt.setString(1, contraseñaNueva);
           
            int total = stmt.executeUpdate();
            if (total > 0) {
                exito = true;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            if (super.getConn() != null) {
                try {
                    super.getConn().close();
                    System.out.println("conn.close()");
                } catch (SQLException ex) {
                   ex.printStackTrace();
                }
            }
        }
        return exito;
    }      

}
