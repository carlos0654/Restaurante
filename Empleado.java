public class Empleado {
    private String emplName;
    private String cargo;
    private float sueldo = 2300;

    Empleado(String emplName, String cargo){
        this.emplName = emplName;
        this.cargo = cargo;
        this.sueldo = 1500;
    }

    Empleado(String emplName){
        this.emplName = emplName;
        
    }

    public void trabajar(){
        System.out.println(emplName + " esta trabajando...");
    }

    public String getEmplName(){
        return emplName;
    }

    public String getEmplCargo(){
        return cargo;
    }

    public float bajarSueldo(float sueldo){
        sueldo = sueldo - 50;
        System.out.println("Se ha bajado sueldo por mal servicio — $" + sueldo);
        return sueldo;
    }

    public void despedir(){
        System.out.println(emplName + " ha sido despedido!");
    }
}