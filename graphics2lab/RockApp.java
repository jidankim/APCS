import wheels.users.*;

public class RockApp extends Frame {
    
    private Rock _rock1;
    private Rock _rock2;
    private Gold _gold;

    public BlobApp() {
	super();
	_rock1 = new Rock(10, 100);
	_rock2 = new Rock(150, 100);
	_gold = new Gold(250, 100);
    }

    public static void main(String[] args) {
	RockApp app = new RockApp();
    }

}

