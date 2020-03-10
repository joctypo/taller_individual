package main;

public class Tarjeta {
	
	private String Tarjeta,Cvcc,Fecha,Id,Pascar;
	
	
	public Tarjeta(String tarjeta, String cvcc, String fecha, String id, String pascar) {
		Tarjeta=tarjeta;
		Cvcc=cvcc;
		Fecha=fecha;
		Id=id;
		Pascar=pascar;
	}


	public String getTarjeta() {
		return Tarjeta;
	}


	public void setTarjeta(String tarjeta) {
		Tarjeta = tarjeta;
	}


	public String getCvcc() {
		return Cvcc;
	}


	public void setCvcc(String cvcc) {
		Cvcc = cvcc;
	}


	public String getFecha() {
		return Fecha;
	}


	public void setFecha(String fecha) {
		Fecha = fecha;
	}


	public String getId() {
		return Id;
	}


	public void setId(String id) {
		Id = id;
	}


	public String getPascar() {
		return Pascar;
	}


	public void setPascar(String pascar) {
		Pascar = pascar;
	}

}
