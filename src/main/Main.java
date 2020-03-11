package main;

import processing.core.PApplet;
import processing.core.PFont;
import processing.core.PImage;
import java.util.ArrayList;
import controlP5.*;


public class Main extends PApplet {
 //Declaración de variables para el programa
	ControlP5 cp5;
	CallbackListener cb;
	
	ArrayList<Usuario> people;
	ArrayList<Carros> cars;
	
	String [] historial;
	String [] usuario;
	String [] card;
	PImage [] animacion1;

	
	
	PImage screen1;
	PImage screen2;
	PImage screen3;
	PImage screen4;
	PImage screen5;
	PImage screen6;
	PImage screen7;
	PImage screen8;
	PImage screen9;
	PImage screen10;
	PImage screen11;
	PImage screen12;
	PImage screen13;
	PImage screen14;
	PImage screen15;
	PImage screen16;
	PImage screen17;
	String vacio = "";
	String register;
	String username;
	String correo;
	String contrasena;
	String naming;
	String pascar;
	String cvcc;
	String fecha; 
	String id; 
	String tarjeta;
	String usuarioeva;
	String passeva;
	String Hid;
	String HMod;
	String Husus;

	int cash;
	int posicion=0;
	int registrador=0;
	int pantallas=0;
	int contadorf;
	int tiempo;
	int pantallavieja=0;
	PFont font;
	
	boolean verificar=false;

	
	
	
	public static void main(String[] args) {
		
		PApplet.main("main.Main");
		
	}

	public void settings() {
		size(360,640);
		

	}
	
