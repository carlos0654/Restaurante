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
    
}
