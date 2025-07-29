class Ingrediente {
    private String nombreIngrediente;
    private int cantidad;
    private String vencimiento;

     //constructore 
    Ingrediente(String nuevoIngrediente, int cantidad, String vencimiento){
    this.nombreIngrediente = nuevoIngrediente;
    this.cantidad = cantidad;
    this.vencimiento = vencimiento;

    }

    Ingrediente(String nuevoIngrediente, int cantidad){
    this.nombreIngrediente = nuevoIngrediente;
    this.cantidad = cantidad;
    }

    public void cocinarse(){
        System.out.println("se cocino correctamente");
    }
    public void podrirse(){
        System.out.println("el ingrediente se ha podrido :(");
    }

    public String getIngName(){
        return nombreIngrediente;
    }

    public int getCantidad(){
        return cantidad;
    }

    public void usarIngrediente(Platillo platillo){
        System.out.println("Se ha usado " + cantidad + nombreIngrediente + "en " + platillo.getPlatName());

    }


}
