import wheels.users.*;

public class BlobApp extends Frame {

    // instance variable
    private WinkingBlob _blob;
    
    public BlobApp() {
	super();
	_blob = new WinkingBlob(10,100);
    }
    
    public static void main(String[] args) {
	BlobApp app = new BlobApp();    }

}
