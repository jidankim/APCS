import wheels.users.*;

public class MeltingSnowman extends Snowman {

	public MeltingSnowman(int x, int y) {
		super(x, y);	
	}

	public void mouseClicked(java.awt.event.MouseEvent e){
		double k = 0.95;
		int x = getXLocation();
		int y = getYLocation();
		
		Ellipse st = getSnowTop();
		Ellipse sb = getSnowBottom();
		y = y + st.getHeight() + sb.getHeight() 
			- (int)(st.getHeight() * k) - (int)(sb.getHeight() * k);
		setLocation(x,y);
		st.setSize((int)(st.getWidth() * k), (int)(st.getHeight() * k));
		sb.setSize((int)(sb.getWidth() * k), (int)(sb.getHeight() * k));
		st.setLocation(x+60-st.getWidth()/2, y + 100);
		sb.setLocation(x+60-sb.getWidth()/2, y + 100 + st.getHeight());
		
		Rectangle ht = getHatTop();
		Rectangle hb = getHatBottom();
		ht.setLocation(x+20, y);
		hb.setLocation(x, y + 40);
	}

}
