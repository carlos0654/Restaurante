
public class Receta {
    private String nombre;
    private Ingrediente ingrediente;

    public Receta(String nombre, Ingrediente ingrediente) {
        this.nombre = nombre;
        this.ingrediente = ingrediente;
    }

    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Ingrediente getIngrediente() {
        return ingrediente;
    }
    public void setIngrediente(Ingrediente ingrediente) {
        this.ingrediente = ingrediente;
    }

    public void mostraringrediente() {
        System.out.println("La receta " + nombre + " contiene el ingrediente: " + ingrediente.getIngName());
    }
    private void preparar() {
        System.out.println("Paso 1: Cortar. Paso 2: Freir. Paso 3: Servir.");
    }

    
}