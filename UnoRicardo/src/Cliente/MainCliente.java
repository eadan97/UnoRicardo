/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cliente;

import Comun.IGame;
import Utils.Pipo;
import Utils.Piposo;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author rshum
 */
public class MainCliente {
    
    public static void main(String[] args) 
    {
        try 
        {
            Registry miRegistro = LocateRegistry.getRegistry("200.200.10.36" , 9500);
            IGame juego = (IGame)miRegistro.lookup("Juegito");
            
            System.out.println("Si sirve, esto debería dar 1 + 1 = "  +juego.enviarPipo(new Pipo("Nombre del Pipo", 2 , new Piposo("El atributillo de Piposo"))));
        } 
        
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
}