	public void setup() {
		
		
		preload();
		//Aquí importamos la fuente
		font =  createFont ( "Raleway-Regular.ttf" , 15 );	
		cp5 = new ControlP5(this);
		//Aquí generamos los inputs de Texto y botones
		textoslog();
		textosreg();
		botones();
		
		//Aqui definimos el tamaño de los arreglos
		usuario = new String [4];
		card = new String [20];
		
		//Aqui inicializamos los arrayList
		people= new ArrayList <Usuario>();
		cars=new ArrayList <Carros>();
		cars.add(new TeslaA(0,""));
		
		//Aqui les damos valores a los arreglos
		usuario[0] = "usuario";
		usuario[1] = "name";
		usuario[2] = "email";
		usuario[3] = "password";
		
		 	

	}


	
	public void draw() {
		background(45);
		
		switch (pantallas) {
	
		
		case 0:
			
			//esta pantalla es la primera que es como una cortinilla
			hidetext();
			hideboton();
			image(screen1,0,0);
			contadorf = frameCount;
			
			//Con esto hacemos el cambio de pantalla 
			if(contadorf==30) {
				pantallas ++;}
			
			break;
			
			
			
		case 1:
			
			
			image(screen2,0,0);
			
			//aqui elegimos las acciones que deseamos realizar 
			cp5.get(Button.class,"login").show();
			cp5.get(Button.class,"register").show();
			
			
			break;
			

			
		case 2:
			
			//En esta pantalla se encuentra el login de la app
			
			image(screen3,0,0);
			
			cp5.get(Textfield.class,"usuario2").setVisible(false);
			cp5.get(Textfield.class,"password2").setVisible(false);
			cp5.get(Textfield.class,"email").setVisible(false);
			cp5.get(Textfield.class,"nombre").setVisible(false);
			cp5.get(Button.class,"submit").hide();
			cp5.get(Button.class,"login").hide();
			cp5.get(Button.class,"register").hide();
			cp5.get(Button.class,"login2").hide();
			
			//estos son los datos requeridos para el login
			cp5.get(Textfield.class,"usuario").setVisible(true);
			cp5.get(Textfield.class,"password").setVisible(true);
			cp5.get(Button.class,"register2").show();
			cp5.get(Button.class,"sign").show();
			
			
			break;
			
			
			
		case 3:
			
			// aqui se encuentra el registro, en esta primera parte ocultamos
			// lo que no necesitamos
			cp5.get(Textfield.class,"usuario").setVisible(false);
			cp5.get(Textfield.class,"password").setVisible(false);
			cp5.get(Button.class,"login").hide();
			cp5.get(Button.class,"register").hide();
			cp5.get(Button.class,"sign").hide();
			cp5.get(Button.class,"register2").hide();
			
			//aqui estan todos los datos requeridos para el register
			image(screen4,0,0);
			cp5.get(Textfield.class,"usuario2").setVisible(true);
			cp5.get(Textfield.class,"password2").setVisible(true);
			cp5.get(Textfield.class,"email").setVisible(true);
			cp5.get(Textfield.class,"nombre").setVisible(true);
			cp5.get(Button.class,"submit").show();
			cp5.get(Button.class,"login2").show();
			
			break;
			
			
			
		case 4:
			
			
			//Aquí se encuentra el menú y en esta ocultamos botones
			hidetext();
			cp5.get(Button.class,"sign").hide();
			cp5.get(Button.class,"register2").hide();
			cp5.get(Button.class,"regresar").hide();
			
			//Aqui estan todos los botones del menu para comprar
			image(screen5,0,0);
			cp5.get(Button.class,"perfil").show();
			cp5.get(Button.class,"teslaA").show();
			cp5.get(Button.class,"teslaB").show();
			cp5.get(Button.class,"teslaC").show();
			
			
			break;
			
			
			
		case 5:
			
			//Aquí se encuentra el lateral y en esta ocultamos el menú
			cp5.get(Button.class,"perfil").hide();
			cp5.get(Button.class,"teslaA").hide();
			cp5.get(Button.class,"teslaB").hide();
			cp5.get(Button.class,"teslaC").hide();
			image(screen5,0,0);
			image(screen16,0,0);
			textFont(font);
			text(usuarioeva,80,68);
			
			
			break;
			
			
			
		case 6:
			
			
			//Aquí tenemos una previsualizacion del carro A y ocultamos botones
			cp5.get(Button.class,"perfil").hide();
			cp5.get(Button.class,"teslaA").hide();
			cp5.get(Button.class,"teslaB").hide();
			cp5.get(Button.class,"teslaC").hide();
			
			image(screen6,0,0);
			
			cp5.get(Button.class,"regresar").show();

			break;
			
			
			
		case 7:
			
			
			//Aquí tenemos una previsualizacion del carro B y ocultamos botones
			cp5.get(Button.class,"perfil").hide();
			cp5.get(Button.class,"teslaA").hide();
			cp5.get(Button.class,"teslaB").hide();
			cp5.get(Button.class,"teslaC").hide();
			
			image(screen10,0,0);
			
			cp5.get(Button.class,"regresar").show();

			break;
			
			
			
		case 8:
			
		
			//Aquí tenemos una previsualizacion del carro C y ocultamos botones
			cp5.get(Button.class,"perfil").hide();
			cp5.get(Button.class,"teslaA").hide();
			cp5.get(Button.class,"teslaB").hide();
			cp5.get(Button.class,"teslaC").hide();
			
			image(screen12,0,0);
			
			cp5.get(Button.class,"regresar").show();
		
			
			break;
			
		case 9:
			
			// comparar carro A
			hideboton();
			image(screen7,0,0);
			
			
			break;
			
		case 10:
			
			// comparar carro B
			hideboton();
			image(screen11,0,0);
			
			break;
			
		case 11:
			
			// comparar carro C
			hideboton();
			image(screen13,0,0);
						

			break;
			
		case 12:
			
			// Aquí podemos comprar, por eso activamos campos de texto 
			
			image(screen8,0,0);
			
			cp5.get(Button.class,"pagar").show();
			cp5.get(Textfield.class,"card").setVisible(true);
			cp5.get(Textfield.class,"cvc").setVisible(true);
			cp5.get(Textfield.class,"fecha").setVisible(true);
			cp5.get(Textfield.class,"id").setVisible(true);
			cp5.get(Textfield.class,"password3").setVisible(true);
			
			cash= cars.get(posicion).getPrecio();
			
		
			textFont(font);
			text(cash,45,485);
			
			
			break;
			
		case 13:
			
			
			// aqui muestra un resumen de la compra y ocultamos botones y textos
			
			hideboton();
			hidetext();
			
			if (pantallavieja==6) {
				image(screen9,0,0);
				
			}else if (pantallavieja==7) {
				image(screen14,0,0);
				
			}else if (pantallavieja==8) {
				image(screen15,0,0);
			}
			
			
			 break;
			 
		case 14:
			
			// aquí muestra el historial del usuario
			
			hideboton();
			hidetext();
			
			image(screen17,0,0);
			
			for(int h=0;h<people.size();h++) {
				if(people.get(h).getUsername()==usuarioeva) {
					textFont(font);
					text(Hid,42,250);
					text(HMod,42,280);
				  
				}
				
			}
			break;
	
		}	// llave del switch
	}//llave del Draw
		
