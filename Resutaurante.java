import java.util.Scanner;

public class Resutaurante {
    public static void main(String[] args) {

        
        
        Scanner escaner = new Scanner(System.in);
        
        controladorrestaurante controlador = new controladorrestaurante();
        

        for (int i = 0; i < 3000; i++) {
            System.out.println("Bienvenido al administrador del restaurante");
            System.out.println("1) pedir un ingrediente");
            System.out.println("2) crear un platillo");
            System.out.println("3) crear una receta");
            System.out.println("4) contratar un mesero");
            System.out.println("5) contratar un chef");
            System.out.println("6) salir");
            System.out.print("Seleccione una opción: ");
            int opcion = escaner.nextInt();
            escaner.nextLine(); 

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del ingrediente: ");
                    String nombreing = escaner.nextLine();
                    System.out.print("Ingrese la cantidad: ");
                    int cantidad = escaner.nextInt();
                    escaner.nextLine();
                    System.out.println("***********************");
                    controlador.crearingrediente(nombreing, cantidad);
                    System.out.println("");
                    break;
                case 2:
                    System.out.print("Ingrese el nombre del platillo: ");
                    String platilloNombre = escaner.nextLine();
                    System.out.print("Ingrese el precio del platillo: ");
                    double precio = escaner.nextDouble();
                    escaner.nextLine();
                    System.out.println("************************");
                    controlador.crearplatillo(platilloNombre, precio);
                    System.out.println("");
                    break;
                case 3:
                    System.out.print("Ingrese el nombre de la receta: ");
                    String recetaNombre = escaner.nextLine();
                    System.out.print("Ingrese el ingrediente de la receta: ");
                    String ingredienteNombre = escaner.nextLine();
                    System.out.println("************************");
                    controlador.crearreceta(recetaNombre, ingredienteNombre);   
                    System.out.println("");                 
                    break;
                case 4:
                    System.out.print("Ingrese el nombre del mesero: ");
                    String meseroNombre = escaner.nextLine();
                    System.out.println("************************");
                    controlador.contratarMesero(meseroNombre);
                    System.out.println("");
                    break;
                case 5:
                    System.out.print("Ingrese el nombre del chef: ");
                    String chefNombre = escaner.nextLine();
                    System.out.println("************************");
                    controlador.crearChef(chefNombre);
                    System.out.println("");
                    break;
                case 6:
                    i=100000;
                    break;            
                default:
                    break;
            }

            

            

        }
        System.out.println("************************");
        System.out.println("Abriendo el restaurante...");
        System.out.println("************************");
        controlador.abrirrestaurante();
        System.out.println("");
        /*   
        System.out.print("Ingrese el puesto al que quiere aplicar ");
        
        System.out.print("\nIngrese el nombre del empleado: ");
        String chefName = scanner.nextLine();
        chefs chef = new chefs(chefName);
        System.out.println(chef.getNombre_chef() + " ahora es un chef");
        Platillo platillo = new Platillo("Ceviche 🔥", 59.9);
        chef.cocinar(platillo);
        platillo.getPrecio();
        chef.cocinar(platillo);

        
        System.out.print("\nIngrese el nombre del cliente: ");
        String nombreCliente = scanner.nextLine();
        System.out.print("\nIngrese el NIT ");
        String nit = scanner.nextLine();
        
        Cliente cliente = new Cliente(nombreCliente);
        
        cliente.quejarse();
        
        cliente.quejarseChef(chef);
        */
        
        

    }

}