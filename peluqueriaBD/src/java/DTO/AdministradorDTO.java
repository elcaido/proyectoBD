/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;


import FACTORY.DaoFactory;
import INTERFAZ.IAdministradorDTO;
import java.util.ArrayList;
import INTERFAZ.IClienteDTO;

/**
 *
 * @author Angel Aparicio
 */
public class AdministradorDTO {
    private String usuario;
    private String contraseña;
private FACTORY.DaoFactory factor;
    public AdministradorDTO() {
        factor = new DaoFactory();
    }

    public AdministradorDTO(String usuario, String contraseña) {
        this.usuario = usuario;
        this.contraseña = contraseña;
         factor = new DaoFactory();
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public String toString() {
        return "AdministradorDTO{" + "usuario=" + usuario + ", contrase\u00f1a=" + contraseña + '}';
    }

     public AdministradorDTO obtenerUsuario(String usuario) {
        IAdministradorDTO u = factor.obtenerUsuario(false);
        if (consultarUsuario(usuario).equalsIgnoreCase("")) {
            System.out.println("No existe este usuario");
            return null;
        }
        return u.consultarUsuario(usuario);
    }

    public String consultarUsuario(String usuario) {
        IAdministradorDTO u = factor.obtenerUsuario(false);
        AdministradorDTO u2 = u.consultarUsuario(usuario);
        if (u2 == null) {
            return "";
        }
        return u2.toString();
    }
   
 

    public boolean registrarCliente( String nombres, String apellidos, String direccion, String telefono,
            String correo) {
        IClienteDTO a = factor.obtenerConexionAsistente(false);
        ClienteDTO aux = new ClienteDTO(nombres, apellidos, direccion, telefono, correo);
        return a.registrarCliente(aux);
    }
    
    public boolean actualizarCliente(int id, String nombres, String apellidos, String direccion, String telefono,
            String correo){
        IClienteDTO a = factor.obtenerConexionAsistente(false);
        return a.actualizarCliente(id, nombres, apellidos, direccion, telefono, correo);
    }
    public boolean eliminarCliente(int id){
        IClienteDTO a = factor.obtenerConexionAsistente(false);
        return a.eliminarCliente(id);
    }
    public ClienteDTO consultarCliente(int id){
        IClienteDTO a = factor.obtenerConexionAsistente(false);
        return a.consultarCliente(id);
    }

          }