	public void mouseClicked() {
		
		
		
		// Verifica para salir del menu lateral
		if (pantallas==5 && mouseX>198 && mouseX<360 && mouseY>0 && mouseY<640) {
			pantallas=4;
		}
		
		
		// verifica el botón de comparar del carro A
		if (pantallas==6 && mouseX>30 && mouseX<92 && mouseY>355 && mouseY<467) {	
			pantallas=9;
		}
		
		
		// verifica el botón de comparar del carro B
		if (pantallas==7 && mouseX>30 && mouseX<92 && mouseY>355 && mouseY<467) {
			pantallas=10;
		}
		
		
		// verifica el botón de comparar del carro C
		if (pantallas==8 && mouseX>30 && mouseX<92 && mouseY>355 && mouseY<467) {
			pantallas=11;
		}
		
		
		// verifica el botón de comprar
		if ((pantallas==6 || pantallas==7 || pantallas==8) && mouseX>30 && mouseX<92 && mouseY>486 && mouseY<600) {
			
			
			if(pantallas==6) {
				cars.add(new TeslaA(0,""));
			}
			if(pantallas==7) {
				cars.add(new TeslaB(0,""));
			}
			if(pantallas==8) {
				cars.add(new TeslaC(0,""));

			}
			
			posicion++;	
			//aqui guardamos la pantalla por si necesita volver
			pantallavieja=pantallas;
			pantallas=12;
		}
		
		
		//verifica el botón de regresar de A
		if (pantallas==9 && mouseX>22 && mouseX<73 && mouseY>59 && mouseY<93) {	
			pantallas=6;	
		}
		
		
		//verifica el botón de regresar de B
		if (pantallas==10 && mouseX>22 && mouseX<73 && mouseY>59 && mouseY<93) {
			pantallas=7;	
		}
		
		
		//verifica el botón de regresar de C
		if (pantallas==11 && mouseX>22 && mouseX<73 && mouseY>59 && mouseY<93) {
			pantallas=8;	
		}
		
		
		
		//verifica el botón de regresar en compras de A
		if (pantallas==12  && mouseX>22 && mouseX<73 && mouseY>59 && mouseY<93) {
			pantallas=pantallavieja;
		}
		
		
		
		//regresar al menu principal después de la compra
		if ((pantallas==13 || pantallas==14) && mouseX>143 && mouseX<216 && mouseY>556 && mouseY<581) {
			pantallas=4;}
		
		
		
		//Este verifica cuando se selecciona para sacar el historial
		if (pantallas==5  && mouseX>16 && mouseX<121 && mouseY>130 && mouseY<148) {
			historia();
			pantallas=14;
			}
		
	}// llave del mouse Clicked 
	
	
	// este private sirve para el historial, guardamos los datos
	private void historia() {
		for(int h=0;h<people.size();h++) {
			if(people.get(h).getUsername()==usuarioeva) {
			  Hid=people.get(h).getId();
			  HMod=people.get(h).getCarrocomprado();
			  Husus=people.get(h).getUsername();
			}
		}
	}

	
	
