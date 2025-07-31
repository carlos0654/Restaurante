public class controladorrestaurante {

    private chefs chef;
    private meseros mesero ;
    private Platillo platillo;

    public String crearingrediente(String nombre, int cantidad) {
        Ingrediente ingrediente = new Ingrediente(nombre, cantidad);
        return ("Se ha pedido "+ ingrediente.getCantidad() + " del ingrediente: " + ingrediente.getIngName());

    }
    public String crearplatillo(String nombrePlatillo, double precio) {
        Platillo platillo = new Platillo(nombrePlatillo, precio);
        return("Se ha creado el platillo: " + platillo.getPlatName() + " con un precio de $" + precio);
        
    }
    public String crearreceta(String nombreReceta, String ingredienteNombre) {
        Ingrediente ingrediente = new Ingrediente(ingredienteNombre, 1);
        Receta receta = new Receta(nombreReceta, ingrediente);
        return("Se ha creado la receta: " + receta.getNombre() + " con el ingrediente: " + ingrediente.getIngName());
        
    }
    public String contratarMesero(String nombre) {
        meseros mesero = new meseros(nombre);
        return("Se ha contratado al mesero: " + mesero.getNombreMesero());        
    }
    public String crearChef(String nombre) {
        chef = new chefs(nombre);
        return "Se ha contratado al Chef: " + chef.getNombre_chef();
        
    }

    public Cliente abrirrestaurante() {
        Cliente cliente = new Cliente("Pancracio");
        chef.cocinar(platillo);
        platillo.getPrecio();
        cliente.quejarse();
        return cliente;
    }

    public Platillo cocinarunplatillo(String platillo) {
        Platillo platilloCocinar = new Platillo(platillo, 30.00);
        chef.cocinar(platilloCocinar);
        return platilloCocinar;
    }

    public String quejarseChef(String nombreChef) {
        chefs chef = new chefs(nombreChef);
        Cliente cliente = new Cliente("Pancracio");
        cliente.quejarseChef(chef);
        return ("El cliente dice: " + nombreChef + " aprenda a cocinar 😡😡");
    }

    public String ordenarPlatillo(String platillo) {
        mesero.servirPlatillo(platillo);
        return platillo;
    }

    public Platillo comerPlatillo(String platillo) {
        Cliente cliente = new Cliente("Pancracio");
        Platillo platilloComer = new Platillo(platillo, 30.00);
        cliente.comer(platilloComer);
        return platilloComer;
    }
    public chefs trabajarChef(String nombreChef) {
        chefs chef = new chefs(nombreChef);
        chef.setHorasExtra(chef.getHorasExtra() + 1);
        return chef;
    }
    
}
