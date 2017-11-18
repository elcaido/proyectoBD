/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FACTORY;

import DAO.MySQLAdministradorDAO;
import DAO.MySQLClienteDAO;

import INTERFAZ.IAdministradorDTO;
import INTERFAZ.IClienteDTO;


/**
 *
 * @author Angel Aparicio
 */
public class DaoFactory {
 public IAdministradorDTO obtenerUsuario(boolean keepConnection) {
        return new MySQLAdministradorDAO(keepConnection);
    }
 public IClienteDTO obtenerConexionAsistente(boolean keepConnection) {
        return new MySQLClienteDAO(keepConnection);
    }
 
}
