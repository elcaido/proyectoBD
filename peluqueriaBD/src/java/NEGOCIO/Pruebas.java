/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NEGOCIO;

import DTO.AdministradorDTO;

/**
 *
 * @author DELL
 */
public class Pruebas {
    
    
    public static void main(String[] args) {
        AdministradorDTO a = new AdministradorDTO();
        
        a.registrarCliente("daniel", "Quintero", "Calle 2", "2313456", "daniel@gmail.com");
        System.out.println("hola mundo");
    }
    
}
