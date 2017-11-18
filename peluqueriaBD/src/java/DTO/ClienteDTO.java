/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;


public class ClienteDTO {
   
   private int id;
   private String nombres;
   private String apellidos;
   private String direccion;
   private String telefono;
   private String correo;
  
   

    public ClienteDTO() {
    }

    public ClienteDTO( String nombres, String apellidos, String direccion, String telefono, String correo) {
        
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.telefono=telefono;
        this.correo = correo;
        
        
       
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

  

   

    @Override
    public String toString() {
        return "ClienteDTO {nombres=" + nombres + ", apellidos=" + apellidos + ", dureccion=" + direccion+ ", tele=" + telefono + ", correo=" + correo + '}';
    }
   
   
}
