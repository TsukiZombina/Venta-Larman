/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t5_zelzinmarquez;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ammy_
 */
public class Venta {

    private List<LineaDeVenta> lineasDeVenta;
    private int pago;
    private int porPagar;


    public Venta() {
        lineasDeVenta = new ArrayList<>();
    }
    
    public void crearLineaDeVenta(EspecificacionDelProducto producto, int cantidad) {
        lineasDeVenta.add(new LineaDeVenta(producto, cantidad));
    }
    
    public void realizarPago(int dineroEntregado) {
        this.pago = dineroEntregado;
        for(int i= 0; i < lineasDeVenta.size(); i++){
            porPagar += lineasDeVenta.get(i).getSubtotal();
        }
        System.out.println("Se realizó pago: " + pago + "\nCambio: " + (pago - porPagar));
    }
    
    public int getPago() {
        return pago;
    }
}
