package main;

import processing.core.PApplet;
import processing.core.PFont;
import controlP5.*;

public class Main extends PApplet {

	ControlP5 cp5;
	
	public static void main(String[] args) {
		
		PApplet.main("main.Main");
		
	}

	public void setup() {
		
		PFont font =  createFont ( "Raleway-Regular.ttf" , 20 );

		cp5 = new ControlP5(this);
		
		 cp5.addTextfield("jkj")
	     .setPosition(20,100)
	     .setSize(200,40)
	     .setFocus(true)
	     .setFont(font)
	     .setColor(color(255))
	     //.setLabelVisible(false)
	    // .setColorBackground(255)
	     .setColorActive(255) 
	     .removeBehavior() 
	    // .setStringValue("Usuario")
	     //.setCaptionLabel("Usuario")
	     //.setPasswordMode(true)
	  //   .setText("Usuario")
	     ;
		 
		textFont(font); 
	}
	
	public void settings() {
		size(360,640);
		

	}
	
	public void draw() {
		background(45);
		
		
	}
}
