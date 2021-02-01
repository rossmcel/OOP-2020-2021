package ie.tudublin;

import processing.core.PApplet;

public class HelloProcessing2 extends PApplet
{

	public void settings()
	{
		size(500, 500);
	}

	public void setup() {
		
	}
	
	public void draw()
	{	
		background(232, 14, 2); // background colou
		stroke(255); // pen colout = white

		// outer circle
		fill(255, 251, 0);
		ellipse(250, 220, 220, 220); // circle - cx, cy, w, h

		// triangle
		fill(29, 242, 242);
		triangle(250, 100, 130, 300, 370, 300);

		// inner circle
		fill(181, 181, 177);
		ellipse(250, 200, 100, 50); // circle - cx, cy, w, h

		// inner inner circle
		fill(5, 5, 5);
		ellipse(250, 200, 35, 35); // circle - cx, cy, w, h
	}
}
