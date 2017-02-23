/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t5_zelzinmarquez;

/**
 *
 * @author ammy_
 */
public class StrategySaleApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Registro registro = new Registro();
        registro.crearNuevaVenta();
        registro.introducirProducto("15220A", "gansito", 10, 2);
        registro.introducirProducto("15220A", "gomitas", 10, 2);
        registro.finalizarVenta(100);
    }
    
}
