package principal;

import clases.Auricular;


public class Prueba_auricular {
	public static void main(String[] args) {
		// constructor con parámetros
	  Auricular auricular_1=new Auricular("G533","Logitec", 114.0, 3);
	  
	  System.out.println(auricular_1);
	 
	  //constructor sin parámetros
	  
	  Auricular auricular_2=new Auricular();
	  
	  auricular_2.setModelo("GXT383");
	  auricular_2.setMarca("Trust");
	  auricular_2.setPrecio(59.9);
	  auricular_2.setStock(5);
	  
	  System.out.println(auricular_2);
	
	
	  
	 
	}


}
