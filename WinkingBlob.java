import wheels.users.*;

public class WinkingBlob extends Blob {

    public WinkingBlob(int x, int y) {
	super(x,y);
    }

    public void mousePressed(java.awt.event.MouseEvent e) {
	super.mousePressed(e);
	this.getRightEye().setSize(10, 10);
	this.getRightEye().setLocation(this.getRightEye().getXLocation() + 10,
				       this.getRightEye().getYLocation() + 10);
    }

    public void mouseReleased(java.awt.event.MouseEvent e) {
	super.mouseReleased(e);
	this.getRightEye().setSize(30, 30);
	this.getRightEye().setLocation(this.getRightEye().getXLocation() - 10,
				       this.getRightEye().getYLocation() - 10);
    }
    
}
