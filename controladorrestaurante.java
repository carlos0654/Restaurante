public class controladorrestaurante {



    private chefs chef = new chefs("Juan");
    private meseros mesero = new meseros("Maria");
    private Platillo platillo = new Platillo("Pizza", 12.99);




    public Ingrediente crearingrediente(String nombre, int cantidad) {
        return new Ingrediente(nombre, cantidad);

    }
    public Platillo crearplatillo(String nombrePlatillo, double precio) {
        return new Platillo(nombrePlatillo, precio);
        
    }
    public Receta crearreceta(String nombreReceta, String ingredienteNombre) {
        Ingrediente ingrediente = new Ingrediente(ingredienteNombre, 1);
        return new Receta(nombreReceta, ingrediente);
        
    }
    public meseros contratarMesero(String nombre) {
        return new meseros(nombre);
        
    }
    public chefs crearChef(String nombre) {
        return new chefs(nombre);
        
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
        return chef.getNombre_chef();
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
