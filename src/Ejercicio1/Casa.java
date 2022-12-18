package Ejercicio1;

public class Casa {
    //Creamos los campos requeridos:
    private Integer precio;
    //No sé cómo es un campo caracter
    private  String  energía;
    private String catastral;

    final static Integer Iva=21;
    final static Integer Ivareducido=16;

    public Integer getPrecio() {
        return precio;
    }
//Creamos getters
    public String getCatastral() {
        return catastral;
    }

    public String getEnergía() {
        return energía;
    }
//Creamos Setters
    public void setCatastral(String catastral) {
        this.catastral = catastral;
    }

    public void setEnergía(String energía) {
        this.energía = energía;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    void MostrarPrecioConIva(){
        System.out.println("El precio con el IVA es: \n" +
                 (precio + precio*Iva/100));
    }
//Creamos las funciones requeridas
    void MostrarPrecioConIvareducido () {
        System.out.println("El precio con IVA reducido es: \n"
                 + (precio + precio * Ivareducido / 100));
    }
    void MostrarCatastral_Y_Precios(){
        System.out.println("La referencia catastral es: " + catastral + "\n" +
                "El precio sin Iva es: " + precio + "\n" +
                "El precio con IVA es:" + (precio += precio*Iva/100)
                + "\n" + "El precio con IVA reducido es: " + (precio += precio * Ivareducido / 100));
    }
}