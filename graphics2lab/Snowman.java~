import wheels.users.*;

public class Snowman extends Rectangle{

	private Ellipse _sTop, _sBottom;
	private Rectangle _hTop, _hBottom;

	public Snowman(int x, int y) {
		super(x,y);
		this.setSize(120, 300);
		this.setColor(java.awt.Color.CYAN);
		_sTop = new Ellipse(java.awt.Color.LIGHT_GRAY);
		_sBottom = new Ellipse(java.awt.Color.LIGHT_GRAY);
		_sTop.setSize(100, 100);
		_sBottom.setSize(100, 100);
		_sTop.setLocation(x+10,y+100);
		_sBottom.setLocation(x+10,y+200);
		_hTop = new Rectangle(java.awt.Color.DARK_GRAY);
		_hBottom = new Rectangle(java.awt.Color.DARK_GRAY);
		_hTop.setSize(80, 40);
		_hBottom.setSize(120, 60);
		_hTop.setLocation(x+20,y);
		_hBottom.setLocation(x,y+40);
	}

	public Ellipse getSnowTop(){
		return _sTop;
	}

	public Ellipse getSnowBottom(){
		return _sBottom;
	}

	public Rectangle getHatTop(){
		return _hTop;
	}

	public Rectangle getHatBottom(){
		return _hBottom;
	}

}
