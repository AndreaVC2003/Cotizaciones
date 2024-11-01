package cotizacion;

public class Cliente {
    private String id;    
    private String nombre;
    private String direccion;
    private int telefono;
    private String email;
    
    public Cliente () {}
    
    public Cliente (String id, String nombre, String direccion, int telefono, 
            String email) {
        setId(id);       
        setNombre(nombre);        
        setDireccion(direccion);
        setTelefono(telefono);
        setEmail(email);
    }

    public boolean setId(String id) {
        if (id.length() != 0){
            this.id = id;
            return true;        
        }else return false;
    }  

    public boolean setNombre(String n) {
        if(n.length() != 0){
            this.nombre = n;
            return true;
        }else return false;
            
    }

    public boolean setDireccion(String d) {
        if(d.length() != 0){
            this.direccion = d;
            return true;
        }else return false;
    }

    public boolean setTelefono(int t) {
        if(t > 0){
            this.telefono = t;
            return true;
        }else return false;
        
    }
    
    public boolean setEmail(String e) {
        if(e.length() != 0){
            this.email = e;
            return true;            
        }else return false;
        
    }
    
    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public String getDireccion() { return direccion; }
    public int getTelefono() { return telefono; }
    public String getEmail() { return email; }

    public String toString() {
        return "\nClave: "+id+"\nNombre: "+nombre+"\nDirección: "+direccion+
                "\nTelefono: "+telefono+ "\nEmail: "+ email;
    }
}