	// este es para ocultar los campos de textos 
	private void hidetext() {
		cp5.get(Textfield.class,"usuario").setVisible(false);
		cp5.get(Textfield.class,"password").setVisible(false);
		cp5.get(Textfield.class,"usuario2").setVisible(false);
		cp5.get(Textfield.class,"password2").setVisible(false);
		cp5.get(Textfield.class,"nombre").setVisible(false);
		cp5.get(Textfield.class,"email").setVisible(false);
		cp5.get(Textfield.class,"card").setVisible(false);
		cp5.get(Textfield.class,"password3").setVisible(false);
		cp5.get(Textfield.class,"cvc").setVisible(false);
		cp5.get(Textfield.class,"id").setVisible(false);
		cp5.get(Textfield.class,"fecha").setVisible(false);
	}
	
	
	
	// este es para ocultar los botones 
	private void hideboton() {
		cp5.get(Button.class,"login").hide();
		cp5.get(Button.class,"login2").hide();
		cp5.get(Button.class,"register").hide();
		cp5.get(Button.class,"register2").hide();
		cp5.get(Button.class,"submit").hide();
		cp5.get(Button.class,"sign").hide();
		cp5.get(Button.class,"perfil").hide();
		cp5.get(Button.class,"teslaA").hide();
		cp5.get(Button.class,"teslaB").hide();
		cp5.get(Button.class,"teslaC").hide();
		cp5.get(Button.class,"regresar").hide();
		cp5.get(Button.class,"pagar").hide();
			}
	


	
	public void preload() {
		
		//Aquí cargamos todas las imagenes que vamos a utilizar 
		screen1= loadImage("insumos/screen1.png");
		screen2= loadImage("insumos/screen2.png");
		screen3= loadImage("insumos/screen3.png");
		screen4= loadImage("insumos/screen4.png");
		screen5= loadImage("insumos/screen5.png");
		screen6= loadImage("insumos/screen6.png");
		screen7= loadImage("insumos/screen7.png");
		screen8= loadImage("insumos/screen8.png");
		screen9= loadImage("insumos/screen9.png");
		screen10= loadImage("insumos/screen10.png");
		screen11= loadImage("insumos/screen11.png");
		screen12= loadImage("insumos/screen12.png");
		screen13= loadImage("insumos/screen13.png");
		screen14= loadImage("insumos/screen14.png");
		screen15= loadImage("insumos/screen15.png");
		screen16=loadImage("insumos/screen16.png");
		screen17=loadImage("insumos/screen17.png");
	
	}
	
	
	//Aqui se crean los cuadros de textos para el login
	public void textoslog() {
		
		 cp5.addTextfield("usuario")
	     .setPosition(90,250)
	     .setSize(185,26)
	     .setFocus(true)
	     .setFont(font)
	     .setColor(255)
	     .setColorBackground(color(255,255,255,1))
	     .setColorActive(color(255,255,255,1)) 
	     .removeBehavior() 
	     .setLabelVisible(false)
	     .setCaptionLabel("")
	     ;
		
		 cp5.addTextfield("password")
	     .setPosition(90,297)
	     .setSize(185,26)
	     .setFocus(true)
	     .setFont(font)
	     .setColor(255)
	     .setPasswordMode(true)
	     .setColorBackground(color(255,255,255,1))
	     .setColorActive(color(255,255,255,1)) 
	     .removeBehavior() 
	     .setLabelVisible(false)
	     .setCaptionLabel("")
	     ;
		 
		
	}
	
	
	
