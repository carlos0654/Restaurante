public class chefs{

    private String nombreChef;
    private int horasExtra;
    private float sueldoChef;
    private int calificacion;
    private int platillosCocinados;

    //constructores
    public chefs(String nombre, int horasExtra, float sueldoChef, int calificacion, int platillosCocinados){
        this.nombreChef = nombre;
        this.horasExtra = horasExtra;   
        this.sueldoChef = sueldoChef;    
        this.calificacion = calificacion;
        this.platillosCocinados = platillosCocinados;
    }

    public chefs(String nombre){
        this.nombreChef = nombre;
        this.horasExtra = 0;   
        this.sueldoChef = 4700;   
        this.calificacion = 3; 
        this.platillosCocinados = 0;
    }
    //+

    //gets y sets
    public String getNombre_chef() {
        return nombreChef;
    }
    public void setNombre_chef(String nombre) {
        this.nombreChef = nombre;
    }
    public int getHorasExtra() {
        return horasExtra;
    }
    public void setHorasExtra(int horasExtra) {
        this.horasExtra = horasExtra;
    }
    public float getSueldoChef() {
        return sueldoChef;
    }
    public void setSueldoChef(float sueldoChef) {
        this.sueldoChef = sueldoChef;
    }
    public int getCalificacion() {
        return calificacion;
    }
    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }
    public int getPlatillosCocinados() {
        return platillosCocinados;
    }
    public void setPlatillosCocinados(int platillosCocinados) {
        this.platillosCocinados = platillosCocinados;
    }
    //+

    //metodos
    public void cocinar(Platillo platillo) {
        System.out.println("el chef ha cocinado, " + platillo.getPlatName());
    }
    public void picar(){
        System.out.println("el chef ha picado los ingredientes");
    }
    public void moler(){
        System.out.println("el chef ha molido los ingredientes");
    }
    public int trabajarMas(int horasExtra){
        this.horasExtra += horasExtra;
        System.out.println("el chef ha trabajado " + horasExtra + " horas extra.");
        return this.horasExtra;
    }
    //+

}