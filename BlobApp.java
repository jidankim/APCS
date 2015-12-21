import wheels.users.*;

public class BlobApp extends Frame {

    // instance variable
    private Blob _blob;
    
    public BlobApp() {
	super();
	_blob = new Blob(0,0);
    }
    
    public static void main(String[] args) {
	BlobApp app = new BlobApp();
    }

}
