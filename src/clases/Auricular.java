package clases;

public class Auricular {

private String modelo;
private String marca;
private Double precio;
private int stock;

//para definir y que puedan ser nulos
public Auricular() {
	
};
//para poder inicializarlo a cualquier valor
public Auricular(String modelo,String marca,Double precio,int stock) {
	this.modelo= modelo;
	this.marca=marca;
	this.precio=precio;
	this.stock=stock;
}



public String getModelo() {
	return this.modelo;
}
public void setModelo(String modelo_auricular) {
	this.modelo=modelo_auricular;
}

public String getMarca() {
    return this.marca;
}
public void setMarca(String marca_auricular) {
	this.marca=marca_auricular;
}

public  double getPrecio() {
	return this.precio;
}

public void setPrecio(double precio_auricular) {
	this.precio=precio_auricular;
}

public int getStock() {
	return this.stock;
}
public void setStock(int stock_auricular) {
	this.stock=stock_auricular;
}

public String toString() {
	return this.modelo + "-" + this.marca+"-"+this.precio+"-"+this.stock;
}
public String paraFichero() {
	return this.modelo+ ";" +this.marca +";" +this.precio+";"+this.stock;
}




}