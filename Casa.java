public class Casa {
    private int precio;
    private char califEnerg;
    private String refCatastral;

    static int IVA = 21;
    static int IVAred = 16;
    int precioIVA = (21*100)/precio;
    int precioIVAred = (16*100)/precio;
    public void precioIVA(){
       System.out.println("El precio de la casa con IVA es de "
       + precioIVA);
    }

    public Casa(int precio, char califEnerg, String refCatastral) {
        this.precio = precio;
        this.califEnerg = califEnerg;
        this.refCatastral = refCatastral;
    }
    public int getPrecio() {
        return precio;
    }
    public char getCalifEnerg() {
        return califEnerg;
    }
    public String getRefCatastral() {
        return refCatastral;
    }
    public static int getIVA() {
        return IVA;
    }
    public static int getIVAred() {
        return IVAred;
    }
    public int getPrecioIVA() {
        return precioIVA;
    }
    public int getPrecioIVAred() {
        return precioIVAred;
    }
    public void precioIVAred(){
        System.out.println("El precio de la casa con IVA reducido" +
                " es " + precioIVAred);
    }
    void refCatastralPrecios(){
        System.out.println("La referencia catastral de la casa es " + refCatastral +
        "\nEl precio sin IVA es: " + precio +
                "\nEl precio con IVA es: " + precioIVA +
                "\nEl precio con IVA reducido es: " + precioIVAred);
    }


}
