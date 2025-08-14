
class Cliente{
    String nombreCliente;
    String nit;

    Cliente(String nombre, String nit){
        this.nombreCliente = nombre;
        this.nit = nit;
    }

    Cliente(String nombreCliente){
        this.nombreCliente = nombreCliente;
        this.nit = "c.f";
    }


    public void quejarse(){ 
        System.out.println("MALISIMA LA CIMIDA FUA 0 ESTRELLAS😡 😡 😡");

    }

    public void quejarseChef(chefs chef){
        System.out.println("El cliente dice: aprenda a cocinar, " + chef.getNombre_chef() + " >:(");
    }

    public void ordenar(Platillo platillo){
        System.out.println("El cliente ha ordenado: " + platillo.getPlatName());
    }

    public String comer(Platillo platillo){
        return("Comiendo " + platillo.getPlatName());
    }

    public String getClientName(){
        return nombreCliente; 
    }
}
