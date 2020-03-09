package main;

import processing.core.PApplet;
import processing.core.PFont;
import processing.core.PGraphics;
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
	
	
	boolean verificar=false;

	
	
	
	public static void main(String[] args) {
		
		PApplet.main("main.Main");
		
	}


	public void setup() {
		

		preload();
		
		
		PFont font =  createFont ( "Raleway-Regular.ttf" , 15 );
		
		cp5 = new ControlP5(this);
		 noStroke();
		 noFill();
		 
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

		
		
		

	}

	public void settings() {
		size(360,640);
		

	}
	
	public void draw() {
		background(45);
		image(screen3,0,0);
		text("x: "+mouseX+"y: "+mouseY,mouseX,mouseY);
		

		
	}
		
	
	public void preload() {
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

	
}
