import java.util.Scanner;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Resutaurante extends JFrame{
    
    Resutaurante() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1200, 720);
        this.setLayout(null);
        this.setTitle("Restaorante");

        JTextField textfieldPedirIndgrediente = new JTextField();
        JTextField textfieldCrearPlatillo = new JTextField();
        JTextField textfieldCrearReceta = new JTextField();
        JTextField textfieldContratarMesero = new JTextField();
        JTextField textfieldContratarChef = new JTextField();
        JTextField textfieldCocinarPlatillo = new JTextField();
        JTextField textfieldQuejarseChef = new JTextField();
        JTextField textfieldOrdenarPlatillo = new JTextField();
        JTextField textfieldComerPlatillo = new JTextField();


        controladorrestaurante controlador = new controladorrestaurante();
        JLabel labelPedirIndgrediente = new JLabel(" Pedir Ingrediente");
        JLabel labelCrearPlatillo = new JLabel(" Crear Platillo");
        JLabel labelCrearReceta = new JLabel(" Crear Receta");
        JLabel labelContratarMesero = new JLabel(" Contratar Mesero");
        JLabel labelContratarChef = new JLabel(" Contratar Chef");
        JLabel labelCocinarPlatillo = new JLabel(" Cocinar Platillo");
        JLabel labelQuejarseChef = new JLabel(" Quejarse del Chef");
        JLabel labelOrdenarPlatillo = new JLabel(" Ordenar Platillo");
        JLabel labelComerPlatillo = new JLabel(" Comer Platillo");
        JLabel labelTrabajarMas = new JLabel(" Mostrar Platillos");

        JButton buttonPedirIngrediente = new JButton("Pedir");
        JButton buttonCrearPlatillo = new JButton("Crear");
        JButton buttonCrearReceta = new JButton("Crear");
        JButton buttonContratarMesero = new JButton("Contratar");
        JButton buttonContratarChef = new JButton("Contratar");
        JButton buttonCocinarPlatillo = new JButton("Cocinar");
        JButton buttonQuejarseChef = new JButton("Quejarse");
        JButton buttonOrdenarPlatillo = new JButton("Ordenar");
        JButton buttonComerPlatillo = new JButton("Comer");
        JButton buttonTrabajarMas = new JButton("Mostrar");
        
        JButton buttonLimpiar = new JButton("Limpiar");
        
        
        buttonPedirIngrediente.setBounds(145, 85, 170, 30);
        textfieldPedirIndgrediente.setBounds(345, 85, 170, 30);
        buttonCrearPlatillo.setBounds(145, 140, 170, 30);
        buttonCrearReceta.setBounds(145, 195, 170, 30);
        buttonContratarMesero.setBounds(145, 250, 170, 30);
        buttonContratarChef.setBounds(145, 305, 170, 30);
        buttonCocinarPlatillo.setBounds(145, 365, 170, 30);
        buttonQuejarseChef.setBounds(145, 420, 170, 30);
        buttonOrdenarPlatillo.setBounds(145, 478, 170, 30);
        buttonComerPlatillo.setBounds(145, 540, 170, 30);
        buttonTrabajarMas.setBounds(145, 590, 170, 30);
        buttonLimpiar.setBounds(485, 595, 150, 30);
        
        textfieldCrearPlatillo.setBounds(345, 140, 170, 30);
        textfieldCrearReceta.setBounds(345, 195, 170, 30);
        textfieldContratarMesero.setBounds(345, 250, 170, 30);
        textfieldContratarChef.setBounds(345, 305, 170, 30);
        textfieldCocinarPlatillo.setBounds(345, 365, 170, 30);
        textfieldQuejarseChef.setBounds(345, 420, 170, 30);
        textfieldOrdenarPlatillo.setBounds(345, 478, 170, 30);
        textfieldComerPlatillo.setBounds(345, 540, 170, 30);

        
        

        JPanel panelLabels = new JPanel();
        panelLabels.setLayout(new BoxLayout(panelLabels, BoxLayout.Y_AXIS));
        panelLabels.setBounds(5, 0, 120, 720);
        panelLabels.setBackground(Color.LIGHT_GRAY);

        panelLabels.add(Box.createVerticalStrut(90));
        panelLabels.add(labelPedirIndgrediente);
        panelLabels.add(Box.createVerticalStrut(40));
        panelLabels.add(labelCrearPlatillo);
        panelLabels.add(Box.createVerticalStrut(40));
        panelLabels.add(labelCrearReceta);
        panelLabels.add(Box.createVerticalStrut(40));
        panelLabels.add(labelContratarMesero);
        panelLabels.add(Box.createVerticalStrut(40));
        panelLabels.add(labelContratarChef);
        panelLabels.add(Box.createVerticalStrut(40));
        panelLabels.add(labelCocinarPlatillo);
        panelLabels.add(Box.createVerticalStrut(40));
        panelLabels.add(labelQuejarseChef);
        panelLabels.add(Box.createVerticalStrut(40));
        panelLabels.add(labelOrdenarPlatillo);
        panelLabels.add(Box.createVerticalStrut(40));
        panelLabels.add(labelComerPlatillo);
        panelLabels.add(Box.createVerticalStrut(40));
        panelLabels.add(labelTrabajarMas);



        JPanel panelLabels2 = new JPanel();
        panelLabels2.setLayout(new BoxLayout(panelLabels2, BoxLayout.Y_AXIS));
        panelLabels2.setBounds(670, 20, 480, 640);
        panelLabels2.setBackground(Color.GRAY);
        panelLabels2.add(Box.createVerticalStrut(70));

        JPanel panelLabels3 = new JPanel();
        panelLabels3.setLayout(new BoxLayout(panelLabels3, BoxLayout.Y_AXIS));
        panelLabels3.setBounds(680, 30, 460, 620);
        panelLabels3.setBackground(Color.LIGHT_GRAY);








        this.add(panelLabels);

        this.add(panelLabels3);
        this.add(panelLabels2);
        
        

        this.add(textfieldPedirIndgrediente);
        this.add(textfieldCrearPlatillo);
        this.add(textfieldCrearReceta);
        this.add(textfieldContratarMesero);
        this.add(textfieldContratarChef);
        this.add(textfieldCocinarPlatillo);
        this.add(textfieldQuejarseChef);
        this.add(textfieldOrdenarPlatillo);
        this.add(textfieldComerPlatillo);

        this.add(buttonPedirIngrediente);
        this.add(buttonCrearPlatillo);
        this.add(buttonCrearReceta);
        this.add(buttonContratarMesero);
        this.add(buttonContratarChef);
        this.add(buttonCocinarPlatillo);
        this.add(buttonQuejarseChef);
        this.add(buttonOrdenarPlatillo);
        this.add(buttonComerPlatillo);
        this.add(buttonTrabajarMas);
        this.add(buttonLimpiar);

        buttonPedirIngrediente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelLabels3.add(new JLabel(controlador.crearingrediente(textfieldPedirIndgrediente.getText(), 5)));
                panelLabels3.revalidate();
                //panelLabels3.repaint();
            }
        });
            buttonCrearPlatillo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelLabels3.add(new JLabel(controlador.crearplatillo(textfieldCrearPlatillo.getText(), 50.00)));              
                panelLabels3.revalidate();
            }
        });
            buttonCrearReceta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelLabels3.add(new JLabel(controlador.crearreceta(textfieldCrearReceta.getText(), "Tomate")));
                panelLabels3.revalidate();
            }
        });
            buttonContratarMesero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelLabels3.add(new JLabel(controlador.contratarMesero(textfieldContratarMesero.getText())));
                panelLabels3.revalidate();
            }
        });
            buttonContratarChef.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelLabels3.add(new JLabel(controlador.crearChef(textfieldContratarChef.getText())));
                panelLabels3.revalidate();
            }
        });
            buttonCocinarPlatillo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelLabels3.add(new JLabel(controlador.cocinarunplatillo(textfieldCocinarPlatillo.getText()).getPlatName() + " ha sido cocinado."));
                panelLabels3.revalidate();

            }
        });
            buttonQuejarseChef.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelLabels3.add(new JLabel(controlador.quejarseChef(textfieldQuejarseChef.getText())));
                panelLabels3.revalidate();

            }
        });
            buttonOrdenarPlatillo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelLabels3.add(new JLabel(controlador.ordenarPlatillo(textfieldOrdenarPlatillo.getText())));
                panelLabels3.revalidate();

            }
        });
            buttonComerPlatillo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelLabels3.add(new JLabel(controlador.comerPlatillo(textfieldComerPlatillo.getText())));
                panelLabels3.revalidate();

            }
        });
            buttonTrabajarMas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelLabels3.add(new JLabel("hay: "+ controlador.cantidadplatillos()+ " platillos"));
                panelLabels3.add(new JLabel("Menu de platillos..."));
                for (int i = 0; i < controlador.cantidadplatillos(); i++) {
                    panelLabels3.add(new JLabel("        "+controlador.trabajarChef(i) + ""));
                    panelLabels3.revalidate();
                }
                

            }
        });
        buttonLimpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelLabels3.removeAll();
                panelLabels3.revalidate();
                panelLabels3.repaint();

            }
        });


    }
    public static void main(String[] args) {
        Resutaurante restaurante = new Resutaurante();
        restaurante.setVisible(true);  
        
        
        Scanner escaner = new Scanner(System.in);
        String mensajeRespuesta;
        
        controladorrestaurante controlador = new controladorrestaurante();
        for (int i = 0; i < 3000; i++) {

            System.out.println("1) pedir un ingrediente");
            System.out.println("2) crear un platillo");
            System.out.println("3) crear una receta");
            System.out.println("4) contratar un mesero");
            System.out.println("5) contratar un chef");
            System.out.println("6) cocinar un platillo");
            System.out.println("7) quejarse del chef");
            System.out.println("8) ordenar un platillo");
            System.out.println("9) comer un platillo");
            System.out.println("10) trabajar mas");

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
                    mensajeRespuesta = controlador.crearingrediente(nombreing, cantidad);
                    System.out.println(mensajeRespuesta);
                    System.out.println("");
                    break;
                case 2:
                    System.out.print("Ingrese el nombre del platillo: ");
                    String platilloNombre = escaner.nextLine();
                    System.out.print("Ingrese el precio del platillo: ");
                    double precio = escaner.nextDouble();
                    escaner.nextLine();
                    System.out.println("************************");
                    mensajeRespuesta = controlador.crearplatillo(platilloNombre, precio);
                    System.out.println(mensajeRespuesta);
                    System.out.println("");
                    break;

                case 3:
                    System.out.print("Ingrese el nombre de la receta: ");
                    String recetaNombre = escaner.nextLine();
                    System.out.print("Ingrese el ingrediente de la receta: ");
                    String ingredienteNombre = escaner.nextLine();
                    System.out.println("************************");
                    mensajeRespuesta = controlador.crearreceta(recetaNombre, ingredienteNombre);  
                    System.out.println(mensajeRespuesta);
                    System.out.println("");                 
                    break;

                case 4:
                    System.out.print("Ingrese el nombre del mesero: ");
                    String meseroNombre = escaner.nextLine();
                    System.out.println("************************");
                    mensajeRespuesta = controlador.contratarMesero(meseroNombre);
                    System.out.println(mensajeRespuesta);
                    System.out.println("");
                    break;

                case 5:
                    System.out.print("Ingrese el nombre del chef: ");
                    String chefNombre = escaner.nextLine();
                    System.out.println("************************");
         
                    mensajeRespuesta = controlador.crearChef(chefNombre);
                    System.out.println(mensajeRespuesta);
                    System.out.println("");

                    break;

                case 6:
                    System.out.print("Ingrese el nombre del platillo a cocinar: ");
                    String platilloCocinar = escaner.nextLine();
                    controlador.cocinarunplatillo(platilloCocinar);
                    System.out.println("El chef ha cocinado el platillo: " + platilloCocinar);
                    System.out.println("");
                    break;

                case 7:
                    System.out.print("Ingrese el nombre del chef para quejarse: ");
                    String chefQuejarse = escaner.nextLine();
                    mensajeRespuesta = controlador.quejarseChef(chefQuejarse);
                    System.out.println(mensajeRespuesta);
                    break;

                case 8:
                    System.out.print("Ingrese el nombre del platillo a ordenar: ");
                    String platilloAOrdenar = escaner.nextLine();
                    controlador.ordenarPlatillo(platilloAOrdenar);
                    System.out.println("");
                    break;

                case 9:
                    System.out.print("Ingrese el nombre del platillo a comer: ");
                    String platilloAComer = escaner.nextLine();
                    controlador.comerPlatillo(platilloAComer);
                    System.out.println("El cliente esta comiendo: " + platilloAComer);
                    System.out.println("");

                    break;

                case 10:
                    System.out.print("Ingrese el nombre del chef para trabajar más: ");
                    String chefTrabajar = escaner.nextLine();
                    System.out.println("El chef " + chefTrabajar + " ha trabajado una hora extra.");
                
                    break;

                case 11:
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
