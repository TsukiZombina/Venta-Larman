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
class Registro {
    
    private Venta venta;

    public Registro() {
    }
    
    public void crearNuevaVenta() {
        venta = new Venta();
    }
    
    public void introducirProducto(String id, String descripcion, int precio, int cantidad) {
        EspecificacionDelProducto producto = new EspecificacionDelProducto(id, descripcion, precio);
        venta.crearLineaDeVenta(producto, cantidad);
    }
    
    public void finalizarVenta(int dineroEntregado) {
        venta.realizarPago(dineroEntregado);
    }
}
