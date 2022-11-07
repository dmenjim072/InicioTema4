/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package tema4;

import javax.swing.JOptionPane;
import org.apache.commons.lang3.RandomStringUtils;

public class Ejercicio4B {

    public static void main(String[] args) {
        //opcion 1 - PIn 4 digitos 
        for (int i = 0; i < 10; i++) {
            
        
        String pin = RandomStringUtils.randomNumeric(4);
        
            System.out.println(pin);
        }
        
        System.out.println("------------------");
        
        //opcion 2 - contraseña 8 digitos
        for (int i = 0; i < 10; i++) {
                  
        String password = RandomStringUtils.randomAlphanumeric(8);
        
            System.out.println(password);
        }
        
        System.out.println("------------------");
        
        //opcion 3 - contraseña 6 digitos con caracteres preseleccionados
        char[] conjuntoCaracteres = {'a', 'b', 'c', 'x', '$', '€'};
        int numero=6;
        for (int i = 0; i < 10; i++) {
                  
        String password2 = RandomStringUtils.random(numero, conjuntoCaracteres);
        
            System.out.println(password2);
        }
        
    }
    
    public static String mostrarMenuInicial(){
        
        String menuInicial;
        
        do{
        menuInicial = JOptionPane.showInputDialog("Elija una de las 3 opciones: \n"
                + "1.- Crear pin para una tarjeta SIM \n"
                + "2.- Crear contraseña para un SO (8 carácteres) \n"
                + "3.- Crear contraseña eligiendo numero de carácteres");
        }while(menuInicial==1 || menuInicial==2 || menuInicial==3);
        
        return menuInicial;
    }
}
