package main;

import processing.core.PApplet;
import processing.core.PFont;
import processing.core.PGraphics;
import processing.core.PImage;
import controlP5.*;

public class Main extends PApplet {

	ControlP5 cp5;
	CallbackListener cb;
	PImage screen3;
	
	
	public static void main(String[] args) {
		
		PApplet.main("main.Main");
		
	}


	public void setup() {
		
		screen3= loadImage("insumos/screen3.jpg");
		PFont font =  createFont ( "Raleway-Regular.ttf" , 15 );
		
		cp5 = new ControlP5(this);
		 noStroke();
		 noFill();
		 
		 cp5.addTextfield("")
	     .setPosition(93,258)
	     .setSize(185,26)
	     .setFocus(true)
	     .setFont(font)
	     .setColor(255)
	     //.setLabelVisible(false)
	     .setColorBackground(color(255,255,255,10))
	     .setColorActive(color(255,255,255,10)) 
	     .removeBehavior() 
	     .setText("Usuario")
	     .onClick(cb) 
	     
	     //.setStringValue("Usuario")
	     //.setCaptionLabel("Usuario")
	     //.setPasswordMode(true)
	     //
	     ;
		
		textFont(font); 
		
		 cb = new CallbackListener() {
			    public void controlEvent(CallbackEvent theEvent) {
			      
			    	
			      
			    }
			  };

	}

	public void settings() {
		size(360,640);
		

	}
	
	public void draw() {
		background(45);
		image(screen3,0,0);
		text("x: "+mouseX+"y: "+mouseY,mouseX,mouseY);
		
	}
}
