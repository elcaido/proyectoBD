/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package INTERFAZ;

import DTO.ClienteDTO;
import java.util.ArrayList;


public interface IClienteDTO {
  public boolean registrarCliente(ClienteDTO a);
  public boolean eliminarCliente(int id);
  public boolean actualizarCliente(int id, String nombres,String apellidos,String direccion, String telefono,String correo);
  public ClienteDTO consultarCliente(int id);

  
}
