package main;

public abstract class Carros {
 protected int precio;
 protected String modelo;
 

 //Aquí realizo el constructor de la clase abstracta 
public Carros (int Precio, String Modelo) {
	
	precio=Precio;
	modelo=Modelo;
	
}


//Aquí se encuentran los Set y Get 
public int getPrecio() {
	return precio;
}


public void setPrecio(int precio) {
	this.precio = precio;
}


public String getModelo() {
	return modelo;
}


public void setModelo(String modelo) {
	this.modelo = modelo;
}


}
