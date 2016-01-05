import wheels.users.*;

public class Gold extends Rock {

    public Gold(int x, int y) {
	super(x,y);
    }
    
    public void mousePressed(java.awt.event.MouseEvent e) {
	this.setColor(java.awt.Color.YELLOW);
    }

    public void mouseReleased(java.awt.event.MouseEvent e) {
	this.setColor(java.awt.Color.BLACK);
    }    
    

}
