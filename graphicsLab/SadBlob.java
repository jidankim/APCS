import wheels.users.*;


public class SadBlob extends TalkativeBlob{

    public SadBlob(int x, int y){
	super(x,y);
	this.getBubble().setText("I'm sad!");
    }

}
