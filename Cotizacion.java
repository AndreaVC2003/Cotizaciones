
package cotizacion;

public class Cotizacion {
    public static void main(String[] args) {
        Modelo m = new Modelo();
        Vista v = new Vista(m);
        Controlador c = new Controlador(m, v);
    }
}
