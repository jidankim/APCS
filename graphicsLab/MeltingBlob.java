import wheels.users.*;

public class MeltingBlob extends Blob{


    public MeltingBlob(int x, int y){
	super(x,y);
    }


    public void mouseClicked(java.awt.event.MouseEvent e){
	double k = 0.99;
	int x = getXLocation();
	int y = getYLocation();

	Ellipse r = getRightEye();
	Ellipse l = getLeftEye();
	int rEyeX = getXLocation() +  (int) (0.2 * getWidth() * k) ;
	int rEyeY = getYLocation() + (int) (0.2 * getWidth() * k)  ;
	int lEyeX = getXLocation() + (int) (0.5 * getWidth() * k)  ;
	int lEyeY = rEyeY;
	setSize((int)(getWidth() * k), (int)(getHeight() * k));
	r.setLocation(rEyeX , rEyeY);
	l.setLocation(lEyeX , rEyeY);
	r.setSize((int)(r.getWidth() * k), (int) (r.getHeight() * k));
	l.setSize((int)(l.getWidth() * k), (int) (l.getHeight() * k));



	
    }
    

}