	//Aqui se crean los cuadros de textos para el login
	public void textosreg() {
		
		 cp5.addTextfield("usuario2")
	     .setPosition(91,244)
	     .setSize(185,26)
	     .setFocus(true)
	     .setFont(font)
	     .setColor(255)
	     .setColorBackground(color(255,255,255,1))
	     .setColorActive(color(255,255,255,1)) 
	     .removeBehavior() 
	     .setLabelVisible(false)
	     .setCaptionLabel("")
	     ;
		
		 cp5.addTextfield("nombre")
	     .setPosition(91,290)
	     .setSize(185,26)
	     .setFocus(true)
	     .setFont(font)
	     .setColor(255)
	     .setColorBackground(color(255,255,255,1))
	     .setColorActive(color(255,255,255,1)) 
	     .removeBehavior() 
	     .setLabelVisible(false)
	     .setCaptionLabel("")
	     ;
		 
		 cp5.addTextfield("email")
	     .setPosition(91,339)
	     .setSize(185,26)
	     .setFocus(true)
	     .setFont(font)
	     .setColor(255)
	     .setColorBackground(color(255,255,255,1))
	     .setColorActive(color(255,255,255,1)) 
	     .removeBehavior() 
	     .setLabelVisible(false)
	     .setCaptionLabel("")
	     ;
		 
		 cp5.addTextfield("password2")
	     .setPosition(91,387)
	     .setSize(185,26)
	     .setFocus(true)
	     .setFont(font)
	     .setColor(255)
	     .setPasswordMode(true)
	     .setColorBackground(color(255,255,255,1))
	     .setColorActive(color(255,255,255,1)) 
	     .removeBehavior() 
	     .setLabelVisible(false)
	     .setCaptionLabel("")
	     ;	
		 
		 
		 cp5.addTextfield("card")
	     .setPosition(42,304)
	     .setSize(270,26)
	     .setFocus(true)
	     .setFont(font)
	     .setColor(155)
	     .setColorBackground(color(255,255,255,1))
	     .setColorActive(color(255,255,255,1)) 
	     .removeBehavior() 
	     .setLabelVisible(false)
	     .setCaptionLabel("")
	     ;	
		 
		 cp5.addTextfield("cvc")
	     .setPosition(42,357)
	     .setSize(54,26)
	     .setFocus(true)
	     .setFont(font)
	     .setColor(155)
	     
	     .setColorBackground(color(255,255,255,1))
	     .setColorActive(color(255,255,255,1)) 
	     .removeBehavior() 
	     .setLabelVisible(false)
	     .setCaptionLabel("")
	     ;	
		 
		 cp5.addTextfield("fecha")
	     .setPosition(125,355)
	     .setSize(91,26)
	     .setFocus(true)
	     .setFont(font)
	     .setColor(155)
	    
	     .setColorBackground(color(255,255,255,1))
	     .setColorActive(color(255,255,255,1)) 
	     .removeBehavior() 
	     .setLabelVisible(false)
	     .setCaptionLabel("")
	     ;	
		 
		 cp5.addTextfield("id")
		 .setPosition(42,409)
	     .setSize(270,26)
	     .setFocus(true)
	     .setFont(font)
	     .setColor(155)
	    
	     .setColorBackground(color(255,255,255,1))
	     .setColorActive(color(255,255,255,1)) 
	     .removeBehavior() 
	     .setLabelVisible(false)
	     .setCaptionLabel("")
	     ;	
		 

		 
		 cp5.addTextfield("password3")
	     .setPosition(42,521)
	     .setSize(270,26)
	     .setFocus(true)
	     .setFont(font)
	     .setColor(155)
	     .setPasswordMode(true)
	     .setColorBackground(color(255,255,255,1))
	     .setColorActive(color(255,255,255,1)) 
	     .removeBehavior() 
	     .setLabelVisible(false)
	     .setCaptionLabel("")
	     ;	
	}
	
	
	//Aqui se crean los botones para la app
	public void botones() {
		  cp5.addButton("login")
		     .setPosition(145,198)
		     .setSize(72,21)
		     .setColorActive(color(255,255,255,1)) 
		     .setColorBackground(color(255,255,255,1))
		     .setColorForeground(color(0,0,0,30))
		     .setCaptionLabel("") 
		     ;
		
		  cp5.addButton("register")
		     .setPosition(145,239)
		     .setSize(72,21)
		     .setColorActive(color(255,255,255,1)) 
		     .setColorBackground(color(255,255,255,1))
		     .setColorForeground(color(0,0,0,30))
		     .setCaptionLabel("") 
		     ;
		  
		  
		  cp5.addButton("login2")
		     .setPosition(94,197)
		     .setSize(72,21)
		     .setColorActive(color(255,255,255,1)) 
		     .setColorBackground(color(255,255,255,1))
		     .setColorForeground(color(0,0,0,30))
		     .setCaptionLabel("") 
		     ;
		
		  cp5.addButton("register2")
		     .setPosition(187,198)
		     .setSize(72,21)
		     .setColorActive(color(255,255,255,1)) 
		     .setColorBackground(color(255,255,255,1))
		     .setColorForeground(color(0,0,0,30))
		     .setCaptionLabel("") 
		     ;
		  
		  cp5.addButton("sign")
		     .setPosition(142,344)
		     .setSize(78,26)
		     .setColorActive(color(255,255,255,1)) 
		     .setColorBackground(color(255,255,255,1))
		     .setColorForeground(color(0,0,0,30))
		     .setCaptionLabel("") 
		     ;
		  
		  cp5.addButton("submit")
		     .setPosition(141,434)
		     .setSize(78,26)
		     .setColorActive(color(255,255,255,1)) 
		     .setColorBackground(color(255,255,255,1))
		     .setColorForeground(color(0,0,0,30))
		     .setCaptionLabel("") 
		     ;
		  
		  
		  cp5.addButton("perfil")
		     .setPosition(26,71)
		     .setSize(35,32)
		     .setColorActive(color(255,255,255,1)) 
		     .setColorBackground(color(255,255,255,1))
		     .setColorForeground(color(0,0,0,30))
		     .setCaptionLabel("") 
		     ;
		  
		  cp5.addButton("teslaA")
		     .setPosition(58,129)
		     .setSize(243,149)
		     .setColorActive(color(255,255,255,1)) 
		     .setColorBackground(color(255,255,255,1))
		     .setColorForeground(color(0,0,0,30))
		     .setCaptionLabel("") 
		     ;
		  
		  cp5.addButton("teslaB")
		     .setPosition(58,291)
		     .setSize(243,149)
		     .setColorActive(color(255,255,255,1)) 
		     .setColorBackground(color(255,255,255,1))
		     .setColorForeground(color(0,0,0,30))
		     .setCaptionLabel("") 
		     ;
		  
		  cp5.addButton("teslaC")
		     .setPosition(58,454)
		     .setSize(243,149)
		     .setColorActive(color(255,255,255,1)) 
		     .setColorBackground(color(255,255,255,1))
		     .setColorForeground(color(0,0,0,30))
		     .setCaptionLabel("") 
		     ;
		  
		 cp5.addButton("regresar")
		     .setPosition(22,73)
		     .setSize(37,20)
		     .setColorActive(color(255,255,255,1)) 
		     .setColorBackground(color(255,255,255,1))
		     .setColorForeground(color(0,0,0,30))
		     .setCaptionLabel("") 
		     ;
		 
		 cp5.addButton("pagar")
		 	.setPosition(143,581)
		 	.setSize(73,24)
		 	.setColorActive(color(255,255,255,1)) 
		 	.setColorBackground(color(255,255,255,1))
		 	.setColorForeground(color(0,0,0,30))
		 	.setCaptionLabel("") 
		 	;
	
	}
	
	
	//Aquí registramos la persona
	public void registraduria() {
		System.out.println("entro");
		naming = cp5.get(Textfield.class, "nombre").getText();
		usuario[0] = naming;
		username = cp5.get(Textfield.class, "usuario2").getText();
		usuario[1] = username ;
		correo = cp5.get(Textfield.class, "email").getText();
		usuario[2] = correo;
		contrasena = cp5.get(Textfield.class, "password2").getText();
		usuario[3] = contrasena;
		
		people.add(new Usuario(naming,username,correo,contrasena));
		
		
		System.out.println(naming+username+correo+contrasena);
		pantallas = 2;

	}
		 
	
	// Este es un método que funciana con el boton de login
	//Estas son las funciones de los botones que se encuentran arriba
	
