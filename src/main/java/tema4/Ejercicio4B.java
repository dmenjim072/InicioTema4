/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package tema4;

import javax.swing.JOptionPane;
import org.apache.commons.lang3.RandomStringUtils;

public class Ejercicio4B {

    public static void main(String[] args) {
        
        //Declaramos variables
        String pin = "";
        String password = "";
        String password2 = "";
        
        //llamamos al metodo para el menu
        int menuInicial = mostrarMenuInicial();
        
        //opcion 1 - Pin 4 digitos
        if (menuInicial == 1) {
            
            //llamamos al metodo1
            opcion1(pin);
                       
        }
        
        //opcion 2 - contraseña 8 digitos
        if(menuInicial == 2){
            
            //llamamos al metodo2
            opcion2(password);
            
        }

        //opcion 3 - contraseña 6 digitos con caracteres preseleccionados
        if(menuInicial == 3){
            
            //llamamos al metodo 3
            opcion3(password2);
            
        }

    }

    public static int mostrarMenuInicial() {

        int menuInicial;

        do {
            String menuInicialString = JOptionPane.showInputDialog("Elija una de las 3 opciones: \n"
                    + "1.- Crear pin para una tarjeta SIM \n"
                    + "2.- Crear contraseña para un SO (8 carácteres) \n"
                    + "3.- Crear contraseña eligiendo numero de carácteres");
            menuInicial = Integer.parseInt(menuInicialString);
        } while (menuInicial != 1 && menuInicial != 2 && menuInicial != 3);

        return menuInicial;
    }
    
    public static void opcion1(String pin){
        for (int i = 0; i < 10; i++) {
        
            pin = RandomStringUtils.randomNumeric(4);
            
            System.out.println(pin);
        }
    }
    
    public static void opcion2(String password){
        
        for (int i = 0; i < 10; i++) {

            password = RandomStringUtils.randomAlphanumeric(8);

            System.out.println(password);
        
            }
        
    }
    
    public static void opcion3(String password2){
        
        char[] conjuntoCaracteres = {'a', 'b', 'c', 'x', '$', '€'};
        int numero = 6;
        for (int i = 0; i < 10; i++) {

            password2 = RandomStringUtils.random(numero, conjuntoCaracteres);

            System.out.println(password2);
        }
        
    }
}
