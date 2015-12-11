public class PointClient{

    public static double distance(Point a, Point b) {
	int x1 = a.getX();
	int y1 = a.getY();
	int x2 = b.getX();
	int y2 = b.getY();

	return Math.sqrt((x2-x1) * (x2-x1) + (y2-y1) * (y2-y1));
    }
    
}
