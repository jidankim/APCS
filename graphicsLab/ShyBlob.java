import wheels.users.*;

public class ShyBlob extends Blob{

    public ShyBlob(int x, int y){
	super(x,y);
    }

    public void mouseClicked(java.awt.event.MouseEvent e){
	setLocation(getXLocation(), getYLocation() + 1);
	getRightEye().setLocation( getRightEye().getXLocation(),
				   getRightEye().getYLocation() + 1);
	getLeftEye().setLocation( getLeftEye().getXLocation(),
				  getLeftEye().getYLocation() + 1);

    }

}
