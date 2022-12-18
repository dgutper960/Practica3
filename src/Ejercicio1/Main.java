package Ejercicio1;

public class Main {
    public static void main(String[] args) {
        Casa casa1 = new Casa();//Creamos un Objeto Casa
        casa1.setPrecio(952);
        casa1.setCatastral("KELLY-5289200-FOH");
        casa1.setEnergía("Calif Energ A++");
        casa1.MostrarPrecioConIva();
        casa1.MostrarPrecioConIvareducido();
        casa1.MostrarCatastral_Y_Precios();
    }

}
