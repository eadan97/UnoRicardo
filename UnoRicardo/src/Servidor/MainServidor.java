/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servidor;

import Comun.IGame;
import Utils.Game;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;


public class MainServidor implements java.io.Serializable 
{
    public static void main(String[] args) 
    {
        try
        {
            IGame juego = new Game();
            
            Registry myRegistry = LocateRegistry.createRegistry(9500);
            myRegistry.rebind("Juegito", juego);
            
            System.out.println("Servidor ON");
        }
        
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
