/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package INTERFAZ;

import DTO.AdministradorDTO;

/**
 *
 * @author Angel Aparicio
 */
public interface IAdministradorDTO {
     public AdministradorDTO consultarUsuario(String nick);
    public boolean cambiarContraseña(String usuario, String contraseñaNueva)throws Exception;
}
