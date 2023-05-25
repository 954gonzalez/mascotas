import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import javax.swing.JOptionPane;

public class Procesos {
	HashMap<String, Mascotas> mapaMascotas;
	int cant=0;
	Mascotas acceso;
	
	
	
public Procesos() {
		mapaMascotas = new HashMap<>();
		iniciar();
	}
	


private void iniciar() {
	acceso=new Mascotas();
		crearMascota();
		imprimirMascotas();
		buscarMascota();
	}


public void buscarMascota() {
	
	acceso.buscarMascota();
}

private void imprimirMascotas() {
	for (Mascotas mascota : mapaMascotas.values()) {
		mascota.mostrarInformacion();
	
		  
	}
    
}



private void crearMascota() {
		cant=Integer.parseInt(JOptionPane.showInputDialog("ingrese la cantidad de mascotas"));
		for(int i=0;i<cant;i++) {
			Mascotas mascota=new Mascotas();
			mascota.ingresar();
			
			mapaMascotas.put(mascota.codigo, mascota);
		
		}
}


	
}


