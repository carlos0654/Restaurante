

class Platillo {
    private String nombrePlatillo;
    private Double precio;
    
    Platillo(String nombrePlatillo, Double precio){
    this.nombrePlatillo = nombrePlatillo;
    this.precio = precio;
    }

    public void agregarSal(){
        
        System.out.println("Anadiendo sal...");

    }

    public void getPrecio(){
        System.out.println("El platillo " + nombrePlatillo + " Tiene un precio de: $" + precio);

    }

    public String getPlatName(){
        return nombrePlatillo;

    }


}