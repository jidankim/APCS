import wheels.users.*;

public class Blob extends Ellipse {

    // instance variables
    private Ellipse _leftEye, _rightEye;

    // constructor 
    public Blob (int x, int y) {
        super(x,y);
	this.setSize(100,100);
	_leftEye = new Ellipse(java.awt.Color.BLACK);
	_rightEye = new Ellipse(java.awt.Color.BLACK);
	_leftEye.setSize(30,30);
	_rightEye.setSize(30,30);
	_leftEye.setLocation(x+15, y+10);
	_rightEye.setLocation(x+55, y+10);
    }

    public void mousePressed(java.awt.event.MouseEvent e) { 
	this.setFillColor(java.awt.Color.BLUE);
    }
}
