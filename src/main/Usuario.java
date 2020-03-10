package main;

public class Usuario {
	private String Username,Correo,Naming,Contrasena; 
	private Tarjeta tarjetica;
	
	
	
	
	public Usuario(String naming, String username, String correo,  String contrasena) {
		Username=username;
		Correo=correo;
		Naming=naming;
		Contrasena=contrasena;
		
		
	}
	

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



	

}
