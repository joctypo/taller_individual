package main;

import processing.core.PApplet;
import processing.core.PFont;
import processing.core.PImage;
import controlP5.*;

public class Main extends PApplet {

	ControlP5 cp5;
	CallbackListener cb;
	
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
	int pantallas=0;
	int contadorf;
	int tiempo;
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
		font =  createFont ( "Raleway-Regular.ttf" , 15 );	
		cp5 = new ControlP5(this);
		textoslog();
		textosreg();
		botones();
		

		 	

	}


	
	public void draw() {
		background(45);
		
		switch (pantallas) {
		case 0:
			hidetext();
			image(screen1,0,0);
			contadorf = frameCount;
			if(contadorf==30) {
				pantallas ++;
			}
			System.out.println(frameCount);
			text("x: "+mouseX+"y: "+mouseY,mouseX,mouseY);
			break;
		case 1:
			image(screen2,0,0);
			
			text("x: "+mouseX+"y: "+mouseY,mouseX,mouseY);
			break;
		case 2:
			image(screen3,0,0);
			cp5.get(Textfield.class,"usuario").setVisible(true);
			cp5.get(Textfield.class,"password").setVisible(true);
			text("x: "+mouseX+"y: "+mouseY,mouseX,mouseY);
			break;
		case 3:
			text("x: "+mouseX+"y: "+mouseY,mouseX,mouseY);
			break;
		case 4:
			text("x: "+mouseX+"y: "+mouseY,mouseX,mouseY);
			break;
		case 5:
			text("x: "+mouseX+"y: "+mouseY,mouseX,mouseY);
			break;
		case 6:
			text("x: "+mouseX+"y: "+mouseY,mouseX,mouseY);
			break;
		case 7:
			text("x: "+mouseX+"y: "+mouseY,mouseX,mouseY);
			break;
		case 8:
			text("x: "+mouseX+"y: "+mouseY,mouseX,mouseY);
			break;
			

	
		}
		
		
		
		

		
	}
		
	
	private void hidetext() {
		cp5.get(Textfield.class,"usuario").setVisible(false);
		cp5.get(Textfield.class,"password").setVisible(false);
		cp5.get(Textfield.class,"usuario2").setVisible(false);
		cp5.get(Textfield.class,"password2").setVisible(false);
		cp5.get(Textfield.class,"nombre").setVisible(false);
		cp5.get(Textfield.class,"email").setVisible(false);
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
	
	}

	public void textoslog() {
		
		 cp5.addTextfield("usuario")
	     .setPosition(93,250)
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
	     .setPosition(93,250)
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
		 
		
	}
	public void textosreg() {
		
		 cp5.addTextfield("usuario2")
	     .setPosition(93,250)
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
	     .setPosition(93,250)
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
	     .setPosition(93,250)
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
	     .setPosition(93,250)
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
	}
	
	
	public void botones() {
		  cp5.addButton("login")
		     .setValue(0)
		     .setPosition(145,198)
		     .setSize(72,21)
		     .setColorActive(color(255,255,255,1)) 
		     .setColorBackground(color(255,255,255,1))
		     .setColorForeground(color(0,0,0,30))
		     .setCaptionLabel("") 
		     ;
		
	}
}
