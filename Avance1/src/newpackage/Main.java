/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import Datos.Menu;
import Datos.Usuario;

/**
 *
 * @author gilio
 */
public class Main {

    public static void main(String args[]) {
        Usuario usuario = new Usuario();
        usuario.usuario();
        Menu menu = new Menu();
        menu.menu();
    }

}
