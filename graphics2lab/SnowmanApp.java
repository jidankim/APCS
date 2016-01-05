import wheels.users.*;

public class SnowmanApp extends Frame {

	private MeltingSnowman _meltingSnowman;

	public SnowmanApp() {
		super();
		_meltingSnowman = new MeltingSnowman(100, 100);
	}

	public static void main(String[] args) {
		SnowmanApp app = new SnowmanApp();
	}

}
