package cotizacion;

public class Material {
    private String id;    
    private String unidad;
    private String descripcion;
    private float precio;

    public Material () {}
    
    public Material (String id, String unidad, String descripcion, float precio) {
        setId(id);       
        setUnidad(unidad);        
        setDescripcion(descripcion);
        setPrecio(precio);
    }

    public boolean setId(String id) {
        if (id.length() != 0){
            this.id = id;
            return true;        
        }else return false;
    }
       
    public boolean setUnidad(String u) {
        if(u.length() != 0){
            this.unidad = u;
            return true;
        }else return false;
    }

    public boolean setDescripcion(String d) {
        if(d.length() != 0){
            this.descripcion = d;
            return true;
        }else return false;
    }

    public boolean setPrecio(float p) {
        if (p > 0.0) {
            this.precio = p;
            return true;
          } else return false;
    }

    public String getId() { return id; }    
    public String getUnidad() { return unidad; }    
    public String getDescripcion() { return descripcion; }
    public float getPrecio() { return precio; }

    public String toString() {
        return "\nClave: "+id+"\nUnidad: "+unidad+"\nDescripción: "+descripcion+
                "\nPrecio: "+precio;
    }
}