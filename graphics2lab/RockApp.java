import wheels.users.*;

public class RockApp extends Frame {
    
    private Rock _rock1;
    private Rock _rock2;
    private Gold _gold;

    public RockApp() {
	super();
	/*
	_rock1 = new Rock(10, 100);
	_rock2 = new Rock(150, 100);
	_gold = new Gold(290, 100);
	*/
	boolean[] isGold = new boolean[3];
	isGold[(int)(Math.random()*3)] = true;
	for (int i = 0; i < isGold.length; i++) {
		if (isGold[i]) new Gold(140 * i + 10, 100);
		else new Rock(140 * i + 10, 100);
	}
    }

    public static void main(String[] args) {
	RockApp app = new RockApp();
    }

}