	public void login() {
		
pantallas=2;
		
	}

	
	// Este es un método que funciana con el boton de register
	public void register() {
		  println("register");
		  pantallas=3;

		}
	
	
	// Este es un método que funciana con el boton de login
	public void login2() {
		  println("login");
		  pantallas=2;
		  
		}
	

	// Este es un método que funciana con el boton de register
	public void register2() {
		  println("register");
		  pantallas=3;
		}
	
	
	// Este es un método que funciana con el boton de Sign, para ingresar
	public void sign() {
		
		for (int i=0; i<people.size();i++) {
			usuarioeva= people.get(i).getUsername();
			passeva=people.get(i).getContrasena();
			
			
		// aquí evaluamos si el usuario es el mismo del registro y coincide con su password
		if(cp5.get(Textfield.class, "usuario").getText().equals(usuarioeva) && cp5.get(Textfield.class, "password").getText().equals(passeva)) {
			pantallas=4;
			System.out.println("entro");
		}}
	}
	
	
	//En este se almacena la informacion de la tarjeta y la envia a la clase
	public void infocard() {
		tarjeta=cp5.get(Textfield.class,"card").getText();
		cvcc=cp5.get(Textfield.class,"cvc").getText();
		fecha=cp5.get(Textfield.class,"fecha").getText();
		id=cp5.get(Textfield.class,"id").getText();
		pascar=cp5.get(Textfield.class,"password3").getText();
		
		//Aqui se recorre el arreglo para registrar la tarjeta de acuerdo a la persona que esta en el login
		for(int i = 0; i < people.size(); i++) {
			people.get(i).registrocard(tarjeta, cvcc, fecha, id, pascar);
		}	
	}
	
	
	// Este es un método que funciana con el boton de submit
	public void submit() {
			registraduria();
			limpiar();
	}
	
	
	// Este es un método que funciana con el boton de perfil
	public void perfil() {
		pantallas=5;
	}
	
	
	// Este es un método que funciana con el boton de TeslaA
	public void teslaA() {
		pantallas=6;
	}
	

