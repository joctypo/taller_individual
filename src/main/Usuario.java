package main;

public class Usuario {
	private String Username,Correo,Naming,Contrasena; 
	private Tarjeta tarjetica;
	String carrocomprado;
	String id;
	String histori [];
	
	
	//Este es el constructor del Usuario
	public Usuario(String naming, String username, String correo,  String contrasena) {
		Username=username;
		Correo=correo;
		Naming=naming;
		Contrasena=contrasena;
		carrocomprado = "";
		id="";
		histori = new String [50];
		
		
	}
	
	//A continuacion estan los Get y Set que ayudan a mover las variables entre clases 
	public String getUsername() {
		return Username;
	}
	
	
	public void setUsername(String username) {
		Username = username;
	}
	
	
	public String getCorreo() {
		return Correo;
	}
	
	
	public void setCorreo(String correo) {
		Correo = correo;
	}
	
	
	public String getNaming() {
		return Naming;
	}
	
	
	public void setNaming(String naming) {
		Naming = naming;
	}
	
	
	public String getContrasena() {
		return Contrasena;
	}
	
	
	public void setContrasena(String contrasena) {
		Contrasena = contrasena;
	}


	public void registrocard(String tarjeta, String cvcc, String fecha, String id, String pascar) {
		tarjetica= new Tarjeta(tarjeta,cvcc,fecha,id,pascar);
	}
	
	
	
	public Tarjeta getTarjetica(Tarjeta tarjetica) {
		return tarjetica;
	}


	public String getCarrocomprado() {
		return carrocomprado;
	}


	public void setCarrocomprado(String carrocomprado) {
		this.carrocomprado = carrocomprado;
	}


	public String getId() {
		return id;
	}


	public String[] getHistori() {
		return histori;
	}


	public void setHistori(String[] histori) {
		this.histori = histori;
	}


	public void setId(String id) {
		this.id = id;
	}



	

}
