public class meseros{

    private String nombreMesero;
    private String sueldoMesero;
    private int horasExtras;
    private String rango;

    //constructores
    public meseros(String nombreMesero, String sueldoMesero, int horasExtras, String rango){
        this.nombreMesero = nombreMesero;
        this.sueldoMesero = sueldoMesero;
        this.horasExtras = horasExtras;
        this.rango = rango;
    }
    public meseros(String nombreMesero){
        this.nombreMesero = nombreMesero;
        this.sueldoMesero = "3500"; 
        this.horasExtras = 0;
        this.rango = "Novato";
    }
    //+

    //gets y sets
    public String getNombreMesero() {
        return nombreMesero;
    }
    public void setNombreMesero(String nombreMesero) {
        this.nombreMesero = nombreMesero;
    }
    public String getSueldoMesero() {
        return sueldoMesero;
    }
    public void setSueldoMesero(String sueldoMesero) {
        this.sueldoMesero = sueldoMesero;
    }
    public int getHorasExtras() {
        return horasExtras;
    }
    public void setHorasExtras(int horasExtras) {
        this.horasExtras = horasExtras;
    }
    public String getRango() {
        return rango;
    }
    public void setRango(String rango) {
        this.rango = rango;
    }
    //+

    //metodos
    public void anotarPedido(String pedido) {
        System.out.println("El mesero " + nombreMesero + " ha anotado el pedido: " + pedido);
    }
    public String servirPlatillo(String platillo) {
        return ("El mesero " + nombreMesero + " ha servido el platillo: " + platillo);
    }
    public void limpiarMesa() {
        System.out.println("El mesero " + nombreMesero + " ha limpiado la mesa.");
    }
    public void organizarMesa() {
        System.out.println("El mesero " + nombreMesero + " ha organizado la mesa.");
    }
    public int trabajarMas(int horasExtras){
        this.horasExtras += horasExtras;
        System.out.println("el chef ha trabajado " + horasExtras + " horas extra.");
        return this.horasExtras;
    }

}