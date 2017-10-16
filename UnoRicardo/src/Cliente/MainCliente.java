/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cliente;

import Comun.IGame;
import Utils.Jugador;
import Utils.Pipo;
import Utils.Piposo;
import Views.MainWindow;
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
            
            //Sección de pruebas
              //-------o-------\\
            //Termina sección de pruebas
            
            MainWindow mw = new MainWindow(juego);
            mw.setVisible(true);
            
        } 
        
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
}
