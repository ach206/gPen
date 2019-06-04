package artPenProject;
/*
ArtPenByCamilleHall.java
@author: Ashley Camille Hall
@date: 06/01/2019
A program to draw my logo
*/
import acm.program.*;
import acm.graphics.*;
import java.awt.*;

public class ArtPenByCamilleHall extends GraphicsProgram{
	public final int APPLET_WIDTH = 650;
	public final int APPLET_HEIGHT = 650; 	
	public final Color BROWN = new Color(102, 52, 52); 
	
	public void init() {	
//		 set up the height of applet window
		setSize(APPLET_WIDTH, APPLET_HEIGHT);
	}

	public void run() {
	
	/* ---------- BACKGROUND ---------- */
	
	GPen bkground = new GPen(0,0);
	add(bkground); // adds the pen object to applet
	
	// background color
	bkground.setFillColor(Color.WHITE);  // set the background color 
	bkground.startFilledRegion(); // start the background fill
	bkground.drawLine(0, 0);
	bkground.drawLine(0, 800);
	bkground.drawLine(800, 0);
	bkground.drawLine(0, -800);
	bkground.endFilledRegion();
	
	/* ---------- HAIR 3D SHADOW ---------- */
	
	GPen shadow = new GPen(360,200);
	add(shadow);
	shadow.setFillColor(Color.BLACK); 
	shadow.startFilledRegion();
	shadow.drawLine(-10, 0);
	shadow.drawLine(-20, 0);
	shadow.drawLine(-16, 10);
	shadow.drawLine(-5, 18);
	shadow.drawLine(-7, 22);
	shadow.drawLine(-9, 20);
	shadow.drawLine(-6, 19);
	shadow.drawLine(2, 16);
	shadow.drawLine(-4, 11);
	shadow.drawLine(-11, 9);
	shadow.drawLine(-20, 3);
	shadow.drawLine(-15, 7);
	shadow.drawLine(-15, 6);
	shadow.drawLine(-15, 7);
	shadow.drawLine(-15, 6);
	shadow.drawLine(-15, 2);
	shadow.drawLine(-15, -9);
	shadow.drawLine(-30, -20);
	shadow.drawLine(-8, -20);
	shadow.drawLine(-10, -40);
	shadow.drawLine(5, -35);
	shadow.drawLine(18, -34);
	shadow.drawLine(29, -33);
	shadow.drawLine(30, -32);
	shadow.endFilledRegion();
	
	/* ---------- FACE ---------- */
	
	GPen face = new GPen(500,170);
	add(face); 
	face.setFillColor(BROWN);
	face.startFilledRegion();
	face.drawLine(-10, 10);
	face.drawLine(-20, 10);
	face.drawLine(-16, 10);
	face.drawLine(-15, 18);
	face.drawLine(-7, 22);
	face.drawLine(-9, 20);
	face.drawLine(-6, 19);
	face.drawLine(2, 16);
	face.drawLine(-4, 11);
	face.drawLine(-11, 9);
	face.drawLine(-20, 3);
	face.drawLine(-15, 7);
	//face.drawLine(-15, 6);
	//face.drawLine(-15, 7);
	face.drawLine(-15, 6);
	face.drawLine(-15, 2);
	face.drawLine(-25, -9);
	face.drawLine(-30, -20);
	face.drawLine(-8, -20);
	face.drawLine(-15, -20);
	face.drawLine(5, -25);
	face.drawLine(18, -24);
	face.drawLine(29, -23);
	face.drawLine(30, -22);
	face.endFilledRegion();
	
	
	
	/* ---------- BROWS ---------- */
	
	GPen brow = new GPen(400,200);
	add(brow);
	
	brow.setFillColor(Color.BLACK);
	brow.startFilledRegion();
	brow.move(0, 0);
	brow.drawLine(0, 0);
	brow.drawLine(-20, 4);
	brow.drawLine(0, 10);
	brow.drawLine(20, -4);
	//brow.drawLine(-20, 0);
	//brow.drawLine(0, -10);
	brow.endFilledRegion();
	
	brow.setFillColor(Color.BLACK); 
	brow.startFilledRegion();
	brow.move(-60, -6);
	brow.drawLine(0, 0);
	brow.drawLine(-20, -4);
	brow.drawLine(0, 10);
	brow.drawLine(20, 4);
	//brow.drawLine(-20, 0);
	//brow.drawLine(0, -10);
	brow.endFilledRegion();
	
	
	/* ---------- HAIR ---------- */
	
	GPen pen = new GPen(400,200);
	add(pen); 
	pen.setFillColor(Color.BLACK); 
	pen.startFilledRegion();
	
	//CLOSES THE LEFT SIDE PUFF
	pen.drawLine(-23, -31);
	
	//NEAR LEFT PART
	pen.drawLine(-10, 0);
	pen.drawLine(-20, 0);
	pen.drawLine(-16, 10);
	pen.drawLine(-5, 18);
	pen.drawLine(-7, 22);
	pen.drawLine(-9, 20);
	pen.drawLine(-6, 19);
	pen.drawLine(2, 16);
	pen.drawLine(-4, 11);
	pen.drawLine(-11, 9);
	
	//FINISHES LEFT BOTTOM PUFF
	pen.drawLine(-20, 3);
	pen.drawLine(-15, 7);
	pen.drawLine(-15, 6);
	pen.drawLine(-15, 7);
	pen.drawLine(-15, 6);
	pen.drawLine(-15, 2);
	pen.drawLine(-15, -9);
	pen.drawLine(-30, -20);
	pen.drawLine(-8, -20);
	pen.drawLine(-10, -40);
	
	//pen.drawLine(5, -10)
	pen.drawLine(5, -35);
	pen.drawLine(18, -34);
	pen.drawLine(29, -33);
	pen.drawLine(30, -32);
	
	//	START
	pen.drawLine(15, -20);
	
	//START LEFT CURVE
	pen.drawLine(20, -10);
	pen.drawLine(20, -2);
	pen.drawLine(20, 0);
	pen.drawLine(19, 1);
	pen.drawLine(19, 3);
	pen.drawLine(17, 11);
	
	//	START DESCENDING CURVE
	pen.drawLine(14, 15);
	pen.drawLine(10, 20);
	pen.drawLine(10, 30);
	
	//HAIR PARTED HERE
	pen.drawLine(4, 15);
	pen.drawLine(4, 20);
	pen.drawLine(0, -15);
	pen.drawLine(2, -20);
	//END PARTED HAIR
	
	//START ASCENDING RIGHT HAIR
	pen.drawLine(10, -30);
	pen.drawLine(14, -15);
	
	//	RIGHT SIDE BASELINE HAIR
	pen.drawLine(50, -10);
	
	//	RIGHT SIDE START DESCENDING HAIR
	pen.drawLine(15, 5);
	pen.drawLine(20, 10);
	pen.drawLine(25, 15);
	pen.drawLine(5, 8);
	
	//HAIR DIPS IN ON LEFT SIDE
	pen.drawLine(-4, 15);
	pen.drawLine(1, 5);
	pen.drawLine(2, 8);
	pen.drawLine(5, 5);
	
	//END DIP AND PUFF BACK OUT
	pen.drawLine(5, 10);
	pen.drawLine(8, 5);
	pen.drawLine(15, 10);
	
	//DIP IN SLIGHTLY ON RIGHT SIDE
	pen.drawLine(10, 20);
	pen.drawLine(-2, 30);
	pen.drawLine(-4, 15);
	pen.drawLine(0, 20);
	
	//POP OUT SLIGHTLY ON RIGHT SIDE
	pen.drawLine(-4, 5);
	pen.drawLine(0, 8);
	pen.drawLine(0, 12);
	pen.drawLine(5, 25);
	pen.drawLine(8, 12);
	
	//CLOSING LEFT SIDE HAIR
	pen.drawLine(-8, 22);
	pen.drawLine(-1, 2);
	pen.drawLine(0, 0);
	pen.drawLine(-18, -2);
	pen.drawLine(-15, 4);
	pen.drawLine(-18, -4);
	pen.drawLine(-15, 4);
	pen.drawLine(-18, -4);
	pen.drawLine(-15, -10);
	pen.drawLine(-18, -14);
	pen.drawLine(-24, -11);
	pen.drawLine(-9, -10);
	pen.drawLine(-8, -4);
	pen.drawLine(-4, -2);
	pen.drawLine(1, -14);
	pen.drawLine(1, -24);
	pen.drawLine(2, -34);
	
	pen.endFilledRegion();
	
	
	
	}
}