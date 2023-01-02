package principal;

import java.io.File;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

import clases.Auricular;


public class AuricularAPP_Array {
	public static void main(String[] args) throws FileNotFoundException {
		
		
		
		//creas array vacio
		Auricular auriculares[]=new Auricular[10];
		lectura(auriculares);
		guardar(auriculares);
		
		
		
	}
		public static void lectura(Auricular [] auricular) throws FileNotFoundException {
		Scanner teclado = new Scanner(System.in);
		File file = new File("recursos/auriculares");
		Scanner scan = new Scanner(file);
		  //constructor sin parámetros
		String linea;
		String[] partes;
		  int i=0;
		 	while (scan.hasNextLine()) {
				
				linea = scan.nextLine();
				partes = linea.split(";");
				// GUARDA el fichero
				Auricular auricular_guardar=new Auricular((partes[0]),(partes[1]),(Double.parseDouble(partes[2])),(Integer.parseInt(partes[3])));
				auricular[i]=auricular_guardar;
				//imprimes ficheros
				 System.out.println(auricular[i]);
				 
				i=i+1;
				//array completado
		  
		 
	}
			scan.close();
			teclado.close();
		}
		  
		  
		public static void guardar(Auricular [] auricular) throws FileNotFoundException {
			
			
				PrintWriter writer = new PrintWriter("recursos/auriculares");
				for (int j = 0; j < auricular.length; j++) {
					writer.println(auricular[j].paraFichero());
				}
				System.out.println("Los nuevos cambios han sido guardados con exito!!");
				writer.close();

			}
		 
		
		
}
			
	

	
	



	
	

