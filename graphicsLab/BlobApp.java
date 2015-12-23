import wheels.users.*;

public class BlobApp extends Frame {

    // instance variable
    private WinkingBlob _winkingBlob;
    private TalkativeBlob _talkativeBlob;
    private HappyBlob _happyBlob;
    private SadBlob _sadBlob;
    private GreedyBlob _greedyBlob;
    private ShyBlob _shyBlob;
    private MeltingBlob _melty;

    
    public BlobApp() {
	super();
	_winkingBlob = new WinkingBlob(10,100);
	_talkativeBlob = new TalkativeBlob(150, 100);
	_happyBlob = new HappyBlob(250, 100);
	_sadBlob = new SadBlob(350,100);
	_greedyBlob = new GreedyBlob(450, 100);
	_shyBlob = new ShyBlob(550, 100);
	_melty = new MeltingBlob(10, 200);
    }
    
    public static void main(String[] args) {
	BlobApp app = new BlobApp();   
    }

}
