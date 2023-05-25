import javax.swing.JOptionPane;

public class Mascotas {
    // Atributos
    String codigo;
    String nombre;
    String especie;
    int edad;

    Procesos acceso;
    //Constructor sin parametros
  public Mascotas() {
    	  codigo="";
          nombre = "Firu";
          especie = "Default";
          edad = 0;
          acceso=new Procesos();
    }

 public void ingresar() {
    	codigo =JOptionPane.showInputDialog("Ingrese el codigo");
        nombre = JOptionPane.showInputDialog("Ingrese nombre");
        especie = JOptionPane.showInputDialog("Ingrese la especie");
        edad =Integer.parseInt(JOptionPane.showInputDialog("ingrese la edad"));
    }
 public void iniciar() {
		
		
	}

    // Constructor con parametros
 public Mascotas(String codigo,String nombre, String especie, int edad) {
    	this.codigo= codigo;
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }

    // Método para mostrar información de la mascota
 public void mostrarInformacion() {
    	System.out.println("codigo: "+ codigo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad + " años");
       
        hacerSonido();
        jugar();
        System.out.println();
    }

    // Método para hacer que la mascota realice un sonido
 public void hacerSonido() {
        if (especie.equalsIgnoreCase("perro")) {
            System.out.println("¡Guau guau!");
        } else if (especie.equalsIgnoreCase("gato")) {
            System.out.println("¡Miau miau!");
        } else {
            System.out.println("La mascota no hace sonidos conocidos.");
        }
    }
    
    
 public void jugar() {
        System.out.println(nombre + " está jugando.");
    }

   
 
 
  public void alimentar() {
        System.out.println(nombre + " está siendo alimentado.");
    }
    
  
  
  public void buscarMascota() {
    	
    	String codigoBusqueda = JOptionPane.showInputDialog("Ingrese el codigo de la mascota a buscar");
        if (codigo.equals(codigoBusqueda)) {
            System.out.println("Mascota encontrada:");
            mostrarInformacion();
            
        } else {
        	System.out.println("no se encontro");
        }
    }
    
  
  
  
 public void actualizarMascota() {
    	
    	String codigoBusqueda = JOptionPane.showInputDialog("Ingrese el codigo de la mascota a acualizar");
        if (codigo.equals(codigoBusqueda)) {
        	String codigon = JOptionPane.showInputDialog("Ingrese el nuevo codigo de la mascota");
        	String nom = JOptionPane.showInputDialog("Ingrese el nuevo nombre");
            mapaMascotas.put(codigon);
        } else {
        	System.out.println("no se encontro");
        }
    }
}
