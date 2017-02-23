package t5_zelzinmarquez;

public class EspecificacionDelProducto {
    
    private String id;
    private String descripcion;
    private int precio;
    
    public EspecificacionDelProducto(String id, String descripcion, int precio) {
        this.id = id;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public String getID() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getPrecio() {
        return precio;
    }
}
