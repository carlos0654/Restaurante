public class controladorrestaurante {



    private chefs chef = new chefs("Juan");
    private meseros mesero = new meseros("Maria");
    private Platillo platillo = new Platillo("Pizza", 12.99);

       


    public void crearingrediente(String nombre, int cantidad) {
        Ingrediente ingrediente = new Ingrediente(nombre, cantidad);
        System.out.println("Se ha pedido "+ ingrediente.getCantidad() + " del ingrediente: " + ingrediente.getIngName());
    }
    public void crearplatillo(String nombrePlatillo, double precio) {
        Platillo platillo = new Platillo(nombrePlatillo, precio);
        System.out.println("Se ha creado el platillo: " + platillo.getPlatName() + " con un precio de $" + precio);
    }
    public void crearreceta(String nombreReceta, String ingredienteNombre) {
        Ingrediente ingrediente = new Ingrediente(ingredienteNombre, 1);
        Receta receta = new Receta(nombreReceta, ingrediente);
        System.out.println("Se ha creado la receta: " + receta.getNombre() + " con el ingrediente: " + ingrediente.getIngName());
    }
    public void contratarMesero(String nombre) {
        meseros mesero = new meseros(nombre);
        System.out.println("Se ha contratado al mesero: " + mesero.getNombreMesero());
    }
    public void crearChef(String nombre) {
        chefs chef = new chefs(nombre);
        System.out.println("Se ha contratado al Chef: " + chef.getNombre_chef());

    }

    public void abrirrestaurante() {
        Cliente cliente = new Cliente("Pancracio");
        chef.cocinar(platillo);
        platillo.getPrecio();
        cliente.quejarse();

    }
    public void cocinarunplatillo(String platillo) {
        Platillo platilloCocinar = new Platillo(platillo, 30.00);
        chef.cocinar(platilloCocinar);
        System.out.println("El chef ha cocinado el platillo: " + platilloCocinar.getPlatName());
    }
    public void quejarseChef(String nombreChef) {
        chefs chef = new chefs(nombreChef);
        Cliente cliente = new Cliente("Pancracio");
        cliente.quejarseChef(chef);
        System.out.println("El cliente se ha quejado del chef: " + chef.getNombre_chef());
    }
    public void ordenarPlatillo(String platillo) {
        mesero.servirPlatillo(platillo);
    }
    public void comerPlatillo(String platillo) {
        Cliente cliente = new Cliente("Pancracio");
        Platillo platilloComer = new Platillo(platillo, 30.00);
        cliente.comer(platilloComer);
    }
    public void trabajarChef(String nombreChef) {
        chefs chef = new chefs(nombreChef);
        chef.setHorasExtra(chef.getHorasExtra() + 1);
        System.out.println("El chef " + chef.getNombre_chef() + " ha trabajado una hora extra.");
    }
    
}
