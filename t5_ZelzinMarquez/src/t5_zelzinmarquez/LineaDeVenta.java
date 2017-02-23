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
public class LineaDeVenta {

    private EspecificacionDelProducto especProducto;
    private int cantidad;

    public LineaDeVenta(EspecificacionDelProducto producto, int cantidad) {
        this.especProducto = producto;
        this.cantidad = cantidad;
    }

    public int getSubtotal() {
        int subtotal = especProducto.getPrecio()*cantidad;
        return subtotal;
    }
}