	// Este es un método que funciana con el boton de TeslaB
	public void teslaB() {
		pantallas=7;
	}
	

	// Este es un método que funciana con el boton de TeslaC
	public void teslaC() {
		pantallas=8;
	}
	
	
	// Este es un método que funciana con el boton de regresar al menu
	public void regresar() {
		pantallas=4;
	}
	
	
	// Este es el método para pagar y guardar datos
	public void pagar() {
		
		if(cp5.get(Textfield.class, "password3").getText().equals(passeva)) {
			
			pantallas=13;
			for(int h=0;h<people.size();h++) {
				if(people.get(h).getUsername()==usuarioeva) {
					people.get(h).setCarrocomprado(cars.get(posicion).getModelo());
					people.get(h).setId(cp5.get(Textfield.class, "id").getText());
					historia();
				}
				
			}
			
			limpiar();
			System.out.println("entro");
		}
		
		
		
	}

	
	//Este sirve para limpiar los campos de texto 
	public void limpiar() {
		
		cp5.get(Textfield.class,"usuario").clear();
		cp5.get(Textfield.class,"password").clear();
		cp5.get(Textfield.class,"usuario2").clear();
		cp5.get(Textfield.class,"password2").clear();
		cp5.get(Textfield.class,"nombre").clear();
		cp5.get(Textfield.class,"email").clear();
		cp5.get(Textfield.class,"card").clear();
		cp5.get(Textfield.class,"password3").clear();
		cp5.get(Textfield.class,"cvc").clear();
		cp5.get(Textfield.class,"id").clear();
		cp5.get(Textfield.class,"fecha").clear();
		
		
	}
	
	

	
	
}
